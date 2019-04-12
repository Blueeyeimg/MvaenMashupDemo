package com.ecnu.utils;


import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Poem {
    public JSONObject getPoem(String keyWord){
        JSONObject result = new JSONObject();
        result.put("keyword",keyWord);
        Document doc;
        try {
            doc = Jsoup.connect("https://so.gushiwen.org/search.aspx?value=" + keyWord).get();
            String title = doc.getElementsByTag("b").get(1).text();
            Element source = doc.getElementsByClass("source").get(0);
            String author = source.child(2).text();
            String dynasty = source.child(0).text();
            result.put("title",title);
            result.put("author",author);
            result.put("dynasty",dynasty);

            Element contson = doc.getElementsByClass("contson").get(0);
            result.put("text",contson.text());

        } catch (IOException e) {
            //
        }
        return result;
    }

    public static void main(String[] argc){
        System.out.println(new Poem().getPoem("东风"));
        System.out.println(new Poem().getPoem("东风"));
    }
}
