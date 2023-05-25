package chap5;

import java.util.Scanner;

/*
 * 정수값 5개를 입력받아서
 * 입력받은 수의 합계,평균,최대값,최소값,최대값인덱스값,최소값인덱스값 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수값 5개를 입력하세요");
		int arr[] = new int[5];
		int sum=0,maxidx=0,minidx=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			if(arr[maxidx]< arr[i])
				maxidx = i;
			if(arr[minidx]> arr[i])
				minidx = i;
		}
		System.out.println("합계"+sum);
		System.out.println("평균:"+(double)sum/arr.length);
		System.out.println("최대값:"+arr[maxidx]+",인덱스:"+maxidx);
		System.out.println("최소값:"+arr[minidx]+",인덱스:"+minidx);
		
		
	}

}
