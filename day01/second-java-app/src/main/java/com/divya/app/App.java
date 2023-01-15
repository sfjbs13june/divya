package com.divya.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Greeting greeting = new Greeting();
        String result= greeting.SayHi();
        String result1=greeting.SayHello();
        String result2=greeting.SayWelcome();
        String result3=greeting.SayBye();

        System.out.println(result);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);






    }
}
