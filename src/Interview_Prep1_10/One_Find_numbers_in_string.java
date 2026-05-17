package Interview_Prep1_10;

public class One_Find_numbers_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find the Count of numbers in the Given String "hey1234876hey"?

		String str = "hey1234876hey";
		int count=0;

		for (int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("Count of numbers in sting "+ str +" is "+ count);

	}

}
