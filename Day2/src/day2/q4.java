package day2;
import java.util.Scanner;
public class q4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String=");
		String str = sc.nextLine();
		String rev="";
		for(String word:str.split(" ")) {
			for(int i=word.length()-1; i>=0; i--) {
				rev+=word.charAt(i);
			}
			rev+=" ";
		}
		System.out.println(rev);
	}
	

}
