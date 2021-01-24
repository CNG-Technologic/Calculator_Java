package com.cng.calclulator.java.computation;

import com.cng.calclulator.java.computation.ComputingPercentage.Percentage;
import com.cng.calclulator.java.computation.PI.piComputation;
import com.cng.calclulator.java.start.MainStart;

import java.util.Scanner;

/*Класс в кoтором находятся дополнительные операции для вычисения более сложных задач.
 * (Квадратное уравнение, Факториал, Действия с процентами, Действия с чилом P)
 */
public class more {

    piComputation pi = new piComputation();
    MainStart start = new MainStart();
    Percentage percentage = new Percentage();
    Scanner scanner = new Scanner(System.in);

    public void descriminant(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        System.out.println("D = " + b + " * " + b + " - " + 4 + " * " + a + " * " + c + " = " + D);

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
        start.startM();
    }

    public void factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(num + "! = " + factorial);
        start.startM();
    }

    public void prozent(double a) {
        System.out.println(a + " % = " + (a / 100));

        System.out.println("Продолжить действия с процентами? (y/n)");
        String ifproz = scanner.nextLine();

        if (ifproz.equals("Y") || ifproz.equals("y")) {
            percentage.Prvoid(a);
        }

        if (ifproz.equals("N") || ifproz.equals("n")) {
            start.startM();
        }
    }

    public void pi() {
        System.out.println("PI = " + Math.PI);
        System.out.println("Продолжить действия с pi? (y/n)");
        String ifpi = scanner.nextLine();

        if (ifpi.equals("Y") || ifpi.equals("y"))
            pi.PiVoid();


        if (ifpi.equals("N") || ifpi.equals("n"))
            start.startM();


    }


}
