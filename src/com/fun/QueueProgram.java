package com.fun;

import java.util.*;

/**
 * Created by rab4154 on 3/22/2017.
 */
public class QueueProgram
{

    public static int solveSuperMarketQueue(int[] customers, int n) {
            if (customers.length == 0)
            {
                return 0;
            }

            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

            //Add customers to queue
            for (int i = 0; i < customers.length && i < n; i++)
            {
                pq.offer(customers[i]);
            }

            for (int i = n; i < customers.length; i++)
            {
                pq.offer(pq.poll() + customers[i]);
            }

            //Remove head of queue
            while (pq.size() != 1)
            {
                pq.poll();
            }

            return pq.poll();
        }

    public static void main(String[] args)
    {
        int[] customers = new int[]{2, 2, 3, 3, 4, 4};
        int n = 2;

        int result = solveSuperMarketQueue(customers, n);

        System.out.println("Result? " + result);
    }
}
