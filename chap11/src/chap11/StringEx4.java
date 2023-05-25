package chap11;
/*
 * String.format 메서드 : 형식화된(서식문자사용) 문자열 리턴
 * 						클래스(static) 메서드 => 객체화 필요 없음
 * 형식화문자 : %d,%f,%c....
 * 		=> System.out.printf() 함수와 사용법 동일.
 */
public class StringEx4 {
	public static void main(String[] args) {
		//%f : 부동소숫점표시문자. 실수표시
		//%.2f : 소숫점이하 2자리로 표시
		String sf = String.format("%2f", 0.142);
		System.out.println(sf); //0.14
		sf = String.format("%.2f", 0.145);
		System.out.println(sf);	//0.15
		//%d : 10진 정수 출력
		sf = String.format("%d", 12345);
		System.out.println(sf);
		//%d : 10진 정수 출력. 세자리마다, 출력
		sf = String.format("%,d", 12345);
		System.out.println(sf);
		System.out.printf("%,d\n", 12345);
		//%10d : 10진 정수 출력. 10자리 확보후 출력, 우측정렬
		System.out.printf("%10d\n", 12345);
		//%-10d : 10진 정수 출력. 10자리 확보후 출력, 좌측정렬
		System.out.printf("%-10d\n", 12345);
		//%010d : 10진 정수 출력. 10자리 확보후 출력, 빈자리는 0으로 채움. -표시 불가
		System.out.printf("%010d\n", 12345);
		//%,10d : 10진 정수 출력. 10자리 확보후 출력, 세자리마다 , 출력
		System.out.printf("%,10d\n", 12345);
		//%-,10d : 10진 정수 출력. 10자리 확보후 출력, 세자리마다 , 출력, 좌측정렬
		System.out.printf("%-,10d\n", 12345);
		//%-,4d : 10진 정수 출력. 4자리 확보후 출력, 세자리마다 , 출력, 좌측정렬
		System.out.printf("%-,4d\n", 12345);
		//%X,%x : 16진수 정수 출력
		//%X : A~F로 표시. 대문자로 표시
		//%x : a~f로 표시. 소문자로 표시
		System.out.printf("%X.%x\n", 255,255);
		System.out.printf("%02X.%02x\n", 10,10);
		//%o : 8진 정수 출력
		System.out.printf("%o\n", 10);
		
		//%s : 문자열 출력
		System.out.printf("%s\n","홍길동");
		System.out.printf("%10s\n","홍길동");
		System.out.printf("%-10s\n","홍길동");
		//%c : 문자 출력
		System.out.printf("%c%c%c\n",'홍','길','동');
		//여러개의 자료형 출력
		System.out.printf("%s의 학점은 %c입니다. 점수는 %3d입니다.","홍길동",'A',95);
		System.out.println(String.format("%s의 학점은 %c입니다. 점수는 %3d입니다.","홍길동",'A',95));
	}
}
