package com.cng.calclulator.java.start;

import java.util.Scanner;

import static com.cng.calclulator.java.common.data.help_text;
import static com.cng.calclulator.java.computation.piComputation.pi_void;
import static com.cng.calclulator.java.computation.basic.*;
import static com.cng.calclulator.java.computation.more.*;
import static com.cng.calclulator.java.start.Main.full_exit;

public class MainStart {

    public static void start_main() {

        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("\nЧто ты хочешь сделать: (help - все функции)");
        String start_operator = in.nextLine();

        if(start_operator.equals("+") || start_operator.equals("-") || start_operator.equals("*") || start_operator.equals("/") || start_operator.equals("k")
                || start_operator.equals("s") || start_operator.equals("d") || start_operator.equals("f") || start_operator.equals("!") || start_operator.equals("pi")
                || start_operator.equals("?") || start_operator.equals("help") ) {

            if (start_operator.equals("+") || start_operator.equals("-") || start_operator.equals("*") || start_operator.equals("/")) {
                System.out.print("Введи 1 число: ");
                a = in.nextDouble();
                System.out.print("Введи 2 число: ");
                b = in.nextDouble();

                if (start_operator.equals("+"))
                    System.out.println(a + " + " + b + " = " + sum(a, b));

                if (start_operator.equals("-"))
                    System.out.println(a + " - " + b + " = " + difference(a, b));

                if (start_operator.equals("*"))
                    System.out.println(a + " * " + b + " = " + multiplication_of_numbers(a, b));

                if (start_operator.equals("/"))
                    System.out.println(a + " / " + b + " = " + quotient(a, b));

            }

            if (start_operator.equals("k")) {
                System.out.print("Введи число:");
                a = in.nextDouble();
                System.out.println(root_of_number(a));
            }

            if (start_operator.equals("s")) {
                System.out.print("Введи число: ");
                a = in.nextDouble();
                System.out.print("Введи степень: ");
                b = in.nextDouble();
                System.out.println(degree_num(a, b));
            }

            if (start_operator.equals("d")) {
                System.out.print("Введи a: ");
                a = in.nextDouble();
                System.out.print("Введи b: ");
                b = in.nextDouble();
                System.out.print("Введи c: ");
                c = in.nextDouble();
                full_quadratic_equation(a, b, c);
            }

            if (start_operator.equals("f") || start_operator.equals("!")) {
                System.out.print("Введи число: ");
                int num = in.nextInt();
                System.out.println(factorial(num));
            }

            if (start_operator.equals("pi")) {
                System.out.println("Pi = " + Math.PI);
                System.out.format("Продолжить действия с pi? (y/n) ");
                String operator = in.nextLine();

                if(operator.equals("y"))
                    pi_void();
                else if(operator.equals("n"))
                    System.out.println("Возвращаемся назад...");
                else
                    System.out.println("Комманда <" + operator + "> не найдена");

            }

            if(start_operator.equals("help") || start_operator.equals("?")) {
                help_text();
            }

            start_main();

        } else if (start_operator.equals("e") || start_operator.equals("е"))
            full_exit();
        else {
            System.out.println("Команда <" +  start_operator + "> не найдена.");
            start_main();
        }

    }
}
