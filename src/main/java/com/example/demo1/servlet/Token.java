package com.example.demo1.servlet;

import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "token", value = "/token")
public class Token extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        response.getWriter().write(ServletUtils.getJSONObject(request).toString());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        System.out.println(jsonObject.toString());

        response.getWriter().write(jsonObject.toString());

//        if (header != null) {
//            String base64 = header.substring(6, header.length());
//            byte[] bytes = new byte[0];
//            try {
//                bytes = Base64.decode(base64);
//            } catch (Base64DecodingException e) {
//                e.printStackTrace();
//            }
//            String userNameAndPasswd = new String(bytes, 0, bytes.length);
//            if (userNameAndPasswd.equals("zhangsan:123456")) {
//                PrintWriter out = response.getWriter();
//                out.write("hello");
//                System.out.println("认证成功");
//            }else{
//                returnError(response);
//            }        } else {
//            returnError(response);
//        }

    }



}
