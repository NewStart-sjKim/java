package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Echo Server 프로그램
 * : 클라이언트 프로그램에서 받은 데이터를 그대로 클라이언트로 전송
 */
public class EchoServerEx1 {
	public static void main(String[] args) {
		try {
			while(true) {
				//ServerSocket : 서버 기능 소켓.
				//				 5000번 포트를 OS로 부터 할당 받아 대기
				ServerSocket server = new ServerSocket(5000);
				System.out.println("클라이언트 접속 대기");
				// client : 클리이언트가 생성한 Socket 객체
				Socket client = server.accept();// Socket 객체 대기
				//Thread 객체에 Socket객체를 전달하여 Thread에서 해당
				//클라이언트와 통신
				ServerThread th = new ServerThread(client);// 내부클래스
				th.start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	static class ServerThread extends Thread{
		private Socket client;
		PrintWriter out;
		BufferedReader br;
		//client : 서버가 accept한 Socket 객체. client 연결 당 하나의 소켓객체생성
		ServerThread(Socket client){ // 생성자
			this.client = client;
			System.out.println("client ip :" + client.getInetAddress());
			System.out.println("client port :" + client.getPort());
			try {
//				client.getOutputStream() : 서버가 클라이언트로 데이터 전송
				out = new PrintWriter(client.getOutputStream());
//				client.getInputStream()	 : 클라이언트에서 서버로 데이터 수신
				br = new BufferedReader
						(new InputStreamReader(client.getInputStream()));
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void run() {
			String input;
			try {
				//br.readLine() : 클라이언트가 전송한 데이터 수신
				while((input = br.readLine()) != null) {
					out.println(input);
					out.flush();
					System.out.println("client data :" + input);
				}
				br.close(); out.close(); client.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
