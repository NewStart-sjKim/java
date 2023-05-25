package chap14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 문자형 입력 스트림 : 인코딩 하기
 */
public class FileReaderEx2 {
	public static void main(String[] args) throws IOException {
		System.out.println("d:/euckr.txt 파일 읽기");
		FileReader fr = new FileReader("d/euckr.txt");
		int data = 0;
		while((data=fr.read()) != -1)
			System.out.println((char)data);
		System.out.println("");
		System.err.println("d:/utf8.txt 파일 읽기 ==========");
		fr = new FileReader("d:/utf8.txt");
		while((data=fr.read()) != -1)
			System.out.println((char)data);
	}
}
