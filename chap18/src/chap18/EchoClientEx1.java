package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Echo Client 프로그램
 * 키보드에서 데이트를 입력받아, 서버로 데이터 전송
 * 서버에서 데이터 수신하여 화면 출력
 */
public class EchoClientEx1 {
	public static void main(String[] args) throws IOException {
		int port = 5000;
		String ip = "192.168.200.6";
		Socket client = null;
		PrintWriter out = null;
		BufferedReader br = null;
		String input;
		//stdin : 키보드에서 입력 받기. 한줄씩 읽기 가능(readLine())
		BufferedReader stdin = new BufferedReader
				(new InputStreamReader(System.in));
		//Socket 객체 생성.
		//ip : 서버 IP 주소
		//port : 서버 port 번호
		client = new Socket(ip, port);
		/*
		 * 
		 * client.getInputStream() : 서버에서 데이터 수신하는 스트림
		 *							 서버가 송신한 데이터임.
		 *client.getOutputStream() : 서버로 데이터 송신하는 스트림
		 */
		
		br = new BufferedReader
				(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream());
		System.out.println("local port :" + client.getLocalPort());
		System.out.println("local ip :" + client.getLocalAddress());
		System.out.println("server port :" + client.getPort());
		System.out.println("server ip :" + client.getInetAddress());
		System.out.println("메세지입력 종료(bye)");
		//stdin.readLine() : 키보드 입력
		while((input = stdin.readLine()) != null){
			if(input.equals("buy"))
				break;
			out.println(input); //서버로 데이터 전송
			out.flush();		//버퍼의 내용 강제 전송
			//br.readLine() : 서버에서 데이트를 수신
			System.out.println("sever echo :" + br.readLine());
			System.out.println("메시지 입력");
		}
		out.close();		br.close();		stdin.close();
		client.close();
	}
}
