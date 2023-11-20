package test;

class Person {
	String phone;

	void setPhone(String phone) {
		this.phone = phone;
	}

	String getPhone() {
		return "Person : " + phone;
	}
}

class Professor extends Person {
	String getPhone() {
		return super.getPhone() + "(Professor)";
	}
}

public class ProfTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setPhone("010-1111-2222");
		System.out.println(p.getPhone());

		Professor a = new Professor();
		a.setPhone("010-1234-5678");
		System.out.println(a.getPhone());

	}

}
