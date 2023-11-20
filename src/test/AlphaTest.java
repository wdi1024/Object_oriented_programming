package test;

public class AlphaTest {

	public static void main(String[] args) {
		int i, j;
		char a = 'A';
		char[] alpha = new char[26];
		for (i = 0; i < 26; i++) {
			alpha[i] = a++;
			for (j = 0; j < i + 1; j++)
				System.out.print(alpha[j]);
			System.out.println();
		}
	}

}
