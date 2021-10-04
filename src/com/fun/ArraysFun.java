package com.fun;

import java.util.Collections;
import java.util.List;

public class ArraysFun
{

    public static void main(String[] args)
    {
        int[] numbers = new int[]{1,3,4,5,10,125,389};

        int x = findSmallest(numbers, "index");

        System.out.println(x);


    }

    //This method finds the smallest value or index in a given set of numbers
    public static int findSmallest( final int[] numbers, final String toReturn )
    {
        int num = 0;
        Integer minValue;
        Integer minIndex;

        //Since we don't have access to Apache Commons in CodeWars...we'll convert the primitive int array
        //to the Integer array

        //Create an Integer array - the size is defined by the primitive int array's length.
        Integer[] numberArray = new Integer[numbers.length];

        //Setting a loop counter and using the enhanced for loop
        int i=0;
        for (int number: numbers)
        {
            //Set the number to each member of the new array.
            numberArray[i++] = number;
        }

        //Use case 1: find the smallest value in a given array.
        if (numbers.length >= 1 && toReturn.equalsIgnoreCase("value"))
        {
            //Convert the array to a List. Fully qualify the ArraysFun class (since this class is named ArraysFun)
            List<Integer> numList = java.util.Arrays.asList(numberArray);

            //Use the built in function of "min" on Collections to figure out the smallest value.
            minValue =  Collections.min(numList);

            num = minValue;
        }

        //Use Case 2 - find the smallest index of a given array.
        else if (numbers.length >= 1 && toReturn.equalsIgnoreCase("index"))
        {
            //Convert the array to a List. Fully qualify the ArraysFun class (since this class is named ArraysFun)
            List<Integer> numberList = java.util.Arrays.asList(numberArray);

            //Figure out the minimum index using the indexOf function on List and min on Collections
            minIndex = numberList.indexOf(Collections.min(numberList));

            num = minIndex;
        }

        return num;
    }
}
