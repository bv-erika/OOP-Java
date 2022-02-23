package masodikgyak;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		
		System.out.println("Size of array: ");
		int size = readInt();
		
		String[][] myAddressBook = new String[size][];
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < myAddressBook.length; i++) {
			System.out.println("Name: ");
			String name = input.nextLine();
			System.out.println("Num. of emails: ");
			int n = readInt();
			myAddressBook[i] = new String[n+1];
			myAddressBook[i][0] = name;
			for(int j = 1; j <= n; j++) {
				System.out.println(j + ". email: ");
				String email = input.nextLine();
				myAddressBook[i][j] = email;
			}
		}
		
		printArray(myAddressBook);
	}

	public static void printArray(String[][] myAddressBook) {
		for(int i = 0; i < myAddressBook.length; i++) {
			for(int j = 0; j < myAddressBook[i].length; j++) {
				System.out.print(myAddressBook[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		do {
			while(!sc.hasNextInt()) {
				System.out.println("Not a number");
				sc.next();
			}
			n = sc.nextInt();
		} while(n < 1 || n > 10);
		
		return n;
	}
}
