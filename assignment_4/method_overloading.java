package assignment_4;

public class method_overloading {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public float add(int a,float b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	

	public static void main(String[] args) {
		int a=3;
		int b=9;
		int c=14;
		float d=11.6f;
		method_overloading mo=new method_overloading();
		System.out.println("sum of 2 integers is "+add(a,b));
		System.out.println("sum of integer and float is "+mo.add(a, d));
		System.out.println("sum of 3 integers is "+mo.add(a,b,c));

	}

}
