/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "For each question please enter y for yes and n for no. ");
        // Prompt user
        System.out.print( "Is the car silent when you turn the key? " );
        String Ans = scan.nextLine();
        if (Ans.equals("y"))
        {
            System.out.print( "Are the battery terminals corroded? " );
            Ans = scan.nextLine();
            if (Ans.equals("y"))
            {
                System.out.print( "Clean terminals and try starting again." );
                System.exit(0);
            }
            else if (Ans.equals("n"))
            {
                System.out.print( "Replace cables and try again." );
                System.exit(0);
            }
        }
        else if (Ans.equals("n"))
        {
            System.out.print( "Does the car make a slicking noise? " );
            Ans = scan.nextLine();
            if (Ans.equals("y"))
            {
                System.out.print( "Replace the battery." );
                System.exit(0);
            }
            else if (Ans.equals("n"))
            {
                System.out.print( "Does the car crank up but fail to start? " );
                Ans = scan.nextLine();
                if (Ans.equals("y"))
                {
                    System.out.print( "Check spark plug connections" );
                    System.exit(0);
                }
                else if (Ans.equals("n"))
                {
                    System.out.print( "Does the engine start and then die? " );
                    Ans = scan.nextLine();
                    if (Ans.equals("y"))
                    {
                        System.out.print( "Does you car have fuel injection? " );
                        Ans = scan.nextLine();
                        if (Ans.equals("y"))
                        {
                            System.out.print( "Get it in for service." );
                            System.exit(0);
                        }
                        else if(Ans.equals("n"))
                        {
                            System.out.print( "Check to ensure the choke is opening and closing." );
                            System.exit(0);
                        }
                    }
                    else if (Ans.equals("n"))
                    {
                        System.out.print( "This should not be possible." );
                        System.exit(0);
                    }
                }

            }
        }

    }
}