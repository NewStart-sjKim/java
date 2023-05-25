package chap11;
/*
 * StringBuffer 주요 메서드
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abd").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.insert(5,"==");
		System.out.println(sb);
		sb.insert(6,1.23);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abd");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
