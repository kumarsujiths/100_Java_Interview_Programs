package Interview_Prep21_30;

public class TwThree_MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to find top two maximum numbers in the given array.
		// You should not use any sorting functions.
		// You should iterate the array only once.
		// You should not use any kind of collections in java.

		int[] arr = { 12, 35, 1, 10, 34, 1 };

		if (arr == null || arr.length < 2) {
			System.out.println("Array must contain at least two elements");
			return;
		}

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2 && num != max1) {
				max2 = num;
			}
		}

		if (max2 == Integer.MIN_VALUE) {
			System.out.println("Second maximum number does not exist");
		} else {
			System.out.println("First maximum = " + max1);
			System.out.println("Second maximum = " + max2);
		}
	}

}
