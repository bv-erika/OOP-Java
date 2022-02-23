/**
 * 
 */
package elsogyak;

/**
 * @author erika
 *
 */
public class Pi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Leibniz sor
				double pi = 0;
				int numerator = 1;
				int denominator = 1;
				for (int i=1; i<= 1000; i++) {
					if (i%2 == 1)
						pi += (double)numerator / denominator;
					else
						pi -= (double)numerator / denominator;
					
					denominator += 2;
				}

				System.out.println("Pi = " + pi*4);

	}

}
