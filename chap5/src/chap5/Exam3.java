package chap5;
import java.util.Scanner;
/*
 * 문자열 내에 각소문자의 갯수 출력하기 
 */
public class Exam3 {
	public static void main(String[] args) {
		String str = "akjflasjafoajwgoiasgkslgahwwjgowagz";
		char[] alpha =str.toCharArray();
		int[] data = new int[26];
		for(int i=0;i < alpha.length;i++) {
			data[alpha[i]-'a']++;
		}
		for(int i=0;i<data.length;i++) {
			if (data[i]>0) {
				System.out.print((char)(i+'a')+":"+data[i]+"개=>");
				for(int j=0;j<data[i];j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}
