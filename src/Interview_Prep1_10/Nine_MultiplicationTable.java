package Interview_Prep1_10;

import java.util.Scanner;

public class Nine_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to Display Multiplication Table
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
                
		MultiplicationTable(num);

	}
	
	public static void MultiplicationTable(int num)
	{
		System.out.println("Multiplication Table of "+ num+ " is:");
		for (int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+ num*i);
		}
	}

}
