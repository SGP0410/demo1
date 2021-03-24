package com.example.demo1.servlet;

import com.example.demo1.dao.impl.ParkingDaoImpl;
import com.example.demo1.pojo.Parkinglists;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/3/16 20:41 星期二
 *
/**
 * 通过id查询停车场详情
 *   {"id":"1"}
 */
@WebServlet(name = "parklotid" ,value = "/parklotid")
public class Parklotid extends Parklotlist {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req, resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        Parkinglists parkinglists = new ParkingDaoImpl().queryParkingById(jsonObject.getInt("id"));
        JSONObject jsonObject1 = new JSONObject();
        if (parkinglists != null){
            jsonObject1.put("msg","查询成功");
            jsonObject1.put("code","200");
            myDoGet(jsonObject1 , parkinglists, request);
        }else {
            jsonObject1.put("msg","查询失败");
            jsonObject1.put("code","500");
        }
        resp.getWriter().write(jsonObject1.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
