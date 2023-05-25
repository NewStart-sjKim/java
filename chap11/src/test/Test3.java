package test;
/*
[결과] 
 HTML=>홍길동
 CSS=>김삿갓
 JavaScript=>이몽룡
 JAVA=>성춘향
 JSP=>임꺽정
 스프링=>향단이
*/
public class Test3 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JavaScript-JAVA-JSP-스프링";
		String s2 = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
		String[] srr1 = s1.split("-");// s1 문자열 - 으로 분리하여 배열 저장
		String[] srr2 = s2.split(",");// s2 문자열 , 으로 분리하여 배열 저장
		for(int i=0;i<srr1.length;i++) 	{
			System.out.printf(srr1[i]+"=>"+srr2[i].trim());
			//\\s* : 공백0개이상 => 정규식 : 문자의 특성을 기호표시
			srr2 = s2.split("\\s*,\\s*");
			for(int i1=0;i1<srr1.length;i1++)
				System.out.printf("%s=>%s:" + srr1[i1],srr2[i1]);
		}
		
	}
}