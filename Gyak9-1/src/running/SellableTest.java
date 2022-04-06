package running;

import java.awt.Color;

import classes.product.*;
import interfaces.Sellable;

public class SellableTest {

	public static void main(String[] args) {
		
		Product s1 = new Pen("toll", 3500, "Zebra", Color.BLACK);
		System.out.println(s1);
		//s1.setDefaultPrice();
		//System.out.println(s1);
		
		s1.setCurrency("EUR");
		System.out.println(s1);
		s1.setDefaultCurrency();
		System.out.println(s1);
		
	}
	
}
