package Interview_Prep1_10;

import java.util.Scanner;

public class Six_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to Find Factorial of Given no.
//		
//		int number=5;
//		int fact=1;
//		int i=number;
//		while(i>=1)
//		{
//			fact=fact*i;
//			i--;
//		}
//		System.out.println("Factorial of number "+number+" is "+ fact);
		
		//Using recursion function call
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));
        sc.close();

	}
	
	public static int factorial(int n)
	{
		if (n==0 | n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}

}
