package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class crawling {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        // underkg 크롤링

        try{
            Document doc = Jsoup.connect("http://underkg.co.kr/news").get();

            Elements result = doc.select("[class=title]").select("a");
            list1 = result.eachText();
            int i = 0;
            for(String title : list1){
                System.out.printf("%d. %s\n",++i, title);
            }
        } catch(Exception e){
            e.printStackTrace();
        }


    }


}


