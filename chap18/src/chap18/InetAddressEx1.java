package chap18;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 * InetAddress 클래스의 생성자의 접근제한자 : default
 * 		=> new InetAddress() 객체 생성 불가.
 *  객체 생성을 위한 static 메서드
 *  1. InetAddress getByName(도메인 이름)
 *  2. InetAddress[] getAllByName(도메인 이름) : 모든 IP값 조회
 *  3. InetAddress		getLocalHost() : 내컴퓨터의 IP 주소
 *  4. InetAddress		getByAddress(byte[])
 */

public class InetAddressEx1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.gdu.co.kr");
		System.out.println("hostname :" + ip.getHostName()); //도메인 이름
		System.out.println("hostaddress :" + ip.getHostAddress());// ip 주소값
		byte[] ipAddr = ip.getAddress();//ip 주소값. 바이트형 배열형으로 리턴
		for(byte b : ipAddr) // -128 ~ 127 값까지 표현
			System.out.print(((b<0)?256 + b : b) + ".");
		System.out.println();
		InetAddress[] ips = InetAddress.getAllByName("www.daum.com");
		for(InetAddress a : ips) {
			System.out.println("IP주소 :" + a);
		}
		System.out.println("내 컴퓨터 ::" + InetAddress.getLocalHost());
	}
}
