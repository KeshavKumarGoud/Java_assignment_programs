package Automation_class_19;

import java.util.Arrays;

public class Array_reverse {

	public static void main(String[] args) {
		int[] str=new int[3];
		int[] reverse_str=new int[3];
		str[0]=67623;
		str[1]=73467;
		str[2]=76472;
		for(int i=0,k=reverse_str.length-1;i<str.length;i++,k--)
		{
			reverse_str[k]=str[i];
		}
		System.out.println("Original Int Array is  :"+Arrays.toString(str));
		System.out.println("Copied reverse Array is:"+Arrays.toString(reverse_str));

	}

}
