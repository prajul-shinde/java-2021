package com.timbuchalka;
//double faster in modern computers
//used mostly in java inbuilt math functions
//double is far more precised than float 16 digits
public class Main {

    public static void main(String[] args) {
	int myIntValue=5/3;
	//float has width of 32 bit
	float myFloatValue=5f/3f;
	//double has width of 64 bit
	double myDoubleValue=5d/3d;
        System.out.println("myIntValue "+myIntValue);
        System.out.println("myFloatValue "+myFloatValue);
        System.out.println("myDoubleValue "+myDoubleValue);
    }
}
