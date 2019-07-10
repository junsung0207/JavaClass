package org.dimigo.oop;

public class Book {
    // 필드 선언
    private String title;
    private String author;
    private int page;

    // 기본 생성자 (constructor)   아무것도 없다면 시스템에서 알아서 만들어 주지만 추가 생성자가 있다면 자동으로 만들X
    public Book(){
        System.out.println("기본   생성자 호출");
    }


    // 추가 생성자
    // @ 오버로딩은 메소드의 이름이 같고 매개변수 개수가 달라야 함.
    // @ 메소드 이름과 매개변수 개수가 같은 경우는 매개변수의 타입이 달라야함. (1번 Book과 2번 Book)
    public Book(String title, String author, int page) { //1
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, int page, String author) { //2
        this.title = title;
        this.author = author;
        this.page = page;
    }



    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
        this(title,author,0); //page에는 default 값인 0 을 자동으로 넣게 해주는 Chaining 기법
    }

    public Book(String title) {
//        this.title = title;
        this(title,"저자 미상"); // 이 또한 Chaining 기법
    }



    //하지만 밑의 getter setter는 alt+insert(generate)로 자동적으로 만들 수 있음.

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
            return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }


    //      // 밑에 3개는 getter 메소드
//    public String getTitle(){
//        return title;
//    }
//    public String getAuthor(){
//        return author;
//    }
//    public int getPage(){
//        return page;
//    }
//
//
//
//    //밑 3개의 메소드는 Setter (세터)라고 부름.
//    public void setTitle(String title){
//        this.title = title;
//    }
//
//    public void setAuthor(String author){
//        this.author = author;
//    }
//
//    public void setPage(int page){
//        if(page > 0){
//            this.page = page;
//        }
//    }


}
