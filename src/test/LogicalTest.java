package test;

import java.util.Scanner;

public class LogicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int x = in.nextInt();
		boolean tt1 = (x % 4 == 0) && (x % 5 == 0);
		boolean tt2 = (x % 4 == 0) || (x % 5 == 0);
		System.out.println("4와 5로 나누어진다 :" + tt1);
		System.out.println("4또는 5로 나누어진다 :" + tt2);
		System.out.println("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는다:" + (tt1 && !tt2));
	}

}
