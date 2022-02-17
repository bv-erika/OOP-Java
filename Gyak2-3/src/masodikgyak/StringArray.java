package masodikgyak;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		int size = readInt();
		String[] myArray = new String[size];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Nevek: ");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = in.nextLine();
		}

		printArray(myArray);
		
		System.out.println("Azonosak száma: " + countIdenticals(myArray));
		System.out.println("Azonos kezdőbetűsek száma: " + countSameCredentials(myArray));
		
	}
	
	static int readInt() {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.println("Size of array: ");
			//String str = input.nextLine();
			while (!input.hasNextInt()) {
				System.out.println("Not a number");
				input.next();
			}
			n = input.nextInt();
		} while(n < 1 || n > 10);
		
		return n;
	}
	
	static void printArray(String[] array) {
		for(String item : array) {
			System.out.println(item);
		}
	}

	static int countIdenticals(String[] array) {
		int counter = 0;
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					counter++;
				}
			}
		}
		return counter;
	}
	
	static int countSameCredentials(String[] array) {
		int counter = 0;
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if (array[i].charAt(0) == array[j].charAt(0)) {
					counter++;
				}
			}
		}
		return counter;
	}
}
