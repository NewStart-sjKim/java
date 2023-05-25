package test2;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 *  12,340
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "1,234";
		
		int i = Integer.parseInt(str.replace(",",""));
		
		System.out.printf("%,d",i*10);
	}
}