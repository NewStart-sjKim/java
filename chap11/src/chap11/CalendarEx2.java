package chap11;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar 클래스로 날짜 설정하기
 */
public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//객체 생성
		//2023-12-31로 설정
		cal.set(2023,(12-1),31);
		System.out.println("날짜:" + cal.get(Calendar.YEAR) + "-"
		+ (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE));
		//2023-12-31 ? 요일 로 출력하기
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println("날짜:" + cal.get(Calendar.YEAR) + "-"
		+ (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE) + week[cal.get(Calendar.DAY_OF_WEEK)] + "요일");
		String w = "일월화수목금토";
		System.out.println("날짜:" + cal.get(Calendar.YEAR) + "-"
				+ (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE) + w.charAt(cal.get(Calendar.DAY_OF_WEEK)) + "요일");
		Date now = new Date();
		now.setTime(now.getTime() + (1000*60*24));
		System.out.println(now);
		cal.setTime(now);//Calendar 객체 <= Date 객체
		System.out.println("날짜:" + cal.get(Calendar.YEAR) + "-"
				+ (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE) + w.charAt(cal.get(Calendar.DAY_OF_WEEK)) + "요일");
		//Date 객체 <= Calendar 객체
		Date day = new Date();
		//cal.getTimeInMillis() : 1970년 이(후의 밀리초.
		day.setTime(cal.getTimeInMillis());
		System.out.println(day);
		}
	}

