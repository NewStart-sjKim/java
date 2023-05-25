package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 포현식 예제 : 문자의 형식을 지정하여 일치 여부를 결정
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.",
				"car","combat","count","cTT","data","disk","c"};
		/*
		 * c[a-zA-Z]?
		 * c : c 문자로 시작
		 * [a-zA-Z] : a~z,A~Z . 대소문자
		 * ? : 0 또는 1개
		 * * : 0 개 이상
		 * + : 1 개 이상
		 */
		Pattern p = Pattern.compile("c[a-zA-Z]?");
		for(String s : data) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.print(s + ",");
			}
		}
		System.out.println();
		String names = "홍길동,	김삿갓,이몽룡	,	성춘향	,	임꺽정" ;
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr)
			System.out.println(s);
	}
}
