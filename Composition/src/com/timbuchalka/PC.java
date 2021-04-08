package com.timbuchalka;

// Composition= PC has a case monitor and motherBoard

//Inheritance vs Composition
    // in Inheritance we can inherit only one class at a time

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixel(1200,50,"yellow");
    }

}
