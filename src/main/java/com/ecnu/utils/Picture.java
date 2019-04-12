package com.ecnu.utils;

import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Picture {
    public String getPicture(String keyWord){
        String url = null;
        Document doc;
        try {
            doc = Jsoup.connect("https://image.baidu.com/search/acjson?" +
                    "tn=resultjson_com&ipn=rj&ct=201326592&is=&fp=result&queryWord=" +
                    keyWord + "&cl=2&lm=-1&ie=utf-8&oe=utf-8&adpicid=&st=-1&z=&ic=0&word=" +
                    keyWord + "&s=&se=&tab=&width=&height=&face=0&istype=2&qc=&nc=1&fr=&pn=1&rn=5&gsm=b4&1492507141415=").get();
            JSONObject body = JSONObject.parseObject(doc.body().text());
            url = body.getJSONArray("data").getJSONObject(0).getString("thumbURL");
            //data-imgurl="http://img3.imgtn.bdimg.com/it/u=757995547,4181013528&amp;fm=26&amp;gp=0.jpg"main_img img-hover

        } catch (IOException e) {
            //
        }
        return url;
    }

    public static void main(String[] argc){
        System.out.println(new Poem().getPoem("东风"));
        System.out.println(new Poem().getPoem("东风"));
    }

}
