
public class person {
	private String name;
	private int id;
	private int age;

	public person(String name, int id, int age) {
		this.name = name;
		this.age = age;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;

	}
}
