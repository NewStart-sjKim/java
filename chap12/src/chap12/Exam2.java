package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Student 클래스 구현하기
 * 	1. 멤버변수 :int 학번(studno),이름(name),전공(major)
 * 	2. 멤버메서드 : 학생 정보를 출력하도록 toString() 메서드 오버라이딩하기
 * 	3. 구현인터페이스 : Comparable => 학번순으로 정렬하도록 설정
 */
class Student implements Comparable<Student>{
	int studno;
	String name,major;

	Student(int studno ,String name, String major){
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "학번 :" + studno + ", 이름 :" + name + ", 전공 :" + major;
	}




	@Override
	public int compareTo(Student s) {
	
		return studno - s.studno;
	}
}

public class Exam2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동","컴퓨터공학"));
		list.add(new Student(2,"김삿갓","경영학"));
		list.add(new Student(3,"이몽룡","통계학"));
		System.out.println("1 : " + list);
		Collections.sort(list); // 학번순으로 정렬
		System.out.println("2 : " + list);
		System.out.println("이름순으로 출력");
		Collections.sort(list,new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		});
		System.out.println("3:" + list);
		System.out.println("전공순으로 출력");
		Collections.sort(list,new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				return s1.major.compareTo(s2.major);
	}
});
		System.out.println("4:" + list);
	}
}
