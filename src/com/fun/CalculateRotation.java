package com.fun;

public class CalculateRotation
{
    public static void main(String[] args)
    {
        String first = "hoop";
        String second = "pooh";

        int x = shiftedDifference(first, second);

        System.out.println(x);
    }

    public static int shiftedDifference(String first, String second)
    {
        //Return the number of digits the first sting has been rotated.

        int rotationCount = first.length();
        boolean matchFlag = false;

        for (int i = 0; i < first.length(); i ++)
        {
            rotationCount --;
            String rotatedWord = first.substring(i + 1, first.length()) + first.substring(0, i + 1);
            System.out.println(rotationCount);
            System.out.println(rotatedWord);

            if (rotatedWord.equals(second))
            {
                matchFlag = true;
                break;
            }
        }

        if (matchFlag == false)
        {
            rotationCount = -1;
        }

        return rotationCount;
    }

}
