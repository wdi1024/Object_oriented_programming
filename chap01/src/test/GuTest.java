package test;

import java.util.Scanner;

public class GuTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("출력하고자 하는 구구단 : ");
		int gu = in.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.println(gu + " * " + i + " = " + gu * i);
			i++;
		}
	}
}
