package test;

class Bank {
	double getInt_rate() {
		return 0.0;
	}
}

class BadBank extends Bank {
	double getInt_rate() {
		return 10.0;
	}
}

class NormalBank extends Bank {
	double getInt_rate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	double getInt_rate() {
		return 3.0;
	}
}

public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : " + b1.getInt_rate() + "%");
		System.out.println("NormalBank의 이자율 : " + b2.getInt_rate() + "%");
		System.out.println("GoodBank의 이자율 : " + b3.getInt_rate() + "%");

	}

}
