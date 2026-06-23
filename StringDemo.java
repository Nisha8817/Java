package javacodes;
import java.util.*;
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.next();
		System.out.println("Length of the string is : "+s.length());
		for(int i =0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
		sc.close();
	}

}
