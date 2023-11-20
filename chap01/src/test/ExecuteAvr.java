package test;

import java.util.Scanner;

class Total {
	int kor, mat, eng;
	int tot;

	void calc_total() {
		tot = kor + mat + eng;
		System.out.printf("총점은 %d이다.\n", tot);
	}
}

class Average extends Total {
	float avg;

	void calc_avr() {
		avg = tot / 3;
		System.out.printf("평균은 %.1f이다.\n", avg);
	}
}

public class ExecuteAvr {

	public static void main(String[] args) {
		Average av = new Average();
		Scanner sn = new Scanner(System.in);

		System.out.print("국어 : ");
		av.kor = sn.nextInt();
		System.out.print("수학 : ");
		av.mat = sn.nextInt();
		System.out.print("영어 : ");
		av.eng = sn.nextInt();

		av.calc_total();
		av.calc_avr();
	}

}
