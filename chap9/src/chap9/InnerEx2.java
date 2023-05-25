package chap9;
/*
 * 외부 클래스의 private 멤버 호출
 */
class Outer2{
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	
	static class StaticInner{
		// 클래스 멤버에서 인스턴스멤버 호출시 객체화 필요.
//		int siv = outeriv; //StaticInner는 Outer2 클래스의 클래스 멤버.
		int siv = new Outer2().outeriv; //StaticInner는 Outer2 클래스의 클래스 멤버.
		static int scv = outercv;
	}
/*
 * 지역내부클래스에서 사용되는 메서드의 지역변수는 상수화 되어야 한다.
 * 지역변수의 변경이 없는 경우는 상수로 판단함.
 * 지역변수의 변경이 있는 경우 오류 발생.
 */
	void method(int pv) {
		int pv2 = pv+1;
		//pv++;
		//pv2++;
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			void method(int num) {
				System.out.println("outeriv = " + outeriv);
				System.out.println("outercv = " + outercv);
				System.out.println("liv = " + liv);
				System.out.println("liv2 = " + liv2);
				num++;
				System.out.println("num = " + num);
				//pv++;
				System.out.println("pv = " + pv);
				System.out.println("pv2 = " + pv2);
			}
		}
		LocalInner lc = new LocalInner();
		System.out.println("lc.liv=" + lc.liv);
		System.out.println("lc.liv2=" + lc.liv2);
		lc.method(100);
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		//내부클래스 3개의 멤버 값들 출력하기
		Outer2 out = new Outer2();// 외부클래스 객체화
		out.method(10);
//		System.out.println(out.outeriv);//private 멤버. 다른클래스에서 접근 불가
//		System.out.println(out.outercv);//private 멤버. 다른클래스에서 접근 불가
//		instanceInner 객체생성
		Outer2.InstanceInner oi = out.new InstanceInner();
		System.out.println("InstanceInner.iiv=" + oi.iiv);
		System.out.println("InstanceInner.iiv2=" + oi.iiv2);
//		staticInner 객체생성
		Outer2.StaticInner os = new Outer2.StaticInner();
		System.out.println("StaticInner.siv=" + os.siv);
		System.out.println("StaticInner.siv=" + os.scv);
		System.out.println("StaticInner.siv=" + Outer2.StaticInner.scv);
	}
}
