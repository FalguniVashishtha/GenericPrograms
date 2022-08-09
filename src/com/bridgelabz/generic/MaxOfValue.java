package com.bridgelabz.generic;
import java.util.Scanner;
import java.util.Arrays;


    public class MaxOfValue <E extends Comparable<E>>
    {
        private E[] Arr; //declaring array
        //Constructor
        MaxOfValue(E[] Arr) {
            this.Arr = Arr;
        }
        public void display()
        {
            System.out.println("\nBefore Sorting:");
            for(E element : Arr) {
                System.out.printf("%s", element + ", ");
            }
            Arrays.sort(Arr);
            System.out.println("\nAfter Sorting:");
            for(E element : Arr) {
                System.out.printf("%s", element + ", ");
            }
        }
        //Generics method to find max value
        public void findMaxValue() {
            int lengthOfArray = Arr.length; //local variable
            Arrays.sort(Arr); //sorting the array
            System.out.println(Arr[lengthOfArray -1]); //after sorting the last element will be the max
        }
        //main method starts
        public static void main(String[] args) {
            //Declaring the values to the arrays
            Integer[] integerValue = {10, 70, 20, 35, 40};
            Float[] floatValue = {4.9f, 1.0f, 99.06f, 56.15f};
            String[] stringValue = {"sfd", "wqr", "qwf"};
            //Displaying the elements before and after sorting
            new MaxOfValue(integerValue).display(); System.out.println();
            new MaxOfValue(floatValue).display(); System.out.println();
            new MaxOfValue(stringValue).display(); System.out.println();
            //printing the max values
            System.out.print("\nThe maximum of integers: " ); new MaxOfValue(integerValue).findMaxValue();
            System.out.print("\nThe maximum of floats: "); new MaxOfValue(floatValue).findMaxValue();
            System.out.print("\nThe maximum of strings: " ); new MaxOfValue(stringValue).findMaxValue();
        }
}
