package test2;
/*
 * 다음의 결과가 나오도록 Student 클래스 구현하기
 * [결과]
      학번:1
      이름:홍길동
      국어:0
      영어:0
      수학:0
      총점:0
      평균:0.0
   =====================
      학번:2
      이름:김삿갓
      국어:80
      영어:90
      수학:70
      총점:240
      평균:80.0
=====================
 */
class Student{
	String name;
	int no,kor,eng,math,total;
	float avg;
	Student(String n, int n1){
		name = n;
		no = n1;
	}
	Student(String n, int n1, int k, int e, int m){
		name = n;
		no = n1;
		kor = k;
		eng = e;
		math = m;
		total = k+e+m;
		
	}
	void info() {
		System.out.println("학번:" + no + "\n이름:" + name + "\n국어:" + kor + "\n영어:" + eng + "\n수학:" + math
				+ "\n총점:" + total + "\n평균:" + total/3f + "\n==================");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1);
		s.info();
		Student s2 = new Student("김삿갓", 2, 80, 90, 70);
		s2.info();
	} 
}