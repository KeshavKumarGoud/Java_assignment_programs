package Automation_class_18;

public class find_alphabet_number_space {
	static int alphabetic_count;
	static int numeric_count;
	static int space_count;

	public static void main(String[] args) {
		String input_str= "writing 10 programs daily for 30 days";
		char[] input_char=input_str.toCharArray();
		for(int i=0;i<input_str.length();i++)
		{
			boolean comparision_result= Character.isAlphabetic(input_char[i]);
			if(comparision_result==true)
			{
				alphabetic_count++;
			}
		}
		for(int i=0;i<input_str.length();i++)
		{
			boolean comparision_result= Character.isDigit(input_char[i]);
			if(comparision_result==true)
			{
				numeric_count++;
			}
		}
		for(int i=0;i<input_str.length();i++)
		{
			boolean comparision_result= Character.isSpaceChar(input_char[i]);
			if(comparision_result==true)
			{
				space_count++;
			}
		}
		System.out.println("In the string '"+input_str+"', we have");
		System.out.println("Alphabets :"+ alphabetic_count);
		System.out.println("Numbers :"+ numeric_count);
		System.out.println("Space :"+ space_count);
	}

}
