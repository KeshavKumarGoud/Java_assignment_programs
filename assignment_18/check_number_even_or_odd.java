package assignment_18;

import java.util.Scanner;

public class check_number_even_or_odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		if(number%2==0)
		{
			System.out.println("Number "+number+ " is even" );
		}
		else
		{
			System.out.println("Number "+number+ " is odd" );
		}
	}

}
