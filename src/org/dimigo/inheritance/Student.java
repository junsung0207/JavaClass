package org.dimigo.inheritance;

public class Student extends Person{
    private String studentId;

    public Student(String name, int age, int height, int weight, String studentId) {
        super(name,age,height,weight); //부모에게 바로 매개변수 넘겨줌.
        this.studentId = studentId;
    }

    public void exam(){
        System.out.println(super.getName() + "이 시험을 봅니다.");
    }

    public void study(){
        System.out.println(super.getName() + "이 공부를 합니다.");
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}
