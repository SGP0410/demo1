package com.example.demo1.servlet;

import com.example.demo1.dao.impl.GetHospitalMedicalDaoImpl;
import com.example.demo1.pojo.HospitalMedical;
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
 * @date 2021/3/18 11:16 星期四
 */

/**
 * 新增就诊人卡片
 * {"name":"张五","cardId":"392819872918291","tel":"13829182381","sex":"0","birthday":"2021-3-18","adders":"山东省德州路","userId":"1"}
 */

@WebServlet(name = "sethospitalmedical",value = "/sethospitalmedical")
public class SetHospitalMedical extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);
        JSONObject jsonObject = ServletUtils.getJSONObject(req);

        /**
         * id	int
         * name	varchar
         * cardId	varchar
         * tel	varchar
         * sex	int
         * birthday	varchar
         * adders	varchar
         * userId	int
         */

        HospitalMedical cla = new HospitalMedical();
        cla.setName(jsonObject.getString("name"));
        cla.setCardId(jsonObject.getString("cardId"));
        cla.setTel(jsonObject.getString("tel"));
        cla.setSex(jsonObject.getString("sex"));
        cla.setBirthday(jsonObject.getString("birthday"));
        cla.setAdders(jsonObject.getString("adders"));
        cla.setUserId(jsonObject.getString("userId"));
        int c = new GetHospitalMedicalDaoImpl().querHospitalMedicalDaoset(cla);
        if (c == 1){
            ServletUtils.isOk(jsonObject,true);
        }else {
            jsonObject = new JSONObject();
            ServletUtils.isOk(jsonObject,false);
        }
        resp.getWriter().write(jsonObject.toString());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);
    }


}
