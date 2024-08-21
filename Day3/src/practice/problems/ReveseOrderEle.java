package practice.problems;

public class ReveseOrderEle {
	
	private static void getRevOrderArrayEle(int[] arr) {
		
		System.out.println("Reverse order array elements are: ");
		
		for(int i = arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+"  ");
		}
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		getRevOrderArrayEle(arr);

	}

}
