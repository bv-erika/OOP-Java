package running;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import base.*;
import base.UniEmployee.Position;

public class UniEmployeeTest {

	public static void main(String[] args) {
		
		int size = 5;
		ArrayList<UniEmployee> mylist = new ArrayList<UniEmployee>();
		UniEmployee[] myarray = new UniEmployee[size];
		
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(instream);
		
		for(int i = 0; i < size; i++) {
			String name = "emp" + (i + 1);
			int age = (int)(Math.random() * 46) + 25;
			String workplace = "Uni Miskolc";
			Position p = null;
			
			//választható beosztás
			/*
			System.out.println("Beosztás: ");
			for(Position pos : UniEmployee.Position.values()) {
				System.out.println(pos);
			}
			boolean ok = false;
			try {
			do {
				ok = true;
				String posstr = input.readLine();
				p = null;
				for(Position pos : UniEmployee.Position.values()) {
					if (posstr.compareTo(pos.toString()) == 0)
						p = pos;*/
					/*
					switch(pos) {
					case PROF :  
						if (posstr.compareToIgnoreCase("PROF") == 0)
							p = UniEmployee.Position.PROF;
						break;
					case OKTATO : 
						if (posstr.compareToIgnoreCase("OKTATO") == 0)
							p = UniEmployee.Position.OKTATO;
						break;
					case ADMIN :
						if (posstr.compareToIgnoreCase("ADMIN") == 0)
							p = UniEmployee.Position.ADMIN;
						break;
					}*/
				/*}
				if (p == null)
					ok = false;
			} while (!ok);
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}*/
			
			//generált beosztás
			int posvalue = (int)(Math.random() * 3);
			for(Position pos : UniEmployee.Position.values()) {
				if (posvalue == pos.getIndex()) {
					p = pos;
				}
			}
			
			UniEmployee e = new UniEmployee(name, age, workplace, p);
			mylist.add(e);
			
			myarray[i] = new UniEmployee(name, age, workplace, p);
		}
		
		listArrayList(mylist);
		System.out.println();
		
		//Tömbre kell konvertálni a listát ahhoz, hogy a sort()
		//metódussal rendezhető legyen
		Object[] myconvertedlist = mylist.toArray();
		listArray(myconvertedlist);
		Arrays.sort(myconvertedlist);
		System.out.println();
		listArray(myconvertedlist);
		
	}
	
	public static void listArrayList(ArrayList<UniEmployee> mylist) {
		for(int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
	}
	
	public static void listArray(Object[] myarray) {
		for(int i = 0; i < myarray.length; i++) {
			System.out.println(myarray[i]);
		}
	}
	
}
