package Interview_Prep11_20;

public class Twenty_TablesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Display Triangle as follow
//		1
//		2 4
//		3 6 9
//		4 8 12 16 ... N (indicates no. of Rows)
		
		int rows=10;
		int count = 1;
		
		for (int i=1;i<=rows;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(count*i+" ");
				count++;
			}
			System.out.println();
			count = 1;
		}

	}

}
