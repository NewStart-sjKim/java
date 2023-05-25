package chap5;

public class ArrayEx2 {

	public static void main(String[] args) {
		//배열의 선언, 생성, 초기화
		int arr[] = {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]="+arr[i]);
		System.out.println("개선된 for 구문으로 요소 출력하기");
		for(int a : arr)
			System.out.println(a);
		//arr 참조변수에 새로운 배열 생성,초기화
		//생성,초기화
		arr = new int[]{100,200,300};
		for(int a: arr)
			System.out.println(a);
		
	}
}
