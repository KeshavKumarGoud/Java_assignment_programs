package Automation_class_18;

public class string_palindrome {
	public static void main(String[] args )
	{
		String str = "keshav";
		String rvs="";
		for(int i=(str.length()-1);i>=0;i--)
		{
			rvs = rvs + str.charAt(i);
			
		}
		
		if(str.equals(rvs))
		{
			System.out.println("The given string "+str+" is pallindrome");
		}
		else
		{
			System.out.println("The given string '"+str+"' is not pallindrome");
		}
	}
}
