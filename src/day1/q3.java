package day1;

public class q3 {
		public boolean prime(int num) {
			if(num<=1) {
				return false;
			}
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
						return false;
					}
				}
			return true;
		}
		
	public static void main(String[] args) {
		int num=9;
		q3 p= new q3();
		boolean result= p.prime(num);
		if(result) {
			System.out.println(num + " is a prime no.");
		}else {
			System.out.println(num + " is not prime");
		}
		
	}

}
