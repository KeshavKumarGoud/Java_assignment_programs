package assignment_32;

import java.util.Scanner;

public class using_switch_case {

	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String color =s.next();
		switch(color)
		{
		case "white":
		System.out.println("its peace");
		break;
	
		case "black":
		System.out.println("its royal");
		break;
		
		case "red":
		System.out.println("its dashing");
		break;
		
		default:
		System.out.println("wait....searching");
		break;
		
		}

	}

}
