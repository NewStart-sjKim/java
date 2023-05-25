package chap11;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 
 */
public class RegularEx3 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111, 집:01-123-6778,"
				+ "이메일:regular@aaa.bbb,계좌번호:301-01-123456";
		/*
		 * () : 그룹
		 * 0\\d{1,2} 	: 0으로시작 숫자 1개 ~ 개 인 데이터
		 * \\d{3,4}		: 숫자 3~4개인 데이터
		 */
		String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i=0;
		System.out.println("전화번호 : ");
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		//이메일 형식 데이터 찾기
		// \\w+ " [0-9A-Za-z]+
		i=0;
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		System.out.println("이메일 :");
		p = Pattern.compile(emailPattern);
		 m = p.matcher(source);
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		//계좌번호 형식 데이터 찾기
			i=0;
			String accountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
			System.out.println("계좌번호 :");
			p = Pattern.compile(accountPattern);
			 m = p.matcher(source);
			while(m.find()) {
				System.out.println(++i + ":" + m.group() + "=>" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
	}
}
