package test;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("등수 입력 : ");
		int k;
		while ((k = in.nextInt()) != 0) {
			if (k == 0)
				break;
			switch (k) {
			case 1 -> System.out.println("아주 잘했습니다.");
			case 2, 3 -> System.out.println("잘했습니다.");
			case 4, 5, 6 -> System.out.println("보통입니다.");
			default -> System.out.println("노력해야 겠습니다.");
			}
			System.out.print("등수 입력 : ");
		}

	}

}
