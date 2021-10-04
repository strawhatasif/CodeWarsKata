package com.fun;

import java.util.*;

public class MissingLetterFinder {

    /**
     * Finds the missing letter.
     *
     * @param characters, not null
     */
    public static char findMissingLetter(char[] characters)
    {
        // Sort the character array.
        java.util.Arrays.sort(characters);

        // Iterate over character array.
        for (int i = 0; i < characters.length - 1; i++) {

            // Find the difference between current char and next char.
            int charDiff = characters[i + 1] - characters[i];

            if (charDiff > 1) {

                for (int j = 1; j < charDiff; j++)
                {
                    char c = (char) (characters[i] + j);
                    return c;
                }
            }
        }

        return ' ';
    }

    public static void main(String[] args)
    {
        char[] characters = new char[] {'O','Q','R','S'};
        char missingLetter = findMissingLetter(characters);

        System.out.println(missingLetter);

    }
}
