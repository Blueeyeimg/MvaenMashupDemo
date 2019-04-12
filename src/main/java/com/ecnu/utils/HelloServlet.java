package com.ecnu.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.*;

import java.io.IOException;

public class HelloServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        String keyWord = new String(request.getParameter("submit").getBytes("ISO-8859-1"),"UTF-8");

        System.out.println(keyWord);
        System.out.println(new Poem().getPoem("东风"));
        JSONObject poem = new Poem().getPoem("东风");
        String url = new Picture().getPicture(keyWord);
        System.out.println(url);

        System.out.println(keyWord);

        request.setAttribute("url",url);
        request.setAttribute("title",poem.getString("title"));
        request.setAttribute("author",poem.getString("author"));
        request.setAttribute("dynasty",poem.getString("dynasty"));
        request.setAttribute("text",poem.getString("text"));

        ServletContext context = getServletContext();
        RequestDispatcher dispatcher =context.getRequestDispatcher("/hello.jsp");
        dispatcher.forward(request, response);

    }

}
