package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * EastCard, CardDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]
게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */
class EastCard {
	int num;
	boolean isKwang;
	EastCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	EastCard() {
		this(1,true);
	}
	public String toString() {
		return num + (isKwang?"K":"");
	}
}
class CardDeck { 
	List<EastCard> cards;
	static Map<String,Integer> jokbo;
	static {  //static 초기화 블럭
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12", 2060);jokbo.put("21", 2060);
		jokbo.put("14", 2050);jokbo.put("41", 2050);
		jokbo.put("19", 2040);jokbo.put("91", 2040);
		jokbo.put("110", 2030);jokbo.put("101", 2030);
		jokbo.put("410", 2020);jokbo.put("104", 2020);
		jokbo.put("46", 2010);jokbo.put("64", 2010);
	}
	CardDeck() { //생성자
		cards = new ArrayList<>(); // ArrayList 사이에 생략된 건 EastCard
		for(int i=0;i<20;i++) { //20장의 카드 객체 저장
			cards.add
			(new EastCard(i%10+1,((i==0||i==2||i==7)?true:false)));
		}
		System.out.println(cards);
	}
	EastCard pick(int idx) {
		// remove(int index) : index에 해당하는 객체를 제거하여 리턴
		return cards.remove(idx);
	}
	EastCard pick() {
		return cards.remove((int)(Math.random()*cards.size()));
	}
	void shuffle() {
		Collections.shuffle(cards); //cards 리스트객체의 요소를 섞기
		System.out.println(cards);
	}
}
class Player {
	String name;
	EastCard c1,c2;
	Player(String name, EastCard c1, EastCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	int getScore() {
		Integer score = 0;
		if(c1.isKwang && c2.isKwang) 
			score = CardDeck.jokbo.get("KK");
		else {
			score = CardDeck.jokbo.get("" + c1.num + c2.num);
			if(score == null) {
				score = (c1.num+c2.num)%10;
			}
		}
		return score;
	}
	public String toString() {
		return name + "(" + c1.toString() + "," + c2 + "):" + getScore();
	}
}

public class Test2 {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		Scanner scan = new Scanner(System.in);
		int gameCnt = 0;
		while(gameCnt < 2 || gameCnt > 10) { 
			   System.out.println("게임할 인원수를 입력하세요(최소:2,최대:10)");
			   gameCnt = scan.nextInt();
		}   
		List<Player> list = new ArrayList<>();
		for(int i=0;i<gameCnt;i++) {
			list.add
			(new Player((i+1)+"번",deck.pick(0),deck.pick(0)));
		}
 		System.out.println("단순 등수 : ");
		Collections.sort
		    (list, new Comparator<Player>() {
				@Override
				public int compare(Player p1, Player p2) {
					return p2.getScore() - p1.getScore();
				}
		    });
		System.out.println("등수:");
		int i=0;
		for(Player g : list) {
		   System.out.println(++i + "등:" + g);
		}
 		System.out.println("동점자 등수 : ");
 		// rank : (점수,동점자Player리스트)
		Map<Integer,List<Player>> rank = 
				        new TreeMap<>(Comparator.reverseOrder());
		for(Player g : list) {
			List<Player> eqrank = rank.get(g.getScore());
			if(eqrank == null) 
				eqrank = new ArrayList<>();
			eqrank.add(g);
			rank.put(g.getScore(), eqrank);
		}	
		int r = 0;
		for(List<Player> l : rank.values()) {
			for(Player g : l)
				System.out.println((r+1) + "등:" + g);
			r += l.size();
	    }
	}
}