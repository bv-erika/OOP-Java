package runnable;

import base.*;
import base.derived.*;

public class CubeTest {

	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder(12, 0.5);
		System.out.println(c1);
		
		Brick c2 = new Brick(5, 3, 4);
		System.out.println(c2);
		
		System.out.println(c1.hasGreaterVolume(c2));
	}

}
