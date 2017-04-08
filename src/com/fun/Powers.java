package com.fun;

import java.math.BigInteger;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class Powers
{
    public static void main(String[] args)
    {
        int[] num = new int[]{1,2,3,45,896,2150};

        BigInteger x = powers(num);

        System.out.println(x);
    }

    //Calculates the number of subsets possible from the input list...i.e. "power sets"
    public static BigInteger powers(int[] list)
    {
        return BigInteger.valueOf(2).pow(list.length);
    }
}
