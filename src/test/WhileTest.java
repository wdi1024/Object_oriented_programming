package test;

public class WhileTest {

	public static void main(String[] args) {
		int row = 2;
		while (row < 10) {
			int column = 1;
			System.out.printf("%d단 출력\n", row);
			while (column < 10) {
				System.out.printf("%d * %d = %d\n", row, column, row * column);
				column++;
			}
			System.out.println();
			row++;
		}
	}
}