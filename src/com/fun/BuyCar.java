package com.fun;


/**
 * Created by rab4154 on 7/10/2015.
 */
public class BuyCar
{
    public static void main(String[] args)
    {
        int startPriceOld = 2000;
        int startPriceNew = 8000;
        int savingsPerMonth = 1000;
        double percentLossByMonth = 1.5;

        int[] savings = nbMonths(startPriceOld,startPriceNew,savingsPerMonth,percentLossByMonth);

        System.out.println(savings[0] + "," + savings[1]);


    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingsPerMonth, double percentLossByMonth) {
        int[] result = new int[2];

        int month = 1;
        int totalSavings = 0;
        double priceOld = (double) startPriceOld;
        double priceNew = (double) startPriceNew;

        //Check that the price of the new car is greater than the total value of
        //the old car plus savings
        while (priceNew > (priceOld + totalSavings))
        {
            //Only increment by 0.5% every 2 months
            if (month % 2 == 0)
            {
                percentLossByMonth += .5d;
            }
            priceOld *= (1 - percentLossByMonth / 100);
            priceNew *= (1 - percentLossByMonth / 100);

            totalSavings += savingsPerMonth;
            month++;
        }

        result[0] = --month;
        result[1] = (int)Math.round((priceOld + totalSavings) - priceNew);

        return result;
    }
}
