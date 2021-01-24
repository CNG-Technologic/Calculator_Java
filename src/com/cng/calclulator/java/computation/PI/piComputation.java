package com.cng.calclulator.java.computation.PI;

import com.cng.calclulator.java.computation.more;

import java.util.Scanner;

//Вспомогательный класс для действий с числом пи.
public class piComputation {

    Scanner in = new Scanner(System.in);
    double a_pi; // Нет, это не апи ;)

    public void PiVoid() {
        piComputation startPI = new piComputation();
        System.out.print("Что ты хочешь сделать: ");
        String piaf = in.nextLine();
        System.out.print("Введи значение: ");
        a_pi = in.nextDouble();

        if (piaf.equals("+"))
            startPI.slozhenie(a_pi);

        if(piaf.equals("-"))
            startPI.vicitanie(a_pi);

        if(piaf.equals("/"))
            startPI.delenie(a_pi);

        if(piaf.equals("*"))
            startPI.umnozhenie(a_pi);

        if(piaf.equals("s"))
            startPI.stepenpi(a_pi);

    }

    public void slozhenie(double a_pi) {
        more more = new more();
        System.out.println(Math.PI + " + " + a_pi + " = " + (Math.PI + a_pi));
        more.pi();
    }

    public void umnozhenie(double a_pi) {
        more more = new more();
        System.out.println(Math.PI + " * " + a_pi + " = " + (Math.PI * a_pi));
        more.pi();
    }


    public void vicitanie(double a_pi) {
        more more = new more();
        System.out.println("a)" + Math.PI  + " - " + a_pi + "?" +
                "\nb)" + a_pi + " - " +Math.PI + "?");
        String if_znach = in.nextLine();

        if(if_znach.equals("a")) {
            System.out.println(Math.PI + " - " + a_pi + " = " + (Math.PI - a_pi));
        }

        if(if_znach.equals("b")) {
            System.out.println(a_pi + " - " + Math.PI + " = " + (a_pi - Math.PI));
        }
        more.pi();
    }

    public void delenie(double a_pi) {
        more more = new more();
        System.out.println("a)" + Math.PI  + " / " + a_pi + "?" +
                "\nb)" + a_pi + " / " +Math.PI + "?");
        String if_znachdel = in.nextLine();

        if(if_znachdel.equals("a")) {
            System.out.println(Math.PI + " / " + a_pi + " = " + (Math.PI / a_pi));
        }

        if(if_znachdel.equals("b")) {
            System.out.println(a_pi + " / " + Math.PI + " = " + (a_pi / Math.PI));
        }
        more.pi();
    }

    public void stepenpi(double a_pi){
        more more = new more();
        System.out.println(Math.PI + " в сепени " + a_pi + " = " + Math.pow( Math.PI, a_pi ));
        more.pi();
    }


}
