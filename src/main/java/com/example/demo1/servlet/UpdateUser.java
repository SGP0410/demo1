package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/18 16:25
 */

import com.example.demo1.dao.impl.UserDaoImpl;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "updateUser", value = "/updateUser")
public class UpdateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        System.out.println(jsonObject.toString());
        int i = new UserDaoImpl().updateUser(new User(jsonObject.optInt("userId") , jsonObject.optString("userName"), "", jsonObject.optString("nickName"),
                jsonObject.optString("phonenumber"), jsonObject.optInt("sex"),
                jsonObject.optString("email"), jsonObject.optString("file"),
                jsonObject.optString("idCard")));

        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i == 1);

        response.getWriter().write(jsonObject1.toString());
    }
}
