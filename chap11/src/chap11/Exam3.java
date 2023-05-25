package chap11;
/*
 * delChar 메서드 구현하기
 * StringBuffer delChar(원본문자열,삭제문자열)
 * : 원본문자열에서 삭제 문자열을 제거하고 나머지 문자열 리턴
 */
public class Exam3 {
	public static void main(String[] args) {
		/*
		 * (1!2@3^4~5)~!@#$%^*()
		 * (!@^~)
		 */
		System.out.println(dlChar("(1!2#3^4~5)","~!@#$%^*()")); //12345
		System.out.println(dlChar("(1!2#3^4~5)","12345"));// (!@^~)
		
	}
	static StringBuffer dlChar(String s1, String s2) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s1.length();i++) {			
		//	char ch = s1.charAt(i);
		//	if(s2.indexOf(ch)<0) // s1.charAt(i)가 s2에 없다
		// 	s2.contains(String s) : s2 문자열에 s문자가 포함됐니?
			if(!s2.contains(s1.charAt(i)+""))// s1.charAt(i)가 s2에 없다
				sb.append(s1.charAt(i));
		}
	
		return sb;
	}
}
