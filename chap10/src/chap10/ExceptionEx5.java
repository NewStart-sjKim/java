package chap10;
/*
 * throws	: 예외처리. 발생된 예외를 호출한 메서드로 전달하여 예외 처리.
 * throw	: 예외 발생. 없는 예외를 발생
 */
public class ExceptionEx5 {
	public static void main(String[] args)throws Exception {
		try {
		first();
		} catch(Exception e) {
			System.out.println("main 메서드에서 예외 처리");
		}
	}

	private static void first() {
		System.out.println("first 메서드");
		second();
		
	}

	private static void second() {
		System.out.println("second 메서드");
		try {
		System.out.println(Integer.parseInt("abc"));
		} catch(Exception e) {
			System.out.println("second 메서드에서 예외처리");
			throw e;
		}
	}
}
