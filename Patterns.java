package javacodes;

public class Patterns {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=4;i>0;i--) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
