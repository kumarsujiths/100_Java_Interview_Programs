package Interview_Prep21_30;

import java.util.Scanner;

public class TwOne_PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        
        int sum=0;
        int count=1;
        
        do
        {
        	if(num%count==0)
        	{
        		sum+=count;
        		count++;
        	}
        	else
        	{
        		count++;
        		continue;
        	}
        	
        }while (count < num);
        	
        
        if (sum==num)
        	System.out.println(num +" is a perfect number");
        else
        	System.out.println(num +" is a not perfect number");
        
        
        

	}

}
