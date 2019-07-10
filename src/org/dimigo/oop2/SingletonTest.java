package org.dimigo.oop2;

public class SingletonTest {
    public static void main(String[] args) {


        //        Singleton s = new Singleton();

        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2()); // 셋다 같은 객체

    }
}
