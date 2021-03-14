package com.cng.calclulator.java.start;


import java.util.Scanner;

import static com.cng.calclulator.java.start.MainStart.start_main;

public class Main {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор Java 2.2 BETA");
        start_void();
    }

    public static void start_void() {
        System.out.println("\n1 - старт \n2 - выход");
        Scanner get = new Scanner(System.in);
        String start_operator = get.nextLine();

        if(start_operator.equals("1"))
            start_main();
        else if(start_operator.equals("2"))
            System.out.println("Завершение работы...");
        else {
            System.out.println("Команда <" + start_operator + "> не найдена");
            start_void();
        }
    }

    public static void full_exit() {
        System.out.println("\nТы действительно хочешь выйти?");
        System.out.println("1 - да \n2 - нет");
        String exit = in.nextLine();

        if(exit.equals("2"))
            start_main();
        else if (exit.equals("1"))
            System.out.println("Завершение работы...");
        else {
            System.out.println("Команада <" + exit + "> не найдена");
            full_exit();
        }
    }

}
