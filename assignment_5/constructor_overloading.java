package assignment_5;

public class constructor_overloading {
	constructor_overloading()
	{
		System.out.println("non parameterized constructor");
	}
	constructor_overloading(int a)
	{
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		int a=5;
		new constructor_overloading();
		new constructor_overloading(a);
	}

}
