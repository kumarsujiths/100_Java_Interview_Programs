package Interview_Prep1_10;

import java.util.Scanner;

public class Seven_Reverse_Number_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to Reverse a given no
		//Write a program to find whether no. is palindrome or not.
//		Example :
//			Input - 12521 is a palindrome no.
//			Input - 12345 is not a palindrome no.
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        
        System.out.println("Reverse of "+num+" is: "+ reverse(num));
        
        if (num==reverse(num))
        	System.out.println(num +" is a Palindrome number");
        else
        	System.out.println(num +" is not a Palindrome number");


	}
	
	public static int reverse(int n)
	{
		int rev=0;
		
		while (n>0)
		{
			rev = (rev*10)+ n%10;
			n=n/10;
		}
		
		return rev;
		
	}

}
