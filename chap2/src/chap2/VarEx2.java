package chap2;
/*
 *  문자형: char 기본자료형, 한개문자만가능. 작음따옴표 표현, '
 *  문자열형 : string 참조형. 문자0개 이상. 큰따옴표 표현, "
 *  특수 문자: \
 *  
 */
public class VarEx2 {

	public static void main(String[] args) {
//		char ch1 = ''; // 문자는 한개 필요
//		char ch1 = ""; //"는 문자열의 의미. string 객체만 가능. 오류발생
		char ch1 = 'A';
		System.out.println(ch1); //A  1byte:8bit : ASC 라고한다
		char ch2=(char)65;
		System.out.println(ch2); // A 형변환
		System.out.println('B'-'A'); // 1
		//특수문자
		char single = '\''; //\' : 순수한 문자\'
		System.out.println(single);
		System.out.println("서울\t대전\t대구\t부산"); //\t :탭 
		System.out.println("안녕하세요\n이부분은 다음줄에 출력됩니다."); //\n : 다음라인 newline
		System.out.println("\uD64D\uAE38\uB3D9"); //  : 유니코드
												  // 16bit : 유니코드 (UTF8)
												  // 2byte 문자표시
		System.out.println("c:\\test"); // \\ : 순수문자\
		
		// 변수 선언
//		int true = 100; // 오류 true가 예약어. 예약어는 변수명 사용 불가!
		int True = 100;
		char $harp = '#'; //가능
//		int 7up = 7; // 숫자 시작 안됨.
		int 숫자=0; // 한글 변수명 사용 가능함. 권장하지 않음. 웹으로 가면 유니코드로 바껴서 나감
	}	

}
