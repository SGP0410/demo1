package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/18 8:27
 */

import com.example.demo1.dao.impl.NewsDaoImpl;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "setComment", value = "/setComment")
public class SetComment extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        int comment = new NewsDaoImpl().addComment(
                jsonObject.optInt("userId"),
                jsonObject.optInt("pressId"),
                jsonObject.optString("content"),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , comment != -1);
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
