package test;

public class ExeDog2 {
	static void dog_prn(Dog d) {
		System.out.println("이름 : " + d.name);
		System.out.println("품종 : " + d.breeds);
		System.out.println("나이 : " + d.age);
		d.wag();
		d.bark();
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "망고";
		d1.breeds = "골든리트리버";
		d1.age = 2;
		dog_prn(d1);

		Dog d2 = new Dog();
		d2.name = "까미";
		d2.breeds = "믹스";
		d2.age = 3;
		dog_prn(d2);
	}

}
