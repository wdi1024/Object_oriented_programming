package test;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑변의 반지름은? ");
		double r = in.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double h = in.nextDouble();
		System.out.printf("원기둥의 부피는 %4.14f입니다. ", r * r * 3.14 * h);
	}

}
