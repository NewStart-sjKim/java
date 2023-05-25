package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * File 클래스로 파일 읽어 오기
 */
public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("aaa.txt");
		if(!f.exists()) {
			System.out.println("해당 파일은 존재하지 않습니다.");
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		byte[] buf = new byte[8096];
		int len = 0;
		while((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		fis.close();
		f.delete();
	}
}
