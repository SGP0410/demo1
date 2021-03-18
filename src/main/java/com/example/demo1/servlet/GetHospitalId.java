package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetHospitalDaoImpl;
import com.example.demo1.dao.impl.GetHospitalListDaoImpl;
import com.example.demo1.pojo.HospitalList;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 关鑫
 * @date 2021/3/18 9:32 星期四
 */

/**
 * 根据id查询医院详情
 */
@WebServlet(name = "gethospitalId", value = "/gethospitalId")
public class GetHospitalId extends GetHospitalList {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        HospitalList list = new GetHospitalListDaoImpl().queryHospital(jsonObject.getInt("hospitalId"));
        JSONObject jsonObject1 = new JSONObject();
        if (list != null){
            ServletUtils.isOk(jsonObject1,true);
            myDoGet(jsonObject1,list);
        }else {
            ServletUtils.isOk(jsonObject1,false);
        }
        resp.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
