package com.cng.calclulator.java.computation;

import java.util.Scanner;

import static com.cng.calclulator.java.common.data.help_pi_text;
import static com.cng.calclulator.java.computation.basic.*;
import static com.cng.calclulator.java.start.MainStart.pi_start;

public class piComputation {

    public static void pi_void() {

        Scanner in = new Scanner(System.in);
        double a;

        System.out.format("\nЧто ты хочешь сделать? ");
        String operator = in.nextLine();

        if(operator.equals("+") | operator.equals("-") | operator.equals("*") | operator.equals("/") | operator.equals("s") | operator.equals("?")) {

            if (operator.equals("+")) {
                a = get_data();
                System.out.println(Math.PI + " + " + a + " = " + sum(Math.PI, a));
            }

            if (operator.equals("-")) {
                a = get_data();
                System.out.println(Math.PI + " - " + a + " = " + difference(Math.PI, a));
            }

            if (operator.equals("*")) {
                a = get_data();
                System.out.println(Math.PI + " * " + a + " = " + multiplication_of_numbers(Math.PI, a));
            }

            if (operator.equals("/")) {
                a = get_data();
                System.out.println(Math.PI + " / " + a + " = " + quotient(Math.PI, a));
            }

            if (operator.equals("s")) {
                a = get_data();
                System.out.println(Math.PI + " в степени " + a + " = " + degree_num(Math.PI, a));
            }

            if (operator.equals("?")) {
                help_pi_text();
                pi_void();
            }

            pi_start();
        } else {
            System.out.println("Команда <" + operator + "> для работы с числом пи не найдена");
            pi_void();
        }

    }

    public static double get_data() {
        Scanner get = new Scanner(System.in);
        System.out.format("Введи число: ");
        return get.nextDouble();
    }

}
