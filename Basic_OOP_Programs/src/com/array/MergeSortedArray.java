/*
 Merge Sorted Array: Given two sorted integer arrays nums1 and nums2, merge nums2
into nums1 as one sorted array.
 */
package com.array;

import java.util.Arrays;

public class MergeSortedArray {
	
	private static int[] findMergeArr(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] newArr = new int[len1+len2];
		
		int i = 0, j = 0 , k = 0;
		
		while(i<len1 && j<len2) {
			if(nums1[i] < nums2[j]) {
				newArr[k] = nums1[i];
				i++;
			}else {
				newArr[k] = nums2[j];
				j++;
			}
			k++;
		}
		
		while(i<len1) {
			newArr[k]=nums1[i];
			i++;
			k++;
		}
		
		while(j<len2) {
			newArr[k]=nums2[j];
			j++;
			k++;
		}
		
		return newArr;
	}
	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,5,10,15};
		int[] nums2 = new int[] {2,3,6};
		
		int[] result = MergeSortedArray.findMergeArr(nums1,nums2);
		System.out.println(Arrays.toString(result));
	}

}
