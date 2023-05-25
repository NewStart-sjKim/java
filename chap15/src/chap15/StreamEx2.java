package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int eng;
	private int math;
	Student(String name, int eng, int math){
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String toString() {
		return "name="+name+",eng=" + eng + ",math=" + math;
	}
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",60,70),new Student("김삿갓",65,55),
				new Student("이몽룡",80,75),new Student("임꺽정",85,65));
		Stream<Student> st = list.stream();
		//s : Student 객체
		//Consumer : 매개변수 존재, 리턴값이 없는 메서드
		st.forEach(s->{
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum/2.0;
			System.out.printf(",총점=%4d,평균=%.2f\n",sum,avg);
		});
		System.out.println("===============");
		//이미 사용한 Stream 객체임.
//		st.forEach(s->System.out.println("이름:" + s.getName())); //오류발생
		list.stream().forEach(System.out::println); // 메서드 참조
		System.out.println("===============");
		System.out.println("수학점수 총점 :" +
				list.stream().mapToInt(Student::getMath).sum());
		System.out.println("영어점수 총점 :" +
				list.stream().mapToInt(Student::getEng).sum());
		System.out.println("인원수 총점 :" +
				list.stream().count());
	}
}
