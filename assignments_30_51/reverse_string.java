package Automation_class_18;

public class reverse_string {
	
	public static void main(String[] args)
	{
		String str = "keshav";
		String rvs="";
		for(int i=(str.length()-1);i>=0;i--)
		{
			rvs = rvs + str.charAt(i);
			
		}
		System.out.println(rvs);
		
		
	}

}
