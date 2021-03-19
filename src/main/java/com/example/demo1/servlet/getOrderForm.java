package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/19 8:33
 */

import com.example.demo1.dao.impl.OrderDaoImpl;
import com.example.demo1.pojo.OrderForm;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getOrderForm", value = "/getOrderForm")
public class getOrderForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);

        OrderDaoImpl orderDao = new OrderDaoImpl();
        List<OrderForm> orderFormList = orderDao.queryOrderFormAll();

        JSONObject jsonObject = new JSONObject();
        if (orderFormList != null){
            jsonObject.put("total" , orderFormList.size());
            JSONArray jsonArray = new JSONArray();
            for (OrderForm o:orderFormList) {
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("id" , o.getId());
                jsonObject1.put("orderNum" , o.getOrderNum());
                jsonObject1.put("orderType" , orderDao.queryOrderTypeNameByOrderType(o.getOrderType()).getName());
                jsonObject1.put("orderStatus" , orderDao.queryOrderStatusNameByOrderStatus(o.getOrderStatus()).getName());
                jsonObject1.put("shopName" , o.getShopName());
                jsonObject1.put("orderTime" , o.getOrderTime());
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows" , jsonArray);
            ServletUtils.isOk(jsonObject , true);
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
