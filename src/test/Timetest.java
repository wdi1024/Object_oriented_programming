package test;

import java.util.Scanner;

public class Timetest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int x = in.nextInt();
		int h = x / 3600;
		int m = (x / 60) % 60;
		int s = x % 60;

		System.out.printf("%d시간 %d분 %d초", h, m, s);
	}

}
