package chap4;
/*
 * 중첩조건문 : if 구문내부에 if 구문이 가능함
 */
import java.util.Scanner;
public class IfEx2 {
	public static void main(String[] args) {
		int score = 65;
		if(score >= 60) {
			System.out.println("합격입니다.");
			if(score >= 80)
				System.out.println("좋은 성적을 받으셨습니다.");
		}else {
			System.out.println("불합격입니다.");
		}
}
}