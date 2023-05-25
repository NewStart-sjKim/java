package arrayex;
/*
 * 1부터 10까지의 임의의수 10개를 배열에 저장하고
 * 저장된 수만큼 *를 출력하기
 * 
 * arr={3,5,1,...}
 * 3:***
 * 5:*****
 * 1:*
 * ...
 */
public class Exam2 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+":");
			for(int j=0;j<arr[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
