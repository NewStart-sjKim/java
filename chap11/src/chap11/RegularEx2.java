package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 정규 표현식 예제
 *  . : 문자 하나
 *  ? : 0또는 1
 *  * : 0개 이상
 *  + : 1개 이상
 *  ^[] : 문자열의 시작
 *  [^] : 지정된 문자 제외
 *  | : 또는, or
 *  & : and
 *  (): 그룹
 *  \s : 공백한개
 *  \S : 공백이 아닌 문자 한개
 *  \d :  숫자 한개. [0~9]
 *  \D : 숫자가 아닌 문자
 *  \w : [0-9A-Za-Z]
 *  \W : 특수문자
 *  {n}: n개 
 *  {n,}: n개 이상
 *  {n,m}: n개~m개
 */
public class RegularEx2 {
	public static void main(String[] args) {
		String[] patterns = {
				".","[a-z]","[0-9]+","^[0-9]","[a-z]*",
				"[a-z]+","02|010","\\s","\\S","\\d","\\w","\\W"
		};
		String[] datas = {
				"","a","1","12","012","abc","02"," ","A","5","a","*"
		};
		for(String d : datas) {
			if(d.equals(""))System.out.println("빈문자\"\"의 패턴=>");
			else if(d.equals(" "))
				System.out.println("공백문자\"\"의 패턴=>");
			else
				System.out.println(d + "문자의 패턴 =>");
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) System.out.println(p + ",");
			}
			System.out.println();
		}
	}
}
