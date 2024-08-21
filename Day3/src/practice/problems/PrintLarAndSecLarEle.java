package practice.problems;
import java.util.*;

public class PrintLarAndSecLarEle {
	
public static List<Integer> secondLargestElement(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		List<Integer> ls = new ArrayList<>();
		
		for(int num :arr) {
			
			if(largest<num) {
				secondLargest=largest;
				largest=num;
			}else if(secondLargest<num && num!=largest) {
				secondLargest=num;
			}
		}
		ls.add(largest);
		ls.add(secondLargest);
		return ls;
	}
	
	

	public static void main(String[] args) {
		
		int []arr = new int[] {1,2,3,4,5};
		
		List<Integer> newArr = secondLargestElement(arr);
		
		System.out.println("Largest element in array is "+newArr.get(0));
		System.out.println("Second largest element in array is "+newArr.get(1));
		

	}

}
