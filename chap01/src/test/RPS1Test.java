package test;

import java.util.Scanner;

public class RPS1Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("철수: ");
		String x = in.next();
		System.out.print("영희: ");
		String y = in.next();
		if (x.equals(y) == true)
			System.out.println("무승부!");
		else if (x == "r" && y == "p")
			System.out.println("영희, 승!");
		else if (x == "r" && y == "s")
			System.out.println("철수, 승!");
		else if (x == "p" && y == "r")
			System.out.println("철수, 승!");
		else if (x == "p" && y == "s")
			System.out.println("영희, 승!");
		else if (x == "s" && y == "r")
			System.out.println("영희, 승!");
		else
			System.out.println("철수, 승!");
	}

}
