package negyedikteszt;

import java.util.Scanner;

import negyedik.Alkalmazott;

public class AlkalmazottTeszt {

	public static void main(String[] args) {
		
		Alkalmazott a = new Alkalmazott();
		//a.setName("Tom");
		System.out.println(a.toString());
		a.increaseSalary(50000);
		System.out.println(a);
		
		Alkalmazott a2 = new Alkalmazott("John");
		System.out.println(a2);
		System.out.println("Nagyobb-e a fizetése mint 300e: " + 
							a2.isGreaterThan(300000));
		
		System.out.println("Nagyobb-e a fizetése mint a2: " + 
							a.hasGreaterSalary(a2));
		
		System.out.println(Alkalmazott.compareSalary(a, a2));
		
		Scanner input = new Scanner(System.in);
		
		Alkalmazott[] myArray = new Alkalmazott[5];
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Name: ");
			String name = input.nextLine();
			myArray[i] = new Alkalmazott(name);
			myArray[i].increaseSalary(i*50000);
		}
	
	// Házi feladat: 1/d algoritmusok megírása alapalgoritmusokkal ÉS
	// Alkalmazott osztály metódusainak felhasználásával
	
	}

	public static int maxSalary(Alkalmazott[] array) {
		int maxindex = 0;
		for(int i = 1; i < array.length; i++) {
			if (array[i].getSalary() > array[maxindex].getSalary())
				maxindex = i;
		}
		return maxindex;
	}
	
}
