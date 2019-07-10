package org.dimigo.interfaces;


//하나의 표준/ 규약/ 명세
public interface IAnimal {
    //상수처리 -> public static final 자동 붙임 (이것이 인터페이스의 특징)
    String FARMNAME = "디미 동물농장";

    // 추상메소드 선언
//    void eat(); //앞에 public abstract 자동 붙임

    default void eat() {
        System.out.println("냠냠");
    }

    void bark();

    static void welcome(){
        System.out.println(FARMNAME + "에 오신것을 환영합니다.");
    }
}
