package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("이인규",19,167,68);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("이건",18,180,90,"172311");
        System.out.println(s);
        s.study();
        s.exam();
        s.eat();
        s.sleep();

        Teacher t = new Teacher("제제",50,175,60,"인생");
        System.out.println(t);
        t.teach();
        t.doTask();
        t.eat();
        t.sleep();
    }
}
