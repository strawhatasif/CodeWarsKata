package com.fun;

public class SpinWords
{
    public static void main(String[] args)
    {
        String inputPhrase = "Alice Smith is a beautiful woman. She rocks!";

        String x = spinWords(inputPhrase);

        System.out.println(x);


    }

    public static String spinWords(String sentence)
    {
        //Split the sentence.
        String[] words = sentence.split(" ");
        String invertedSentence = "";

        for (String word : words)
        {
            String invertedWord = "";
            //For words equal to or greater than 5 letters
            //reverse the word
            if (word.length() >= 5)
            {
                //Iterate through the word backwards
                //Append the word one letter at a time.
                for (int i = word.length() - 1; i >= 0; i--)
                {
                    invertedWord += word.charAt(i);
                }
                //Add the word to the sentence.
                invertedSentence += invertedWord;
                invertedSentence += " ";
            }
            else
            {
                invertedWord = word;
                invertedSentence += invertedWord;
                invertedSentence += " ";
            }


        }

        return invertedSentence.trim();
    }
}
