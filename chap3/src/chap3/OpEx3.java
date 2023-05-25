package chap3;
/*
 *  이항연산자 : 산술연산자 : +,-,*,/,%(나머지)
 *   / : 정수/정수 몺은 결과가 정수.
 *   % : 나머지 결과는 피젯수의 부호를 따른다.(나누는값)
 */
public class OpEx3 {

	public static void main(String[] args) {
		int x=10,y=8;
		System.out.println("10+8="+(x+y));
		System.out.println("10-8="+(x-y));
		System.out.println("10*8="+(x*y));
		System.out.println("10/8="+(x/y));
		System.out.println("10%8="+(x%y));
		//나누기
		System.out.println("10/8="+(x/y));
		System.out.println("-10/8="+(-x/y));
		System.out.println("10/-8="+(x/-y));
		System.out.println("-10/-8="+(-x/-y));
		//나머지 : 피젯수를 따라가서 값이 나온다
		System.out.println("10%8="+(x%y));
		System.out.println("-10%8="+(-x%y));
		System.out.println("10%-8="+(x%-y));
		System.out.println("-10%-8="+(-x%-y));
		

	}

}
