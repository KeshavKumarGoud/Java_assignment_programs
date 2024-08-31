package Automation_class_19;

import java.util.Arrays;
import java.util.Scanner;

public class Array_comparision_scanner {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		int rollno1[]=new int[4];
		 Scanner s1=new Scanner(System.in);
		 for(int i=0;i<rollno.length;i++)
		 {
			 rollno[i]=s1.nextInt();
		 }
		 System.out.println(Arrays.toString(rollno));
		 for(int i=0;i<rollno.length;i++)
		 {
			 rollno1[i]=s1.nextInt();
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
