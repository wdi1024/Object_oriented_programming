package test;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int com[] = new int[3];
		int cnt = 1;
		while (com[0] == 0) {
			com[0] = r.nextInt(10);
		}
		while (com[1] == com[0] || com[1] == 0) {
			com[1] = r.nextInt(10);
		}
		while (com[2] == com[0] || com[2] == com[1] || com[2] == 0) {
			com[2] = r.nextInt(10);
		}
		while (true) {
			int user[] = new int[3];
			int strike = 0, ball = 0;
			for (int i = 0; i < 3; i++) {
				System.out.print((i + 1) + "번째 수 : ");
				user[i] = s.nextInt();
			}
			for (int i = 0; i < user.length; i++)
				for (int j = 0; j < com.length; j++)
					if (user[i] == com[j] && i == j)
						strike++;
					else if (user[i] == com[j] && i != j)
						ball++;
			System.out.println(strike + " 스트라이크 " + ball + " 볼");
			if (strike == 3) {
				System.out.println("게임 끝");
				break;
			}
			cnt++;
		}
		System.out.println(cnt + "번째 시도 성공");
	}

}
