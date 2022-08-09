package com.bridgelabz.generic;
import java.util.Scanner;

public class MaxOfValue {
    //Generic Type extends Comparable
    public static <E extends Comparable<E>> E findMaxValue(E a1, E a2, E a3)
    {
        E max = a1; //initially a1 is max
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    //main method starts
    public static void main(String[] args) {
        //printing the max values
        System.out.println("The maximum of three integers: " +findMaxValue(10,20,30));
        System.out.println("The maximum of three floats: " +findMaxValue(41.88f, 108.170f, 9.06f));
        System.out.println("The maximum of three strings: " +findMaxValue("jdsfj", "yqwguy", "ascd"));
    }
}
