package assignment_29;

public class Using_this_calling_method {
	Using_this_calling_method()
	{
		this(5);
		System.out.println("non parameterized constructor");
	}
	Using_this_calling_method(int a)
	{
		System.out.println("parameterized constructor");
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method");
		Using_this_calling_method utcm1=new Using_this_calling_method();
	}

}
