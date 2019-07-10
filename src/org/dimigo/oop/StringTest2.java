package org.dimigo.oop;

public class StringTest2 {

    public static void main(String[] args) {
        // String으로 문자열 생성
        String str = "디미고";
        str += "2학년 "; // 문자열 새로운 메모리에 생성
        str += "4반 ";
        str += "윤준성 ";

        str = str.concat("wdawdawda").concat("awdawda");
        System.out.println(str);
        // StringBuilder, StringBuffer
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 "); // append는 원래 있는 메모리 활용 -> 더 빠르고 메모리를 적게 먹음.
        sb.append("4반 ");
        sb.append("윤준성");
        // sb.append("2학년 ").append("4반 ").append("윤준성");   와 같음.
        System.out.println(sb);


        compareSpeed();
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for(int i = 0 ; i < 100000000 ; i++){
            //str += "def";
            sb2.append("def");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start); //1000 나오면 1초
    }
}
