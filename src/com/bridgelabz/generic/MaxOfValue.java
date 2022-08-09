package com.bridgelabz.generic;
import java.util.Scanner;

public class MaxOfValue {
    public static void findMaxValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers: ");
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer max = a; //Initially maximum value is Integer a.
        if (b.compareTo(max) > 0) //compares Strings.
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.printf("The Maximum of three numbers (%d,%d,%d): ", a, b, c).println(max);
    }
    //main method starts
    public static void main(String[] args) {
        MaxOfValue.findMaxValue(); //calling the method
    }
}
