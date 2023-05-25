package chap11;
//숫자 <- 문자열
public class StringEx5 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		System.out.println(i+200);//300
		float f = Float.parseFloat("100.5");
		System.out.println(f+200);//300.5
		double d = Double.parseDouble("100.5");
		System.out.println(d+200);//300.5
		Long l = Long.parseLong("100");
		System.out.println(l+200);//300
		
		System.out.printf("%02X\n", 255);//FF
		System.out.println(Integer.parseInt("FF",16));//255
		//"11" 문자열을 8진수로 인식하여 정수로 변환
		i = Integer.parseInt("11",8);
		System.out.println(i);//9
	}
}
