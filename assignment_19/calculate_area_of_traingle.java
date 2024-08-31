package assignment_19;

import java.util.Scanner;

public class calculate_area_of_traingle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float b=s.nextFloat();
		float h=s.nextFloat();
		System.out.println("Area of the triangle is "+((b*h)/2));
	}

}
