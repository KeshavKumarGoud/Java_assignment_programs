package Automation_class_26;

import java.util.Arrays;
import java.util.Scanner;

public class Exceptional_handling_array_out_of_bound {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter the numbers to add into in array");
	
			for(int i=0;i<=4;i++)
		
		{
			try
			{
				a[i]=s1.nextInt();
			}
			catch(ArrayIndexOutOfBoundsException A)
			{
				System.out.println("Need only 4 numbers, ignoring the last number");
				
			}
		}
			System.out.println("numbers in Array are:"+Arrays.toString(a));
		
		

	}

}
