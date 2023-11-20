package test;

//class Car {
//	String color;
//	static int numOfCar = 0;
//	static int numOfRedCar = 0;
//
//	Car(String color) {
//		this.color = color;
//		numOfCar++;
//		if (color.equalsIgnoreCase("red"))
//			numOfRedCar++;
//	}
//
//	static int getNumOfCar() {
//		return numOfCar;
//	}
//
//	static int getNumOfRedCar() {
//		return numOfRedCar;
//	}
//}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("Red");
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());

	}

}
