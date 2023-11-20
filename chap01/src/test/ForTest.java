package test;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("양의 정수를 입력하세요 : ");
			int k = in.nextInt();
			if (k == 999) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}
			int sum = 0;
			for (int i = 1; i < k + 1; i++)
				sum += i;
			System.out.println("1부터 " + k + "까지의 합은 " + sum + "입니다.");
		}

	}

}
