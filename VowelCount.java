package javacodes;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		int count = 0 ;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
				System.out.print(ch+" ");
				break;
			}
			
		}
		System.out.println();
		System.out.println(count);

	}

//	private static void count(String str,char ch) {
//		int count = 0 ;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==ch) count++; 
//			
//		}
//		
//		
//	}

}
