package test;

import java.util.Scanner;

class Number {
	int a;
	int b;
	int c;
}

public class Java_reference3 {
	static void swap(Number z) {
		int temp = z.a;
		z.a = z.c;
		z.c = z.b;
		z.b = temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Number n = new Number();
		System.out.printf("3 개의 숫자 입력 : ");
		n.a = in.nextInt();
		n.b = in.nextInt();
		n.c = in.nextInt();
		System.out.printf("swap() 메소드 호출 전 : %d, %d, %d\n", n.a, n.b, n.c);
		swap(n);
		System.out.printf("swap() 메소드 호출 후 : %d, %d, %d\n", n.a, n.b, n.c);
	}

}
