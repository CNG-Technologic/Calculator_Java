package com.cng.calclulator.java.start;

import com.cng.calclulator.java.Text;
import com.cng.calclulator.java.computation.COS.cosClass;
import com.cng.calclulator.java.computation.SIN.SinDegrees;
import com.cng.calclulator.java.computation.SIN.SinRadians;
import com.cng.calclulator.java.computation.TAN.tanClass;
import com.cng.calclulator.java.computation.basic;
import com.cng.calclulator.java.computation.more;

import java.util.Scanner;

public class MainStart {

    public void startM() {

        tanClass tan = new tanClass();
        SinRadians sinRadianStart = new SinRadians();
        SinDegrees sinDegrStart = new SinDegrees();
        cosClass cos = new cosClass();
        more more = new more();
        basic basic = new basic();
        Text text = new Text();
        ifStart Mstart = new ifStart();
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Что ты хочешь сделать: ");
        String ifoper = in.nextLine();

        if(ifoper.equals("+") || ifoper.equals("-") || ifoper.equals("*") || ifoper.equals("/") || ifoper.equals("k")
                || ifoper.equals("s") || ifoper.equals("d") || ifoper.equals("f") || ifoper.equals("!") ||
                ifoper.equals("pi") || ifoper.equals("sin") || ifoper.equals("cos") || ifoper.equals("tan") || ifoper.equals("e")
                || ifoper.equals("е") || ifoper.equals("?") || ifoper.equals("help") ) {


            if(ifoper.equals("e") || ifoper.equals("е")) { //Английская и русская e
                System.out.println("Ты действительно хочешь выйти? ");
                Mstart.ifStartVoid();
            }

            if(ifoper.equals("help") || ifoper.equals("?"))
                text.helptext();

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

            if (ifoper.equals("sin")) {
                System.out.println("D - градусы R - радианы");
                String ifdegress = in.nextLine();

                if (ifdegress.equals("d") || ifdegress.equals("D")) {
                    System.out.format("Введи число: ");
                    double angleInDegrees = in.nextDouble();
                    sinDegrStart.sinDegress(angleInDegrees);
                }

                if (ifdegress.equals("r") || ifdegress.equals("R")) {
                    System.out.format("Введи число: ");
                    double DegreesInRadians = in.nextDouble();
                    DegreesInRadians = (double) 1 / 6 * Math.PI;
                    sinRadianStart.sinRadians(DegreesInRadians);
                }
            }

            if (ifoper.equals("cos")) {
                System.out.format("Введи число: ");
                double degrees = in.nextDouble();
                double radians = Math.toRadians(degrees);
                cos.cosVoid(degrees, radians);
            }

            if (ifoper.equals("tan")) {
                System.out.format("Введи число: ");
                double degress = in.nextDouble();
                double Radians = Math.toRadians(degress);
                tan.tanVoid(Radians);
            }
        } else {
            System.out.println("Команда <" +  ifoper + "> не найдена.");
            Mstart.start();
        }

    }


}
