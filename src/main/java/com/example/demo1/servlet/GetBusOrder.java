package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetBusOrderDaoImpl;
import com.example.demo1.pojo.BusOrder;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/17 21:18 星期三
 */

/**
 * 查询所有定制班车的订单信息
 */

@WebServlet(name = "getbusOrder" ,value = "/getbusOrder")
public class GetBusOrder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<BusOrder> busOrders = new GetBusOrderDaoImpl().queryBusOrderDao();

        JSONObject jsonObject = new JSONObject();
        if (busOrders != null){
            ServletUtils.isOk(jsonObject,true);
            jsonObject.put("total",busOrders.size()+"");
            JSONArray jsonArray = new JSONArray();
            for (BusOrder bus : busOrders){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1,bus);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        } else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }

    protected void myDoGet(JSONObject jsonObject1, BusOrder bus){
        jsonObject1.put("id",bus.getId());
        jsonObject1.put("status",bus.getStatus());
        jsonObject1.put("end",bus.getEnd());
        jsonObject1.put("username",bus.getUserName());
        jsonObject1.put("userTel",bus.getUserTel());
        jsonObject1.put("price",bus.getPrice());
        jsonObject1.put("path",bus.getPath());
        jsonObject1.put("start",bus.getStart());
        jsonObject1.put("userid",bus.getUserId());
    }

}
