package org.dimigo.oop;

public class Count {
    private static int cnt; //초기화는 자동으로 해줌.

    public Count(){
        cnt++;
    }

    public static int getCnt() {
        return cnt;
    }
}
