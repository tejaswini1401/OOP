package com.array;

public class FindMaxSubArrSum {
	
	private static int findMaxSunArrSum(int[] arr) {
		
		if(arr.length == 0) return 0;
		
		int max_current = arr[0];
		int max_global = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			max_current = Math.max(arr[i], max_current + arr[i]);
			
			if(max_current > max_global) {
				max_global = max_current;
			}
		}
		return max_global;		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 2, 1, 6};
		int maxSum = FindMaxSubArrSum.findMaxSunArrSum(arr);
		System.out.println("Maximum subarray sum: "+ maxSum);
	}

}
