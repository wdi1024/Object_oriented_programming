package sec03;

public class NumberTypeDemo {
	public static void main(String[] args) {
		int mach = 340, distance = mach * 60 * 60;
		// float radius = 10.0f, area = radius * radius * 3.14f;
		double radius = 10.0, area = radius * radius * 3.14;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
	}
}
