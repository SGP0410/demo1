package com.example.demo1.servlet;

import com.example.demo1.dao.impl.SlideshowDaoImpl;
import com.example.demo1.pojo.Slideshow;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "lists", value = "/lists")
public class Lists extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        List<Slideshow> slideshowList = new SlideshowDaoImpl()
                .querySlideshowByType(jsonObject.optString("type"));

        JSONObject jsonObject1 = new JSONObject();
        if (slideshowList != null){
            jsonObject1.put("total",slideshowList.size());
            JSONArray jsonArray = new JSONArray();
            for (Slideshow s: slideshowList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("id" , s.getId());
                jsonObject2.put("imgUrl" , ServletUtils.getImageUrl(request , s.getImgUrl()));
                jsonObject2.put("type" , s.getType());
                jsonObject2.put("sort" , s.getSort());
                jsonObject2.put("display" , s.getDisplay());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("roes" , jsonArray);
            jsonObject1.put("code" , "200");
            jsonObject1.put("msg" , "查询成功");
        } else {
            jsonObject1.put("code" , "500");
            jsonObject1.put("msg" , "查询失败");
        }
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
