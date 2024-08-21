package practice.problems;
import java.util.*;

public class FrequencyOfElement {
	
	private static void freqOfElement(int[] arr) {
		
		Map<Integer, Integer> entries = new HashMap<>();
		
		for(int element: arr) {
			if(entries.containsKey(element)) {
				entries.put(element, entries.get(element)+1);
			}else{
				entries.put(element, 1);

			}
		}
		System.out.println("Element: frequency");
		
		for(Map.Entry<Integer,Integer> entry: entries.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,1,2,2,2,5,5};
		
		
		freqOfElement(arr);
	}

}
