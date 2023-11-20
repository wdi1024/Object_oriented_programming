package test;

import java.util.Scanner;

public class SB_test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		System.out.printf("단어 입력 : ");
		String answer = scan.next();
		System.out.println();
		for (int i = 0; i < answer.length(); i++)
			sb.append("-");
		System.out.println(("단어(" + answer.length() + "글자) :" + sb));
	}

}
