/*
 5. Rotate Array: Rotate an array to the right by k steps, where k is non-negative.
 */
package com.array;

import java.util.Arrays;

public class RotateArray {
	
	private static void findRotatingArr(int [] arr, int k) {
		int len = arr.length;
		k = k%len;
		reverse(arr, 0, len-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, len-1);
		
	}
	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		int k = 3;
		System.out.println("Original array : "+Arrays.toString(arr));
		RotateArray.findRotatingArr(arr,k);
		System.out.println("Rotated array : "+Arrays.toString(arr));
	}

}
