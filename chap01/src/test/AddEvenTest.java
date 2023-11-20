package test;

import java.util.Scanner;

public class AddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num;
		do {

			System.out.print("양의 정수를 입력하세요 : ");
			int num1 = in.nextInt();
			num = num1;
			if (num1 % 2 == 0)
				sum += num1;
		} while (num > 0);
		System.out.println("짝수의 합 : " + sum);
	}

}
