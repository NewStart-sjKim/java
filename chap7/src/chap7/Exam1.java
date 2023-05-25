package chap7;
/*
 * Product 클래스
 * 	맴버변수 : 가격(price),포인트(point)
 * 	생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
 * 
 * TV 클래스
 * 	가격: 100
 * 	toString() : "TV" 리턴
 * computer 클래스
 * 	가격: 200
 * 	toString() : "TV" 리턴
 * HandPhone 클래스
 * 	가격: 150
 * 	toString() : "TV" 리턴
 */
class Product{
	int price,point;
	Product(int price){
		this.price = price;
		point  = price/10;
	}
}
class TV extends Product{
	TV(){
		super(100);
	}
	@Override
	public String toString() {
		return "TV";
	}
}
class computer extends Product{
	computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "computer";
	}
}
class HandPhone extends Product{
	HandPhone(){
		super(150);
	}
	@Override
	public String toString() {
		return "HandPhone";
	}
}
/*
 * Buyer 클래스
 * 멤버변수 : money = 500, point
 * 			Product[] items = new Product[5]'
 * 			int cnt;
 * 멤버메서드 :
 * 			void buy(Product p)
 * 				1. p 상품을 가격을 money에서 차감
 * 				2. p 상품의 포인트 만큼 point 증가
 * 				3. items에 제품추가. cnt 증가
 * 				4. p제품의 이름 출력. TV구입
 * 				void summary()
 *				1. 구매 제품 전체의 금액합계.포인트 합계
 *				2. 잔액
 *				3. 전체 구매 물품 이름
 */
class Buyer{
	int point,cnt;
	int	money = 500;
	Product[] items = new Product[5];
	void buy(Product p) {
		money -= p.price;//1. p상품을 가격을 money에서 차감
		point += p.point;//2. p 상품의 포인트 만큼 point 증가
		items[cnt++] = p;//3. items에 제품추가. cnt 증가
		System.out.println(p + "구입");
	}
	void summary() {
		//1. 구매 제품 전체의 금액합계. 포인트 합계
		int totAmt=0,totPoint=0;
		String itemName = "";
	//	for(Product p : items) {
		for(int i=0;i<cnt;i++) {
			totAmt += items[i].price;
			totPoint += items[i].point;
			itemName += items[i]+",";
		}
		System.out.println("구매금액 합계 : " + totAmt);
		System.out.println("구매포인트 합계 : " + totPoint);
		//2. 잔액
		System.out.println("잔액 : "+ money);
		//3. 전체 구매 물품이름
		System.out.println("구매물품 목록 : " + itemName);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		TV t = new TV();
		computer c = new computer();
		HandPhone h = new HandPhone();
		System.out.println(t+"=>"+t.price+"만원,포인트:" + t.point);
		System.out.println(c+"=>"+c.price+"만원,포인트:" + c.point);
		System.out.println(h+"=>"+h.price+"만원,포인트:" + h.point);
		//Product 타입의 참조변수 3개의 배열로 생성
		Product[] p = new Product[3];
		p[0] = t;	// Product <- TV 형변환됨.
		p[1] = c;
		p[2] = h;
		int sumPrice = 0;
		int sumPoint = 0;
		for(int i=0;i<p.length;i++) {
			sumPrice += p[i].price;
			sumPoint += p[i].point;
		}
		System.out.println("전체 제품가격:" + sumPrice);
		System.out.println("전체 제품포인트:" + sumPoint);
		
		Buyer b = new Buyer();
		b.buy(t);b.buy(c);b.buy(h);b.summary();
		System.out.println("main Buyer 잔액:"+ b.money);
		System.out.println("main Buyer 포인트:"+ b.point);
		
	}
}
