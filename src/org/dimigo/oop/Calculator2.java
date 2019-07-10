package org.dimigo.oop;

public class Calculator2 {

//    public void powerOn(){
//        if(!powerFlag){
//            System.out.println("전원을 켭니다.");
//            powerFlag = true;
//        }
//    }
//
//    public void powerOff(){
//        if(this.powerFlag){
//            System.out.println("전원을 끕니다.");
//            this.powerFlag = false;
//        }
//
//    }

    public static double PI = 3.141592;

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mul(int num1, int num2){
        return num1 * num2;
    }

    public static double div(int num1, int num2){
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10 , b = 20;

        Calculator2 c = new Calculator2();

//        c.powerOn();
        System.out.printf("%d + %d = %d\n", a, b, Calculator2.add(a,b));
        System.out.printf("%d - %d = %d\n", a, b, Calculator2.sub(a,b));
        System.out.printf("%d * %d = %d\n", a, b, Calculator2.mul(a,b));
        System.out.printf("%d / %d = %.1f\n", a, b, Calculator2.div(a,b));
//        c.powerOff();

    }
}
