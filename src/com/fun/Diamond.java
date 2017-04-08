package com.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by rab4154 on 4/3/2017.
 */
public class Diamond {

    private static final String ASTERISK = "*";

    public static void main(String[] args)
    {
        int num = 3;

        String x = printMeADiamond(num);

        System.out.println(x);
    }

    public static String printMeADiamond(int n)
    {
        String output = null;

        boolean isEven = n % 2 == 0;

        if (!isEven && n > 0)
        {
            List<String> rows = new ArrayList<>();

            int numberOfAsterisks = n;
            int padding = 0;

            while (numberOfAsterisks > 0) {
                String row = getAsterisks(numberOfAsterisks, padding);

                if (!rows.isEmpty()) {
                    rows.add(0, row);
                    rows.add(row);
                } else {
                    rows.add(row);
                }

                numberOfAsterisks -= 2;
                ++padding;
            }

            StringJoiner joiner = new StringJoiner("\n");

            for (int i=0; i < rows.size(); i++)
            {
                String lastRow = "";
                String row = rows.get(i);
                joiner.add(row);

                //Add an empty row if its the last row
                if (i == (rows.size() -1))
                {
                    joiner.add(lastRow);
                }
            }

            output = joiner.toString();
        }


        return output;
    }

    private static String getAsterisks(int numberOfAsterisks, int padding) {
        StringBuilder asterisksSb = new StringBuilder();

        //Add some padding
        for (int i = 0; i < padding; i++)
        {
            asterisksSb.append(" ");
        }

        //Add an asterisk
        for (int i = 0; i < numberOfAsterisks; ++i)
        {
            asterisksSb.append(ASTERISK);
        }

        return asterisksSb.toString();
    }

}
