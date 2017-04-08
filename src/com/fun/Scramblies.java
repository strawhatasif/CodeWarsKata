package com.fun;

/**
 * Created by rab4154 on 10/10/2016.
 */
public class Scramblies
{
    public static void main(String[] args)
    {

        String str1 = "javscripts";

        String str2 = "javascript";

        boolean match;

        match = doesStringOneContainCharactersThatCanAssembleTheString2Word(str1, str2);

        System.out.print(match);
    }

    public static boolean doesStringOneContainCharactersThatCanAssembleTheString2Word (String str1, String str2)
    {
        boolean doesItWork = true;

        str1 = str1.replaceAll("[.!?&\\-]", "");
        str1 = str1.toLowerCase();

        str2 = str2.replaceAll("[.!?&\\-]", "");
        str2 = str2.toLowerCase();

        for (int i = 0; i < str2.length(); i++)
        {
            String temp = str2.substring(i, i+1);
            if (str1.contains(temp))
            {
                str1 = str1.replaceFirst(temp,"");
            }
            else
            {
                doesItWork = false;
            }
        }

        return doesItWork;
    }
}
