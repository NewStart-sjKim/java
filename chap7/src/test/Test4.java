package test;
/*
 * SutdaCard 클래스
 *   멤버변수 : int number,boolean  isKwang
 *   생성자 : 멤버변수를 매개변수로 입력받아 초기화
 *   멤버메서드 : toString을 결과에 맞도록 오버라이딩하기
 * SutdaDeck 클래스 구현하기
 *  멤버변수 : cards : SutdaCard 20장을 저장할 배열
 *  생성자 : SutdaCard 20장을 생성하여 cards 배열에 저장
 *  메서드 : toString() 오버라이딩하여 결과가 출력되도록 구현
  [결과]    
  1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
 */
class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard(int number,boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	@Override
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
}
class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) { //i:0~19
			cards[i] = new SutdaCard
					((i%10+1),((i==0||i==2||i==7)?true:false));
		}
	}
	@Override
	public String toString() {
		String result = "";
		for(SutdaCard s : cards)
			result += s.toString() + ",";
		return result;
	}
}
public class Test4 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
	}
}
