package chap4;
/*
 * switch(조건값)
 * 	 조건값으로 사용할 수 있는 자료형은 고정이되있다
 * 	 byte,short,int,char,String 만 가능함
 */
public class SwitchEx3 {
	public static void main(String[] args) {
		String v = ""+1;
		switch (v) {
		case "1" : System.out.println(v);break;
		default : System.out.println(v+10);
		}

	}

}
