package day2;

public class q6 {
	public int IsPalindrome(String s) {
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			return 1;
		}else return 0;
		
	}
	public static void main(String[] args) {
		String s="Labdhi";
		q6 palindrome = new q6();
		int result= palindrome.IsPalindrome(s);
		if(result==1) {
			System.out.print("Palindrome");
		}else System.out.println("Not Palindrome");
		
	}

}
