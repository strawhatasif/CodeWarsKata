package com.fun;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class Counter
{
    public static void main(String[] args)
    {
        Boolean[] sheepArray = {true,  true,  true,  false,
                true,  true,  true,  true,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        int x = countSheeps(sheepArray);

        System.out.println(x);


    }

    public static int countSheeps(Boolean[] arrayOfSheeps)
    {
        int index = 0;

        //For each sheep, evaluate if they are 'true' or 'false'
        for (boolean sheep: arrayOfSheeps)
        {
            //If 'true', add to the counter.
            if (sheep)
            {
                index++;
            }
        }

        return index;
    }
}
