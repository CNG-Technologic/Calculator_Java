package com.cng.calclulator.java.computation.SIN;

import com.cng.calclulator.java.start.MainStart;

public class SinDegrees {

    MainStart start = new MainStart();

    public void sinDegress(double angleInDegrees) {
        double sinForDegrees = Math.sin(Math.toRadians(angleInDegrees));
        System.out.println("sin " + angleInDegrees + " = " + sinForDegrees);
        start.startM();
    }

}
