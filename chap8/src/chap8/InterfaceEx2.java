package chap8;
//인터페이스를 리턴 타입으로 사용
class Lazerzet implements Printerable{

	@Override
	public void print() {
		System.out.println("레이저젯 프린터로 프린트");	
	}
}
class Inkzet implements Printerable{

	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트");
		
	}
}
class PrinterManager{
	public static Printerable getPrint(String type) {
		if(type.equals("INK")) return new Inkzet();
		else return new Lazerzet();
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		//p 참조변수 : Inkzet 객체 참조
		Printerable p = PrinterManager.getPrint("INK");
		PrinterManager.getPrint("INK").print(); // Inkzet 객체 리턴
		p.print(); //Inkzet 객체 리턴
		PrinterManager.getPrint("LAZER").print();
		
	}
}
