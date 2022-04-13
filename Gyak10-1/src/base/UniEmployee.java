package base;

public class UniEmployee extends Employee {
	
	public enum Position {
		PROF, OKTATO, ADMIN;
		
		public int getSize() {
			int counter = 0;
			for(Position pos : UniEmployee.Position.values()) {
				counter++;
			}
			return counter;
		}
		
		public static Position getItem(int i) {
			switch(i) {
			case 0 : return PROF;
			case 1 : return OKTATO;
			case 2 : return ADMIN;
			}
			return null;
		}
		
		public int getIndex() {
			switch(this) {
			case PROF : return 0;
			case OKTATO : return 1;
			case ADMIN : return 2;
			}
			return -1;
		}
	}
	
	private static int basesalary = 500000;
	private Position position;
	
	public UniEmployee(String name, int age, String workplace, Position position) {
		super(name, age, workplace, 0);
		this.position = position;
		switch(position) {
			case PROF :  
				this.setSalary(basesalary);
				break;
			case OKTATO : 
				this.setSalary((int)(basesalary*0.5));
				break;
			case ADMIN :
				this.setSalary((int)(basesalary*0.3));
				break;
		}
	}

	public static int getBasesalary() {
		return basesalary;
	}

	public static void setBasesalary(int basesalary) {
		UniEmployee.basesalary = basesalary;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "UniEmployee [position=" + position + ", toString()=" + super.toString() + "]";
	}
	
}
