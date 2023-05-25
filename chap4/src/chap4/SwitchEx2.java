package chap4;
/*
 * 컴퓨터에서 임의의수 (난수)를 받아 상품 선택하기
 */
public class SwitchEx2 {
	public static void main(String[] args) {
		/*
		 *  Math.random() 				: 0 <=  x < 1.0 임의의수를 리턴
		 *  Math.random() * 10  		: 0 <=  x < 10.0
		 *  (int)(Math.random() * 10)   : 0 <=  x < 9 => 정수형태 (0~9사이)
		 *  num							: 1 <= 	x <=10
		 *  							: 1~10 사이의 임의의 정수값
		 */
		int num = (int)(Math.random() * 10) +1;
		switch(num) {
		case 1 : System.out.println("축하합니다. 자전거 당첨입니다");
				 break;
		case 2 : System.out.println("축하합니다.  USB 당첨입니다");
		 break;
		case 3 : System.out.println("축하합니다. 키보드 당첨입니다");
		 break;
		default :
				 System.out.println("다음 기회에...");
		}

	}

}
