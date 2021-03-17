package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetBusListDaoImpl;
import com.example.demo1.pojo.BusList;
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
 * @date 2021/3/17 16:00 星期三
 */

/**
 *  查询所有巴士
 */
@WebServlet(name = "getBusList" ,value = "/getBusList")
public class GetBusList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<BusList> busLists = new GetBusListDaoImpl().queryBusListDao();

        JSONObject jsonObject = new JSONObject();

        if (busLists != null){
            ServletUtils.isOk(jsonObject,true);
            jsonObject.put("total",busLists.size());
            JSONArray jsonArray = new JSONArray();
            for (BusList bus : busLists){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1,bus);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }else {
            jsonObject.put("code","500");
            jsonObject.put("msg","查询失败");
        }
        resp.getWriter().write(jsonObject.toString());
    }

    protected void myDoGet(JSONObject jsonObject1, BusList bus) {
        jsonObject1.put("id",bus.getId());
        jsonObject1.put("number",bus.getNumber());
        jsonObject1.put("name",bus.getName());
        jsonObject1.put("first",bus.getFirst());
        jsonObject1.put("end",bus.getEnd());
        jsonObject1.put("startTime",bus.getStartTime());
        jsonObject1.put("endTime",bus.getEndTime());
        jsonObject1.put("price",bus.getPrice());
        jsonObject1.put("mileage",bus.getMileage());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
