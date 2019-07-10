package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        // 1. 문자열 리터럴 빙식 ( literal pool) - 재사용 방식
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);       //주소값 비교
        System.out.println(dog1.equals(dog2));  //문자열 비교

        //new 객체 생성 방식
        String cat1 = new String("냥냥이");
        String cat2 = new String("냥냥이");
        System.out.println(cat1 == cat2);       //주소값 비교, new객체 생성은 다른 변수가 서로 다른 곳을 가리킴.
        System.out.println(cat1.equals(cat2));  //문자열 비교

        //문제
        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "냥냥이"); //false

        String id = "Admin";

        if(id.toLowerCase().equals("admin")){ //toLowerCase는 문자열을 전부 다 소문자로 바꿔줌.
            System.out.println("관리자");
        }
        else{
            System.out.println("관리자 아님");
        }


//        String str = null;
//        if(str.equals("디미고")){} //여기서 NullPointerException오류 발생
//        if("디미고".equals(str)){} //하지만 이렇게 쓴다면 오류 안남.


//        private static void testString(){
//            //      01234567890123
//            String s = "abcdefgABCDEFG";
//
//            System.out.println(s.length()); // 14                                                        ******** 자주씀 ********
//            System.out.println(s.substring(3));  //범위 내 숫자만 자르기 defgABCDEFG                         ******** 자주씀 ********
//            System.out.println(s.substring(3,6)); // def                                                 ******** 자주씀 ********
//            System.out.println(s.indexOf("C")); // 9
//            System.out.println(s.charAt(9)); // C 입력된 인덱스의 해당 character 불러옴.
//            System.out.println(s.concat("ABC")); //s 에다가 ABC 문자열 붙이기
//            System.out.println("           ABC          ".trim()); //어랏 스페이스를 없애고 출력 가능할까? trim 쓰면 됌!  ******** 자주씀 ********
//            System.out.println(s.toUpperCase()); //전부다 대문자로 바꿔준다.
//            System.out.println(s.toLowerCase()); //전부다 소문자로 바꿔준다.
//            System.out.println(s.replace('a','A')); // a는 모두 A로 바꿔준다.
//            System.out.println(s.startsWith("abc")); // abc로 시작하는 가를 알아보는 구문, abc로 시작하면 true 리턴.
//            System.out.println(s.endsWith("FG")); // FG로 끝나나? 이것 또한 boolean 타입으로 리턴.
//
//        }
    }
}

