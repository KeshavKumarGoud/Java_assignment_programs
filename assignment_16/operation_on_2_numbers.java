package assignment_16;

import java.util.Scanner;

public class operation_on_2_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		int difference=a-b;
		int multiply=a*b;
		int divide=a/b;
		int modulus=a%b;
		
		System.out.println("Addition of 2 numbers " +a+" & "+b+" is "+ sum);
		System.out.println("Subtraction of 2 numbers " +a+" & "+b+" is "+ difference);
		System.out.println("Multiple of 2 numbers " +a+" & "+b+" is "+ multiply);
		System.out.println("Division of 2 numbers " +a+" & "+b+" is "+ divide);
		System.out.println("Modolus of 2 numbers " +a+" & "+b+" is "+ modulus);
		

	}

}
