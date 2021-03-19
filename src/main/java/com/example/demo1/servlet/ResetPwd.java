package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/18 16:59
 */

import com.example.demo1.dao.impl.UserDaoImpl;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "resetPwd", value = "/resetPwd")
public class ResetPwd extends HttpServlet {
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        int i = new UserDaoImpl().updatePassword(jsonObject.optInt("userId"),
                jsonObject.optString("userName"),
                jsonObject.optString("password"));

        JSONObject jsonObject1 = new JSONObject();
        ServletUtils.isOk(jsonObject1 , i != -1);

        resp.getWriter().write(jsonObject1.toString());
    }
}
