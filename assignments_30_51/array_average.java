package Automation_class_20;

public class array_average {

	public static void main(String[] args) {
		int int_array[]=new int[4];
		int_array[0]=17;
		int_array[1]=35;
		int_array[2]=81;
		int_array[3]=42;
		int sum=0;
		double avg;
		for(int i=0;i<int_array.length;i++)
		{
			sum=sum+int_array[i];
		}
		avg=sum/int_array.length;
		System.out.println("The average of the numbers present in array "+avg);
	}

}
