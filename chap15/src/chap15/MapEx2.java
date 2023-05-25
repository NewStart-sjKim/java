package chap15;

import java.util.Arrays;
import java.util.List;

public class MapEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",80,95),
				new Student("이몽룡",70,75),
				new Student("김삿갓",75,70));
		//영어 점수 목록과 합계 출력하기
//		list.stream().mapToInt(Student::getEng)
//		.forEach(s->System.out.print(s+","));
		int sum = list.stream().mapToInt(Student::getEng)
		.peek(s->System.out.print(s+",")).sum();
		System.out.println("합계:" + sum);
		System.out.println("==============");
		//출력없음 : peek() 메서드는 중간 단계 메서드임.
		//최종 출력을 위해서는 forEach사용해야됨
		list.stream().mapToInt(Student::getEng)
		.peek(s->System.out.print(s + ","));
		System.out.println("==============");
		list.stream().mapToInt(Student::getEng)
		.forEach(s->System.out.print(s + ","));
		System.out.println("\n==============");
		//수학 점수 목록과 합계 출력하기
		System.out.println(list.stream().mapToInt(s->s.getMath())
							.peek(s->System.out.print(s + ",")).sum());
		//합계 점수 목록과 전체합께 출력하기
		System.out.println(list.stream().mapToInt(s->s.getEng()+s.getMath())
							.peek(s->System.out.print(s + ",")).sum());
		
	}
}
