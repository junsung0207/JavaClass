package org.dimigo.oop;

public class BookTest2 {

    private static void compare(){
        int a = 10;
        int b = a;
        System.out.println(a == b ? "true" : "false");

        Book book = new Book();
        Book book2 = book;
        System.out.println(book == book2 ? "true" : "false");

        book.setTitle("걸리버 여행기");
        System.out.println(book.getTitle());
        System.out.println(book2.getTitle());
    }


    public static void main(String[] args) {
        compare(); // static 메소드는 다른 static 메소드에서 수행이 가능하다.
        System.out.println("--------------------------");
        int num = 5;
        methodA(num);
        System.out.println(num);
        System.out.println("--------------------------");

        Book book = new Book("동물농장");
        methodB(book);
        System.out.println(book.getTitle());
        System.out.println("--------------------------");

        methodC(book);
        System.out.println(book.getTitle());
        System.out.println("--------------------------");

        //Book book2 = null;
        Book book2 = new Book("자연의 섭리 - 동물의 왕국 편2");
        System.out.println(book2.getTitle().length());

    }

    private static void methodC(Book book) {
        book.setTitle("Do it! Javascript편");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book = new Book("이것이 자바다");
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);

    }
}
