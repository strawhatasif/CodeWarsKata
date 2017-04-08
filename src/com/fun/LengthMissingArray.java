package com.fun;

import java.util.Arrays;

/**
 * Created by rab4154 on 10/11/2016.
 */
public class LengthMissingArray
{
    public static void main(String[] args)
    {

        Object[][] arrayOfArrays = new Object[][] { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }};

        int val;

        val = getLengthOfMissingArray(arrayOfArrays);

        System.out.print(val);
    }

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
    {
        int length = 0;

        System.out.print(arrayOfArrays.length);

        for (int i=0; i < arrayOfArrays.length; i++)
        {
            Arrays.sort(arrayOfArrays[i]);
        }

        return length;
    }
}
