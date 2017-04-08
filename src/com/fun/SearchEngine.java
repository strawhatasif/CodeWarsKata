package com.fun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class SearchEngine
{
    public static void main(String[] args)
    {
        String toFind = "She";
        String inputPhrase = "Alice Smith is a beautiful woman. She rocks!";

        int x = find(toFind,inputPhrase);

        System.out.println(x);

    }

    public static int find(String needle, String haystack)
    {
        // Escape special characters
        needle = needle.replaceAll("([\\\\\\.\\[\\{\\(\\*\\+\\?\\^\\$\\|])", "\\\\$1");
        // Since we know there is a wildcard of "_" then replace it with a period
        needle = needle.replace("_", ".");

        // Capture the pattern
        Pattern p = Pattern.compile("(" + needle + ")");
        Matcher m = p.matcher(haystack);

        //If we find a match, return the index at the start of the word
        if (m.find())
        {
            return m.start(1);
        }
        //Else, we need to return "-1"
        else
        {
            return -1;
        }
    }
}
