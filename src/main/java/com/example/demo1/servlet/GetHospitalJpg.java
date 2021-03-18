package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetHospitalDaoImpl;
import com.example.demo1.pojo.HospitalJpg;
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
 * @date 2021/3/18 8:20 星期四
 */

/**
 * 通过医院编号查询医院轮播图
 * {"hospitalId":"1"}
 */
@WebServlet(name = "gethospitaljpg" , value = "/gethospitaljpg")
public class GetHospitalJpg extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);


        JSONObject jsonObject2 = ServletUtils.getJSONObject(req);
        List<HospitalJpg> hospitalJpgs = new GetHospitalDaoImpl().queryHospitalList(jsonObject2.getInt("hospitalId"));

        JSONObject jsonObject = new JSONObject();
        if (hospitalJpgs!=null){
            ServletUtils.isOk(jsonObject,true);
            jsonObject.put("rotal",hospitalJpgs.size());
            JSONArray jsonArray = new JSONArray();
            for (HospitalJpg jpg : hospitalJpgs){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1,jpg);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }

    protected void myDoGet(JSONObject jsonObject, HospitalJpg jpg){
        jsonObject.put("imgUrl",jpg.getImgUrl());
        jsonObject.put("hospitalId",jpg.getHospitalId());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
