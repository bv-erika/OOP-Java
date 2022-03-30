package base;

public abstract class Cube {
	private int height;

	public Cube(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract double getArea();
	
	public double getVolume() {
		return height * getArea();
	}
	
	public boolean hasGreaterVolume(Cube other) {
		if (this.getVolume() > other.getVolume())
			return true;
		
		return false;
	}
}
