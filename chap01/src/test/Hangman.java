package test;

import java.util.Scanner;

public class Hangman {
	String hiddenString;
	StringBuffer outputString = new StringBuffer();
	int remainder;
	int failed;
	Scanner scan = new Scanner(System.in);

	public Hangman() {
		this.failed = 0;
		this.hiddenString = "hello";
		remainder = hiddenString.length();
		for (int i = 0; i < hiddenString.length(); i++)
			outputString.append('-');
	}

	int playGame() {
		while (remainder > 0 && failed < 6) {
			checkChar(this.readChar());
		}
		return this.failed;
	}

	char readChar() {
		System.out.println("단어(" + hiddenString.length() + "글자) : " + outputString);
		System.out.printf("1 문자를 입력하세요 :");
		char guess = scan.next().charAt(0);
		System.out.println();
		return guess;
	}

	void checkChar(char guess) {
		int suc = 0;
		for (int i = 0; i < hiddenString.length(); i++) {
			if (hiddenString.charAt(i) == guess) {
				outputString.setCharAt(i, guess);
				remainder--;
				suc++;
			}
		}
		if (suc == 0)
			failed++;
	}
}
