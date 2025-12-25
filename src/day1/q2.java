package day1;
import java.util.Scanner; 

public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements=");
		int num= sc.nextInt();
		int arr[]= new int[num];
		int min=0;
		for(int i=0; i<num; i++) {
			System.out.println("Enter element for array=");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is=");
		for(int i= 0; i<num; i++) {
			System.out.println(arr[i] + " ");
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]<min) {
				min=arr[j];
			}
		}
		System.out.println("Minimum element is=" + min);
		
	}

} 
