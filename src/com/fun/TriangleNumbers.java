package com.fun;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class TriangleNumbers
{
    public static void main(String[] args)
    {
        long number = 125250;

        Boolean x = isTriangleNumber(number);

        System.out.println(x);
    }

    public static Boolean isTriangleNumber(long number)
    {
        //Initially setting isTriangle as false.
        Boolean isTriangle = false;

        //Multiply the input number by 8 and add 1
        long calculatedNumber = 8 * number+1;

        //Find the square root of the calculated number
        long triangular = (long) Math.sqrt(calculatedNumber);

        //If the square root times itself equals the calculated number
        //return true
        if (triangular*triangular == calculatedNumber)
        {
            isTriangle = Boolean.TRUE;
        }

        return isTriangle;
    }
}
