package org.dimigo.inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    // Dog 에만 있는 메소드
    public void wag(){
        System.out.println(name + "이(가) 꼬리를 흔든다."); //Animal 의  name을 private에서 protected 로 바꾸니까 요기의 name에 오류가 안뜸.
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
