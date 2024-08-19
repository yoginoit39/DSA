package Sorting;

import java.util.Arrays;

public class BBSort {
	
	public static void main (String[] args) {
		
		int[] arr = {-87,-1,1,99,50,4,0,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
			
		
	}
	
	static void sort(int[] arr) {
		
		boolean swapped;
		
		for(int i = 0; i < arr.length; i++) {
			
			swapped = false;
			
			for(int j = 1; j < arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
			
			
		}
		
		
		
	}
	
}