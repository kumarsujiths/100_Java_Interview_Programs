package Interview_Prep11_20;

public class Fourteen_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to find whether given no. is Armstrong or not.
//		Example :
//		Input - 153
//		Output - 1^3 + 5^3 + 3^3 = 153, so it is Armstrong no.
		
		int number =153;
		int armstrong_sum=0;
		int temp=number;
		
		while(temp>0)
		{
			armstrong_sum+=(int) Math.pow(temp%10, 3);
			temp=temp/10;
		}
		
		System.out.println(number + " is the given number");
		System.out.println(armstrong_sum + " is the Armstrong of the "+ number+" number");
		
		if (number==armstrong_sum)
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is not an Armstrong number");

	}

}
