package org.dimigo.interfaces;


public class AnimalTest {
    public static void main(String[] args) {
        IAnimal.welcome();

        IAnimal[] animals = {
                new Duck(), new Pig(), new Cow()
        };

        System.out.println("=== 평온한 동물농장 ===");

        for(IAnimal a : animals){
            a.eat();
        }

        System.out.println("=== 늑대가 나타났다 ===");

        for(IAnimal a : animals){
            a.bark();
        }
    }
}
