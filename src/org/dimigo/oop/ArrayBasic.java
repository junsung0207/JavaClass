package org.dimigo.oop;

public class ArrayBasic {

    public static void main(String[] args) {
        // 기본형 타입 배열
        // int, float, double, char, boolean, byte, long, short
        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);

        int[] intArr2 = {1,2,3,4,5}; // int[] intArr2 = new int[] {1,2,3,4,5}; 라고 써도 똑같음.
        printArray(intArr2);

            System.out.println("");

        //double 타입 배열
        double[] doubleArr = new double[5];

        printArray(doubleArr);



        // 참조형 타입 배열
        String[] strArr = new String[3];


        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "윤준성";

        printArray(strArr);


        String[] strArr2 = new String[] {"ITZY", "김건모", "카와이"};
        printArray(strArr);


        System.out.println("");

        //Book 타입 배열 2개짜리 생성
        //Book 객체 생성 후 출력

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블","김재영",100);
        bookArr[1] = new Book("워드마스터","전유원",200);

        Book[] bookArr2 = new Book[] {
                new Book("수학의 바이블2","김재영",100),
                new Book("워드마스터2","전유원",200)
        };

        printArray(bookArr2);

        //배열 사용 시 주의 사항
        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3.length - 1);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]); //null
//        System.out.println(strArr3[0].length); //nullPointException

    }




    private static void printArray(int[] intArr) {
        for(int num : intArr) //for-each 문
        {
            System.out.print(num + "|");
        }
    }

    private static void printArray(double[] doubleArr) { //오버로딩
        for(double num : doubleArr) //for-each 문
        {
            System.out.print(num + "|");
        }
    }

    private static void printArray(String[] strArr) {
        for(String num : strArr) //for-each 문
        {
            System.out.print(num + "|");
        }
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr){
            //System.out.printf("책제목 : %s, 저자명 : %s, 페이지수 : %s\n", value.getTitle(),value.getAuthor(),value.getPage());
            System.out.println(value);
        }
    }
}
