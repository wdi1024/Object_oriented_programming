package test;

import java.util.Scanner;

public class DigitSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 :");
		int x = in.nextInt();
		int y = x % 10;
		y += (x / 10) % 10;
		y += ((x / 10) / 10);
		System.out.printf("각 자리수의 합 %d", y);
	}

}
