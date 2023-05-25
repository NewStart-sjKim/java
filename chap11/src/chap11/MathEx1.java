package chap11;
/*
 * Math 클래스 : 수치 계산 가능 클래스. final, 객체 생성 안됨.
 * 				모든 멤버가 static.
 * 				상수 : PI(원주율), E(자연로그)
 */
public class MathEx1 {
	public static void main(String[] args) {
		// 절대값 : abs()
		System.out.println("Math.abs(5) = " + Math.abs(5));
		System.out.println("Math.abs(-5) = " + Math.abs(-5));
		System.out.println("Math.abs(3.14) = " + Math.abs(3.14));
		System.out.println("Math.abs(-3.14) = " + Math.abs(-3.14));
		//근사정수 	: ceil(),floor(),rint()
		//ceil() 	: 큰 근사정수
		System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));//6.0
		System.out.println("Math.ceil(-5.4) = " + Math.ceil(-5.4));//-5.0
		//floot()	: 작은큰사정수
		System.out.println("Math.floor(5.4) = " + Math.floor(5.4));//5.0
		System.out.println("Math.floor(-5.4) = " + Math.floor(-5.4));//6.0
		//rint()	: 근사정수
		System.out.println("Math.rint(5.4) = " + Math.rint(5.4));//5.0
		System.out.println("Math.rint(-5.4) = " + Math.rint(-5.4));//-5.0
		//최대,최소	: max(),min()
		System.out.println("Math.min(5,4) = " + Math.min(5,4));//4
		System.out.println("Math.min(5.4,5.3) = " + Math.min(5.4,5.3));//5.3
		System.out.println("Math.max(5,4) = " + Math.max(5,4));//5
		System.out.println("Math.max(5.4,5.3) = " + Math.max(5.4,5.3));//5.4
		//반올림 : round()
		System.out.println("Math.round(5.4) = " + Math.round(5.4)); //5
		System.out.println("Math.round(5.5) = " + Math.round(5.5));	//6
		//난수 : random()
		System.out.println("Math.random() = " + Math.random());	//0<= x <1.0
		//삼각함수
		//sin 90도
		System.out.println("Math.sin(Math.PI/2) = " + Math.sin(Math.PI/2));
		//cos 60도
		System.out.println("Math.cos(toRadians(60)) = " + Math.cos(Math.toRadians(60)));
		//tan 45도
		System.out.println("Math.tan(Math.PI/4) = " + Math.tan(Math.PI/4));
		//도 <- 라디안
		System.out.println("Math.toDegrees(Math.PI)" + Math.toDegrees(Math.PI));
		//log 함수
		System.out.println("Math.log(Math.E) = " + Math.log(Math.E));
		//제곱근
		System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
		//제곱
		System.out.println("Math.pow(5,3) = " + Math.pow(5,3));//5*5*5
	}
}
