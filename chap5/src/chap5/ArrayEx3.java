package chap5;
/*
 * 로또 번호 생성
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for(int i=0;i<balls.length;i++) {
			balls[i]=i+1;
		}
		for(int i=0;i<=1000;i++) {
			int f = (int)(Math.random()* 45); //0~44 중 한개
			int t = (int)(Math.random()* 45); //0~44 중 한개
			//swap 알고리즘
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		for(int b : lotto)
			System.out.print(b+",");
		System.out.println();
		
		System.out.println("로또 번호 정렬하기");
		for(int i=0;i<lotto.length;i++) {// i:0
			/*
			 38,5,30,21,37,12
			 i:0
			 */
			for(int j=0;j<lotto.length-1-i;j++) { // j : 0~4
				if(lotto[j]>lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
				}
			}
			System.out.print(i+":");
			for(int a : lotto) System.out.print(a+",");
			System.out.println();
		}
		for(int b : lotto) System.out.print(b+",");
		}

}
