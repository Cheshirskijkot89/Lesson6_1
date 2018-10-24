package chizhenko;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		int maxEl;
		
		for (int i=0; i<myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);
		}
		
		
		maxEl = MaxElement(myArray);
		System.out.println(Arrays.toString(myArray));
		System.out.println("max element is " + maxEl);
		
	}

	public static int MaxElement(int[] pArray) {
	
		int max = 0;
		
		for (int i=0; i<pArray.length; i++) {
			if (pArray[i] > max) {
				max = pArray[i];
			}
		}
		
		return max;
	}
	
}


