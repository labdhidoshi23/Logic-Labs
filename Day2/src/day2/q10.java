package day2;
import java.util.Scanner;
public class q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance=1000;
		int choice;
		while(true) {
			System.out.println("ATM");
			System.out.println("1. Check balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Enter your choice=");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your current balance=" + balance);
				break;
			case 2:
				System.out.println("Enter amount to be deposited=");
				int deposit =sc.nextInt();
				balance+=deposit;
				System.out.println("New current balance=" + balance);

            case 3:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();

                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("New Balance: " + balance);
                } else {
                    System.out.println("Insufficient balance or invalid amount");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice. Try again.");   
			}
		}
	}

}
