package day2;
import java.util.Scanner;
public class q9 {
	public int Factorial(int num) {
		if(num==0 || num==1) {
			return 1;
		}else return num* Factorial(num-1);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number=");
		int num= sc.nextInt();
		q9 fact= new q9();
		int result= fact.Factorial(num);
		System.out.println("Factorial=" + result);
		
		
	}

}
