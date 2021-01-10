package com.cng.calclulator.java.start;

import java.util.Scanner;

public class ifStart {

    MainStart start_1 = new MainStart();
    Scanner x = new Scanner(System.in);
    String ifstart;
    public void start() {
        System.out.println("1 - старт \n2 - выход");
        ifstart = x.nextLine();

        if(ifstart.equals("1"))
            start_1.startM();
        else
            System.out.println("Завершение работы...");
    }

    public void ifStartVoid() {
        System.out.println("1 - да \n2 - нет \nТакже работет Y/N (yes/no)");
        ifstart = x.nextLine();

        if(ifstart.equals("нет")) {
            start_1.startM();
        } else
            System.out.println("Завершение работы...");

    }

}
