package test;

class Member {
	private String name, id, password;
	private int age;

	public String getName() {
		return name;
	}

	public String getid() {
		return id;
	}

	public String getpass() {
		return password;
	}

	public int getage() {
		return age;
	}

	public void setName(String s) {
		this.name = s;
	}

	public void setId(String s) {
		this.id = s;
	}

	public void setPassword(String s) {
		this.password = s;
	}

	public void setAge(int i) {
		this.age = i;
	}

	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}