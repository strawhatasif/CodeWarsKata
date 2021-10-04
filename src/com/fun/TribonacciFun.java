package com.fun;

public class TribonacciFun
{
    public static void main(String[] args)
    {
        double[] numbers = new double[]{1,1,1};
        int n = 10;

        double[] x = tribonacci(numbers, n);

        System.out.println(x.toString());

    }

    public static double[] tribonacci(double[] s, int n)
    {
        //The first three numbers of the sequence
        //come from the input array.
        double a = s[0];
        double b = s[1];
        double c = s[2];

        //Final values array with a size limit to the specified input
        double[] finalValues = new double[n];

        //if the array length is 1, only add the first number
        if (finalValues.length == 1)
        {
            finalValues[0] = a;
        }
        //if the array length is greater than 1,
        //add the first and second numbers
        if (finalValues.length > 1)
        {
            finalValues[0] = a;
            finalValues[1] = b;
        }
        //if the array length is greater than 2,
        //add the third number
        if (finalValues.length > 2)
        {
            finalValues[2] = c;
        }

        //Start at 3 since we already have the first 3 numbers
        //Iterate until the specified limit

        //Add the sum of the 3 numbers
        //Keep replacing the numbers with the previous one

        //EXAMPLE: given (1, 2, 3) as the first 3 numbers
        //'d' would be 6...then
        //'a' would be 2
        //'b' would be 3
        //'c' would be 6
        for (int p = 3; p < n; p++)
        {
            double d = a + b + c;
            finalValues[p] = d;

            a = b;
            b = c;
            c = d;
        }

        return finalValues;
    }
}
