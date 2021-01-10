package com.cng.calclulator.java.computation;

import com.cng.calclulator.java.start.MainStart;

public class basic {

    MainStart str = new MainStart();

    public void sloz(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        str.startM();
    }

    public void vichitanie(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
        str.startM();
    }

    public void umnozhenie(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
        str.startM();
    }

    public void delenie(double a, double b){
        System.out.println(a + " / " + b + " = " + (a / b));
        str.startM();
    }

    public void koren(double a) {
        System.out.println("Корень из " + a + " = " + Math.sqrt(a));
        str.startM();
    }

    public void stepen(double a, double b) {
        System.out.println(a + " в степени " + b + " = " + Math.pow(a, b));
        str.startM();
    }


}
