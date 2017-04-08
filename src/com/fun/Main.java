package com.fun;

public class Main {

    public static void main(String[] args)
    {
        int[] n = {1,2,3,4,5};

        int[] x = print(n);

        System.out.println(x[0] + " " +  x[1]);


    }

    public static int[] print(int[] n)
    {
        int[] output = {0,1};

       int y = ArraysFun.findSmallest(n, "yay");

        System.out.println(y);
        int g = 0;

        output[0] = y;
        output[1] = g;

       return output;
    }

}
