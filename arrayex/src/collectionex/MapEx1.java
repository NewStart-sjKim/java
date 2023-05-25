package collectionex;
import java.util.Collection;
import java.util.Collections;
/*
 * 7. 해쉬 테이블을 이용하여 이름을 입력하면 키를 찾을 수 있도록 해보세요
 * 
 * 이름		 키
 * 홍길동		172
 * 성춘향		164
 * 이몽룡		176
 * 이순신		183
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
			Map<String,Integer> map = new HashMap<>();
			map.put("홍길동", 172);
			map.put("성춘향", 164);
			map.put("이몽룡", 176);
			map.put("이순신", 183);
			//이름을 입력하면 MapEx1값 출력하기
			Scanner scan = new Scanner(System.in);
			while(true) {
			System.out.println("이름을 입력하세요(종료:exit)");
			String name = scan.next();
			if(name.equals("exit")) break;
			if(map.get(name)==null) {
				//키를 입력받아서 map에 등록하기
				System.out.println(name + "키를 입력하세요");
				int h = scan.nextInt();
				map.put(name,h);
			}
			System.out.println(map.get(name));
		}
			System.out.println("keySet() 함수 사용하여 조회하기");
			Set<String> names = map.keySet();
			for(String n : names) System.out.println(n + "=" + map.get(n));
			
			System.out.println("entrySet() 함수 사용하여 조회하기");
			Set<Map.Entry<String,Integer>> entrys = map.entrySet();
			for(Map.Entry<String,Integer> e : entrys) 
				System.out.println(e.getKey() + "=" + e.getValue());
				
			System.out.println("values() 함수 사용하여 키 평균 출력하기");
			Collection<Integer> avg = map.values();
			int sum = 0;
			for(Integer h : map.values()) {
				sum += h;
			}
			System.out.println("등록된 키의 평균:" + (double)sum/map.size());
	}
}
