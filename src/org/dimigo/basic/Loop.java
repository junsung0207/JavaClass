package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력하기

        for(int j  = 2 ;j <=9 ; j++)
        {
            for(int i = 1; i <9 ; i++){
                System.out.printf("%d x %d = %d\t",j,i,j*i);
            }
            System.out.printf("\n");
        }
        //for-each 문
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int value : arr){
            System.out.println(value);
        }

        String[] BTS = {"슈가","제이홉","남준"};

        for(String name : BTS){
            System.out.println(name);
        }

        //3. while, do-while, do while은 게임에서 메뉴 만들 때 주로 사용.

        Scanner scanner = new Scanner(System.in); //모니터에서 출력할떄 System.out , 입력할땐 System.in
        int menu = 0;
        do{
            System.out.println(" <<아이돌 선택>> ");
            System.out.println("1. ITZY");
            System.out.println("2. 빅뱅");
            System.out.println("3. 걸스데이");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();

            // 1을 입력하면 "ITZY를 선택하셨네요"
            // 2를 입력하면 "빅뱅을 선택하셨네요"
            // 3을 입력하면 "걸스데이를 선택하셨네요.
            // 9를 입력하면 프로그램 종료
            // 없는 메뉴 입력시 "없는 메뉴네요."
            switch(menu){
                case 1:{
                    System.out.println("ITZY를 선택하셨네요.");
                    break;
                }
                case 2:{
                    System.out.println("빅뱅을 선택하셨네요.");
                    break;
                }
                case 3:{
                    System.out.println("걸스데이를 선택하셨네요.");
                    break;
                }
                case 9:{
                    scanner.close();
                    break;
                }
                default:{
                    System.out.println("없는 메뉴네요.");
                }
            }
        } while(menu !=  9);

    }
}
