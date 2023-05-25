
package chap14;

import java.io.File;

/*
 * File 클래스
 *  - 파일 이나 폴더의 정보를 관리하는 클래스
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:/"; // 윈도우 폴더 구분자 : \\,/ 가능
		//f1 : c:\\ 폴더를 관리하는 객체
		File f1 = new File(filePath);
		//list() : f1 파일의 하위 목록 리턴
		String[] files  = f1.list();
		for(String f : files) {
			//f : 파일의 이름 또는 폴더 이름
			System.out.println(f);
			//f2 : 폴더의 하위파일 파일이름 지정하여 관리 객체
			File f2 = new File(filePath,f);
			if(f2.isDirectory()) {// 폴더?
				System.out.printf("%s:디렉토리\n", f);
			}else { // 파일
				//%d : 10진 정수세자리마다 , 로 출력
				//f.length() : 파일의 크기
				System.out.printf("%s:파일(%,dbyte)\n",f,f.length());
			}
		}
	}
}
