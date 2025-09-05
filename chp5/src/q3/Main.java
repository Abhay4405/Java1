package q3;
class RBI{
	 double rateofintrest() {
		 return 0.0;
	}
}
class SBI extends RBI{
	@Override
	double rateofintrest() {
		return 5.5;
	}
}
class ICICI extends RBI{
	@Override
	double rateofintrest() {
		return 6.7;
	}
}
class HDFC extends RBI{
	@Override
	double rateofintrest() {
		return 7.9;
	}
}
public class Main {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		HDFC hdfc = new HDFC();
		System.out.println(sbi.rateofintrest());
		System.out.println(icici.rateofintrest());
		System.out.println(hdfc.rateofintrest());
	}

}
