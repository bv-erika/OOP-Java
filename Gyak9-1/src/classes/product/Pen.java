package classes.product;

import java.awt.Color;

import classes.MyColor;
import interfaces.Colorable;

public class Pen extends Product implements Colorable {
	private String brand;
	private Color color;
	
	public Pen(String name, int price, String brand, Color color) {
		super(name, price);
		this.brand = brand;
		this.color = color;
	}

	@Override
	public String toString() {
		MyColor mycolor = new MyColor(color);
		return "Pen [brand=" + brand + ", color=" + mycolor + ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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
