/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App
{
    static final int CONVERSION_RATE = 350;

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the length of the room in feet? " );
        int length = Integer.parseInt( scan.nextLine() );

        System.out.print( "What is the width of the room in feet? " );
        int width = Integer.parseInt( scan.nextLine() );

        int area = length * width;
        int gallons = (int)(Math.ceil( area / ((double)CONVERSION_RATE ) ));

        System.out.println("You will need to purchase " + gallons + " of paint to cover " + area + " square feet.");
    }
}
