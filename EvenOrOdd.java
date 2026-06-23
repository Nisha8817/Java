package javacodes;
import java.util.*;
public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it iis even or odd : ");
		int num = sc.nextInt();
		if(num%2==0) System.out.println(num+" is Even number");
		else System.out.println(num+" is Odd number");
	}
}
