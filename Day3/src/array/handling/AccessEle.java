package array.handling;
import java.util.Arrays;
import  java.util.Scanner;

public class AccessEle {
	
	private static int accessArrayEle(int[] arr, int index) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==index) {
				return arr[i];
			}
		}
		return -1;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[] {1,2,3,4};
		
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter index of array which you want access element : ");
		int index = sc.nextInt();
		
		int ele = accessArrayEle(arr, index);
		
		if(ele==-1) {
			System.out.println("Index not found in an array");
		}else {
			System.out.println("Element at index "+index+" is "+ele);
		}
		sc.close();
		
	}

}
