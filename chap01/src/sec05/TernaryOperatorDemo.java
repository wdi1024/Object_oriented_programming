package sec05;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y;
		y = (x == 1) ? 10 : 20;
		System.out.println(y);
		y = (x > 1) ? x++ : x + 20;
		System.out.println(x);
		System.out.println(y);
	}

}
