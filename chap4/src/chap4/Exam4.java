package chap4;

/*
 * 1~100까지 짝수의 합을 구하기
 * for
 * while
 * do while
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("for 구문을 짝수 합 구하기");
		int s = 0, i = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				s += i;
		}
		System.out.println("합계:" + s);
		System.out.println("while 구문을 짝수 합 구하기");
		s = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 == 0)
				s += i;
			i++;
		}
		System.out.println("합계" + s);
		System.out.println("do while 구문을 짝수 합 구하기");
		s = 0;
		i = 1;
		do {
			if (i % 2 == 0)
				s += i;
			i++;
		} while (i <= 100);
		System.out.println("합계:" + s);

//===================================================================================
//	2씩 증가
		System.out.println("for 구문");
		s = 0;
		i = 0;
		for (i = 2; i <= 100; i += 2) {
			s += i;
		}
		System.out.println("for 구문");
		System.out.println("while 구문");
		s = 0;
		i = 2;
		while (i <= 100) {
			s += i;
			i += 2;
		}
		System.out.println("while 구문");
		System.out.println("do while 구문");
		s = 0;
		i = 2;
		do {
			s += i;
			i += 2;
		} while (i <= 100);
		System.out.println("do while 구문");
	}

}
