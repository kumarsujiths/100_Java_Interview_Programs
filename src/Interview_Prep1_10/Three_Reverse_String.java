package Interview_Prep1_10;

import java.util.Arrays;

public class Three_Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java Program to reverse a String?
		
		String input = "Name is James";
		
		String rev="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			rev = rev+ input.charAt(i);
		}
		
		System.out.println("Original string is " + input);

		System.out.println("Reversed string is " + rev);
	}

}
