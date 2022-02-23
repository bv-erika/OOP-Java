package harmadikgyak;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Második verzió...: input string felbontása
		boolean ok;
		do {
			ok = true;
			System.out.println("Formula: ");
			String instr = sc.nextLine();
			String[] strArray = instr.split(" ");
		
			try {
				int a = Integer.parseInt(strArray[0]);
				char op = strArray[1].charAt(0);
				int b = Integer.parseInt(strArray[2]);
				System.out.println(a + " " + op + " " + b);
			} catch(Exception e) {
				System.out.println("Invalid input");
				ok = false;
			}
		} while(!ok);

		
	}

}
