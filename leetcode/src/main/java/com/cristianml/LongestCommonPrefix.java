package com.cristianml;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        // We call the method and print the final result
        System.out.println("Result: " + findPrefix(strs));
    }

    public static String findPrefix(String[] strs) {
        // Validation for empty or null array
        if (strs == null || strs.length == 0) return "";

        // Loop i: Recovers each letter index of the first word (the mold)
        for (int i = 0; i < strs[0].length(); i++) {

            // Get the character from the first word at current index
            char current = strs[0].charAt(i);

            // Loop j: Compare this letter with the rest of the words in the array
            for (int j = 1; j < strs.length; j++) {

                // CRITICAL VALIDATION:
                // 1. Compare if current index 'i' is equal to word length (to avoid out of bounds)
                // 2. Compare if the character in the current word is distinct from our mold
                if (i == strs[j].length() || strs[j].charAt(i) != current) {

                    // If any condition is true, we found the end of the common prefix
                    // We return the substring from the start to the last valid index
                    return strs[0].substring(0, i);
                }
            }
        }

        // If the loops finish, it means the entire first word is the common prefix
        return strs[0];
    }
}