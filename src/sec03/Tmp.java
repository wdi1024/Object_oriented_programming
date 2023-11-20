package sec03;

import java.util.Scanner;

class Hap {
	int a, b, sum;

	public Hap(int a, int b) {
		this.a = a;
		this.b = b;
		this.sum = 0;
	}

	void sum_for() {
		for (int i = a; i <= b; i++) {
			sum += i;
			if (i != b)
				System.out.printf(" %d +", i);
		}
		System.out.printf("%d ", b);
	}

}

public class Tmp {
	static Scanner in = new Scanner(System.in);

	static int in_out(int a) {
		System.out.printf("%d번째 수를 입력하세요 : ", a);
		int k = in.nextInt();
		return k;
	}

	public static void main(String[] args) {
		int s1, s2;
		do {
			s1 = in_out(1);
			s2 = in_out(2);
			Hap hh = new Hap(s1, s2);
			hh.sum_for();
			System.out.printf("= %d\n", hh.sum);
		} while (s2 != 0);
	}

}
