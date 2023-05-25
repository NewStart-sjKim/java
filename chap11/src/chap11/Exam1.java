package chap11;
class Card{
	String kind;
	int number;
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card c = (Card)obj;
			//return kind == e.kind && number == e.number;
			return this.kind.equals(c.kind) && this.number == c.number;
		}else
			return false;
	}
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
}
public class Exam1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade",1);
		Card c2 = new Card("Spade",1);
		if(c1 == c2) System.out.println("c1,c2는 같은 객체임");
		else System.out.println("c1,c2는 다른 객체임");
		if(c1.equals(c2))
			System.out.println("c1,c2는 같은 종류의 카드임");
		else
			System.out.println("c1,c2는 다른 종류의 카드임");

	}

}
