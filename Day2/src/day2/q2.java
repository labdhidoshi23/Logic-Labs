package day2;
import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float sum=0;
		System.out.println("Enter no of subjects=");
		int num1= sc.nextInt();
		for(int i=0; i<num1; i++) {
			System.out.println("Enter marks of suject " + i);
			float marks = sc.nextFloat();
			sum+=marks;
		}
		float percentage= sum/num1;
		System.out.println("The percentage is=" + percentage);
		if(percentage>=90) {
			System.out.print("Grade A");
		}else if(percentage>=75) {
			System.out.println("Grade B");
		}else if(percentage>=60) {
			System.out.println("Grade C ");
		}else if(percentage>=40) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade E");
		}
		
		
		
		
	}

}
