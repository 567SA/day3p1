package acc.exp;

public class exceptiondemo {
	static int i=0;
	public static int printno (int=0) {
		p=p+2;
		System.out.println(p);
		return p=printno(p+2);
	}
	
	public static void main(String[]arg) {
		printno(p);
	}

}
