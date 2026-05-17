package Interview_Prep21_30;

import java.util.HashMap;
import java.util.Map;

public class TwTwo_Repitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to find out duplicate or repeated characters 
		//in a string, and calculate the count of repeat.
		
		String str = "ABCD abcd AabcdBCD";
        int[] count = new int[256]; // For standard ASCII

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
        
        // With hashmap to get more optimized way
        UsingHashMap(str);
		
		
	}
	
	public  static void UsingHashMap(String str) {
		// Step 1 : Create a HashMap
		 Map<Character, Integer> freq = new HashMap<>();
        // Step 2: Count frequency of each character
        for (char c : str.toCharArray()) {
            if (c != ' ') { // Skip spaces (optional)
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        // Step 3: Print only repeated characters with count > 1
        System.out.println("Duplicate characters and their counts using Hashmap:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
	}

}
