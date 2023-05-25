package chap14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {

	public static void main(String[] args) throws IOException {
//OutputStreamWriter : 바이트형출력스트림 => 문자형 출력스트림
//PrintStream System.out
//Writer	 : 문자형 출력스트림
//Write(int) : 2byte(1char) 단위로 출력
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다'); // 한글출력
		out.flush(); //버퍼의 내용을 목적지로 강제 전송
	}

}
