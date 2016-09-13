package com.prabhu;

public class Main {

    public static void main(String[] args) {
        // int takes up 8 bytes of memeory
        int myIntValue = 5/3;
        // float occupies 32 bytes of memory
        float myFloatValue = 5f / 3f;
        // double occupies 64 bytes of memory
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue is --> "+ myIntValue);
        System.out.println("myFloatValue is --> "+ myFloatValue);
        System.out.println("myDoubleValue is --> " + myDoubleValue);

        // Convert a given nuber of pounds to kilograms
        //1. Create a variable and store the number of pounds
        //2. Calculate the number of kilograms for the number of above and store in a variable
        //3. Print out the results
        //
        // Notes: 1 pound is equal to 0.45359237 kilograms

        double myPoundVal = 200.0d;
        double myLbToKg = 0.45359237d;
        double myKgval = myPoundVal *  myLbToKg;
        System.out.format(myPoundVal + " Lbs = " + myKgval + " Kgs." );
    }
}
