package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/19 15:21
 */

import com.example.demo1.dao.impl.PaymentDaoImpl;
import com.example.demo1.pojo.Group;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getGroupAll", value = "/getGroupAll")
public class GetGroupAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<Group> groupList = new PaymentDaoImpl().queryGroupAll();
        JSONObject jsonObject = new JSONObject();
        if (groupList !=null){
            ServletUtils.isOk(jsonObject , true);
            JSONArray jsonArray = new JSONArray();
            for (Group g:groupList) {
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("typeName" , g.getTypeName());
                jsonObject1.put("name" , g.getName());
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows" , jsonArray);
        }else {
            ServletUtils.isOk(jsonObject , false);
        }
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
