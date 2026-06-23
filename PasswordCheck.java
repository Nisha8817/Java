package javacodes;
import java.util.*;
public class PasswordCheck {

	public static void main(String[] args) {
		int uC =0;
		int dC =0;
		int sC =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password : ");
		String pswd = sc.next();
		if(pswd.length()<8) System.out.println("Please enter password length of atleast 8 characters");
		else {
			for(int i=0;i<pswd.length();i++) {
				int ch = pswd.charAt(i);
//				System.out.println(ch);
				if((ch>=65 && ch<=82)) {
					uC+=1;

				}
				if(ch>=48 && ch<=57) {
					dC+=1;
				}
				if((ch>=32 && ch<=47)) {
					sC+=1;
				}
				if(ch>=58 && ch<=64) {
					sC+=1;
				}
			}
		}
		
		if(uC !=0 && dC!=0 && sC!=0) {
			System.out.println("Password Accepted");
		}
		else System.out.println("Password not accepted");

	}

}
