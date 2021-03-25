package com.example.demo1.servlet;

import com.example.demo1.dao.impl.HospitalDepartmentsDaoImpl;
import com.example.demo1.pojo.Doctor;
import com.example.demo1.pojo.HospitalDepartments;
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
 * @date 2021/3/25 8:58 星期四
 */

@WebServlet(name = "getdoctor",value = "/getdoctor")
public class GetHospitaIddoctor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<Doctor> doctors =new HospitalDepartmentsDaoImpl().queryDoctor();


        JSONObject jsonObject = new JSONObject();
        if (doctors != null){
            ServletUtils.isOk(jsonObject,true);
            jsonObject.put("total",doctors.size());
            JSONArray jsonArray = new JSONArray();
            for (Doctor lists : doctors){
                JSONObject jsonObject1 = new JSONObject();
                myDoGet(jsonObject1,lists);
                jsonArray.put(jsonObject1);
            }
            jsonObject.put("rows",jsonArray);
        }else {
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());

    }

    protected void myDoGet(JSONObject jsonObject1, Doctor lists){
        jsonObject1.put("id",lists.getId());
        jsonObject1.put("deptId",lists.getDeptId());
        jsonObject1.put("doctor",lists.getDoctorName());
        jsonObject1.put("HospitalId",lists.getHospitalId());
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
