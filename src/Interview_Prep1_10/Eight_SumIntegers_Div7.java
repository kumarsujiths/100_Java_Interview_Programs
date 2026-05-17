package Interview_Prep1_10;

public class Eight_SumIntegers_Div7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find sum of all integers greater than 100 and less than
		// 200
		// that are divisible by 7
		int sum = 0;

		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(
				"Sum of all integers greater than 100 and " 
						+ "less than 200 that are divisible by 7 is: " + sum);

	}

}
