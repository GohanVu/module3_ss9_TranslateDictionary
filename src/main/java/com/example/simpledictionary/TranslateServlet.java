package com.example.simpledictionary;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/translate")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put ("hello","Xin chào");
        dictionary.put("how","Thế nào");
        dictionary.put("wtf", "Cái đéo gì thế!");
        String search = req.getParameter("txtSearch");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if(result!=null){
            writer.println("Word: "+search);
            writer.println("Result: "+result);
        } else {
            writer.println("Not found");
        }
        writer.println("<html>");
    }
}