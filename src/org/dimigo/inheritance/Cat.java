package org.dimigo.inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    //부모 클래스의 메소드를 자식클래스에서 재정의
    // 매소드 오버라이딩 -> 이름, 매개변수 다 똑같이 쓰고 구현 부분만 바꾸기.
    // 오버로딩은 이름은 같고 매개변수의 타입이 다른 것. 대표적으로 생성자에 많이 쓰임. 둘이 헷갈리면 안됌.
//    @Override
//    public void bark(){
//        System.out.println("야옹");
//    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }

    public void scratch(){
        System.out.println(name + "이(가) 할퀸다.");
    }

}
