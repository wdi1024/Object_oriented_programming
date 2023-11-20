package test;

public class ReverseArrayTest {

	public static int[] reverse(int[] org) {
		int[] rev = new int[org.length];
		for (int i = org.length - 1, j = 0; i > -1; i--, j++)
			rev[j] = org[i];

		return rev;
	}

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 7, 9 };
		int[] result = reverse(data);
		System.out.printf("변환 전 : ");
		for (int i : data)
			System.out.print(i + " ");
		System.out.println();
		System.out.printf("변환 후 : ");
		for (int i : result)
			System.out.print(i + " ");
	}

}
