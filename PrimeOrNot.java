package javacodes;
import java.util.*;
public class PrimeOrNot {
		public static void main(String[] args) {
			System.out.println("Enter a number : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num==1)System.out.println("Prime");
			int i=2;
			while(i<num) {
				if(num%i == 0) {
					System.out.println("Not Prime");
					break;
				}
				i++;
			}
			if(i==num) System.out.println("Prime");
			
			
		}

}
