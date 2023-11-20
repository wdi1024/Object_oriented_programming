package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayT {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int n = 1;
		while (true) {
			System.out.printf("%d 원소 입력 : ", n);
			data = in.nextInt();
			if (data < 0)
				break;
			else {
				scores.add(data);
				n++;
			}
		}
		System.out.printf("배열 원소 : ");
		for (int i : scores)
			System.out.printf("%d ", i);

	}
}
