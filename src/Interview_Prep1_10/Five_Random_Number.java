package Interview_Prep1_10;

import java.util.Arrays;
import java.util.Random;

public class Five_Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to generate 5 Random nos. between 1 to 100, and it should not follow with decimal point.
		
		Random rand = new Random();
		int i=0;
		int a[] = new int[5];;
		while(i<5)
		{
			a[i]=rand.nextInt(100);
			i++;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
