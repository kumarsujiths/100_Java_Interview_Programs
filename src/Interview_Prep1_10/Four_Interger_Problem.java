package Interview_Prep1_10;

public class Four_Interger_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a program that will read a float type value from the keyboard and print the following output.
//		->Small Integer not less than the number.
//		->Given Number.
//		->Largest Integer not greater than the number.
		
		float fl= 12.45f;
		
		System.out.println("Given Number is "+ fl);
		System.out.println("Small Integer not less than the number is "+ (int) Math.ceil(fl));
		System.out.println("Largest Integer not greater than the number is "+ (int) Math.floor(fl));

		

	}

}
