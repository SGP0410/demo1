package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/17 16:40
 */

import com.example.demo1.dao.impl.ServiceDaoImpl;
import com.example.demo1.pojo.Service;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getServiceAll", value = "/getServiceAll")
public class GetServiceAll extends GetServiceByIsRecommend {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        List<Service> serviceList = new ServiceDaoImpl().queryService();
        JSONObject jsonObject = new JSONObject();
        myDoGet(jsonObject , serviceList , request);
        response.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
