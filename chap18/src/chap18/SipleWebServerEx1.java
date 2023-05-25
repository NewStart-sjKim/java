package chap18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 간단한 웹서버 프로그램.
 * 브라우저에서 요청한 데이터를 처리
 */
public class SipleWebServerEx1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8000);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			//client : 브라우저. url : http://localhost:8000
			Socket client = server.accept();
			HttpThread t = new HttpThread(client);
			t.start();
		}
	}
	static class HttpThread extends Thread{
		private Socket client;
		BufferedReader br;
		PrintWriter pw;
		HttpThread(Socket client){
			this.client = client;
			try {
				br = new BufferedReader
						(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
				/*
				 * 응답 헤더 전송
				 * 200 : http 응답 코드. 정상
				 * 500 : 오류발생
				 * 404 : 해당페이지 없음
				 * 
				 * Conten-Type:text/html : 전송 데이터가 html 형식.
				 * 						   브라우저는 html 번역기 준비.
				 * text/html : 문서의 종류 표현 => MIME타입
				 */
				pw.println("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n\r\n");
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip :" + client.getLocalAddress());
			System.out.println("server port :" + client.getLocalPort());
			System.out.println("client ip :" + client.getInetAddress());
			System.out.println("client port :" + client.getPort());
		}
		public void run() {
			BufferedReader fbr = null;
			try {
				//br : 브라우저에서 수신된 데이터
				String line = br.readLine();
				// "GET / HTTP/1.1"
				// "GET / index.html HTTP/1.1"
				System.out.println("Http Header :" + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") -1;
				String filename = line.substring(start,end);
				//요청페이지
				if(filename.equals("")) 
					filename = "index.html";
				fbr = new BufferedReader(new FileReader(filename));
				System.out.println("filename =" + filename);
				String fline = null;
				while((fline = fbr.readLine()) != null) {
					pw.println(fline); // pw : 출력스트림 // 브라우저에 데이터 전송 = > 브라우저의 소스보기로 확인 가능!
					pw.flush();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fbr != null) fbr.close();
					if(br != null) br.close();
					if(pw != null) pw.close();
					if(client != null) client.close();
				}catch(IOException e) {}
			}
		}
	}
}
