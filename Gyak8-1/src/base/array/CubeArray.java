package base.array;

import base.Cube;
import base.derived.Brick;
import base.derived.Cylinder;

public class CubeArray {
	private Cube[] array;
	
	public CubeArray(int size) {
		array = new Cube[size];
	}
	
	public void setItem(int index, Cube c) {
		array[index] = c;
	}
	
	public int getMaxSize() {
		return array.length;
	}
	
	public Cube getItem(int index) {
		return array[index];
	}
	
	public int getNumberOfItems() {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] != null)
				counter++;
		}
		return counter;
	}
	
	public double getAvgVolume() {
		double avg = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] != null)
				avg += array[i].getVolume();
		}
		return avg / getNumberOfItems();
	}
	
	public int getNumOfCylinders() {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i] instanceof Cylinder)
					counter++;
			}
		}
		return counter;
	}
	
	public int getNumOfBricks() {
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i] instanceof Brick)
					counter++;
			}
		}
		return counter;
	}
}
