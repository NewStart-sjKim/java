package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 * Calendar 객체 이용하기
 */
public class Exam7 {
	public static void main(String[] args) {
	System.out.println("년도와 월을 입력하세요");
	Scanner sc = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int y = sc.nextInt();
	int m = sc.nextInt();
	//cal.set(y,m-1,1);// 입력한 년 월의 첫번째 날자로 설정
	//int lastday = cal.getActualMaximum(Calendar.DATE);
	//cal.set(y,m-1,lastday) //입력한 년월의 마지막 날자로 설정
	cal.set(y,m,0);
	String w = " 일월화수목금토";
	
	//System.out.println(y + "-" + m + "-" + lastday + " " +
	// week.charAt(cal.get(Claendar.DAY_OF_WEEK))+ " 요일 " ;
	System.out.println("년도:" + cal.get(Calendar.YEAR)+
		"이번달의 마지막 일자:" + cal.getActualMaximum(Calendar.DATE) + 
		w.charAt(cal.get(Calendar.DAY_OF_WEEK))  + "요일");
	}
}
