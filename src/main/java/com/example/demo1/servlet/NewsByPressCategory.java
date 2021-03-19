package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/17 8:42
 */

import com.example.demo1.dao.impl.NewsDaoImpl;
import com.example.demo1.pojo.News;
import com.example.demo1.pojo.NewsCategory;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getNewsByPressCategory", value = "/getNewsByPressCategory")
public class NewsByPressCategory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        String pressCategory = jsonObject.optString("pressCategory");

        NewsDaoImpl newsDao = new NewsDaoImpl();
        List<News> newsList = newsDao.queryNewsByPressCategory(pressCategory);
        myDoGet(request , response , newsList , newsDao);
    }

    protected void myDoGet(HttpServletRequest request, HttpServletResponse response , List<News> newsList , NewsDaoImpl newsDao){
        JSONObject jsonObject1 = new JSONObject();
        if (newsList != null){
            jsonObject1.put("total" , newsList.size());
            JSONArray jsonArray = new JSONArray();
            for (News n:newsList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("createTime" , n.getCreateTime());
                jsonObject2.put("updateTime" , n.getUpdateTime());
                jsonObject2.put("id" , n.getId());
                jsonObject2.put("title" , n.getTitle());
                jsonObject2.put("content" , n.getContent());
                jsonObject2.put("imgUrl" , ServletUtils.getImageUrl(request , n.getImgUrl()));
                if (n.getPressCategory() == null || n.getPressCategory().equals("")){
                    jsonObject2.put("pressCategory" , "");
                }else {
                    jsonObject2.put("pressCategory" , newsDao
                            .queryNewsCategoryByPressCategory(n.getPressCategory()).getCategoryName());
                }
                jsonObject2.put("isRecommend" , n.getIsRecommend());
                jsonObject2.put("likeNumber" , n.getLikeNumber());
                jsonObject2.put("viewsNumber" , n.getViewsNumber());
                jsonObject2.put("userId" , n.getUserId());
                jsonObject2.put("pressStatus" , n.getPressStatus());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows" , jsonArray);
            ServletUtils.isOk(jsonObject1 , true);
        }else {
            ServletUtils.isOk(jsonObject1 , false);
        }
        try {
            response.getWriter().write(jsonObject1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
