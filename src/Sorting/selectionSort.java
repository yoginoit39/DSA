package Sorting;

import java.util.Arrays;

public class selectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,5,1,2,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void sort(int[]arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr,0,last);
			swap(arr, maxIndex, last);
		}
		
	}
	
	
	static int getMaxIndex(int[]arr, int start, int end) {
		
		int max = start;
		
		for(int i = start; i <= end; i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
		
	}
	
	static void swap(int[]arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
}


//***************** OR *********************************


//public class selectionSort{
//	
//	public static void main(String[] args) {
//		
//		int arr[] = {4,5,1,2,3};
//		int min;
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			min = i;
//			
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[j] < arr[min]) {
//					min = j;
//				}
//			}
//			
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//			
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//	
//}
































