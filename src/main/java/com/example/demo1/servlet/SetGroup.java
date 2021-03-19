package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/19 15:33
 */

import com.example.demo1.dao.impl.PaymentDaoImpl;
import com.example.demo1.pojo.Group;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "setGroup", value = "/setGroup")
public class SetGroup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        int i = new PaymentDaoImpl().addGroup(new Group(jsonObject.getInt("typeName"),
                jsonObject.optString("name")));

        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i != -1);
        response.getWriter().write(jsonObject1.toString());

    }
}
