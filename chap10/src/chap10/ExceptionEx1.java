package chap10;
/*
 * 예외 처리 : 발생된 예외를 정상화 하는 과정
 * 	try 블럭 : 예외발생 가능성이 있는 문장들의 모임. 예외 발생시
 * 				catch 블럭으로 제어 이동
 * 	catch 블럭 : try 블럭에서 발생된 예외를 처리.
 * 				try 블럭에서 에외 발생시 호출괴는 블럭.
 * 				반드시 try 블럭과 함계 사용해야 함.
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
//		System.out.println(args[0]);//ArrayIndexOutOfBoundsException 예외발생
		try {
			System.out.println(args[0]);//ArrayIndexOutOfBoundsException 예외발생
			System.out.println(1/0);//ArithmeticException 예외 발생
			System.out.println(2);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		}
		System.out.println("프로그램 종료");
	}

}
