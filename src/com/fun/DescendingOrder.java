package com.fun;

import java.util.Arrays;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class DescendingOrder
{
    public static void main(String[] args)
    {
        int num = 123458962;

        int x = sortDesc(num);

        System.out.println(x);


    }

    //This method sorts the given input number in a descending order
    public static int sortDesc(final int num)
    {
        if (num<10){ return num;}

        String str = "" + num;
        char[] integerArray = str.toCharArray();
        char[] integerResult = new char[integerArray.length];

        //Sort the array in ascending order
        Arrays.sort(integerArray);

        //Sort the array in descending order
        for (int i = 0; i<integerArray.length; i++){
            integerResult[(integerArray.length - 1) - i] = integerArray[i];
        }
        return Integer.parseInt(new String(integerResult));
    }
}
