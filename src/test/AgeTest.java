package test;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int x = in.nextInt();
		if (x >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
