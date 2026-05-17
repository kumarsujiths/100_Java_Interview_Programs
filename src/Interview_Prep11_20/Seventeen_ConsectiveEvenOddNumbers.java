package Interview_Prep11_20;

public class Seventeen_ConsectiveEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to find average of consecutive N Odd no. and Even no.
		
		int number=10;
		
		System.out.println("Avergate of consecutive "+ number+"odd numbers is: "+  AvgConsecutiveOddNumbers(number));
		System.out.println("Avergate of consecutive "+ number+"even numbers is: "+AvgConsecutiveEvenNumbers(number));

	}
	
	public static float AvgConsecutiveOddNumbers(int num)
	{
		float sum=0f;
		int i=1;
		int itr=num;
		while(num>0)
		{
			sum+=i;
			i+=2;
			num--;
		}
		float avg = sum/itr;
		
		return avg;
		
	}
	
	public static float AvgConsecutiveEvenNumbers(int num)
	{
		float sum=0f;
		int i=2;
		int itr=num;
		while(num>0)
		{
			sum+=i;
			i+=2;
			num--;
		}
		float avg = sum/itr;
		
		return avg;
		
	}

}
