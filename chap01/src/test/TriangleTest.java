package test;

class Triangle {
	private double base, height;

	public Triangle(double a, double b) {
		this.base = a;
		this.height = b;
	}

	public double findArea() {
		return (this.base * this.height) / 2;
	}

	public double getBase() {
		return this.base;
	}

	public double getHeight() {
		return this.height;
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		System.out.println(t1.findArea());
	}

}
