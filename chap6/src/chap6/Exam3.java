package chap6;
/*
 * RectangleEx.java 소스의 Rectangle3 클래스를 이용하기
 * 20 ~ 50 사이의 임의의 가로, 세로 길이를 가진 사각형 5개를 생성하고
 * toString 메서드를 이용하여 출력하기
 * 
 * 전체 사각형의 면적의 합과 둘레의 합 출력
 */
public class Exam3 {
	public static void main(String[] args) {
		Rectangle3 r1 = new Rectangle3();
		r1.width = (int)(Math.random()*31)+20;//20 ~ 50의 임의 수
		r1.height = (int)(Math.random()*31)+20;
		r1.serialNo = ++Rectangle3.sno;
		System.out.println(r1);
		// r1 ~ r5 5개의 객체 생성 => 5개 배열로 처리
		Rectangle3[] arr = new Rectangle3[5]; //Rectangle3를 참조할 참조변수가 5개, 객체생성 아님
		int totArea = 0, totLength = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Rectangle3();
			arr[i].width = (int)(Math.random()*31)+20;
			arr[i].height = (int)(Math.random()*31)+20;
			arr[i].serialNo = ++Rectangle3.sno;
			System.out.println(arr[i]);
			
		}
		for(Rectangle3 r : arr) {
			totArea += r.area();
			totLength += r.length();
		}
		System.out.println("전체 면적의 합 :"+ totArea);
		System.out.println("전체 둘레의 합 :" + totLength);
	}

}
