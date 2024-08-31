package Automation_class_21;

import java.util.Arrays;
import java.util.Scanner;

public class anagram_program {

	public static void main(String[] args) {
		System.out.println("Please enter the strings for which you want to chack the anaagram property");
		Scanner input=new Scanner(System.in);
		String input_string_1=input.next();
		String input_string_2=input.next();
		if(input_string_1.length()==input_string_2.length())
		{
			char[] lettersArray1=input_string_1.toCharArray();
			char[] lettersArray2=input_string_2.toCharArray();
			Arrays.sort(lettersArray1);
			Arrays.sort(lettersArray2);
			//if(lettersArray1.equals(lettersArray2)) this equals funtionality does not work for comparing 2 arrays.
			
			if(Arrays.equals(lettersArray1, lettersArray2))
			{
			System.out.println("Both the Strings "+input_string_1+" and "+input_string_2+" are equal" );
			}
		}
		else
		{
			System.out.println("The given 2 strings are not anagram");
		}
	}

}
