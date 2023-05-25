package chap6;
/*
 *초기화 블럭 예제
 *	static 초기화 블럭	: 클래스 변수의 초기화
 *					  클래스 정보 로드시 한번 실행됨.
 *	인스턴스 초기화 블럭	: 인스턴스 변수의 초기화. 생성자와 기능 겹침
 *					  객체화시 생성자 호출전에 먼저 실행됨.
 */
public class InitEx1 {
	
		static int cv;
		int iv;
		InitEx1(){
			System.out.println("5. 생성자 호출됨");
		}
		static{	//static 초기화 블럭
			cv = (int)(Math.random()*100);
			System.out.println("1. static 초기화 블럭 실행 : cv="+cv);
		}
		{	//인스턴스 초기화 블럭
			iv = (int)(Math.random()*100);
			System.out.println("4. 인스턴스 초기화 블럭 실행");
		}
		public static void main(String[]args) {
			System.out.println("2. main 메서드 시작");
			System.out.println("3. main 메서드 init1 객체생성");
			InitEx1 intitl = new InitEx1();
			System.out.println("3. main 메서드 init2 객체생성");
			InitEx1 intit2 = new InitEx1();
		}
	}


