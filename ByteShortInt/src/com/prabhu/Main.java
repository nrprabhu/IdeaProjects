package com.prabhu;

public class Main {

    public static void main(String[] args) {
        int myInt = 2_147_483_647;
        short myShort=32_767;
        byte myByte= 127;
       long myLong = (long) 50_000L + (long) (10L * ((long)myByte+(long) myInt+ (long) myShort));
      //  long myLong = 50000L + (10L * (myByte + myInt + myShort));
        System.out.println("my Long is " + myLong);
    }

}
