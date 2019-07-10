package org.dimigo.oop2;

public class Person {
    //private final String type = "포유류";
    private final String birthDate;
    private String name;

    public static final String TYPE = "포유류";


    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }


    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("2002.02.07","윤준성");
        Person p2 = new Person("2002.06.19","백종인");

        System.out.println(p1);
        System.out.println(p2);

        //p1.type = "파충류"; //final로 지정되서 값을 바꿀 수 없음.

        System.out.println(Person.TYPE);




    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
