package base.derived;

import base.Cube;

public class Brick extends Cube {
	private int sideA;
	private int sideB;
	
	public Brick(int height, int sideA, int sideB) {
		super(height);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double getArea() {
		return sideA * sideB;
	}

	@Override
	public String toString() {
		return "Brick [sideA=" + sideA + ", sideB=" + sideB + ", getArea()=" + getArea() + ", getHeight()="
				+ getHeight() + ", getVolume()=" + getVolume() + "]";
	}

}
