package acc.exphandilig;

public class exppropagationdemo {
void training() {
	Stirng course = null;
	System.out.println(course.length());
	
}
void participate1() 
{
	this.training();
	
}
void  trainer() {
	try {
		participate1();
	}
	catch(Exection e) {
		System.out.println("Excption Handeled");
		
	}
	public static void main(String[]arg) {
		expprogationdemo exc =new expprogationdemo();
		exc.trainer();
	}
}
}
