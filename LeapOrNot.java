package javacodes;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it iis leap year or not : ");
		int num = sc.nextInt();
		if((num %4 ==0 && num %400 ==0) || (num % 100 !=0)) {
			System.out.println("Leap year");
		}
		else System.out.println("Not a Leap year");
	}

}
