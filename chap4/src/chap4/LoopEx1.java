package chap4;
/*
 * 반복문
 * 	for(초기값:조건문:증감식){
 * 		문장들
 * }
 * 							┌--------------┐		
 * 	for 실행 순서 : 초기값->조건문 참 -> 문장들->증감식
 * 							 거짓 -> for 밖. 반복문 종료
 * 	while(조건문) {
 * 		문장들
 * }
 * 						┌--------┐	
 * 	while 실행 순서 : 조건문 참 -> 문장들
 * 						 거짓 -> while 밖. 반복문 종료
 * 
 * 	do {
 * } while (조건문);
 * 						┌---------┐	
 * do while 실행 순서 : 문장들 -> 조건문 참->
 * 									거짓-> do while 밖. 반복문 종료
 */
public class LoopEx1 {
	public static void main(String[] args) {
	System.out.print(1);
	System.out.print(2);
	System.out.print(3);
	System.out.print(4);
	System.out.println(5);
	System.out.println("for 구문으로 1~5까지 출력");
	//i변수: for구문 내에서 선언 되었으므로, for구문 내에서만 사용가능함
	// 		지역변수라함
	for(int i=1;i<=5;i++)
		System.out.print(i);
	System.out.println();
	//System.out.println("i=" + i); //i 변수 사용 영역 밖. 오류 발생
	System.out.println("while 구문으로 1~5까지 출력");
	int i=10;
	while(i<=5) {
		System.out.print(i);
		i++;
		}
	System.out.println();
	System.out.println("do while 구문으로 1~5까지 출력");
	i=1   ;
	do {
		System.out.print(i);
		i++;
	}while(i<=5);
	System.out.println();
	}

}
