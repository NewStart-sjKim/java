package chap1;
/*
 * 여러줄 주석
 * 주석: 컴파일러의 번역 대상이 아닌 부분. 자바 문법과 관련이 벗는
 * 		부분으로 자유롭게 작성가능한 영역
 * 1. 자바는 대소문자 구분함.
 * 2. public class Hello 인경우 파일의 이름은 반드시 Hello .java 이어야 함.
 * 3. 자바 커파일러(javac)에 의해서 확장자가 .class인 바이트 코드 파일 생성됨.
 * 	  이클리스에서 위치는 bin/ 폴더의 하위에 생성
 * 4. 자바인터프리터(java)가 .class 파일을 읽어 실행함.
 * 
 */
public class Hello {
	// 한줄주석 : 슬레시 이후부분 한줄이 주석임.
	public static void main(String[] args) { // 프로그램 시작 점.
		
			System.out.println("Hello World"); // 표준출력(화면출력,콘솔출력)
	}

}
