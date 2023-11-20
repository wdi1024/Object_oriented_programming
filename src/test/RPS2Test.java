package test;

import java.util.Scanner;

public class RPS2Test {

	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
	}

	public static String input(String a) {
		Scanner in = new Scanner(System.in);
		System.out.printf("%s :", a);
		String k = in.next();
		return k;
	}

	public static void whosWin(String x, String y) {
		if (x.equals(y))
			System.out.println("무승부!");
		else if (x.equals("r")) {
			if (y.equals("p"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		} else if (x.equals("p")) {
			if (y.equals("s"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		} else {
			if (y.equals("r"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		}
	}
}
