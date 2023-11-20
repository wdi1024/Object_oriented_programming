package test;

public class PiramidTest {

	public static void main(String[] args) {
		for (int row = 2; row < 7; row++) {
			for (int column = 1; column < row; column++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
