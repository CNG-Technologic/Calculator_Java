package com.cng.calclulator.java.start;

import java.util.Scanner;

public class ifStart {

    public void start() {
        MainStart start_1 = new MainStart();
        System.out.println("1 - старт \n2 - выход");
        Scanner x = new Scanner(System.in);
        String ifstart = x.nextLine();

        if(ifstart.equals("1"))
            start_1.startM();
        else
            System.out.println("Завершение работы...");

    }

}
