package chap12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 : (Key,객체) 쌍인 객체들의 모임.
 * 	put(key,value) 	: map 객체에 데이터 추가.(key 값이 있으면 수정, 없으면 추가)
 * 	value get(key) 	: key 에 해당하는 value 값 리턴
 * 	set keySet()	: map 객체의 key 값들 리턴
 * 	Collection values()	: map 객체의 value 값들 리턴.
 * 						value값으로 key 선택 불가.
 * Set<Map.Entry> entrySet() : (key,value) 쌍인 객체들 리턴
 * 						 Map.Entry : getKey()	: key값
 * 									 gatValue()	: Value 값
 * Value remove(key) : key값에 해당하는 객체 제거. value 값 리턴
 */
public class MapEx1 {
	public static void main(String[] args) {
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<names.length;i++) {
			map.put(names[i],nums[i]);
		}
		System.out.println(map);
		//map.get(key) : key의 value 값 리턴
		System.out.println("김삿갓의 전화번호:" + map.get("김삿갓"));
		System.out.println("홍길동의 전화번호:" + map.get("홍길동"));
		System.out.println("김길순의 전화번호:" + map.get("김길순")); //null
		//keySet() : map 객체의 key 값들만 리턴
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + ":" + map.get(keys));
		}
		//values() : map 객체의 value 값들만 리턴
		//			 중복가능, 순서모름.
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v); // 값을 이용해서 key값을 알지 못함.
		}
		//entrySet() : (key,value)쌍인 객체들 리턴
		//			   (key,value)의 자료형 : Map.Entry
		Set<Map.Entry<String,Integer>> entry = map.entrySet();
		for(Map.Entry<String,Integer> e : entry) {
			System.out.println(e);
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		System.out.println("map 객체의 요소의 갯수 :" + map.size());
		//홍길동의 전화번호 제거하기
		Integer tel = map.remove("홍길동");
		System.out.println(tel + "전화번호 제거");
		System.out.println("map 객체의 요소의 갯수 : " + map.size());
		System.out.println(map);
	}
}
