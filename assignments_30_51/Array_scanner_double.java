package Automation_class_19;

import java.util.Arrays;
import java.util.Scanner;

public class Array_scanner_double {

	public static void main(String[] args) {
		double rollno[]=new double[4];
		double rollno1[]=new double[4];
		Scanner s1=new Scanner(System.in);
		 for(int i=0;i<rollno.length;i++)
		 {
			 rollno[i]=s1.nextDouble();
		 }
		 System.out.println(Arrays.toString(rollno));
		 for(int i=0;i<rollno.length;i++)
		 {
			 rollno1[i]=s1.nextDouble();
		 }
		 System.out.println(Arrays.toString(rollno1));
		 boolean result=Arrays.equals(rollno, rollno1);
			
			if(result==true)
			{
				System.out.println("Both the arrays are equal");
			}else
			{
				System.out.println("Both the arrays are not equal");
			}

	}

}
