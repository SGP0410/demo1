package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetHospitalReservationDaoImpl;
import com.example.demo1.pojo.HospitalReservation;
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
 * @date 2021/3/18 20:46 星期四
 */

/**
 * 医院
 * 通过userid查询预约信息
 * {"userid":"1"}
 */
@WebServlet(name = "gethospitalreservationuser",value = "/gethospitalreservationuser")
public class GetHospitalReservationUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        List<HospitalReservation> hosp = new GetHospitalReservationDaoImpl().queryHospitalUserid(jsonObject.getString("userid"));
        JSONObject jsonObject1 = new JSONObject();

        if (hosp != null){
            ServletUtils.isOk(jsonObject1,true);

            JSONArray jsonArray = new JSONArray();
            for (HospitalReservation ho : hosp){
                JSONObject jsonObject2 = new JSONObject();
                myDoGet(jsonObject2,ho);
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows",jsonArray);

        }else {
            ServletUtils.isOk(jsonObject1,false);
        }

        resp.getWriter().write(jsonObject1.toString());

    }
    protected void myDoGet(JSONObject jsonObject2, HospitalReservation ho){
        /**
         * id
         * patientName
         * divisionId
         * typesId
         * moeny
         * startime
         * userId
         */
        jsonObject2.put("id",ho.getId());
        jsonObject2.put("patientName",ho.getPatientName());
        jsonObject2.put("divisionId",ho.getDivisionId());
        jsonObject2.put("typesId",ho.getTypesId());
        jsonObject2.put("moeny",ho.getMoeny());
        jsonObject2.put("startime",ho.getStartime());
        jsonObject2.put("userId",ho.getUserId());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
