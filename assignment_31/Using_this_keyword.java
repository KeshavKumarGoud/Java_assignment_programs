package assignment_31;

public class Using_this_keyword {

	static int varable_1=10;
	static int varable_2=20;
	public  void this_method_1(int varable_1,int varable_2)
	{
		
		System.out.println("local variable values "+varable_1+" "+varable_2);
		//System.out.println("Global variable values "+varable_1+" "+varable_2);
		this.varable_1=varable_1;
		this.varable_2=varable_2;
		System.out.println("local variable values "+varable_1+" "+varable_2);
		
	}
	public static void main(String[] args) {
		int a=11;
		int b=21;
		System.out.println("main method");
		System.out.println("Global variable values "+varable_1+" "+varable_2);
		Using_this_keyword utk=new Using_this_keyword();
		utk.this_method_1(a,b);
		System.out.println("Global variable values "+varable_1+" "+varable_2);
		
	}

}
