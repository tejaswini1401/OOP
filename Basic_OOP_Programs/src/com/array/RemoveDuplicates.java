package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	private static int[] removeDuplicates(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int value : arr) {
			set.add(value);
		}
		
		int[] newArr = new int[set.size()];
		int index = 0;
		for(int val : set) {
			newArr[index++] = val;
		}
		return newArr;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 5};
		int[] result = RemoveDuplicates.removeDuplicates(arr);
		System.out.println(Arrays.toString(result));
	}

}
