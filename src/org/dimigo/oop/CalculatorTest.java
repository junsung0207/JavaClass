package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10 , b = 20;

        Calculator cal = new Calculator(a,b);
        System.out.println(cal);

        cal.powerOn();
        System.out.printf("%d + %d = %d\n", a, b, cal.add());
        System.out.printf("%d - %d = %d\n", a, b, cal.sub());
        System.out.printf("%d * %d = %d\n", a, b, cal.mul());
        System.out.printf("%d / %d = %.1f\n", a, b, cal.div());
        cal.powerOff();

    }
}
