package arrayex;

public class Exam1 {

	public static void main(String[] args) {
		//배열 선언 : int 형 배열을 참조할 참조 변수 선언
		int sum = 0;
		int[] arr;
		arr = new int[10];
		for(int i=0;i<arr.length;i++){ 
			arr[i] = (int) (Math.random()*100)+1;
		}
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//arr의 모든 값들의 합을 구하여 출력하기
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);
		System.out.println("정렬하기");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
