package classes.point;

import java.awt.Color;

import classes.MyColor;
import interfaces.Colorable;

public class ColorPoint extends Point implements Colorable {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	public ColorPoint() {
		super(0,0);
		this.color = getDefaultColor();
	}
	
	public ColorPoint(Color color) {
		this(0, 0, color);
	}

	@Override
	public String toString() {
		MyColor mycolor = new MyColor(color);
		return "ColorPoint [color=" + mycolor + ", toString()=" + super.toString() + "]";
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//interface implementation
	public void setDefaultColor() {
		this.color = getDefaultColor();
	}
	
}
