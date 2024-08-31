package assignment_17;

import java.util.Scanner;

public class calculate_area_of_circle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float pi=3.147f;
		float radius=s.nextFloat();
		System.out.println("Area of the circle is "+(pi*radius*radius));

	}

}
