package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Car porsche=new Car();
        Car holden=new Car();
      /*  porsche=null;
       System.out.println("model was "+porsche.getModel()); */
        porsche.setModel("911");
        System.out.println("model was "+porsche.getModel());
    }
}
