package com.cng.calclulator.java.computation.SIN;

import com.cng.calclulator.java.start.MainStart;

public class SinRadians {
    MainStart startMain = new MainStart();
    public void sinRadians(Double DegreesInRadians) {
        double sinForRadians = Math.sin(DegreesInRadians);
        System.out.println(sinForRadians);
        startMain.startM();
    }
}
