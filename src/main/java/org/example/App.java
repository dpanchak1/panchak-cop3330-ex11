/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros=input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate=input.nextDouble();

        double dollars=euros*rate;

        System.out.printf("%.02f euros at an exchange rate of %.04f is%n%.02f U.S. dollars.",euros,rate,dollars);
    }
}
