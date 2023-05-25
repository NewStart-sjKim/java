package chap6;
/*
 * SutdaCard 클래스 구현하기
 * 멤버변수 : int num, boolean isKwang
 * 멤버메서드 : toString()
 * [결과]
 * 3
 * 1K
 */
class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(int c, boolean K){
		num = c;
		isKwang = K;
	}
	SutdaCard(){
		num = 1;
		isKwang = true;
	}
	public String toString() {
		return num + (isKwang? "K":"");
	}
}
public class Exam4 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,false);
		SutdaCard c2 = new SutdaCard();
		System.out.println(c1);//3
		System.out.println(c2);//1k
	}

}
