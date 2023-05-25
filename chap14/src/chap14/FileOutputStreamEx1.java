package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStreamEx1 예제 : vkdlfdp epdlxjfmf wjwkd
 * 주요 메서드
 *  void write(int data) 	: 1byte 출력
 *  void write(byte[] buf) 	: buf 내용 출력
 *  void write(byte[] buf,int start, int len):
 *  			 buf의 start 부터 len 만큼 내용 출력
 *  
 */
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
		/*
		 * fos : out.txt 파일에 내용을 쓸수 있는 출력 스트림
		 * 		out.txt 파일이 없으면 out.txt 파일 생성하여 내용 출력함
		 * 		out.txt 파일이 있으면 기존의 파일에 생성하여 내용 출력함. 기존내용 사라짐.
		 * 
		 * 		FileOutputStream 객체 생성시 FileNotfoundException 예외처리 필요
		 * 		=> 파일의 생성 권한이 없는 경우 예외 발생.
		 * new FileOutputStream("out.txt') : out.txt에 내용 출력함
		 * 									 기존내용 사라짐
		 * new FileOutputStream("out.txt',true) : out.txt에 내용 출력함
		 * 									 	  기존내용에 새로운 내용 추가
		 */
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		//fos.flush();
		//byte[] getBytes() : 문자열 데이터를 byte[]로 리턴
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf,5,6);
		fos.flush();
	
	}
}
