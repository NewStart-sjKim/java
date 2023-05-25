package chap18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import chap18.SipleWebServerEx1.HttpThread;

/*
 * 간단한 웹서버 구현하기
 * http://localhost:8001/index.html 요청시
 * 이미지 파일도 출력되도록 SimpleWebServerEx1.java 수정된 소스
 * 
 * 1. 파일을 읽을때 바이트형 입력스트림(InputStream)으로 읽기
 * 2. 클라이언트에 데이터 전송시 바이트형출력스트림(OutputStream)출력하기
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8001);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();
			HttpThread t = new HttpThread(client);
			t.start();

		}
	}
	static class HttpThread extends Thread{
		private Socket client;
		BufferedReader br;
		OutputStream pw;
		HttpThread(Socket client){
			this.client = client;
			try {
				br = new BufferedReader
						(new InputStreamReader(client.getInputStream()));
				pw = client.getOutputStream();
				pw.write
				("HTTP/1.0 200 OK\r\nContent-Type:text/html\r\n\r\n".getBytes());
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("server ip :" + client.getLocalAddress());
			System.out.println("server port :" + client.getLocalPort());
			System.out.println("client ip :" + client.getInetAddress());
			System.out.println("client port :" + client.getPort());

		}
		public void run() {
			FileInputStream fbr = null;
			try {
				String line = br.readLine();
				System.out.println("HTTP Header :" + line);
				int start = line.indexOf("/") +1;
				int end = line.lastIndexOf("HTTP") -1;
				String filename = line.substring(start,end);
				if(filename.equals("")) filename = "index.html";
				fbr = new FileInputStream(filename);
				byte[] buf = new byte[8096];
				int len = 0;
				while((len=fbr.read(buf)) != -1) {
					pw.write(buf,0,len);
					pw.flush();
				}
			}catch(IOException e) {
				e.printStackTrace()
			} finally {
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
