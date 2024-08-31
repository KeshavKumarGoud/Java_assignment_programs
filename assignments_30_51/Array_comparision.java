package Automation_class_19;

import java.util.Arrays;

public class Array_comparision {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		int rollno1[]=new int[4];
		rollno[0]=71;
		rollno[1]=65;
		rollno[2]=21;
		rollno1[0]=71;
		rollno1[1]=65;
		rollno1[2]=21;
		
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
