package com.fun;

import java.util.*;

/**
 * Created by rab4154 on 4/3/2017.
 */
public class MinMax {
    public static void main(String[] args)
    {
        int[] numArray = new int[]{5,2334454};

        int[] x = getMinAndMax(numArray);

        System.out.println(x);
    }

    public static int[] getMinAndMax(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        return new int[] {min, max};
    }
}
