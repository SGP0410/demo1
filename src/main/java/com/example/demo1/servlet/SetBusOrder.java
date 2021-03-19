package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetBusOrderDaoImpl;
import com.example.demo1.pojo.BusOrder;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/3/18 15:42 星期四
 */

/**
 * {"start":"泰德大厦","end":"大连北站","userName":"张三","userTel":"12345611","price":"8","path":"一号线","status":"1","userId":"1"}
 */
@WebServlet(name = "setbusorder",value = "/setbusorder")
public class SetBusOrder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        BusOrder order = new BusOrder();
        order.setStart(jsonObject.getString("start"));
        order.setEnd(jsonObject.getString("end"));
        order.setUserName(jsonObject.getString("userName"));
        order.setUserTel(jsonObject.getString("userTel"));
        order.setPrice(jsonObject.getString("price"));
        order.setPath(jsonObject.getString("path"));
        order.setStatus(jsonObject.getString("status"));
        order.setUserId(jsonObject.getString("userId"));

        int a = new GetBusOrderDaoImpl().setBusOrderDao(order);

        if (a==1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            jsonObject = new JSONObject();
            ServletUtils.isOk(jsonObject,false);
        }

        resp.getWriter().write(jsonObject.toString());


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

}
