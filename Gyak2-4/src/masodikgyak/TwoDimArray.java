package masodikgyak;

import static java.lang.Math.*;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int[][] myArray = new int[2][4];
		//myArray[0] = new int[4];
		//myArray[1] = new int[2];
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[0].length; j++) {
				myArray[i][j] = (int)(random() * 10) + 1;
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}

		//printArray(myArray);
		int searchkey = 5;
		int index = linearSearch(myArray, searchkey);
		if (index < 0)
			System.out.println("Not found");
		else
			System.out.println("Index: " + index);
		
	}

	static int linearSearch(int[][] myArray, int searchkey) {
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[0].length; j++) {
				if (myArray[i][j] == searchkey) {
					return i * myArray[0].length + j;
				}
			}
		}
		return -1;
	}
}
