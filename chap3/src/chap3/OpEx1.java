package chap3;
/*
 * 단항연산자 : 연산자의 피연산자가 한개인 연산자.
 * 
 * 1. 증강연산자 : ++,--
 * 		++ : 변수의 값을 1 증가
 * 		-- : 변수의 값을 1 감수
 * 
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x=5,y=5;
		// 후위형 우선순위가 낮음(결과는 원래값이 나오고 저장되는건 플러스값)
		x++; // x의 값을 1 증가. x=6
		y--; // y의 값을 1 감소. y=4
		System.out.println("x="+x+",y="+y); //x=6,y=4
		// 전위형 우선순위가 먼저온다(저장된 값에 플러스 )
		++x;
		--y;
		System.out.println("x="+x+",y="+y); //x=7,y=4
		x=y=5;
		y = ++x;
		System.out.println("x="+x+",y="+y);
		y = x++;
		System.out.println("x="+x+",y="+y);
		System.out.println("x="+ x++);
		System.out.println("x="+ ++x);
		
	}

}
