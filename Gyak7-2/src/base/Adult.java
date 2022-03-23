package base;

public class Adult extends Person {

	private String workplace;

	public Adult(String name, int age, String workplace) {
		super(name, age);
		this.workplace = workplace;
	}
	
	public Adult(String name, int age) {
		this(name, age, "home");
	}
	
	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	@Override
	public String toString() {
		return "Adult [getName()=" + getName() + ", getAge()=" + getAge() + 
				", workplace=" + workplace + "]";
	}
	
}
