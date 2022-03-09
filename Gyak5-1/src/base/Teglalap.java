package base;

public class Teglalap {
	private int a;
	private int b;
	
	public Teglalap(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Teglalap [a=" + a + ", b=" + b + ", area=" +
				getArea() + "]";
	}

	public static boolean equals(Teglalap t1, Teglalap t2) {
		if (t1.a == t2.a && t1.b == t2.b)
			return true;
		return false;
	}
	
	public boolean equals(Teglalap other) {
		if (this.a == other.a && this.b == other.b)
			return true;
		return false;
	}
	
	public int getArea() {
		return a*b;
	}

	
	/* getter, setter */
	public Teglalap(int a) {
		this(a, a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

	
}
