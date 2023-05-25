package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx3 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//charAt(4) : 4번인덱스의 문자 리턴, 5번째 문자
		System.out.println("s.charAt(4):" + s.charAt(4));//E
		/*
		 * s.compareTo('abc') : 정렬에 사용되는 메서드. 대소문자 구분
		 * 		음수리턴 : s 문자열이 abc 문자열보다 앞쪽으로 인식	 s < 'abc'
		 * 		양수리턴 : s 문자열이 abc 문자열보다 뒷쪽으로 인식 s > 'abc'
		 * 		0	   : 같은 문자열.
		 */
		System.out.println("s.compareTo('abc'):" + s.compareTo("abc"));
		System.out.println("s.compareTo('AAA'):" + s.compareTo("AAA"));
		//s.compareToIgnoreCase : 대소문자 상관없이 비교.
		//IgnoreCase : 대소문자 상관 없이의 의미
		System.out.println("s.compareToIgnoreCase('abc'):" + s.compareToIgnoreCase("abc"));
		//s.endsWith('GH') : s 문자열의 끝이 GH야?
		System.out.println("s.endsWith('GH'):" + s.endsWith("GH"));
		// s.startsWith('AB') : s 문자열의 시작이 AB야?
		System.out.println("s.startsWith('AB'):" + s.startsWith("AB"));
		//equals : 내용비교.
		System.out.println("s.equals('ABCDEFGH'):" + s.equals("ABCDEFGH"));
		//equalsIgnoreCase : 대소문자 상관없이 내용비교
		System.out.println("s.equalsIgnoreCase('abcdefgh'):" + s.equalsIgnoreCase("abcdefgh"));
		s = "This is a String";
		//s.indexOf('i') : s 문자열에서 i 문자의 위치 리턴
		System.out.println("s.indexOf('i'):" + s.indexOf('i'));//2
		//s.indexOf('i',3) : s 문자열에서 3번 인덱스 부터 i 문자열의 위치 리턴
		System.out.println("s.indexOf('i,3'):" + s.indexOf('i',3));//5
		//s 문자열에 Q 문자가 없는경우 -1 리턴
		System.out.println("s.indexOf('Q'):" + s.indexOf('Q'));//-1
		//s.lastIndexOf('i') : 뒷쪽에서 i 문자의 위치를 찾는다.
		//						인덱스는 앞에서 부터 찾는다.
		System.out.println("s.lastIndexOf('i'):" + s.lastIndexOf('i')); //13
		//length : 문자열의 길이
		System.out.println("s.length():" + s.length());
		//s.replace('is','QR') : 문자열 치환. is 문자열을 QR 문자열로 치환
		System.out.println("s.replace('is','QR'):" + s.replace("is","QR"));
		//s.replace('is','') : 문자열 치환. is 문자열을 빈문자열로 치환
		System.out.println("s.replace('is',''):" + s.replace("is",""));
		s = "This is a String";
		//substring : 부분문자열
		//s.substring(5) : 5번 인덱스 이후 문자열 리턴
		System.out.println("s.substring(5):" + s.substring(5));
		//s.substring(5,13) : 5번 인덱스 부터 12번 인덱스 까지 문자열 리턴
		//					  13번 인덱스 포함 안됨
		System.out.println("s.substring(5,13):" + s.substring(5,13));
		//대소문자 변경
		//toUpperCase()(대문자), toLowerCase()(소문자)
		System.out.println("s.toUpperCase():" + s.toUpperCase());
		System.out.println("s.toLowerCase():" + s.toLowerCase());
		//trim() : 양쪽 공백 제거
		s = "		문자열 trim 메서드		";
		System.out.println("s:" + s);
		System.out.println("s.trim():" + s.trim());
		System.out.println("s.length():" + s.length());
		System.out.println("s.trim().s.length():" + s.trim().length());
		//split : 문자열을 분리하여 배열로 리턴
		s = "홍길동,이몽룡,김삿갓";
		String[] arr = s.split(",");
		for(String sr : arr)
			System.out.println(sr);
	}
}
