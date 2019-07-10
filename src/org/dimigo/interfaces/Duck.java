package org.dimigo.interfaces;

public class Duck implements IAnimal{

    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void bark() {
        System.out.println("꽥꽥");
    }
}
