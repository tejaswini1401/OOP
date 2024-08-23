package com.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	private static int[] findProductArr(int[] arr) {
		
		int[] newArr = new int[arr.length];
		int product = 1;
		for(int i=0;i<arr.length;i++) {
			newArr[i] = product;
			product = product * arr[i];
		}
		product = 1;
		for(int i = arr.length-1;i>=0;i--) {
			newArr[i] = newArr[i] * product;
			product = product * arr[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		
		int [] arr = new int[] {1, 2, 3, 4, 5};
		int[] result = ProductOfArrayExceptSelf.findProductArr(arr);
		System.out.println(Arrays.toString(result));
	}

}
