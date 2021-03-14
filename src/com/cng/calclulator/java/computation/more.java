package com.cng.calclulator.java.computation;

public class more {

    public static void full_quadratic_equation(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        System.out.println("D = " + b + " * " + b + " - " + 4 + " * " + a + " * " + c + " = " + D);

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = (" + -b + " - " + Math.sqrt(D) + ") / (2 * " + a + ") = " + x1);
            System.out.println("x2 = (" + -b + " + " + Math.sqrt(D) + ") / (2 * " + a + ") = " + x2);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + -b + " / (2 * " + a + ") = " + x);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else
            System.out.println("Уравнение не имеет действительных корней!");
    }

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
