
public class Person {
	private String fullName;
	private int age;
	private int id;
	
	public Person(String name,int age,int id) {
		this.setName(name);
		this.setAge(age);
		this.setId(id);
	}

	public String getName() {
		return fullName;
	}

	public void setName(String name) {
		this.fullName = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
