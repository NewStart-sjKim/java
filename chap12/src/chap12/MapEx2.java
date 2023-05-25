package chap12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * EastCard 클래스 구현하기
 * 		멤버변수 	:	int num, boolean isKwang
 * 		생성자	:	멤버들을 입력받아 초기화
 * 					매개변수가 없는 경우 : num=1, isKwang = true인 객체 생성
 * 		멤버메서드	:	toString()
 * 					num=1,isKwang=True : 1K
 */
class EastCard{
	int num;
	boolean isKwang;
	EastCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	EastCard(){
		this(1,true);
	}
	public String toString() {
		return num + (isKwang?"k" : "");
	}
}
/*
 * CardDeck 클래스 구현하기
 * 멤버변수	: List<EastCard> cards;
 * 				static Map<String,Integer> jokbo;
 * 생성자		: 매개변수 없음.
 * 				EastCard 20장을 cards 객체에 저장
 * 				1~10의 숫자를 가진 카드가 각각 2장씩.
 * 				숫자값이 1,3,8 인 카드중 한장은 isKwang=true 인 카드
 * 메서드		: EastCard pick(int idx) : idx번째 카드를 제거하여 리턴
 * 			  EastCard pick()	: cards 에서 임의의 번째 카드를 제거하여 리턴
 * 			  void shuffle()	: cards 를 섞어 주는 기능
 * 								  Collections.shuffle() 함수 사용
 */
class CardDeck{
	List<EastCard> cards;
	 static Map<String,Integer> jokbo;
	 static {
		 jokbo = new HashMap<>();
		 jokbo.put("kk",4000);
		 for(int i=1;i<=10;i++) {
			 jokbo.put("" + i+ i, 3000+(i*10));
		 }
		 jokbo.put("12",2060);jokbo.put("21",2060);
		 jokbo.put("14",2050);jokbo.put("41",2050);
		 jokbo.put("19",2040);jokbo.put("91",2040);
		 jokbo.put("110",2030);jokbo.put("101",2030);
		 jokbo.put("410",2020);jokbo.put("104",2020);
		 jokbo.put("46",2010);jokbo.put("64",2010);
	 }
	 CardDeck(){
	 	cards = new ArrayList<>();
	 	for(int i=0;i<20;i++) {
	 		cards.add(new EastCard(i%10+1,((i==0||i==2||i==7)?true:false)));
	 	}
	 	System.out.println(cards);
	 }
	 EastCard pick(int idx) {
		 return cards.remove(idx);
	 }
	 EastCard pick() {
		 return cards.remove((int)(Math.random()*cards.size()));
	 }
	 void shuffle() {
		 Collections.shuffle(cards);
		 System.out.println(cards);
	 }
}
/*
 * Player 클래스
 * 	멤버변수 	: String name,
 * 			  EastCard c1,c2
 * 	생성자	: 멤버변수값을 입력받아 객체 생성
 * 	멤버메서드
 * 		int getscore() : c1,c2 카드의 점수 리턴.
 * 			c1,c2 카드가 jokbo에 있는 카드인 경우 jokbo 점수 리턴
 * 			jokbo에 없는 카드인 경우 (c1.num + c2.num)%10 점수 리턴
 * 		String toString() : 이름과 카드 2장, 점수를 문자열로 리턴
 * 				홍길동(2,8K):0
 * 				김삿갓(4,8):2
 */
class Player{
	String name;
	EastCard c1,c2;
	Player(String name, EastCard c1, EastCard c2 ){		
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	int getScore() {
		Integer score = 0;
		if(c1.isKwang && c2.isKwang)
			score = CardDeck.jokbo.get("kk");
		else {
			score = CardDeck.jokbo.get(""+c1.num + c2.num);
			if(score == null) {
				score = (c1.num + c2.num)%10;
			}
		}
		return score;
	}
	public String toString() {
		return name + "(" + c1 + "," + c2 + "):" + getScore();
	}
}
public class MapEx2 {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		List<Player> list = new ArrayList<>();
		list.add(new Player("홍길동",deck.pick(0),deck.pick(0)));
		list.add(new Player("김삿갓",deck.pick(0),deck.pick(0)));
		list.add(new Player("이몽룡",deck.pick(0),deck.pick(0)));
		for(Player p : list) System.out.println(p);
		System.out.println("deck에 남은 카드 갯수 :" + deck.cards.size());
		System.out.println("deck에 남은 카드:" + deck.cards);
		/*
		 * Player 중 가장 높은 점수를 가진 Player의 이름 출력하기
		 * 	홍길동 승리.
		 * 1등,2등의 점수가 같은 경우
		 *  홍길동, 김삿갓 비김.
		 */
		//1. Player 카드 점수 순으로 정렬
		Collections.sort(list, new Comparator<Player>() {

			@Override
			public int compare(Player p1, Player p2) {
				return p2.getScore() - p1.getScore();// 점수의 내림차순 정렬
			}
			
		});
		System.out.println(list);
		if(list.get(0).getScore() == list.get(1).getScore())
			System.out.println(list.get(0).name + "," + list.get(1).name + " : 비김");
		else
			System.out.println(list.get(0).name + " 승리. 점수 :" + list.get(0).getScore());
	}
}
