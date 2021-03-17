package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/17 9:41
 */

import com.example.demo1.dao.impl.NewsDaoImpl;
import com.example.demo1.pojo.NewsCategory;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getPressCategory", value = "/getPressCategory")
public class GetPressCategory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        List<NewsCategory> newsCategoryList = new NewsDaoImpl().queryNewsCategory();

        JSONObject jsonObject = new JSONObject();
        if (newsCategoryList != null){
            ServletUtils.isOk(jsonObject , true);
            JSONArray jsonArray = new JSONArray();
            for (NewsCategory n:newsCategoryList) {
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("pressCategory" , n.getPressCategory());
                jsonObject1.put("categoryName" , n.getCategoryName());
                jsonObject1.put("dictSort" , n.getDictSort());
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("data" , jsonArray);
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
