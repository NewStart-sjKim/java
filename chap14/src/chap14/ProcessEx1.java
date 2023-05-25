package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 다른 프로세스의 결과를 출력하기
 * Runtime.getRuntime() : OS(운영체제,window)로 부터 프로세스 실행 권한 허가.
 * Process exec()		: 프로세스 실행
 * p.getInputStream()	: 프로세스 결과를 전달 받을 수 있는 입력스트림
 * new InputStreamReader(InputStream,encoding)
 * 	   InputStream 객체의 encoding 방식 설정.	
 */
public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 192.168.200.6");
		Reader r= new InputStreamReader(p.getInputStream(),"EUC-KR");
		int data = 0;
		while((data = r.read()) != -1){
			System.out.print((char)data);
		}
	}
}
