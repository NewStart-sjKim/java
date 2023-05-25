package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*  List 정렬하기
 *    요소의 자료형이 Comparable 인터페이스를 구현한 클래스만 sort(List) 가능.
 *    
 *    Comparable 인터페이스 : comparaTo() 추상 메서드를 멤버로 가짐.
 *    
 *    정렬관련 인터페이스
 *    1. Comparable : 요소의 클래스에 구현함.
 *    				  클래스의 기본정렬 설정함.
 *    				  int compareTo(Object o) 추상메서드를 멤버로 가짐
 *    2. Comparable : 요소에 구현된 기본정렬방식과 다른 정렬을 하고자 할때 사용함.
 *    				  동적으로 정렬방식을 설정
 *    				  Collections.sort(List,Comparator 객체)
 *    				  int compare(Object o1, Object o2)
 *    					결과가 음수 : o1 객체 앞쪽으로 인식
 *    					결과가 양수 : o2 객체 앞쪽으로 인식
 *    				  Comparator<Object> Comparator.reverseOrder()
 *    				  	기본 정렬방식의 역순으로 정렬.
 *    				  	Comparator 인터페이스로 static 메서드.
 */
class Data implements Comparable<Data> {
   int value;

   Data(int value) {
      this.value = value;
   }

   @Override
   public int compareTo(Data d) {
      return value - d.value;
   }

   @Override
   public String toString() {
      return value + "";
   }
}
   class Data2 {
      int value;
      Data2(int value) {
         this.value = value;
      }

      public String toString() {
         return value + "";
      }
}
public class ListEx3 {
   public static void main(String[] args) {
	   //String 객체의 기본정렬방식 : 오름차순 정렬
      List<String> list = new ArrayList<>();
      list.add("a");list.add("c");
      list.add("d");list.add("b");
      list.add("f");
      Collections.sort(list);
      System.out.println(list);
      System.out.println("list의 내림차순 정렬로 출력하기");
      Collections.sort(list, Comparator.reverseOrder());
      System.out.println(list);
      
      List<Data> list2 = new ArrayList<>();
      list2.add(new Data(3));
      list2.add(new Data(2));
      list2.add(new Data(1));
      Collections.sort(list2);
      System.out.println(list2);
      System.out.println("list2 객체 내림차순 정렬");
      Collections.sort(list2, Comparator.reverseOrder());
      System.out.println(list2);
      
      List<Data2> list3 = new ArrayList<>();
      list3.add(new Data2(3));
      list3.add(new Data2(2));
      list3.add(new Data2(1));
      
      Comparator<Data2> c = new Comparator<>() {
         public int compare(Data2 d1, Data2 d2) {
            return d1.value - d2.value;
         }
      };
      //Collections.sort(list3, c);
      Collections.sort(list3,new Comparator<Data2>() {
    	  public int compare(Data2 d1, Data2 d2) {
    		  return (d2.value - d1.value);// 내림차순
    	  }
      });
      
      Collections.sort(list3,(d1,d2)->d1.value-d2.value);
      System.out.println(list3);
   }
}