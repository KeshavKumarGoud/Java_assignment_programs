package assignment_27;

public class Super_calling_method_1 extends Super_calling_method_2{
	 static int a=1;
	Super_calling_method_1()
	{	
		super();
		System.out.println("child class constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Super_calling_method_1 scm1=new Super_calling_method_1();

	}


}
