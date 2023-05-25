package chap10;
/*
 * throws : 예외처리
 * 			예외던지기 : 예외 발생 메서드에서 호출한 메서드로 예외 전달.
 * 						=> 호출한 메서드로 예외
 */
public class ExceptionEx4 {
	public static void main(String[] args)throws Exception {
		try {
			first();
		} catch(RuntimeException e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace(); //예외 정보 출력
		}
	}

	private static void first() throws Exception {
		System.out.println("first 메서드");
		second();
		
	}

	private static void second() throws Exception {
		System.out.println("second 메서드");
		System.out.println(Integer.parseInt("abc"));//NumberFormatException
		
	}
}
