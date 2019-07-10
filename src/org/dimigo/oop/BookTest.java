package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book; // 래퍼런스 변수 선언 int i; 허고
        book = new Book(); // i = 10; 한거랑 똑같은 구문임.

        Book book2 = new Book(); // 위쪽 2줄을 이렇게 1줄로 짧게 줄일 수 있음.

        System.out.println(book);
        System.out.println(book2);


        //변경전
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("수학의 바이블");
        book.setAuthor("민경도");
        book.setPage(200);

        //변경후
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());


        Book book3 = new Book("언어의 정원","신카이 마코토",100);
        Book book4 = new Book("언어의 정원","신카이 마코토");
        Book book5 = new Book("언어의 정원");


    }
}
