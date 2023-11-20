package test;

import java.util.Scanner;

public class URLTest {
	static void endsw(String s) {
		if (s.endsWith("com"))
			System.out.println(s + "은 'com'으로 끝납니다.");
		else
			System.out.println(s + "은 'com'으로 끝나지 않습니다.");
	}

	static void middlesw(String s) {
		if (s.contains("java"))
			System.out.println(s + "은 'java'를 포함합니다.");
		else
			System.out.println(s + "은 'java'를 포함하지 않습니다.");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String k;
		while (true) {
			System.out.printf("URL을 입력하세요 : ");
			k = in.nextLine();
			if (k.equals("bye"))
				break;
			endsw(k);
			middlesw(k);
		}
	}
}
