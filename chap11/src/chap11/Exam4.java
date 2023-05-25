package chap11;
/*
 * double round (double 실수값, int 자리수)
 * double truncate(double 실수값, int 자리수)
 * 	String.format(),
 * 	Double.parseDouble()
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1)); //3.1
		System.out.println(round(3.1215,2)); //3.12
		System.out.println(round(3.1215,3)); //3.122
		System.out.println(truncate(3.15345,1));//3.1
		System.out.println(truncate(3.15345,2)); //3.15
		System.out.println(truncate(3.15345,3)); //3.153
		System.out.println(truncate(3.15345,4)); //3.1534
	}

	private static double round(double d, int i) {
		String sf2 = String.format("%."+i+"f",d);
		return Double.parseDouble(sf2);

	}

	private static double truncate(double d, int i) {
//		double num = Math.pow(10,i);
//		return (int)(d*num)/num;
		String sd = d + "";
		int dot = sd.indexOf(".");
		return Double.parseDouble
				(sd.substring(0,dot) + sd.substring(dot,dot+1+i));
	}
}
