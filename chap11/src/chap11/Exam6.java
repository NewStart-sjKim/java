package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
	Scanner sc = new Scanner(System.in);
	int y = sc.nextInt();
	int m = sc.nextInt();
	String dstr = y + "-" + (m+1) + "-01";
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	Date day = null;
		try {
			day = sf.parse(dstr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		try {
//			day = sf.parse(sday);
//		}catch (ParseException e) {
//			e.printStackTrace();
//		}
		//다음달1일 - 하루시간 => 이번달의 마지막일자
		day.setTime(day.getTime()-(1000*60*60*24));
		//마지막일자와 요일 출력하기
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}
