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
        if (b.compareTo(max) > 0) //compare Integer.
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.printf("The Maximum of three Integers (%d, %d and %d): ", a, b, c).println(max);
    }
    //method to find max of three floats
    public static void findMaxValue(Float a , Float b , Float c)
    {
        Float max = a; //Initially maximum value is Integer a.
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.printf("The Maximum of three Float Numbers (%f,%f and %f): ",a,b,c).println(max);
    }
    //Method to find Maximum of three Strings
    public static void findMaxValue(String string1 , String string2, String string3){
        String max = string1;//Initially maximum value is String s1.
        if (string2.compareTo(max) > 0)
            max = string2;
        if (string3.compareTo(max) > 0)
            max = string3;
        System.out.printf("The Maximum of three Strings (%s,%s and %s): ",string1,string2,string3).println(max);
    }
    //main method starts
    public static void main(String[] args) {
        MaxOfValue.findMaxValue(); //calling the method
        MaxOfValue.findMaxValue(10f,20f,30f);
        MaxOfValue.findMaxValue("ffg","ggvv","mgj");
    }
}
