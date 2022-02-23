/** 
 *  Csomag leírása: első gyakorlat
 */
package elsogyak;

import java.lang.*;

/**
 * Feladat leírása: Euler-féle e számra közelítő számítás
 * (Utolsó módosítás dátuma: 2022. 02. 09.)
 * 
 * @author Baksáné Varga erika
 * @version 1.0
 */
public class Euler {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
	
		double e = 0;
		for(int n = 0; n < 10; n++) {
			e += (double)1/fact(n); // explicit típuskonverzió
		}

		System.out.println("e = " + e);
	}
	
	/**
	 * @param int
	 * Output: az input szám faktoriálisa
	 */
	static long fact(int n) {
		long f = 1;
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}

}
