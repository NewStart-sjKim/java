package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 화면에서 파일명을 입력받고, 출력을 시작할 시작라인,출력 라인수를 입력받아서
 * 시작라인부터 라인수까지의 내용을 화면에 출력하기.
 * 
 * [결과]
 * 파일명을 입력하세요
 * src/chap14/InputStreamEx1.java
 * 시작라인
 * 1
 * 라인수
 * 3
 * 1:package chap14;
 * 2:
 * 3:import java.io.IOException;
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		//stdin : 키보드로 부터 한줄씩 읽을 수 있는 객체.
		//		  stdin.readLine() 사용 가능
		BufferedReader stdin = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String filename = stdin.readLine();
		System.out.println("시작라인:");
		String std = stdin.readLine();
		System.out.println("라인수:");
		String num = stdin.readLine();
		//start : 출력한 파일의 라인 시작 번호
		int start = Integer.parseInt(std.trim());//시작라인 정수화
		//len : 출력할 라인 수
		int len = Integer.parseInt(num.trim());//라인수 정수화
		
		//파일읽기 시작
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String data = null; //파일로부터 한줄씩 읽은 데이터
		int line = 0; //파일의 라인수
		int cnt = 0; //출력한 라인수.
		while((data = br.readLine()) != null) {
			++line; //파일의 라인수
			if (line < start) continue;
			if (cnt >= len)	  break;
			++cnt;		//출력 수
			System.out.println(line + ":" + data);
		}
		br.close();
		stdin.close();
	}
}
