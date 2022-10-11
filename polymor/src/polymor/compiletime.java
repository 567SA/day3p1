package polymor;

public class compiletime {
	void sum( int a,int b);
	{
		System.out.println(a+b);
	}
	void sum( int a,int b,int c);{
	System.out.println(a+b+c);
	}
	public static void main(String[]arg) {
		compiletime obj =new compiletime();
		obj.sum(7, 9,9);
		obj.sum(7, 9);
	}

}
