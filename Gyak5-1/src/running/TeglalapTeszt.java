package running;

import base.Teglalap;

public class TeglalapTeszt {

	public static void main(String[] args) {
		
		Teglalap t1 = new Teglalap(3);
		System.out.println(t1.toString());
		
		Teglalap t2 = new Teglalap(3,5);
		System.out.println(t2);

		System.out.println(t1.equals(t2));
		System.out.println(Teglalap.equals(t1,t2));
		
		/*
		String s1 = new String("alma");
		String s2 = new String("alma");
		System.out.println(s1.equals(s2));
		*/
		
	}

}
