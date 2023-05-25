package chap7;
/*
 * 접근제한자 	: private < (default) < protected < public
 * 
 * class	: (default),public
 * 변수,상수,메서드(생성자) : private , (default) , protected , public (생성자는 모두 사용 가능)
 */
//import chap7.test.Modifier4;
import chap7.test.Modifier2;

public class ModifierEx2 {
	public static void main(String[] args) {
		Modifier3 m3 = new Modifier3();
		m3.method();
		Modifier2 m2 = new Modifier2();
		m2.method();
		//Modifier4 m4 = new Modifier4();
		
	}

}
