package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 내용을 입력받아서 data.txt 파일에 저장하기
 */
public class FileOutPutStreamEx2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		System.out.println("저장할 내용을 입력하세요(종료:exit)");
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			//byte[] (data+"\n").getBytes() : 문자열의 내용을 byte[] 리턴
			fos.write((data+"/n").getBytes());
		}
		fos.flush();
		fos.close();
	}
}
