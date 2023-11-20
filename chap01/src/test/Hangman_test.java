package test;

import java.util.Scanner;

public class Hangman_test {

	public static void main(String[] args) {
		String hiddenString = "hello";
		StringBuffer outputString = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		String user;
		for (int i = 0; i < hiddenString.length(); i++)
			outputString.append('-');
		int t = hiddenString.length();
		System.out.println("단어(" + hiddenString.length() + "글자) :" + outputString);
		while (t > 0) {
			System.out.print("1 문자를 입력하세요 : ");
			user = scan.next();
			System.out.println();
			char ch = user.charAt(0);
			for (int i = 0; i < hiddenString.length(); i++)
				if (hiddenString.charAt(i) == ch) {
					outputString.setCharAt(i, ch);
					t--;
				}
			System.out.println("단어(" + hiddenString.length() + "글자) :" + outputString);
		}
		System.out.println("\n축하합니다.");
	}

}