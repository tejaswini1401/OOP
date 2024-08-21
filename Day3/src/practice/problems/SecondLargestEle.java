package practice.problems;

public class SecondLargestEle {
	
	public static int secondLargestElement(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num :arr) {
			
			if(largest<num) {
				secondLargest=largest;
				largest=num;
			}else if(secondLargest<num && num!=largest) {
				secondLargest=num;
			}
		}
		return secondLargest;
	}
	
	

	public static void main(String[] args) {
		
		int []arr = new int[] {1,2,3,4,5};
		
		int result = secondLargestElement(arr);
		
		System.out.println("Second largest element in array is "+result);
		

	}

}
