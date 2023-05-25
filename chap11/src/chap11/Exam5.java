package chap11;

import java.util.Random;

/*
 * true/false 값을 난수로 발생하여 시스템과 사용자 중 3번 연속 true가 나오는 한쪽
 * 승리하는 프로그램 구현하기
 * 
 * 시스템 true 사용자 true
 * 시스템 true 사용자 false
 * 시스템 true 사용자 true
 * 시스템 승리
 */
public class Exam5 {
	public static void main(String[] args) {
		/*
		Random u = new Random();
		Random s = new Random();
		s.setSeed(System.currentTimeMillis());
		s.setSeed(System.currentTimeMillis()+1000000);
		while(true) {
			if(u.nextBoolean()) {
				System.out.print("사용자 true\t");
				ucnt++;
			}else {
				System.out.print("사용자 false\t");
			 	ucnt = 0;
			}if(u.nextBoolean()) {
			 		System.out.println("시스템 true\t");
			 		scnt++;
			 	}else {
			 		System.out.println("시스템 false\t");
			 		scnt = 0;
			 	}if(ucnt == 3 || scnt == 3)
			 		break;
		}
		System.out.println(ucnt == 3 ? "사용자 승리" : "시스템 승리");
		*/
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int ucnt=0,scnt=0;
		while(true) {
			boolean svalue = rand.nextBoolean();
			boolean uvalue = rand.nextBoolean();
			if(svalue) {
				System.out.print("사용자 true\t");
				ucnt++;
			}else {
				System.out.print("사용자 false\t");
			 	ucnt = 0;
			}if(uvalue) {
			 		System.out.println("시스템 true\t");
			 		scnt++;
			 	}else {
			 		System.out.println("시스템 false\t");
			 		scnt = 0;
			 	}if(ucnt == 3 || scnt == 3)
			 		break;
		}
		System.out.println(ucnt == 3 ? "사용자 승리" : "시스템 승리");
	}
}
