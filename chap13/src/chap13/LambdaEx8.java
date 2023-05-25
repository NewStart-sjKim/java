package chap13;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * 	Function 인터페이스의 하위 인터페이스.
 * 	 매개변수, 리턴값 모두 존재. => 매개변수형, 리턴형이 같다.
 * 
 * IntBinaryOperator : int 형 매개변수 두개. int 형 리턴타입
 * 				int applyAsInt (int int)
 */
public class LambdaEx8 {
	private static Student[] List = {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",85,75,"통계")
			
	};
	public static void main(String[] args) {
		System.out.print("최대 수학 점수:");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?a:b));
		System.out.print("최소 수학 점수:");
		System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		System.out.print("최대 영어 점수:");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?a:b));
		System.out.print("최소 영어 점수:");
		System.out.println(maxOrMinEng((a,b)->(a<=b)?a:b));
		System.out.print("최대 점수 합계:");
		System.out.println(maxOrMinTot((a,b)->(a>=b)?a:b));
		System.out.print("최소 점수 합계:");
		System.out.println(maxOrMinTot((a,b)->(a<=b)?a:b));
		
	}
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = List[0].getMath(); 
		for(Student s : List)
			result = op.applyAsInt(result, s.getMath());
		return result;
	}
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = List[0].getEng(); 
		for(Student s : List)
			result = op.applyAsInt(result, s.getEng());
		return result;
	}
	private static int maxOrMinTot(IntBinaryOperator op) {
		int result = List[0].getMath()+ List[0].getEng(); 
		for(Student s : List)
			result = op.applyAsInt(result, s.getMath()+s.getEng());
		return result;
	}
}
