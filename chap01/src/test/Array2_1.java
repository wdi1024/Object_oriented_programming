package test;

public class Array2_1 {

	public static void main(String[] args) {
		int x = 1;
		int[][] arr1 = new int[5][5];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++)
				arr1[i][j] = x++;
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] >= 10)
					System.out.printf("%d", arr1[i][j]);
				else
					System.out.printf(" " + arr1[i][j]);
			}
			System.out.println();
		}
	}

}
