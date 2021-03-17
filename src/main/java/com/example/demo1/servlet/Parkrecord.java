package com.example.demo1.servlet;

import com.example.demo1.dao.impl.Parkrecord_Base;
import com.example.demo1.pojo.Parkrecordlist;
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
 * @date 2021/3/16 20:57 星期二
 */

@WebServlet( name = "parkrecord" ,value = "/parkrecord")
public class Parkrecord extends HttpServlet {           //停车场   查询所有停车记录

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<Parkrecordlist> list = new Parkrecord_Base().queryParkre();

        JSONObject jsonObject = new JSONObject();

        JSONArray jsonArray = new JSONArray();
        if (list != null){
            jsonObject.put("total",list.size());
            jsonObject.put("msg","查询成功");
            jsonObject.put("code","200");
            for (Parkrecordlist lists : list){
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("id",lists.getId());
                jsonObject1.put("entryTime",lists.getEntryTime());
                jsonObject1.put("outTime",lists.getOutTime());
                jsonObject1.put("plateNumber",lists.getPlateNumber());
                jsonObject1.put("monetary",lists.getMonetary());
                jsonObject1.put("parkName",lists.getParkName());
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }else {
            jsonObject.put("msg","查询失败");
            jsonObject.put("code","500");
        }

        resp.getWriter().write(jsonObject.toString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
