package Interview_Prep11_20;

import java.util.Scanner;

public class Eleven_Days_Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to convert given no. of days into months and days.
//		(Assume that each month is of 30 days)
//		Example :Input - 69
//		Output - 69 days = 2 Month and 9 days
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter number of days: ");
	     int days = sc.nextInt();
	     System.out.println(days + " total days converted to "+ days/30+ " Months and "+ days%30+" days");
	     sc.close(); 
	}

}
