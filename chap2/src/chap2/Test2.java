package chap2;

public class Test2 {

	public static void main(String[] args) {
		
		/*
		5. 다음결과가 나오도록 Test2 프로그램 수정하기
		[결과]
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true 
		*/
				   byte a = 10;
				   byte b = 20;
				   byte c = (byte) (a + b);	//int보다 작은자료형의 연산의 결과는 int
				   char ch = 'A';
				   ch = (char)(ch + 2);
				   float f = 3f / 2;	// int<-int/int => fkiat<-float/int
				   long l= 3000L * 3000 * 3000;
				   float f2 = 0.1f;
				   double d = 0.1;
				   boolean result = (float)d==f2;
				   System.out.println("c="+c);
				   System.out.println("ch="+ch);
				   System.out.println("f="+f);
				   System.out.println("l="+l);
				   System.out.println("result="+result); //자바버그.
				   System.out.printf("%.20f\n",f2);
				   System.out.printf("%.20f\n",d);

	}

}
