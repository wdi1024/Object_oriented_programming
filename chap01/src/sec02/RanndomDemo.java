package sec02;

import java.util.Random;

public class RanndomDemo {

	public static void main(String[] args) {
		int com[] = new int[3];
		Random r = new Random();

		while (com[0] == 0) {
			com[0] = r.nextInt(10);
		}
		while (com[1] == com[0] || com[1] == 0) {
			com[1] = r.nextInt(10);
		}
		while (com[2] == com[0] || com[2] == com[1] || com[2] == 0) {
			com[2] = r.nextInt(10);
		}
		for (int i = 0; i < com.length; i++)
			System.out.printf("com[%d] = %d\n", i, com[i]);

	}

}
