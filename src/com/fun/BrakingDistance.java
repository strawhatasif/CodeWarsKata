package com.fun;

/**
 * Created by rab4154 on 3/22/2017.
 */
public class BrakingDistance {
    /**
     * calculate the stopping distance provided the vehicle's mass and mu
     *
     * @param v
     * @param mu
     * @return
     */
    public static double dist(double v, double mu) {
        // suppose reaction time is 1

        //v = vehicle mass
        v = v * 1000 / 3600;
        double d = v * 1;
        d += v * v / (2 * mu * 9.81);
        return d;
    }

    /**
     * calculate the stopping speed
     * @param d
     * @param mu
     * @return
     */
        public static double speed(double d, double mu) {   // suppose reaction time is 1
            double g=9.81;
            double v=Math.sqrt(mu*g*(2*d+mu*g))-mu*g;
            return v*3600/1000;
        }


    public static void main(String[] args)
    {
        double d = dist(100, 0.7);
        double f = speed(88, 0.9);

        System.out.println("Distance? " + d);
        System.out.println("Speed? " + f);
    }
}
