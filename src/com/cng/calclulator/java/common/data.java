package com.cng.calclulator.java.common;

public class data {

    public static void help_text() {
        //А как же Console.WriteLine(""); ? :-<
        System.out.println("""
                '+' - сложение\s
                '-' - вычитание
                '*' - умножение
                '/' - деление
                'k' - корень
                's' - степень
                '!' или 'f' - факториал
                'd' - дескриминант
                'pi' - число пи
                'e' - выход""");
        //Console.WriteLine("Oh shit here we go again");
    }

    public static void help_pi_text() {
        System.out.println("""
                '+' - сложение\s
                '-' - вычитание
                '*' - умножение
                '/' - деление
                's' - степень""");

    }

}
