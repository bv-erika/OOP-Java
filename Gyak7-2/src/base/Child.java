package base;

public class Child extends Person {

	private String school;

	public Child(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Child [getName()=" + getName() + ", getAge()=" + getAge() + 
				", school=" + school + "]";
	}
	
}
