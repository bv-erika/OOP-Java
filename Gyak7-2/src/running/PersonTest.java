package running;

import java.util.Scanner;

import base.*;

public class PersonTest {

	public static void main(String[] args) {
	
		Person[] array = new Person[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = readPerson();
			System.out.println(array[i]);
		}
		
		System.out.println("Adult avg age: " + avgAge(array));

	}
	
	public static double avgAge(Person[] array) {
		double avg = 0;
		int counter = 0;
		for(Person p : array) {
			if(p instanceof Adult) {
				avg += p.getAge();
				counter++;
			}
		}
		return avg / counter;
	}
	
	public static Person readPerson() {
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		String name = input.nextLine();
		boolean ok = false;
		int age = 0;
		do {
			ok = false;
			System.out.println("Age: ");
			if (input.hasNextInt()) {
				age = input.nextInt();
				ok = true;
			}
		} while(!ok || age < 1 || age > 100);
		input.nextLine();
		
		Person p;
		
		if (age <= 18) {
			System.out.println("School: ");
			String school = input.nextLine();
			p = new Child(name, age, school);
		}
		else {
			System.out.println("Workplace: ");
			String workplace = input.nextLine();
			p = new Adult(name, age, workplace);
		}
		
		return p;
	}

}
