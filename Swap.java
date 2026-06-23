package javacodes;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number2 : ");
		int num2 = sc.nextInt();
		System.out.println("Num1 and Num2 before swapping are : "+num1+" and "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Num1 and Num2 after swapping are : "+num1+" and "+num2);
	}

}
