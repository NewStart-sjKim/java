package chap10;
/*
 * 사용자 예외 클래스 생성하기
 * 
 * 		Exception 클래스 상속 : 예외처리가 필요한 예외 클래스 생성.
 * 		RuntimeException 클래스 상속 : 예외처리 생략 가능 예외 클래스 생성.
 */
class LoginFailException extends Exception{
	LoginFailException(String msg){
		super(msg);
	}
}
class LoginFailException2 extends RuntimeException{
	LoginFailException2(String msg){
		super(msg);
	}
}
public class ExceptionEx8 {
	public static void main(String[] args) {
	String id = "hong";
	String pw = "1234";
	try {
	if(!id.equals("hong") || !pw.equals("1234")) {
		throw new LoginFailException("아이디나 비밀번호 오류입니다.");
	}
	System.out.println("반갑습니다. hong님.");
	throw new LoginFailException2("RuntimeException 클래스 상속");
	} catch(LoginFailException e) {
		System.out.println(e.getMessage());
		}
	}
}
