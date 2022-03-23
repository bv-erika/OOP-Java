package running;

import base.*;

public class ProductTest {

	public static void main(String[] args) {
		
		// a) feladat
		Product p1 = new Product("toll", 3500, 27);
		Bread b1 = new Bread("rozskenyér", 350, 10, 0.5);
		
		System.out.println(p1);
		System.out.println(b1);
		
		System.out.println(Product.comparePrice(p1, b1));
		//System.out.println(Bread.compareUnitPrice(p1, b1));
		
		// b) és c) feladat
		Product p2 = new Bread("fehérkenyér", 250, 10, 1);
		System.out.println(p2);
		System.out.println(Product.comparePrice(p2, b1));
		System.out.println(Bread.compareUnitPrice((Bread)p2, b1));
	}

}
