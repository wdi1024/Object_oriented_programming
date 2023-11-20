package test;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		int max = 0;
		for (int i = 0; i < number.length; i++) {
			System.out.printf((i + 1) + "번째 입력 : ");
			number[i] = scan.nextInt();
		}
		for (int i = 0; i < number.length; i++)
			if (max <= number[i])
				max = number[i];
		System.out.println("입력된 수에서 가장 큰 수는 " + max + "입니다.");

	}

}
