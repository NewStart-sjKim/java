package chap14;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter : 텍스트 형태의 데이터를 파일에 저장
 * FileOutputStreamEx1 예제 : vkdlfdp epdlxjfmf wjwkd
 * 주요 메서드
 *  void write(int data) 	: 1byte 출력
 *  void write(byte[] buf) 	: buf 내용 출력
 *  void write(byte[] buf,int start, int len):
 *  			 buf의 start 부터 len 만큼 내용 출력
 *  void write(String str) : str 내용 출력
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용이 저장됩니다.");
		FileWriter fw = new FileWriter("out2.txt");
		fw.write('1');fw.write('2');fw.write('3');
		fw.write('a');fw.write('b');fw.write('c');
		fw.write('가');fw.write('나');fw.write('다');
		//fos.flush();
		//byte[] getBytes() : 문자열 데이터를 byte[]로 리턴
		char [] buf = "\nFileWriter 예제입니다.\n".toCharArray();
		fw.write(buf);
		fw.write(buf,5,6);
		fw.write("\nFileWriter 예제입니다 : String 자료형 출력하기.\n");
		fw.flush();
	}
}
