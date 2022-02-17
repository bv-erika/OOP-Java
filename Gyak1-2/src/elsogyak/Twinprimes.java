package elsogyak;

public class Twinprimes {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			for(int j = i + 1; j < 100; j++) {
				if ( twinprimes(i,j) ) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
	
	static boolean twinprimes(int i, int j) {
		if (prime(i) && prime(j) && difference(i,j) == 2)
			return true;
		else
			return false;
	}

	static boolean prime(int n) {
		//boolean prime = true;
		for(int div = 2; div <= Math.sqrt(n); div++) {
			if (n % div == 0) {
				//prime = false;
				//break;
				return false;
			}
		}
		return true;
	}
	
	static int difference(int i, int j) {
		return Math.abs(i - j);
	}
}
