package com.fun;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class Multiply {

    public static void main(String[] args)
    {
        Double a = Double.valueOf("5");
        Double b = Double.valueOf("5");

        Double x = multiply(a,b);


        System.out.println(x);


    }

    //Takes two numbers and multiplies them
    public static Double multiply(Double a, Double b)
    {
        return a * b;
    }
}
