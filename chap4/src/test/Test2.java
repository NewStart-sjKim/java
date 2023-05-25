package test;
/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고,  (o)
  한개의 숫자를 입력받아 가위바위보 게임하기 

  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
 */

/*
 * 1.화면에 숫자 입력했을 떄  가위,바위,보 나오고
 * 2.
 * 
 * */
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int sys = (int)(Math.random()*3)+1; // 시스템값
		
		System.out.println("숫자를 입력하시오");
		Scanner sc= new Scanner(System.in);
		int me = sc.nextInt();
		if(sys>me) {
			if(sys == 3 && me == 1){
				System.out.println("사용자가 이겼습니다!");
			}else {
				System.out.println("시스템이 이겼습니다!");}
			}else if(sys<me){
			if(sys == 1 && me == 3) {
				System.out.println("시스템이 이겼습니다!");
			}else {
				System.out.println("사용자가겼습니다!");}
			}else 
				System.out.println("비겼습니다!");
		
		boolean win = false;
		System.out.print
		("시스템:" + sys + "사용자");
			
	}
}