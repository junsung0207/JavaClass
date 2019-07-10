package org.dimigo.oop;

public class CountTest {
    public static void main(String[] args) {
        for(int i = 0 ; i < 1000; i ++){
            new Count();

        }
        System.out.println(Count.getCnt());
    }

}
