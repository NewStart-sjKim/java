package test;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 - 32
     대문자 = 소문자 + 32
     '0'  : 48
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
public class Test1 {
	public static void main(String[] args) {
		System.out.print("문자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		if(ch >='a' && ch <='z') {
			ch -= 32;
			System.out.println(ch);
		}
		else if (ch >='A' && ch <='Z') {
			ch += 32;
			System.out.println(ch);	
		}
		else 
			System.out.println("기타문자");
		
	
		
			Scanner sc = new Scanner(System.in);
			char ch1 = sc.next().charAt(0);
			if(ch1 >= 'A' && ch1 <='Z') {//대문자
				System.out.println((char)(ch+32));
			}else if(ch1 >= 'a' && ch1 <='z'){//소문자
				System.out.println((char)(ch-32));
			}else if(ch1 >= '0' && ch1 <='9'){//숫자
				System.out.println(ch + 20);//ch1 코드값+20
				// '1' - '0' + 49 - 48 = 1
				// '3' - '0' 
				System.out.println((ch1-'0') + 20);
			}
		
	}	
}