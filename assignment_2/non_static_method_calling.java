package assignment_2;

public class non_static_method_calling {
	public void ns_method_1()
	{
		System.out.println("non static method");
	}

	public static void main(String[] args) {
		
		System.out.println("main method");
		non_static_method_calling ns=new non_static_method_calling();
		ns.ns_method_1();
	}

}
