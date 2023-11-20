package test;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("양의 정수를 입력하세요 : ");
		int k = in.nextInt();
		int sum = 0;
		for (int i = 1; i <= k; i++)
			sum += i;
		System.out.println("1부터 " + k + "까지 합은 " + sum + "입니다.");
	}

}
