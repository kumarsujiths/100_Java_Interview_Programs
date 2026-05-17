package Interview_Prep11_20;

public class Sixteen_Harmonic_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program to generate Harmonic Series.
//		Example :
//		Input - 5
//		Output - 1 + 1/2 + 1/3 + 1/4 + 1/5 = 2.28 (Approximately)
		
		System.out.println(harmonic_series(5));

	}
	
	public static float harmonic_series(int num)
	{
		float sum=0f;
		
		for (int i=1;i<=num;i++)
		{
			sum+= (float)(1.0/i);
		}
			
		return sum;
		
	}

}
