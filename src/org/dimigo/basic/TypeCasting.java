package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        //자동형변환 : 작은 타입 -> 큰 타입 (Promotion)
        byte b = 10;
        short s = b; //작은 거를 큰거에 담다.
        int i = s;
        long l = i; // 작은거를 큰거에 담다.
        System.out.printf("%d, %d, %d, %d\n",b,s,i,l);

        //강제형변환 : 큰 타입 -> 작은 타입. 영어로는 Casting
        i = (int) l; //l 앞에 (int)를 써 타입캐스팅을 해줌.
        s = (short)i;
        b = (byte)s;
        System.out.printf("%d, %d, %d, %d\n",b,s,i,l);

        //값의 범위 고려해서 Casting하기
        int i2 = 128;
        byte b2 = (byte)i2; //byte의 범위는 -128 ~ 127
        System.out.println(b2);

        long l2 = 10000000000L; //100억 뒤에 L (long)을 붙여줘야 함.
        int i3 = (int)l2;
        System.out.println(i3);

    }
}
