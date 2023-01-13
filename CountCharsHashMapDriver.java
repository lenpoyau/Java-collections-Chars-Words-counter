package collections;

import java.util.HashMap;
import java.util.Map;

public class CountCharsHashMapDriver {

	public static void main(String[] args) {
		String str = "This is a great thing";
		String str2 = "This is a nice occassion. This is a great thing. We're making great progress. It's a good feeling";
		char[] lineOfChars = str.toCharArray();
		Map<Character, Integer> occurrences = new HashMap<>();
		Map<String, Integer> stringOccurences = new HashMap<>();
		
		// removing "." chars from the string.
		String str2withoutperiods = "";
		  for (int i=0; i<str2.length(); i++) {
		    // Only append the char if it is not the "." case
		    if (!str2.substring(i, i+1).equals(".")) {
		    	str2withoutperiods = str2withoutperiods + str2.substring(i, i+1); // Could use str.charAt(i) here
		    }
		  }
		// Break up the string into words using white space as separator
		// and store each word as an element in a string array  
		String[] words = str2withoutperiods.split(" ");
		
		// System.out.println("Testing!!! " + str2withoutperiods);
		
		// Iterate through the character array lineOfChars and
		// Find the number of occurrences each unique char is found in the HashMap named occurrences
		// The first time the char is found add a Value of 1 in the HashMap
		// Each following time it's found in the char array, add it to the hashmap and increase the Value count by one. 
		for(char character: lineOfChars) {
			Integer count = occurrences.get(character);
			if(count == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, count+1);
			}
		}
		
		// Interate through the String array and count each occurrence of a word using a hashMap.
		for(String word: words) {
			Integer count = stringOccurences.get(word);
			if(count == null) {     // word was not found in the hashmap so initialize it
				stringOccurences.put(word, 1);
			} else {               // word was found in the hashmap so increase its count.
				stringOccurences.put(word, count+1);
			}
		}
		
		System.out.println("String: " + str + "\n");
        System.out.println("Number of times a character occured in the above string");
        System.out.println(occurrences);
        
        System.out.println("\n" + "String: " + str2withoutperiods + "\n");
        System.out.println("Number of times a word occured in the above string");
        System.out.println(stringOccurences);
	} // Ends main
} // ends class
