package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //1. List 계열 : ArrayList
//        List list = new ArrayList();
//        list.add("뿡딱껀");
//        list.add(100);
//        list.add(new Dog("멍청이"));
//
//        String str = list.get(0); //뿡딱껀을 꺼내고 싶다면


        //제네릭 설정 방법
        List<String> list = new ArrayList<>(); //이 리스트는 String만 담는 List야!
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        list.set(2,"바나나");

        printList(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1)); //마지막 인덱스 출력

        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);

        list.clear();
        printList(list);
    }

    private static void printList(List<String> list) {
        for(String s : list){
            System.out.print(s + " | ");
        }
        System.out.println();
    }
}
