package com.bridgelabz.generic;
import java.util.Scanner;

    public class MaxOfValue <E extends Comparable<E>>
    {
        E a1, a2, a3; //Generics class variables

        //constructor
        public MaxOfValue(E a1, E a2, E a3)
        {
            this.a1 = a1;
            this.a2 = a2;
            this.a3 = a3;
        }

        //Generics method to find max value
        public static <E extends Comparable<E>> E findMaxValue(E a1, E a2, E a3)
        {
            E max = a1; //initially a1 is largest
            if (a2.compareTo(max) > 0)
                max = a2;
            if (a3.compareTo(max) > 0)
                max = a3;
            return max;
        }

        //main method starts
        public static void main(String[] args)
        {
            //printing the max values
            System.out.println("The maximum of three integers: " + findMaxValue(110, 200, 150));
            System.out.println("The maximum of three floats: " + findMaxValue(12.33f, 108.7f, 4.11f));
            System.out.println("The maximum of three strings: " + findMaxValue("zhcb", "qtwyte", "osfb"));
        }
    }
