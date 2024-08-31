package Automation_class_19;

public class special_char_count {
	static int alphabetic_count;
	static int numeric_count;
	static int space_count;
	static int special_charater;
	public static void main(String[] args) {
	String input_str= "Note:writing 10 programs daily for 30 days.Do it!";
	char[] input_char=input_str.toCharArray();
	for(int i=0;i<input_str.length();i++)
	{
	if(!(Character.isAlphabetic(input_char[i])||Character.isDigit(input_char[i])||Character.isSpaceChar(input_char[i])))
		{
			special_charater++;
		}
			
		}
		System.out.println("In the string '"+input_str+"', we have");
		System.out.println("Special charaters :"+ special_charater);
		
	}	

}
