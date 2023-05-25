package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
   src/chap14 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
   InputStream예제.txt  파일 하나에 저장 하기
   InputStream 관련 모든 소스 : XXXInputStreamXXX.java
*/
public class Test2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("src/chap14");//상대경로
		//절대 경로 : root 폴더부터 폴더 경로를 설정
		//File f1 = new File("D:/20230125/java/workspace/chap14/src/chap14"); 
		String[] flist = f1.list(); //chap14 폴더의 하위 파일 목록
		int len;
		FileOutputStream fos = 
				 new FileOutputStream("InputStream예제.txt");
		byte[] buf = new byte[1024];//1K
		for(String fname : flist) {
			//fname : chap14 폴더의 하위 파일 이름 중 한개
		   File f2 = new File(f1,fname);
		  if(f2.isFile() && 
		     fname.indexOf("InputStream") >= 0 && 
		     fname.endsWith(".java")) {
			FileInputStream fis = new FileInputStream(f2);
			fos.write(("\n\n************" 
			   + fname + "*************\n\n").getBytes());
			while((len=fis.read(buf)) != -1) {
				fos.write(buf,0,len);
			}
			fis.close();
		}
	  }
	  fos.flush();
	  fos.close();
 
	}
}