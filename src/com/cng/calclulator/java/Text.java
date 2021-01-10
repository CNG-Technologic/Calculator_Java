package com.cng.calclulator.java;

import com.cng.calclulator.java.start.MainStart;

public class Text {

    public void helptext() {
        MainStart start_2 = new MainStart();
        System.out.println("'+' - сложение " +  //А как же Console.WriteLine(""); ? :-<
                "\n'-' - вычитание" +
                "\n'*' - умножение" +
                "\n'/' - деление" +
                "\n'k' - корень" +
                "\n'!' или 'f' - факториал" +
                "\n's' - степень" +
                "\n'sin' - синус" +
                "\n'cos' - косинус" +
                "\n'tan' - тангенс" +
                "\n'd' - дескриминант" +
                "\n'pi' - число пи" +
                "\n'e' - выход");
        start_2.startM();
        //Console.WriteLine("Oh shit here we go again");
    }

}
