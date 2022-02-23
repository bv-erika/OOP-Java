package elsogyak;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
	
		int size = readInt();
		//System.out.println(size);
		
		int[] myArray = new int[size];
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = (int)(Math.random() * 50) + 1;
			//myArray[i] = 16;
			//System.out.print(myArray[i] + ", ");
		}
		
		printArray(myArray);
		//növekvő rendezés
		Arrays.sort(myArray);
		printArray(myArray);
		
		//bináris keresés
		System.out.println("Searchkey: ");
		int key = readInt();
		System.out.println("Result: " + Arrays.binarySearch(myArray, key));
		
		System.out.println("Átlag: " + avgArray(myArray));
		
		int[] selected = selectArray(myArray);
		System.out.println("Négyzetszámok: ");
		printArray(selected);
	
	}

	static int readInt() {
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number between 1 and 10");
			while(!input.hasNextInt()) {
				System.out.println("Not a number");
				input.next();
			}
			n = input.nextInt();
		} while(n < 1 || n > 10);
		
		return n;
	}
	
	static void printArray(int[] array) {
		for (int item : array) {
			System.out.print(item + ", ");
		}
		System.out.println();
	}
	
	static double avgArray(int[] array) {
		double avg = 0;
		int counter = 0;
		for (int item : array) {
			if (item % 2 == 0) {
				avg += item;
				counter++;
			}
		}
		return avg / counter;
	}
	
	static int[] selectArray(int[] array) {
		int counter = 0;
		nextItem1:
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < i; j++) {
					if (array[i] == array[j]) {
						continue nextItem1;
					}
				}
				if (checkSqrNum(array[i])) {
					counter++;
				}
			}
		
		int[] selection = new int[counter];
		int i = 0;
		nextItem2:
			for(int item : array) {
				for(int j = 0; j < i; j++) {
					if (selection[j] == item) {
						continue nextItem2;
					}
				}
				if (checkSqrNum(item)) {
					selection[i++] = item;
				}
			}
		return selection;
	}
	
	static boolean checkSqrNum(int num) {
		if (num == (int)Math.sqrt(num) * (int)Math.sqrt(num))
			return true;
		return false;
	}
}
