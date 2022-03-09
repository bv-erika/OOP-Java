package base;

import java.util.Arrays;

public class TeglalapTomb {

	Teglalap[] tArray;
	int size;
	
	public TeglalapTomb(int size) {
		tArray = new Teglalap[size];
		this.size = size;
	}
	
	public int minArea() {
		int minindex = 0;
		for(int i = 1; i < tArray.length; i++) {
			if (tArray[i].getArea() < tArray[minindex].getArea())
				minindex = i;
		}
		return minindex;
	}
	
		
	@Override
	public String toString() {
		return "TeglalapTomb [tArray=" + Arrays.toString(tArray) + "]";
	}

	public int getSize() {
		return size;
	}
	
	public void settArray(Teglalap[] t) {
		for(int i = 0; i < size; i++) {
			tArray[i] = t[i];
		}
	}
}
