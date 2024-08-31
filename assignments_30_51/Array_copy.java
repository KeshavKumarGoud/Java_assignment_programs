package Automation_class_19;

import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) {
		double[] Esalary=new double[3];
		double[] Msalary=new double[3];
		Esalary[0]=67623.37;
		Esalary[1]=73467.67;
		Esalary[2]=76472.70;
		for(int i=0;i<Esalary.length;i++)
		{
			Msalary[i]=Esalary[i];
		}
		
		System.out.println("Old Array is"+Arrays.toString(Esalary));
		System.out.println("New copied Array is"+Arrays.toString(Msalary));
		
	}

}
