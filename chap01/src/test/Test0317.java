package test;

import java.util.Scanner;

public class Test0317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력하세요 : ");
		int x = in.nextInt();
		int t1, t2, t3, t4, t5;
		int e = 0, o = 0;
		t1 = x % 10;
		t2 = (x % 100 - t1) / 10;
		t3 = (x % 1000 - t2 * 10 - t1) / 100;
		t4 = (x % 10000 - t3 * 100 - t2 * 10 - t1) / 1000;
		t5 = x / 10000;
		if (t1 % 2 == 0)
			e += 1;
		else
			o += 1;
		if (t2 % 2 == 0)
			e += 1;
		else
			o += 1;
		if (t3 % 2 == 0)
			e += 1;
		else
			o += 1;
		if (t4 % 2 == 0)
			e += 1;
		else
			o += 1;
		if (t5 % 2 == 0)
			e++;
		else
			o++;
		System.out.println("1의 자리 : " + t1);
		System.out.println("10의 자리 : " + t2);
		System.out.println("100의 자리 : " + t3);
		System.out.println("1000의 자리 : " + t4);
		System.out.println("10000의 자리 : " + t5);
		System.out.println("짝수의 갯수 : " + e);
		System.out.println("홀수의 갯수 : " + o);
	}

}
