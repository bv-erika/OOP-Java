package running;

import java.lang.*;
import base.Teglalap;
import base.TeglalapTomb;

public class TeglalapTombTeszt {

	public static void main(String[] args) {
	
		/*
		Teglalap[] myArray = new Teglalap[10];
		
		for(int i = 0; i < myArray.length; i++) {
			// range: 2-10
			int a = (int)(Math.random() * 9) + 2;
			int b = (int)(Math.random() * 9) + 2;
			myArray[i] = new Teglalap(a,b);
			System.out.println(myArray[i]);
		}
		*/
		
		int size = 5;
		Teglalap[] tArray = new Teglalap[size];
		for(int i = 0; i < size; i++) {
			int a = (int)(Math.random() * 9) + 2;
			int b = (int)(Math.random() * 9) + 2;
			tArray[i] = new Teglalap(a,b);
		}
		
		TeglalapTomb myArray = new TeglalapTomb(size);
		myArray.settArray(tArray);
		System.out.println(myArray);
		System.out.println("Legkisebb területű téglalap sorszáma: " + myArray.minArea());
	}

}
