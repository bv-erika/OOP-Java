package base;

import java.time.LocalDate;

public class Person {

	private String name;
	//private LocalDate dateOfBirth;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		this(name, (int)(Math.random()*100) + 1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public boolean isOlderThan(Person p) {
		if (this.age > p.age)
			return true;
		else
			return false;
	}
	
}
