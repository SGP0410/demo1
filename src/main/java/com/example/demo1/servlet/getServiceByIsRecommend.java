package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/16 17:43
 */

import com.example.demo1.dao.impl.ServiceDaoImpl;
import com.example.demo1.pojo.Service;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * 获取推荐服务，从service表中获取数据
 */
@WebServlet(name = "getServiceByIsRecommend", value = "/getServiceByIsRecommend")
public class getServiceByIsRecommend extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        List<Service> serviceList = new ServiceDaoImpl().queryRecommendService();

        JSONObject jsonObject1 = new JSONObject();
        if (serviceList != null){
            jsonObject1.put("total" , serviceList.size());
            JSONArray jsonArray = new JSONArray();
            for (Service s:serviceList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("createTime" , s.getCreateTime());
                jsonObject2.put("updateTime" , s.getUpdateTime());
                jsonObject2.put("id" , s.getId());
                jsonObject2.put("serviceName" , s.getServiceName());
                jsonObject2.put("serviceType" , s.getServiceType());
                jsonObject2.put("imgUrl" , ServletUtils.getImageUrl(request , s.getImgUrl()));
                jsonObject2.put("isRecommend" , s.getIsRecommend());
                jsonObject2.put("link" , s.getLink());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows" , jsonArray);
            jsonObject1.put("code" , 200);
            jsonObject1.put("msg" , "查询成功");
        }else {
            jsonObject1.put("code" , 500);
            jsonObject1.put("msg" , "查询失败");
        }
        response.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
