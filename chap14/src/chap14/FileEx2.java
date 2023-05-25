package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *  File 클래스의 주요 메서드
 *  getAbsolutePath() : 절대경로
 *  mkdir() : 하위 폴더 생성
 *  mkdirs(): 여러 하위 폴더 생성
 *  createNewFile() : 파일 생성
 *  getName() : 파일이름
 *  length()  : 파일의 크기(바이트)
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s폴더 생성:%b\n",f1.getAbsolutePath(),f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일 생성:%b\n",f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일 생성:%s,파일의크기:%d\n",f2.getName(),f2.length());
		
		
		File f3 = new File("c:/temp1/test.txt");
		if(f3.exists()) { //파일 존재하니?
			System.out.println(f3.getName() + "파일은 존재함");
		}else { // 파일 없음
			System.out.println(f3.getName() + "파일은 없음");
		}
		
		System.out.printf("%s->%s 이름 변경 :%b%n",
				f2.getName(),f3.getName(),f2.renameTo(f3));
		//f3.lastModified() : 1970년 부터 현재까지 밀리초 리턴
		System.out.printf("%s파일 최종 수정시간 :%s%n",
				f3.getName(),new Date(f3.lastModified()));
		System.out.printf("%s 파일 삭제:%b%n",
				f3.getName(),f3.delete());
	}
}