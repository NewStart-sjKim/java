package chap14;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입출력 스트림 : 데이터 이동통로. 단방향.
 * 		입력스트림 :	바이트 : 1byte단위. 동영상,이미지등 읽기
 * 						최상위클래스 : InputStream
 * 					문자형 : 2byte단위	 텍스트데이터 쓰기
 * 						최상위클래스 : Reader
 * 		출력스트림 :	바이트 : 1byte단위. 동영상,이미지등 쓰기
 * 						최상위클래스 : OutputStream > PrintStream(하위클래스)
 * 					문자형 : 2byte단위	 텍스트데이터 쓰기
 * 						최상위클래스 : Writer
 * 	InputStreamReader 	:	바이트형입력스트림 => 문자형입력스트림 변경
 * 	OutputStreamWriter 	:	바이트형입력스트림 => 문자형출력스트림 변경
 * 
 * 	자바에서 제공하는 표준 입출력 스트림 객체
 * 	표준입력스트림 : InputStream System.in 	=> 키보드에서 입력
 * 	표준출력스트림 : PrintStream System.Out	=> 콘솔로 출력
 *  표준오류스트림 : PrintStream System.err	=> 콘솔로 출력
 */
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
//InputStream	: 바이트형 입력스트림
//in.read()		: 1바이트단위로 읽기 => 한글깨짐
		InputStream in = System.in;
		int data = 0;
		while((data=in.read()) != -1) //ctrl + z
			System.out.print((char)data);
	}
}
