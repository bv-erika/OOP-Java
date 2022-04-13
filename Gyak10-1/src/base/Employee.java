package base;

public class Employee extends Person implements Comparable<Employee> {

	private String workplace;
	private int salary;
	
	public Employee(String name, int age, String workplace, int salary) {
		super(name, age);
		this.workplace = workplace;
		this.salary = salary;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [workplace=" + workplace + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	//iterface implementation
	public int compareTo(Employee o) {
		return this.getAge() - o.getAge();
	}
	
}
