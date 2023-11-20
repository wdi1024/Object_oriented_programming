package test;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("성적을 입력하세요 : ");
			int k = in.nextInt();
			if (k < 0) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}
			String kind = switch (k / 10) {
			case 10, 9 -> "A";
			case 8, 7 -> "B";
			case 6, 5 -> "C";
			case 4 -> "D";
			default -> "F";
			};
			System.out.printf("당신의 성적 등급은 %s입니다.\n", kind);
		}
	}

}
