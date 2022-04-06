package running;

import java.awt.Color;

import classes.point.*;
import classes.product.*;
import interfaces.Colorable;

public class ColorTest {

	public static void main(String[] args) {
		
		Point p1 = new ColorPoint();
		Colorable p2 = new ColorPoint(Color.BLUE);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Colorable p3 = new Pen("toll", 3500, "Zebra", Color.BLACK);
		System.out.println(p3);
		p3.setDefaultColor();
		System.out.println(p3);

	}

}
