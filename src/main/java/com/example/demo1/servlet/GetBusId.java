package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetBusListDaoImpl;
import com.example.demo1.pojo.BusList;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/3/17 16:51 星期三
 */

/**
 * 通过id获取巴士的基本信息
 * {"number":"1"}
 */
@WebServlet(name = "getbusid",value = "/getbusid")
public class GetBusId extends GetBusList{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        BusList bus = new GetBusListDaoImpl().queryBusid(jsonObject.getInt("number"));

        JSONObject jsonObject1 = new JSONObject();

        if (bus != null){
            ServletUtils.isOk(jsonObject1,true);
            myDoGet(jsonObject1,bus);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
