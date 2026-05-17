package Interview_Prep11_20;

public class Thirteen_InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=9;
		
		for (int i=rows;i>=1;i--)
		{
			for (int j=i;j>=1;j--)
			{
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
