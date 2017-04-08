package com.fun;

/**
 * Created by rab4154 on 7/10/2015.
 */
public class GreetPerson
{

    public static String personName;

    public static void main(String[] args)
    {
        personName = "John Doe";
        String greetName = "Alice Smith";

        String x = greet(greetName);

        System.out.println(x);


    }

    //Greets a person by their name and tells them your name.
    public static String greet(String yourName)
    {
        return String.format("Hi %s, my name is %s", personName, yourName);
    }
}
