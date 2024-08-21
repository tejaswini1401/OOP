package practice.problems;

public class EvenPositionEle {
	
	private static void findEvenPosEle(int[] arr) {
		
		System.out.println("Even array position elemnets are: ");
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6};
		
		findEvenPosEle(arr);
				
	
	}

}
