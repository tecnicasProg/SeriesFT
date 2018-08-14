package com.bcopstein.FuncoesST;

public class App
{
    public static void main( String[] args )
    {
       Lambert l = new Lambert();
       ExpLog e = new ExpLog();
       Trig t = new Trig();

       System.out.println("Serie de Lambert, x = 10: " + l.W0(10));
       System.out.println("funcao exponencial, x = 10: " + l.W0(10));
       System.out.println("cos de x = 10: " + t.cos(10));

    }
}
