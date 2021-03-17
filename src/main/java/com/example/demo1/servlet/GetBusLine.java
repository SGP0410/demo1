package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetBusLineDaoImpl;
import com.example.demo1.dao.impl.GetBusListDaoImpl;
import com.example.demo1.pojo.BusLine;
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
 * @date 2021/3/17 20:05 星期三
 */

/**  通过巴士编号获取路线
 *   {"number":"2"}
 */
@WebServlet(name = "getbusline",value = "/getbusline")
public class GetBusLine extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        List<BusLine> busLine = new GetBusLineDaoImpl().queryBusListDao(jsonObject.getInt("number"));

        JSONObject jsonObject1 = new JSONObject();
        if (busLine != null){
            ServletUtils.isOk(jsonObject1,true);

            JSONArray jsonArray = new JSONArray();
            for (BusLine busLine1 : busLine){
                JSONObject jsonObject2 = new JSONObject();
                myDoDet(jsonObject2,busLine1);
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows",jsonArray);

        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }
    protected void myDoDet(JSONObject jsonObject1, BusLine busLine){
        jsonObject1.put("id",busLine.getId());
        jsonObject1.put("number",busLine.getNumber());
        jsonObject1.put("stepsId",busLine.getStepsId());
        jsonObject1.put("name",busLine.getName());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
