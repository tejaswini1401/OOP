package practice.problems;

public class LargestElement {
	
	private static int findLargestEle(int[] arr) {
		
		int max = arr[0];
		
		for(int ele : arr) {
			
			if(max<ele) {
				
				max = ele;
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};
		
		int result = findLargestEle(arr);
		
		System.out.print("Largest element in  array:  "+ result);
				
		
	}

}
