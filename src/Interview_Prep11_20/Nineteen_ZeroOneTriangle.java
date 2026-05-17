package Interview_Prep11_20;

public class Nineteen_ZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Display Triangle as follow
//		0
//		1 0
//		1 0 1
//		0 1 0 1
		
		int count=1;
		
		for (int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				count++;
				if (count%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
				
			}
			System.out.println();
		}

	}

}
