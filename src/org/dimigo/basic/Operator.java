package org.dimigo.basic;

import java.sql.SQLOutput;

public class Operator {
    public static void main(String[] args) {
        // 1. 산술연산자
        int a = 5, b = 2;

        System.out.println(a+b); //줄복사 Ctrl + d
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((float)(a) / (b)); //이것이 2.5가 나오게 하는 방법.
        System.out.println(a%b);

//        System.out.println(a/0); 0으로 나누면 오류, 한줄 주석 처리는 ctrl + /

        // 2. 다른 타입 간의 연산

        int i = 10;
        double d = 3.14;
        int r = (int)(i + d);
        int r2 = i + (int)d;
        double r3 = i + d;

        // int 보다 작은 타입간의 연산
        short s1 = 1, s2 = 2;
        short r4 = (short)(s1 + s2);
        int r5 = s1 + s2;

        //3. Short-Circuit 테스트
        boolean flag = true;
        a = 10;
        b = 0;

        if(flag || (a/b == 0)){
            System.out.println("OR연산");
        }

        if(!flag && (a/b == 0)){
            System.out.println("And연산");
        }

        int x = 0 ,result; //삼항 연산자를 사용하여 간편하게 사용
        result = (x>=0) ? x : -x;

        //4. 문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 4; //int class라 쓰면 안됌.
        String name = "윤준성";

        System.out.println(school + grade + ban + name); //앞에서부터 연산하기 때문에 디미고6윤준성이 아닌, 디미고24윤준성이라고 나옴.
        System.out.println(grade + ban + school + name);

        //그렇다면 24디미고윤준성을 출력하려면?
        System.out.println("" + grade + ban + school + name);
    }
}
