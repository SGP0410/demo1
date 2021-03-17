package com.example.demo1.servlet;

import com.example.demo1.dao.impl.BaseDao;
import com.example.demo1.dao.impl.ParkingDaoImpl;
import com.example.demo1.pojo.Parkinglists;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/16 17:48 星期二
 */

/**
 *  停车场 查询停车场列表
 */

@WebServlet (name = "parklotlist" ,value = "/parklotlist")
public class Parklotlist extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request,response);     //更改数据类型为utf-8

        List<Parkinglists> lists = new ParkingDaoImpl().queryParking();

        JSONObject jsonObject = new JSONObject();

        if (lists !=    null){
            jsonObject.put("total",lists.size()+"");
            jsonObject.put("msg","查询成功");
            jsonObject.put("code","200");

            JSONArray jsonArray = new JSONArray();
            for (Parkinglists list : lists){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1 , list);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }else {
            jsonObject.put("msg","查询失败");
            jsonObject.put("code","500");
        }
        response.getWriter().write(jsonObject.toString());
    }

    protected void myDoGet(JSONObject jsonObject1  , Parkinglists parkinglists){
        jsonObject1.put("id",parkinglists.getId());
        jsonObject1.put("parkName",parkinglists.getParkingName());
        jsonObject1.put("vacancy",parkinglists.getVacancy());
        jsonObject1.put("priceCaps",parkinglists.getPriceCaps());
        jsonObject1.put("imgUrl",parkinglists.getImgUrl());
        jsonObject1.put("rates",parkinglists.getRates());
        jsonObject1.put("address",parkinglists.getAddress());
        jsonObject1.put("distance",parkinglists.getDistance());
        jsonObject1.put("allPark",parkinglists.getAllPark());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
