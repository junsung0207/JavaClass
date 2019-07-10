package org.dimigo.abstractclass;

public abstract class Animal {
    public void eat(){
        System.out.println("냠냠");
    }
    //추상 메소드 : 자식 클래스에서 반드시 오버라이딩 하라!
    public abstract void bark();

}
