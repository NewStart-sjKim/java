package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectOutputStream 를 이용 하여 객체를 저장한 object.set 파일을 읽어
 * 객체 복원하기
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		System.out.println(c1+","+c2);
	}
}
