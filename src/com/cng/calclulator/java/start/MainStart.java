package com.cng.calclulator.java.start;

import com.cng.calclulator.java.Text;
import com.cng.calclulator.java.computation.basic;
import com.cng.calclulator.java.computation.more;

import java.util.Scanner;

public class MainStart {

    public void startM() {

        //Объекты для запуска вычислительных операций
        more more = new more();
        basic basic = new basic();
        Text text = new Text();
        ifStart Mstart = new ifStart();

        //переменные для передачи объектам данных
        double a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.print("Что ты хочешь сделать: ");
        String ifoper = in.nextLine();

        /* Если введеное знаечение от пользователя удовлетваряет это условие, запускается проверка для запуска конкреной
         операции, иначе пользователь увидит ошибку о неизвестном операторе.
         */
        if(ifoper.equals("+") || ifoper.equals("-") || ifoper.equals("*") || ifoper.equals("/") || ifoper.equals("k")
                || ifoper.equals("s") || ifoper.equals("d") || ifoper.equals("f") || ifoper.equals("!") || ifoper.equals("pi")
                || ifoper.equals("e") || ifoper.equals("е") || ifoper.equals("?") || ifoper.equals("help") ) {


            if(ifoper.equals("e") || ifoper.equals("е")) { //Английская и русская e
                System.out.println("Ты действительно хочешь выйти? ");
                Mstart.ifStartVoid();
            }

            if(ifoper.equals("help") || ifoper.equals("?"))
                text.helptext();

            //Это условие нужно для минимизации повтора кода. Для + - / * нужно получить на вход 2 числа
            if (ifoper.equals("+") || ifoper.equals("-") || ifoper.equals("*") || ifoper.equals("/")) {
                System.out.print("Введи 1 число: ");
                a = in.nextDouble();
                System.out.print("Введи 2 число: ");
                b = in.nextDouble();

                if (ifoper.equals("+")) {
                    basic.sloz(a, b);
                }

                if (ifoper.equals("-")) {
                    basic.vichitanie(a, b);
                }

                if (ifoper.equals("*")) {
                    basic.umnozhenie(a, b);
                }

                if (ifoper.equals("/")) {
                    basic.delenie(a, b);
                }
            }

            if (ifoper.equals("k")) {
                System.out.print("Введи число:");
                a = in.nextDouble();
                basic.koren(a);
            }

            //В этом условие на вход получаются 2 числа, но сообщение для пользователя отличается (Введи степень, а не Введи 2 число)
            if (ifoper.equals("s")) {
                System.out.print("Введи число: ");
                a = in.nextDouble();
                System.out.print("Введи степень: ");
                b = in.nextDouble();
                basic.stepen(a, b);
            }

            if (ifoper.equals("d")) {
                System.out.print("Введи a: ");
                a = in.nextDouble();
                System.out.print("Введи b: ");
                b = in.nextDouble();
                System.out.print("Введи c: ");
                c = in.nextDouble();
                more.descriminant(a, b, c);
            }

            if (ifoper.equals("f") || ifoper.equals("!")) {
                System.out.print("Введи число: ");
                int num = in.nextInt();
                more.factorial(num);
            }


            if (ifoper.equals("pi")) {
                more.pi();
            }

        } else {
            System.out.println("Команда <" +  ifoper + "> не найдена.");
            startM();
        }

    }


}
