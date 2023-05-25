package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		//1. 배열의 선언
		int[] arr;
		//2. 배열의 생성
		arr = new int[5];
		/*
		 * new 연산자
		 * 1. 객체 생성. int 값 저장할 수 있는 변수 5개 할당
		 * 2. 기본값 초기화
		 * 		숫자 : 0
		 * 		boolean : false
		 * 		그외  : null
		 */
		//3. 배열의 값 초기화
		arr[0] = 10;
		arr[1] = 20;
		//4. 배열의 값 조회
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"]="+arr[i]);
		//1,2 배열의 선언, 생성
		int arr2[] = new int[3];
		//3. 배열의 초기화
		arr2[0]=100;
		arr2[1]=200;
		//4.배열값 조회
		for(int i=0;i<arr2.length;i++)
			System.out.println("arr2["+i+"]="+arr2[i]);
		System.out.println("arr2 = arr");
		arr2 = arr;
		for(int i=0;i<arr2.length;i++)
			System.out.println("arr2["+i+"]="+arr2[i]);
		arr[3]=555;
		for(int i=0;i<arr2.length;i++)
			System.out.println("arr2["+i+"]="+arr2[i]);
		
		//개선된 for 구문
		// 첨자(인덱스) 사용 불가. 요소의 값만 사용가능함
		// 첨자를(인덱스) 사용시는 기존 for 구문을 사용해야 함
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
