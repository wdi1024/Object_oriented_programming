package sec4;

public class PrintfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 97;
		String s = "Java";
		double f = 3.14f;
		System.out.printf("%d\n", i); // 10진수
		System.out.printf("%o\n", i); // 8진수
		System.out.printf("%x\n", i); // 16진수
		System.out.printf("%c\n", i); // 문자
		System.out.printf("%5d\n", i); // 5자리, 빈자리 공백
		System.out.printf("%05d\n", i); // 5자리, 빈자리 0 대입
		System.out.printf("%s\n", s); // 문자
		System.out.printf("%5s\n", s); // 5자리, 빈자리 공백
		System.out.printf("%-5s\n", s); // 5자리, 빈자리 공백, 왼쪽 정렬
		System.out.printf("%f\n", f); // 10진수 실수
		System.out.printf("%e\n", f); // 지수
		System.out.printf("%4.1f\n", f); // 4자리, 소수점 밑 1자리
		System.out.printf("%04.1f\n", f); // 4자리, 소수점 밑 1자리, 빈자리 0
		System.out.printf("%-4.1f\n", f); // 4자리, 소수점 밑 1자리, 왼쪽 정렬
	}

}
