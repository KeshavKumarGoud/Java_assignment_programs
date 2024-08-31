package Automation_class_19;

public class find_part_array {
	public static void main(String[] args)
	{
	int str[]=new int[4];
	str[0]= 100;
	str[1]=200;
	str[2]=300;
	str[3]=400;
	int givennumber=400;
	boolean result=false;
	int index=1;
	for(int i=0;i<str.length;i++)
	{
		if(str[i]==givennumber)
		{
			result=true;
			index=i;
		}
		
	}
	if(result==true)
	{
		System.out.println(givennumber + " is a part of the array and its index position is at "+ (index-1));
	}
	else
	{
		System.out.println(givennumber + " is not a part of the array ");
	}

 }
}
