package com.fun;

import java.util.*;

public class WordSearch
{
    public static void main(String[] args)
    {
        String toFind = "beautiful";
        String[] inputPhrase = new String[] {"Alice Smith is a beautiful woman. She rocks!"};

        String[] x = findWord(toFind,inputPhrase);

        System.out.println(java.util.Arrays.asList(x));


    }

    //Checks if the word to find is contained within the string array phrase.
    //If it is, it returns that back...otherwise, it returns "Empty"
    public static String[] findWord(String x, String[] y)
    {
        //Variable if there isn't a match.
        String empty = "Empty";

        String lowerCaseWord;

        //Temporary list that will hold the list of matches.
        List<String> preProcessedList = new ArrayList<>();

        //Variable that indicates whether or not there is a match.
        boolean foundWord = false;

        //For each word in the array:
        // 1. Convert it to lowercase
        // 2. Use the contains method to search the given word
        // 3. If there is a match, add it to the temporary list and set 'foundMatch' as true
        for (String word: y)
        {
            lowerCaseWord = word.toLowerCase();
            if(lowerCaseWord.contains(x))
            {
                preProcessedList.add(word);
                foundWord = true;
            }
        }

        //If there wasn't a match, add the "Empty" string item.
        if (!foundWord)
        {
            preProcessedList.add(empty);
        }

        //Create a final String array with the size of the temp list
        String[] results = new String[preProcessedList.size()];
        //Convert the list to an array and return
        results = preProcessedList.toArray(results);

        return results;
    }
}
