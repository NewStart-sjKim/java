package chap14;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader 보조 스트림
 *  1. 새로운 기능 추가. => ReadLine() 추가.
 *  2. 객체 생성시 다른 스트림을 매개변수로 받는다.
 *     new BufferedReader(Reader)
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		/*
		 * InputStream System.in -> InputStreamReader -> Reader
		 * 	->BufferedReader
		 */
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요.종료(ctrl+z)");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		//readLine() : 한줄입력 기능
		while((data = br.readLine()) != null) {
			System.out.println(data);
			fw.write(data+"\n");
		}
		fw.flush(); fw.close(); br.close();
	}
}
