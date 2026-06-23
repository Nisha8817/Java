package javacodes;
import java.util.*;
public class VowelsSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
			switch(ch) {
			case 'a':
				System.out.println(" is a vowel");
				break;
			case 'e':
				System.out.println(" is a vowel");
				break;
			case 'i':
				System.out.println(" is a vowel");
				break;
			case 'o':
				System.out.println(" is a vowel");
				break;
			case 'u':
				System.out.println(" is a vowel");
				break;
			case 'A':
				System.out.println(" is a vowel");
				break;
			case 'E':
				System.out.println(" is a vowel");
				break;
			case 'I':
				System.out.println(" is a vowel");
				break;
			case 'O':
				System.out.println(" is a vowel");
				break;
			case 'U':
				System.out.println(" is a vowel");
				break;
			default :
				System.out.println(" is consonant");
			}
		}
	}
}
