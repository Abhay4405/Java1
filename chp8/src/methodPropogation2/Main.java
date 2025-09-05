package methodPropogation2;

import java.io.IOException;

class Abhay{
	void m() throws IOException {
		IOException e = new IOException();
		throw e;
	}
	void n() throws IOException {
		
	}
	void o() {
		try {
			n();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
public class Main {

}
