package Automation_class_26;
import java.util.*;

public class Exception_handling {
	static int b=2;
	static int c=0;
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your age");
	try {
			
			int age=s1.nextInt();
		}
	catch(InputMismatchException I)
	{
		System.out.println("Wrong input, please read the question againg.");
		System.out.println("Enter your age");
		Scanner s2=new Scanner(System.in);
		int age1=s2.nextInt();
	}
	
			System.out.println("Enter your name");
			Scanner s3=new Scanner(System.in);
			String firstName = s3.next();
			
	/*	try
		{
			int a = b/c;
		}
		catch(ArithmeticException A)
		{
			System.out.println("error bcoz of / by zero");
		}
		System.out.println("continuing...");*/

	}

}
