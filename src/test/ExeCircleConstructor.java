package test;

class CircleConstructor {
	double pi = 3.14;
	double radius;
	double area;

	public CircleConstructor(double i) {
		this.radius = i;
		area = radius * radius * pi;
		System.out.printf("원의 면적은 %.2f입니다.", area);
	}

}

public class ExeCircleConstructor {

	public static void main(String[] args) {
		CircleConstructor circle = new CircleConstructor(100.0);

	}

}
