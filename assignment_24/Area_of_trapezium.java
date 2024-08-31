package assignment_24;

import java.util.Scanner;

public class Area_of_trapezium {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		float h=s.nextFloat();
	
		System.out.println("Area of trapezium is "+(a+b)*h/2);
	}

}
