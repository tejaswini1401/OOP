package array.handling;
import java.util.*;

public class ChangeArrayEle {
	
	private static List<Integer> changeArrayEle(int[]arr,int old,int newEle) {
		
		List<Integer> ls = new ArrayList<>();
		
		for(int ele: arr) {
			
			if(ele==old) {
				
				ls.add(newEle);
			}else {
				ls.add(ele);
			}
		}
		
		return ls;
		
	}

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4,5};
		int oldEle = 3;
		int newEle = 8;
		
		List<Integer> newArr = changeArrayEle(arr,oldEle,newEle);
		
		System.out.println(newArr);

	}

}
