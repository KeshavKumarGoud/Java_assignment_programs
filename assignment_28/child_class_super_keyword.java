package assignment_28;

import java.util.Scanner;

public class child_class_super_keyword extends parent_class_super_keyword{

	public void overrid_method_1()
	{ Scanner s=new Scanner(System.in);
	System.out.println("please enter the result value");
		int result=s.nextInt();
		if(result==0)
		{
		super.overrid_method_1();
		}
		else
		{
		System.out.println("child overrid_methed_1");
		}
	}
	public static void main(String[] args) {
		child_class_super_keyword cc_superkey=new child_class_super_keyword();
		System.out.println("main method");
		cc_superkey.overrid_method_1();

	}

}
