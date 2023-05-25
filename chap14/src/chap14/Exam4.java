package chap14;

import java.io.File;

/*
 * c:\windows 폴더의 하위폴더 갯수와, 파일의 갯수. 파일의 총크기 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		File f1 = new File("c:/windows");
		int dircnt = 0, filecnt = 0;
		long size = 0;
		String[] files = f1.list();
		for(String f : files) {
			File f2 = new File(f1,f);
			if(f2.isDirectory()) dircnt++;
			else if(f2.isFile()) {
				filecnt++;
				size += f2.length();
			}
		}
		System.out.println("폴더의 갯수:" + dircnt);
		System.out.println("파일의 갯수" + filecnt);
		System.out.printf("파일의 총 크기 :%,dbyre\n",size);
	}
}
