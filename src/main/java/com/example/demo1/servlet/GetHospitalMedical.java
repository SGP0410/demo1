package com.example.demo1.servlet;

/**
 * @author 关鑫
 * @date 2021/3/18 10:25 星期四
 */

import com.example.demo1.dao.impl.GetHospitalMedicalDaoImpl;
import com.example.demo1.pojo.HospitalMedical;
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
 * 通过用户id查询就诊人信息
 */

@WebServlet(name = "gethospitalmedical" ,value = "/gethospitalmedical")
public class GetHospitalMedical extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        List<HospitalMedical> medicals = new GetHospitalMedicalDaoImpl()
                .queryHospitalMedicalDaoid(jsonObject.getInt("userId"));

        JSONObject jsonObject1 = new JSONObject();
        if (medicals != null){
            ServletUtils.isOk(jsonObject1,true);
            jsonObject1.put("total",medicals.size());
            JSONArray jsonArray = new JSONArray();
            for (HospitalMedical medical : medicals){
                JSONObject jsonObject2 = new JSONObject();
                myDoGet(jsonObject2,medical);
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }

    protected void myDoGet(JSONObject jsonObject1, HospitalMedical medical){
        /**
         * id
         * name
         * cardId
         * tel
         * sex
         * birthday
         * adders
         * userId
         */
        jsonObject1.put("id",medical.getId());
        jsonObject1.put("name",medical.getName());
        jsonObject1.put("cardId",medical.getCardId());
        jsonObject1.put("tel",medical.getSex());
        jsonObject1.put("sex",medical.getBirthday());
        jsonObject1.put("birthday",medical.getBirthday());
        jsonObject1.put("adders",medical.getAdders());
        jsonObject1.put("userId",medical.getUserIdl());

    }
}
