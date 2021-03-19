package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/19 9:22
 */

import com.example.demo1.dao.impl.OrderDaoImpl;
import com.example.demo1.pojo.OrderDetails;
import com.example.demo1.pojo.OrderForm;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getOrderDetails", value = "/getOrderDetails")
public class GetOrderDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        OrderDaoImpl orderDao = new OrderDaoImpl();
        OrderForm orderForm = orderDao.queryOrderFormById(jsonObject.optInt("id"));
        List<OrderDetails> orderDetailsList = orderDao.queryOrderDetailsByOrderType(orderForm.getOrderType());
        JSONObject jsonObject1 = new JSONObject();
        if (orderForm != null && orderDetailsList != null){
            ServletUtils.isOk(jsonObject1 , true);
            JSONArray jsonArray = new JSONArray();
            for (OrderDetails o:orderDetailsList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("id" , o.getId());
                jsonObject2.put("commodityName" , o.getCommodityName());
                jsonObject2.put("commodityPrice" , o.getCommodityPrice());
                jsonObject2.put("commodityNumber" , o.getCommodityNumber());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("data" , jsonArray);
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
