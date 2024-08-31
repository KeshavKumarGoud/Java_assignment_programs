package automation_class_28;


public class child_class_1 extends parent_class_1{
	
	public static void child_method5()
	{
		System.out.println("Child Static method 1 ");
	}
	
	public static void child_method6()
	{
		System.out.println("Child Static method 2 ");
	}
	public void child_method7()
	{
		System.out.println("Child non Static method 1 ");
	}
	public void child_method8()
	{
		System.out.println("Child non Static method 2 ");
	}
	public static void main(String[] args) {
		parent_class_1 P1 = new child_class_1(); //Upcasting
		System.out.println("Methods accessable when upcasting");
		parent_class_1.method1();
		parent_class_1.method2();
		P1.method3();
		P1.method4();
		
		child_class_1 C1=(child_class_1)P1;   //Upcasting
		System.out.println("Methods accessable when downcasting");
		C1.child_method5();
		C1.child_method6();
		C1.child_method7();
		C1.child_method8();
		parent_class_1.method1();
		parent_class_1.method2();
		C1.method3();
		C1.method4();
		
	}

}
