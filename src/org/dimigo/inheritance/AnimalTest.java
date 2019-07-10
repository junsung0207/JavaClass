package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {

//        Animal a = new Animal("동물");
//        System.out.println(a);
//        a.eat();
//        a.sleep();
//        a.bark();

        Animal[] animals={
                new Animal("동물"),
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("어흥이")
        };

        for(Animal a : animals){
            System.out.println(a);
            a.eat();
            a.sleep();
            a.bark();
        }





        Dog d = new Dog("멍멍이");
        System.out.println(d); // d= d.toString()
        d.bark();
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("어흥이");
        System.out.println(t);
        t.bark();
        t.hunt();

        for(Animal a : animals){
            doAction(a);
        }


        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        //dog.wag(); //This is 오류
        Dog dog2 = (Dog) dog; //이것이 타입 캐스팅. 강제 형변환이란다.
        dog2.wag();

        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Object);

        doAction(dog);
        doAction(cat);

    }

    private static void doAction(Animal a){
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.scratch();
        }
        else if(a instanceof Dog){
            ((Dog) a).wag();
        }
    }
}
