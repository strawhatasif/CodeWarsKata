package com.fun;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class Pizza
{
    public static void main(String[] args)
    {
        int number = 3;

        int x = maxPizza(number);

        System.out.println(x);
    }

    public static int  maxPizza(int cut)
    {
        int cutVal;

        //If the cut input is less than 0, return -1
        if (cut < 0)
        {
            cutVal = -1;
        }
        //Otherwise if the cut equals 0, return 1
        else if (cut == 0)
        {
            cutVal = 1;
        }
        //Finally, if the cuts are greater than 0
        //Use the "Lazy Caterer's Sequence" formula which is
        //p = ((n*n) + n + 2) /2
        else
        {
            cutVal = ((cut * cut) + cut + 2) / 2;
        }

        return cutVal;
    }
}

