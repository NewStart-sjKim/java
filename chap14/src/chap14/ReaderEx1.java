package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
//InputStreamReader	: InputStream => Reader로 변경
//Reader			: 문자형 입력스트림.
//in.read()			: 2byte(1char)단위로 읽기
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		while((data=in.read()) != -1) //ctrl + z
			System.out.print((char)data);
	}
}
