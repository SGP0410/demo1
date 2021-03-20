package com.example.demo1.servlet;

import com.example.demo1.dao.impl.HospitalDepartmentsDaoImpl;
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
 * @date 2021/3/18 17:04 星期四
 */

/**
 *  获取所有科室信息
 */
@WebServlet(name = "gethospitaldepartments" ,value = "/gethospitaldepartments")
public class GetHospitalDepartments extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        List<HospitalDepartments> list = new HospitalDepartmentsDaoImpl().queryHospitalDepartments();

        JSONObject jsonObject = new JSONObject();
        if (list != null){
            ServletUtils.isOk(jsonObject,true);
            jsonObject.put("total",list.size());
            JSONArray jsonArray = new JSONArray();
            for (HospitalDepartments lists : list){
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

    protected void myDoGet(JSONObject jsonObject1, HospitalDepartments lists){
        jsonObject1.put("id",lists.getId());
        jsonObject1.put("did",lists.getDid());
        jsonObject1.put("categoryName",lists.getCategoryName());
        jsonObject1.put("money",lists.getMoney());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
