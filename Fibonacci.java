package javacodes;

public class Fibonacci {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		System.out.print(x+" "+y+" ");
		int i=3;
		while(i<=10) {
			int z=x+y;
			System.out.print(z+" ");
			x=y;
			y=z;
			i++;
		}

	}

}
