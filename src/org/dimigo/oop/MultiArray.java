package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];

        intArr[0][2] = 1;
        intArr[1][1] = 2;
        printArray(intArr);


        // String 타입 이차원 배열
        String[][] strArr = new String[2][];
        strArr[0] = new String[3] ;
        strArr[1] = new String[2] ;


        //초기화 방법1
        strArr[0][0] = "C";
        strArr[0][1] = "JAVA";
        strArr[0][2] = "PHP";
        strArr[1][0] = "C#";
        strArr[1][1] = "Python";

//        printArray(strArr);

        //초기화 방법 2
        String[][] strArr2 = {
                {"C","JAVA","PHP"},{"C#","Python"}
        };

        //초기화 방법 3
        String[][] strArr3 = new String[][]{
                {"C","JAVA","PHP"},{"C#","Python"}
        };

//        //초기화 방법4
//        String[][] strArr3 = {
//                new String[] {"C","JAVA","PHP"}, new String[] {"C#","Python"}
//        };
//
//        //초기화 방법 5 (new String을 둘다 붙임.)
//        String[][] strArr3 = new String[][]{
//                new String[] {"C","JAVA","PHP"}, new String[] {"C#","Python"}
//        };

    }

//    private static void printArray(String[][] strArr){
//        for(int i : strArr){
//            for(int j : i){
//                System.out.printf(j + " ");
//            }
//            System.out.println();
//        }
//    }

    private static void printArray(int[][] intArr) {
        for(int i = 0 ; i < intArr.length ; i ++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.print(intArr[i][j] + "|");
            }
        }
        System.out.println();

        for(int[] i : intArr){
            for(int j : i){
                System.out.print(j + "|");
            }
        }
    }
}
