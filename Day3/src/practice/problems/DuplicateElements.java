package practice.problems;
import java.util.Arrays;

public class DuplicateElements {
	
	private static void findDuplicateEle(int[] arr) {
		
		System.out.println("Duplicate elements present in array: ");
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] == arr[i+1]) {
				
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,2,3,4,4,4,5};
		
		findDuplicateEle(arr);

	}

}
