package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
	// write your code here
        String str = " aaddmefezdngfgrrz";
        getFirstNonRepeated(str);
        getFirstNonRepeated("Hello World");
        getFirstNonRepeated("Good Morning");
        getFirstNonRepeated("    Apple");
}
    // prints the first non repeated character of the passed String value
    public static void getFirstNonRepeated(String str) {
        System.out.println("The String is: " + str);
        str = str.replaceAll("\\s", "").toLowerCase(); // ignores white spaces and make all lower case

        Map<Character, Integer> h = new HashMap<>();
        // This for loop will traverse the entire string and count the # of occurences in the String
        for (int i = 0; i < str.length(); i++) {
                if (h.containsKey(str.charAt(i))) {
                    h.put(str.charAt(i), h.get(str.charAt(i)) + 1);
                } else h.put(str.charAt(i), 1);
        }

        char c = ' ';
        // This for loop will find the 1st key (character) that only occured once in the string
        for (int j = 0; j < str.length(); j++) {
                if (h.get(str.charAt(j)) == 1) {
                    c = str.charAt(j);
                    break;
                }
        }

        System.out.println("# of Occurences of each character: " + h);
        if (c != ' ') {
            System.out.println("The first non repeating character is: " + c + "\n\n");
        } else {
            System.out.println("Every letter is repested.\n\n");
        }
    }
}