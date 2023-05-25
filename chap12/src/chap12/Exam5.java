package chap12;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 대한민국 = 서울, 캐나다 = 오타와, 영국 = 런던 값을 저장하는 HashMap 객체 저장하기
 * 2. 화면에서 나라이름을 입력받아 해당 수도를 출력하기. 종료 입력까지 계속 입력받기
 * 	  => 등록된 나라가 아닌 경우 등록된 나라가 아닙니다.로 출력하기
 * 3. 등록된 나라가 아닌 경우 입려된 나라의 수도를 입력받아 map 등록하기.
 *    종료시 map에 등록된 내용을 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		//1. 대한민국 = 서울, 캐나다 = 오타와, 영국 = 런던 값을 저장하는 HashMap 객체 저장하기
		Map<String,String> map = new HashMap<>();
		//String[] nation = {"대한민국","캐나다","영국",};
		//String[] capital = {"서울","오타와","런던"};
//		Scanner sc = new Scanner(System.in);
//			String ca = sc.nextLine();
//			for(int i=0;i<nation.length;i++) {
//				map.put(nation[i],capital[i]);
//			}
//		while(true) {
//			
//		}
		map.put("대한민국","서울");
		map.put("캐나다","오타와");
		map.put("영국","런던");
		System.out.println(map);
		//2.화면에서 나라이름을 입력받아 해당 수도를 출력하기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름을 입력하세요(종료)");
			String nat = scan.next();
			if(nat.equals("종료")) break;
			String cap = map.get(nat);
			if(cap == null) {
				System.out.println("등록된 나라 아님");
				System.out.println(nat + "의 수도를 입력하세요");
				String newnat = scan.next();
				map.put(nat, newnat);
				
			}else {
				System.out.println(nat + "의 수도 : " + cap);	
			}
		}
		System.out.println(map);
		System.out.println("keySet()==========");
		for(String k : map.keySet()) {
			System.out.println(k + "=>" + map.get(k));
		}
		System.out.println("entrySet)==========");
		for(Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "=>" + m.getValue());
		}
		System.out.println("프로그램 종료");
	}
}
