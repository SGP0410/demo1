package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/17 20:32
 */

import com.example.demo1.dao.impl.ServiceDaoImpl;
import com.example.demo1.pojo.ServiceType;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getServiceType", value = "/getServiceType")
public class getServiceType extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        List<ServiceType> serviceTypes = new ServiceDaoImpl().queryServiceType();

        JSONObject jsonObject = new JSONObject();
        if (serviceTypes != null){
            ServletUtils.isOk(jsonObject , true);
            JSONArray jsonArray = new JSONArray();
            for (ServiceType s:serviceTypes) {
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("serviceType" , s.getServiceType());
                jsonObject1.put("dictValue" , s.getDictValue());
                jsonObject1.put("dictLabel" , s.getDictLabel());
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
