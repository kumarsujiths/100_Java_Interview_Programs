package Interview_Prep1_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Two_Reverse_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java Program to Exchange Name is James to James is Name?

		String input = "Name is Ishaani  456  ";

		String[] words = input.trim().split("\\s+"); // for extra spaces and symbols

        // Build the reversed sentence using concatenation
		String reversed = "";

//		for (int i = words.length - 1; i >= 0; i--) {
//			reversed += words[i];
//			if (i > 0) {
//				reversed += " ";
//			}
//		}
//		
		// Using streams
		reversed = Arrays.stream(input.trim().split("\\s+")).collect(Collectors.
				collectingAndThen(Collectors.toList(), list -> 
				{
					Collections.reverse(list); 
					return list.stream();
				}
				)).collect(Collectors.joining(" "));

		// Output the result
		System.out.println(reversed.toString());

	}

}
