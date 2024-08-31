package automation_class_27;

public class String_outofbound_exception {

	public static void main(String[] args) {
		System.out.println("characters in string are:");
		String str= "keshav kumar";
		for(int i=0;i<=str.length();i++)
		{ 
		try
			{
			char c=str.charAt(i);
			System.out.print(c);
			}
		catch(StringIndexOutOfBoundsException S)
			{
			System.out.println("");
			System.out.println("All the characters have been printed");
			}
		}

	}

}
