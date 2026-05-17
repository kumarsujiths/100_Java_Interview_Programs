package Interview_Prep1_10;

import java.util.Scanner;

public class Ten_Swap_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to Swap the values
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("Two numbers before swapping are "+num1+" & "+num2);

        num1=num1+num2;
        num2=num1-num2;
		num1=num1-num2;
		
		// single line
//				b=a+b-(a=b);
		// num2=num1+num2-(num1=num2);
				

        System.out.println("After Swapping numbers are "+num1+" & "+num2);

	}
	
	
}
