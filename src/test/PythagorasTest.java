package test;

public class PythagorasTest {

	public static void main(String[] args) {
		for (int a = 1; a < 21; a++) {
			for (int b = 1; b < 21; b++) {
				for (int c = 1; c < 21; c++) {
					if (a * a + b * b == c * c) {
						System.out.printf("%d, %d, %d", a, b, c);
						System.out.println();
					}
				}
			}
		}
	}

}
