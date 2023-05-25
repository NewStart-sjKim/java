package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream 예제
 * 	- 파일의 내용을 읽어서 화면에 출력하기
 * 
 * 	- 주요 메서드
 * 	int read() : 1byte씩 읽어서 내용을 리턴
 * 	int read(byte[] buf) : buf의 크기만큼 읽어서 내용을 buf에 저장하고,
 * 						   실제 읽은 바이트수를 리턴
 * 	int read(byte[] buf,int start,int len) :
 * 							len 만큼 읽어서 내용을 buf에 start 인덱스 부터 저장하고,
 * 							실제 읽은 바이트수를 리턴.
 * 	int available() : 읽기 가능 바이트 수 리턴
 */
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = 
				new FileInputStream("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("====== read() 메서드를 이용하여 읽기");
		//-1 : 파일의 끝이 되면 리턴.(E(end)O(of)F(file))
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println("====== read(byte[]) 메서드를 이용하여 읽기");
		fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		//fis.available() : 읽기 가능 바이트 수
		byte[] buf = new byte[fis.available()];
		//buf  : 실제 읽은 데이터
		//data : 실제로 읽은 바이트 수
		//new String(buf,0,data) :buf 베열의 0버지부터 data번지 앞까지를 문자열로 생성
		while((data=fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,data));
		}
		System.out.println("====== read(byte[],int,int) 메서드를 이용하여 읽기");
		fis = new FileInputStream("src/chap14/InputStreamEx1.java");
		buf = new byte[fis.available()];
		//read(buf,0,buf.length) : 파일의 내용을 읽어서 buf 0 번지부터 buf.length 길이만큼
		//						   buf에 내용 저장. 실제읽은 바이트 수 리턴
		while((data=fis.read(buf,0,buf.length)) != -1) {
			System.out.println(new String(buf,0,data));
		}
	}
}
