package com.example.demo1.servlet;

/**
 * @author 关鑫
 * @date 2021/3/18 9:00 星期四
 */

import com.example.demo1.dao.impl.GetHospitalListDaoImpl;
import com.example.demo1.pojo.HospitalList;
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
 * 查询所有医院信息
 */

@WebServlet(name = "gethospitallist" , value = "/gethospitallist")
public class GetHospitalList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<HospitalList> hospitalLists = new GetHospitalListDaoImpl().queryHospitalList();

        JSONObject jsonObject = new JSONObject();
        if (hospitalLists != null){
            ServletUtils.isOk(jsonObject,true);
            ServletUtils.Setting(req,resp);
            jsonObject.put("rotal",hospitalLists.size());
            JSONArray jsonArray = new JSONArray();
            for (HospitalList list : hospitalLists){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1,list,req);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());
    }

    protected void myDoGet(JSONObject jsonObject1, HospitalList list, HttpServletRequest req){
        /**
         * id
         * hospitalId
         * hospitalName
         * brief
         * level
         * imgUrl
         */
        jsonObject1.put("id",list.getId());
        jsonObject1.put("hospitalId",list.getHospitalId());
        jsonObject1.put("hospitalName",list.getHospitalName());
        jsonObject1.put("brief",list.getBrief());
        jsonObject1.put("level",list.getLevel());
        jsonObject1.put("imgUrl",ServletUtils.getImageUrl(req,list.getImgUrl()));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
