package com.cng.calclulator.java.computation.ComputingPercentage;

import com.cng.calclulator.java.computation.more;

import java.util.Scanner;

//Вспомогательный класс для действий с процентами.
public class Percentage {

    Scanner prin = new Scanner(System.in);
    double a_pr;
    double pr_main;

    public void Prvoid(double a) {
        Percentage percentage = new Percentage();
        System.out.print("Что ты хочешь сделать: ");
        String praf = prin.nextLine();
        System.out.print("Введи значение: ");
        a_pr = prin.nextDouble();

        if(praf.equals("+"))
            percentage.slozhenie(a, a_pr);

        if(praf.equals("-"))
            percentage.vicitanie(a, a_pr);

        if(praf.equals("*"))
            percentage.umnozhenie(a, a_pr);

        if(praf.equals("/"))
            percentage.delenie(a, a_pr);

        if(praf.equals("s"))
            percentage.stepen(a, a_pr);

    }

    public void slozhenie(double a, double a_pr) {
        more more = new more();
        System.out.println((a / 100) + " + " + a_pr + " = " + ((a / 100) + a_pr));
        more.prozent(a);
    }

    public void vicitanie(double a, double a_pr) {
        more more = new more();
        System.out.println("a)" + (a / 100) + " - " + a_pr + "?" +
                "\nb)" + a_pr + " - " + (a / 100) + "?");

        pr_main = a / 100;

        String if_proz = prin.nextLine();
        if(if_proz.equals("a")) {
            System.out.println(pr_main + " - " + a_pr + " = " + (pr_main - a_pr));
        }

        if(if_proz.equals("b")) {
            System.out.println(a_pr + " - " + pr_main + " = " + (a_pr - pr_main));
        }
        more.prozent(a);
    }

    public void delenie(double a, double a_pr) {
        more more = new more();
        System.out.println("a)" + (a / 100) + " / " + a_pr + "?" +
                "\nb)" + a_pr + " / " + (a / 100) + "?");

        pr_main = a / 100;

        String if_proz = prin.nextLine();
        if(if_proz.equals("a")) {
            System.out.println(pr_main + " / " + a_pr + " = " + (pr_main / a_pr));
        }

        if(if_proz.equals("b")) {
            System.out.println(a_pr + " / " + pr_main + " = " + (a_pr / pr_main));
        }
        more.prozent(a);
    }

    public void umnozhenie(double a, double a_pr) {
        more more = new more();
        System.out.println((a / 100) + " * " + a_pr + " = " + ((a / 100) * a_pr));
        more.prozent(a);
    }

    public void stepen(double a, double a_pr) {
        more more = new more();
        System.out.println(a / 100 + " в степени " + a_pr + " = " + Math.pow(a / 100, a_pr));
        more.prozent(a);
    }


}
