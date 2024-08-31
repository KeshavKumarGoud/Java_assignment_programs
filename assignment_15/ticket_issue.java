package assignment_15;

public class ticket_issue {

	public static void main(String[] args) {
		String gender="male";
		int age=33;
		if(gender=="female")
		{
			System.out.println("Free ticket");
		}
		else
		{
			if(gender=="male"&& age<=12)
			{
				System.out.println("Half ticket");
			}
			else if(gender=="male"&& age>12 && age<60)
			{
				System.out.println("Full ticket");
			}
			else
			{
				System.out.println("senior citizen ticket");
			}
		}
	}

	

}
