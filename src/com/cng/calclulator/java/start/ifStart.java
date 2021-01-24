package com.cng.calclulator.java.start;

import java.util.Scanner;

public class ifStart {

    MainStart start_1 = new MainStart();
    Scanner x = new Scanner(System.in);
    String ifstart;

    //Базовый метод для старта калькулятора
    public void startVoid() {
        System.out.println("1 - старт \n2 - выход");
        ifstart = x.nextLine();

        if(ifstart.equals("1"))
            start_1.startM();
        else
            System.out.println("Завершение работы...");
    }

    //Метод для проверки выхода из приложения, который вызывается в случае если пользователь хочет выйти их приложения
    public void ifStartVoid() {
        System.out.println("1 - да \n2 - нет \nТакже работет Y/N (yes/no)");
        ifstart = x.nextLine();

        if(ifstart.equals("нет") || ifstart.equals("2") || ifstart.equals("n") || ifstart.equals("NO") ||
                ifstart.equals("no") || ifstart.equals("N") ) {
            start_1.startM();
        } else
            System.out.println("Завершение работы...");

    }

}
