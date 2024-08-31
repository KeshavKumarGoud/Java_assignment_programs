package Automation_class_26;

import java.util.Arrays;

public class Array_fixedsize_exception_handling {

	public static void main(String[] args) {
		int[] a1=new int[4];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[3]=4;
		try {
		a1[4]=5;
		}
		catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println("initializing more numbers than the size of the array, ignoring extra numbers");
		}
		
		System.out.println("the numbers in the array are :"+ Arrays.toString(a1));
		
	}

}
