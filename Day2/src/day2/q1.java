package day2;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//QUESTION 1
		System.out.println("Enter coversion choice CtoF or FtoC:");
		String choice= sc.next();
		System.out.println("Enter the value:");
		float num= sc.nextFloat();
		if(choice.equals("FtoC")) {
			float c= (num-32)*5/9;
			System.out.println(num + "F =" + c);
			
		}else if(choice.equals("CtoF")) {
			float f= (num*9/5)+32;
			System.out.println(num + "C =" + f);
		}else {
			System.out.println("Invalid choice");
		}
	}
}
