package running;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import base.*;
import base.Card.Bank;

public class CardTest {

	public static void main(String[] args) {
		
		int size = readInt();
		Card[] array = new Card[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = createCard();
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Withdraw: " + array[i].withdraw(i*20000+500));
			System.out.println(array[i]);
		}
		
		// Tömb rendezése
		// Listává kell konvertálni, ha Java8 comparatort akarok használni
		List<Card> list = Arrays.asList(array);   
		list.sort(Comparator.comparing(Card::getValidity));
		System.out.println(list); 
		
	}

	public static Card createCard() {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		Card newcard = null;
		try {
			System.out.println("Tulajdonos neve: ");
			String name = br.readLine();
			System.out.println("Egyenleg: ");
			int balance = Integer.parseInt(br.readLine());
			System.out.println("Bank: ");
			String bankstr = br.readLine().toUpperCase();
			Bank bank = Bank.valueOf(bankstr);
			System.out.println("Lejárat: ");
			//String[] datestr = br.readLine().split(".");
			String d = br.readLine();
			String[] datestr = d.split("-");
			int year = Integer.parseInt(datestr[0]);
			int month = Integer.parseInt(datestr[1]);
			int day = Integer.parseInt(datestr[2]);
			
			System.out.println("Hitelkeret: ");
			int credit = Integer.parseInt(br.readLine());
			
			if (credit <= 0)
				newcard = new Card(name, LocalDate.of(year,month,day), balance, bank);
			else if (credit > 0)
				newcard = new CreditCard(name, LocalDate.of(year,month,day), balance, bank, credit);
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return newcard;
	}
	
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int num;
		boolean ok;
		do {
			ok = true;
			System.out.println("Adj meg egy számot: ");
			while(!input.hasNextInt()) {
				ok = false;
				input.nextLine();
			}
			num = input.nextInt();
			input.nextLine();
		} while(!ok || num < 1 || num > 10);
		
		return num;
	}
}
