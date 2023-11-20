package test;

class Circle {
	int radius;

	void show() {
		System.out.println("반지름이 " + this.radius + "인 원이다.");
	}

	public Circle(int radius) {
		this.radius = radius;
	}

}

class ColoredCircle extends Circle {
	String color;

	void show() {
		System.out.println("반지름이 " + this.radius + "인 " + this.color + " 원이다.");
	}

	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		c1.show();
		c2.show();

	}

}
