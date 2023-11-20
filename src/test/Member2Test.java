package test;

class Member2 {
	private String name, id;
	private int birth;

	public Member2(String name, String id) {
		this.name = name;
		this.id = id;
		this.birth = 700000;
	}

	public Member2(String name, String id, int birth) {
		this.name = name;
		this.id = id;
		this.birth = birth;
	}

	public boolean isSameMember(Member2 k) {
		return (this.name == k.name) && (this.birth == k.birth);
	}
}

public class Member2Test {

	public static void main(String[] args) {
		Member2 a = new Member2("홍길동", "h123", 701011);
		Member2 b = new Member2("홍길동", "h456", 701011);
		Member2 c = new Member2("홍길동", "h789");
		System.out.println(a.isSameMember(b));
		System.out.println(a.isSameMember(c));
	}

}
