package runnable;

import base.Cube;
import base.array.CubeArray;
import base.derived.Brick;
import base.derived.Cylinder;

public class CubeArrayTest {
	
	public static void main(String[] args) {
	
		CubeArray myArray = new CubeArray(5);
		
		for(int i = 0; i < myArray.getMaxSize(); i++) {
			int option = (int)(Math.random()*3) + 1;
			System.out.println(option);
			switch(option) {
				case 1:
					double r = (Math.random() * 10) + 1;
					Cube c1 = new Cylinder(10, r);
					myArray.setItem(i, c1);
					break;
				case 2:
					int sideA = (int)(Math.random() * 5) + 1;
					int sideB = (int)(Math.random() * 5) + 1;
					Cube c2 = new Brick(6, sideA, sideB);
					myArray.setItem(i, c2);
					break;
				case 3:
					Cube c3 = null;
					myArray.setItem(i, c3);
			}
		}
		
		System.out.println("Size: " + myArray.getMaxSize());
		System.out.println("Items: " + myArray.getNumberOfItems());
		System.out.println("Avg volume: " + myArray.getAvgVolume());
		System.out.println("Num of items: " + myArray.getNumberOfItems());
		System.out.println("Num of cylinders: " + myArray.getNumOfCylinders());
		System.out.println("Num of bricks: " + myArray.getNumOfBricks());
		
	}
}
