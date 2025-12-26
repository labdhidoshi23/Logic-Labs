package day2;
import java.util.Scanner;
public class q7 {
	public static void main(String[] args) {
		int evenSum=0;
		int oddSum=0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements=");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter no." + i);
			num=sc.nextInt();
			if(num%2==0) {
				 evenSum+=num;
			}else oddSum+=num;
		}
		System.out.println("Even no. sum= " + evenSum);
		System.out.println("Odd no. sum= " + oddSum);	
	}

}
