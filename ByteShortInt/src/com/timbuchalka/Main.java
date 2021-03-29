package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMinValue=-2_147_483_648;
        int myMaxValue=2_147_483_647;
        int myTotal=(myMinValue/2);

        System.out.println("min int value "+myMinValue);
        System.out.println("max int value "+myMaxValue);

        //byte has a width of 8
        byte myMinByte=-128;
        byte myMaxByte=127;
        byte myNewByteValue= (byte) (myMinByte/2);
        System.out.println("min byte value "+myMinByte);
        System.out.println("max byte value "+myMaxByte);

        //short has a width of 16
        short myShortValue=-32768;
        short myShortMaxValue=32767;
        short myNewShortValue= (short) (myShortValue/2);
        System.out.println("min short value "+myShortValue);
        System.out.println("max short value "+myShortMaxValue);

        //long has width of 64
        //long can also hold int so no need to cast
        long myLongValue=-9_223_372_036_854_775_808L;
        long myMaxLongValue=-9_223_372_036_854_775_807L;
        long myNewLongValue=(myLongValue/2);
        System.out.println("min long value "+myLongValue);
        System.out.println("max long value "+myMaxLongValue);
    }
}
