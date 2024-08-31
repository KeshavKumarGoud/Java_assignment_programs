package Assignment_1;

public class static_method_calling {
	public static void method_1()
	{
		System.out.println("its static method");
	}

	public static void main(String[] args) {
		System.out.println("its main method");
		//static_method_calling.method_1();
		method_1();
	}

}
