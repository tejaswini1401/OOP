package practice.problems;

public class SmallestElement {
	
	private static int findMinEle(int[] arr) {
		
		int min = arr[0];
		
		for(int ele: arr) {
			
			if(min>ele) {
				
				min=ele;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};
		
		int result = findMinEle(arr);
		
		System.out.print("Minimum element in array: "+result);
	}

}
