package org.dimigo.oop;

public class Calculator {
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator(){}

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void powerOn(){
        if(!powerFlag){
            System.out.println("전원을 켭니다.");
            powerFlag = true;
        }
    }

    public void powerOff(){
        if(this.powerFlag){
            System.out.println("전원을 끕니다.");
            this.powerFlag = false;
        }

    }

    public int add() {
        System.out.println(this);
        this.powerOn();
        return this.num1 + this.num2;
    }

    public int sub(){
        powerOn();
        return this.num1 - this.num2;
    }

    public int mul(){
        powerOn();
        return this.num1 * this.num2;
    }

    public double div(){
        powerOn();
        return (double) this.num1 / this.num2;
    }
}
