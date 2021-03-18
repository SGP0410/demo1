package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/17 21:41
 */

import com.example.demo1.dao.impl.NewsDaoImpl;
import com.example.demo1.dao.impl.UserDaoImpl;
import com.example.demo1.pojo.Comment;
import com.example.demo1.pojo.User;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getCommentByPressId", value = "/getCommentByPressId")
public class GetCommentByPressId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        List<Comment> commentList = new NewsDaoImpl().queryComment(jsonObject.getInt("pressId"));

        UserDaoImpl userDao = new UserDaoImpl();
        JSONObject jsonObject1 = new JSONObject();
        if (commentList != null){
            ServletUtils.isOk(jsonObject1 , true);
            JSONArray jsonArray = new JSONArray();
            for (Comment c:commentList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("id" , c.getId());
                jsonObject2.put("createTime" , c.getCreateTime());
                jsonObject2.put("content" , c.getContent());
                jsonObject2.put("userId" , c.getUserId());
                User user = userDao.queryUserByUserId(c.getUserId());
                jsonObject2.put("nickName" , user.getNickName());
                jsonObject2.put("userName" , user.getUserName());
                jsonObject2.put("pressId" , c.getPressId());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows" , jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1 , false);
        }
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
