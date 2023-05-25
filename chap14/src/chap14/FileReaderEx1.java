package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 클래스 	: 파일에서 데이트를 2byte 단위로 읽는 기능
 * - 주요 메서드
 * 	 int read()		: 파일에서 데이트를 읽어서 1char로 리턴
 * 	 int read(char[] buf) : 파일에서 데이터를 buf 크기만큼 읽어서 buf에 내용 저장
 * 							실제 읽은 char수를 리턴
 * int read(char[] buf,int start,int len) :
 * 					 파일에서 데이터를 len 크기만큼 읽어서 buf에 start 인덱스부터 내용 저장
 * 							실제 읽은 char수를 리턴
 */
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("===============read() 메서드를 이용하여 읽기");
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println("===============read(char[]) 메서드를 이용하여 읽기");
		fis = new FileReader("src/chap14/InputStreamEx1.java");
		char[] buf = new char[8000];
		while((data = fis.read(buf)) != -1) {
			System.out.print(new String(buf,0,data));
		}
		System.out.println("===============read(char[],int,int) 메서드를 이용하여 읽기");
		fis = new FileReader("src/chap14/InputStreamEx1.java");
		buf = new char[8000];
		while((data = fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf,0,data));
		}
	}
}
