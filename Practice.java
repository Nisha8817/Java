

interface Test {
	default void noShow() {
		System.out.println(" show in interface");
	}
}

abstract class common
{
	abstract void accept( ); // abstract method
	abstract void display( ); // abstract method
	void f1( ) // non abstract method
	{
		System.out.println("HI");
	}
	void f2( ) // non abstract method
	{}
	
}
class student extends common implements Test
{
	void accept( )
	{
		System.out.println("Hello");
	}
	void display( )
	{
	}
	
	public void noShow() {
		// TODO Auto-generated method stub
		System.out.println("Today there is no movie show");
	}
}
class Practice
{
	public static void main(String args[])
	{
		
		common r = new student();
		r.accept(); // calls student accept( );		
		r.f1( ); // calls non-abstract method f1( ) from the common class
		r.noShow();
		student s = new student();
		s.noShow();
	}
}
 