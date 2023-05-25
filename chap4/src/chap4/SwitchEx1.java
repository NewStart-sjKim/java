package chap4;
/*
 *  switch(조건값){
 *  	case 값1 : 문장1
 *  				break;
 *  	case 값2 : 문장1
 *  				break;
 *  ....
 *  default : 그외 문장
 *  }
 *  
 *  break : switch 구문에서 빠짐.
 */
public class SwitchEx1 {
	public static void main(String[] args) {
		int score = 65;
		switch(score/10) {
		case 9,10: System.out.println("A학점");break;
		case 8: System.out.println("B학점");break;
		case 7: System.out.println("C학점");break;
		case 6: System.out.println("D학점");break;
		default: System.out.println("F학점");break;
		}
		// 60점 이상이면 PASS, 60점 미만이면 FAIL 출력
		
		switch(score/10) {
		case 9,10: 
		case 8: 
		case 7: 
		case 6: System.out.println("PASS");break;
		default: System.out.println("FAIL");break;
		
		}
	}

}
