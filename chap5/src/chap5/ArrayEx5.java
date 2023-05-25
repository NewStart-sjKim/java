package chap5;

import java.net.MulticastSocket;
import java.util.Scanner;

/*
 * 10진수를 입력받아 16진수로 변환하기
 */
public class ArrayEx5 {
	public static void main(String[] args) {
	char data[]	= {'0','1','2','3','4','5','6','7','8','9',
					'A','B','C','D','E','F'};
	//toCharArray() : 문자열 데이터를 char[]로 변환 함수
	char data1[] = "0123456789ABCDEF".toCharArray();
	char[] hex = new char[8];
	System.out.println("16진수로 변환할 10진수를 입력하세요");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int divnum = num;
	int index = 0;
	while(divnum > 0) {
		hex[index++] = data[divnum%16];
		divnum /=16;
	}
	System.out.print(num + "의 16진수");
	for(int i=index-1;i>=0;i--) System.out.print(hex[i]);
	System.out.println();
	}
}
