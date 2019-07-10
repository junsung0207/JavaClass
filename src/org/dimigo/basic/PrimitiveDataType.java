package org.dimigo.basic;

public class PrimitiveDataType {

    static boolean flag; // 전역 변수는 초기화를 안해도 됨. ( 기본값 : false )

    public static void main(String[] args) {
        // 1. 논리형
//        boolean flag; //지역 변수는 반드시 초기화 시켜주어야 함.
//
//        if(flag){
//            System.out.println("참입니다!");
//        }
//        else
//            System.out.println("거짓입니다!");

        System.out.println(flag ? "참입니다!" : "거짓입니다!"); //삼항 연산자라고 한다.

        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = '\u0041';

        System.out.printf("%c %c %c\n", ch1, ch2, ch3);

        String name = "이원호";
        System.out.println("My name is " + name);

        // 정수형 출력
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;

        System.out.printf("%d %d %d %d",i1 ,i2, i3 ,i4);

        //byte : -128 ~ 127

        byte b1 = -128;
        byte b2 = 127;

        b1--; // 최솟값에서 1을 감소하면 , 최댓값(127) 로 변함.
        b2++;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(Byte.MIN_VALUE + "-" + Byte.MAX_VALUE);


        long l = 1000000000L;

        double d = 3.14;

        float f1 = 3.14f;
        double d1 = 3.14;
         //float와 double의 정밀도 테스트
        float f2 = 0.12345678901234567890f;
        double d2 = 0.1234567890123456890;

        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s\n", 'A',100,12.345,"오우오우");

    }
}
