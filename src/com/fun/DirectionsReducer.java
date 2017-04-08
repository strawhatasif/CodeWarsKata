package com.fun;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rab4154 on 3/22/2017.
 */
public class DirectionsReducer {

    public static void main(String[] args)
    {
        String[] directions = new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
        dirReduc(directions);
    }

    public static String[] dirReduc(String[] arr)
    {
        List<String> inputArray = new ArrayList<>();
        List<String> dirReductionArray = new ArrayList<>();

        for (String direction : arr)
        {
            if (!direction.equals("")) {
                inputArray.add(direction);
            }
        }


        int reductionCount = 0;

        if (arr.length > 0)
        {
            String currentDirection;

            for (int i = 1; i < arr.length; i++)
            {
                currentDirection = arr[i];

                if (currentDirection.equals("NORTH") && arr[i - 1].equals("SOUTH") ||
                        currentDirection.equals("SOUTH") && arr[i - 1].equals("NORTH") ||
                        currentDirection.equals("WEST") && arr[i - 1].equals("EAST") ||
                        currentDirection.equals("EAST") && arr[i - 1].equals("WEST"))
                {
                    arr[i - 1] = "";
                    arr[i] = "";
                    reductionCount++;
                }
            }
        }

        for (String direction : arr)
        {
            if (!direction.equals(""))
            {
                dirReductionArray.add(direction);
            }
        }

        if (reductionCount == 0)
        {
            return dirReductionArray.toArray(new String[dirReductionArray.size()]);
        }

        System.out.println("final array? " + dirReductionArray);

        return dirReduc(dirReductionArray.toArray(new String[dirReductionArray.size()]));
    }
}
