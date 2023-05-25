package chap4;
/*
 * 1~10 까지의 합구하기
 */
public class LoopEx2 {
	public static void main(String[] args) {
		System.out.println("for 구문을 합 구하기");
		int sum=0,i=0;
		for(i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("합계:"+sum);
		System.out.println("while 구문으로 합 구하기");
		sum=0;
		i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("합계:"+sum);
		System.out.println("do while 구문으로 합 구하기");
		sum=0;
		i=1;
		do {
			sum +=i;
			i++;
		}while(i<=10);
		System.out.println("합계:"+sum);
	}

}
