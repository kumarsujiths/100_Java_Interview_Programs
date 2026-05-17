package Interview_Prep11_20;

public class Eighteen_TriangeBreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Display Triangle as follow : BREAK DEMO.
//		1
//		2 3
//		4 5 6
//		7 8 9 10 ... N
		
        int count = 1; // Initialize a counter for the numbers
		int rows = 0; // Determine the number of rows needed
		int number = 36;

		while((rows*(rows+1))/2 < number){
			rows++;
		}
		
		for (int i=1;i<=rows; i++)
		{
			for (int j=1; j<=i;j++)
			{
				if (count<=number)
				{
					System.out.print(count+ " ");
					count++;
				}
				else
				{
					break;
				}
					
			}
			System.out.println();
			if (count > number) {
                break; // Exit outer loop if numbers are printed
            }
		}
	}

}
