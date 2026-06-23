package javacodes;

import java.util.Scanner;

abstract class BankAccount {
	static double balance = 0;
	public double deposit(double amount) {
		return balance += amount;
	}
	abstract void withdraw(double amount);
	public void displayBalance() {
		System.out.println("Your balance amount is : "+balance);
	}
}
class ICICI extends BankAccount {
	void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Error message : you are trying to withdraw more amount than available balance");
		}
		else balance-=amount;
	}
}
class Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount obj = new ICICI();
		while(true) {
			System.out.println(" 1.Deposit \n 2.Withdraw \n 3.Display Balance\n 4.Exit \n");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 :
				System.out.println("Enter amount to deposit : ");
				double amount = sc.nextDouble();
				obj.deposit(amount);
				break;
			case 2 :
				System.out.println("Enter amount to withdraw : ");
				double amount1 = sc.nextDouble();
				obj.withdraw(amount1);
				break;
			case 3 :
				obj.displayBalance();
				break;
			case 4 : 
				System.out.println("Thankyou ...");
				System.exit(0);
			default :
				System.out.println("Enter valid choice ");
			}
		}

		
	}

	
}
