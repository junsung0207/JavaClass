package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울", "대전", "대구", "부천"};

        System.out.println(Arrays.toString(src));

        //배열 복사 (src -> dest)
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        //배열 비교
        System.out.println(Arrays.equals(src, dest));

        //배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        //배열 검색 (정렬을 먼저 하기)
        System.out.println(Arrays.binarySearch(dest, "부천"));
    }
}
