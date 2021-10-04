package com.fun;

public class Vowels
{
    public static void main(String[] args)
    {
        String inputPhrase = "Alice Smith is a beautiful woman. She rocks!";

        int x = getCount(inputPhrase);

        System.out.println(x);


    }

    //This method determines the numbers of vowels in a given phrase.
    public static int getCount(String str)
    {
        int vowelsCount = 0;
        //Loop through the given string
        for (int s=0; s< str.length(); s++)
        {
            //Check each character in the string phrase using the charAt method
            //Vowels, for this program are A, E, I, O, and U.
            if((str.charAt(s)== 'a') ||
                    (str.charAt(s)== 'e') ||
                    (str.charAt(s)== 'i') ||
                    (str.charAt(s)== 'o') ||
                    (str.charAt(s)== 'u'))
            {
                //found a vowel, increment the counter
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

}
