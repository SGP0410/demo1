package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetHospitalReservationDaoImpl;
import com.example.demo1.pojo.HospitalDepartments;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/3/18 20:01 星期四
 */

/**
 * 提交预约
 *  {"patientName":"王五","divisionId":"胸外科","typesId":"1","moeny":"8","startime":"2021-3-11","userId":"3"}
 */
@WebServlet(name = "sethospitalreservation" ,value = "/sethospitalreservation")
public class SetHospitalReservation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        /**
         * patientName
         * divisionId
         * typesId
         * moeny
         * startime
         * userId
         */
        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        int a = new GetHospitalReservationDaoImpl().HospitalReservation(jsonObject.getString("patientName"),
                jsonObject.getString("divisionId"),jsonObject.getString("typesId"),jsonObject.getString("moeny"),
                jsonObject.getString("startime"),jsonObject.getString("userId"));

        if (a == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

}
