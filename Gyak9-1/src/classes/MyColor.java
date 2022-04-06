package classes;

import java.awt.Color;

public class MyColor extends Color {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}

	@Override
	public String toString() {
		if (this.equals(BLACK)) return "fekete";
		else if (this.equals(RED)) return "piros";
		else if (this.equals(BLUE)) return "kék";
		else return "színes";	
	}
	
	
}
