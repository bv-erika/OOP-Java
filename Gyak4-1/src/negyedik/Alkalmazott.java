package negyedik;

public class Alkalmazott {

	private String name;
	private int salary;
	
	/* constructor */
	
	public Alkalmazott(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Alkalmazott(String name) {
		this(name, 250000);
	}
	
	public Alkalmazott() { 
		this("Tom");
	}

	/* getter, setter */

	public String getName() {
		return name;
	}
	
	public void setName(String newname) {
		name = newname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Alkalmazott [name=" + name + ", salary=" + salary + "]";
	}
	
	/* other methods */
	
	public void increaseSalary(int plus) {
		salary += plus;
	}
	
	public boolean isGreaterThan(int limit) {
		if (salary > limit)
			return true;
		return false;
	}
	
	public double calculateTax(double taxrate) {
		return salary * taxrate / 100;
	}
	
	public boolean hasGreaterSalary(Alkalmazott other) {
		if (this.salary > other.salary)
			return true;
		return false;
	}
	
	public static int compareSalary(Alkalmazott a1, Alkalmazott a2) {
		if (a1.salary == a2.salary)
			return 0;
		else if (a1.salary > a2.salary)
			return 1;
		else
			return 2;
	}
}
