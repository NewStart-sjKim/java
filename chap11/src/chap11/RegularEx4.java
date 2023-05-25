package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학85,과학95";
		//\\d{2,3} : 숫자 2~3자리
		//Pattern p = Pattern.compile("\\d{2,3}");
		Pattern p = Pattern.compile("[0-9]{2,3}");
		Matcher m = p.matcher(data);
		int sum = 0;
		int i = 0;
		//m.find() : 패턴에 일치하는 문자열 검색
		while(m.find()){
			System.out.println(m.group()+",");
			i++;
			sum += Integer.parseInt(m.group());
		}
		System.out.println("총점:" + sum + ",평균:" + (double)sum/i);
	}
}
