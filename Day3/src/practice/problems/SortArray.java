package practice.problems;
import java.util.Arrays;

public class SortArray {
	
	private static void sortArrayAsc(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.print(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,3,7,99,10};
		
		sortArrayAsc(arr);

	}

}
