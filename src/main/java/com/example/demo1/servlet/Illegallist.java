package com.example.demo1.servlet;

import com.example.demo1.dao.impl.IllegalDaoImpl;
import com.example.demo1.pojo.Illegal;
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
 * @date 2021/3/17 8:26 星期三
/**
 *   违章查询    通过车牌 发动机号 车型查询违章记录
 *   {"licencePlate":"鲁123","engineNumber":"1234","catType":"小型汽车"}
 */
@WebServlet(name = "illegal", value = "/illegal")
public class Illegallist extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        List<Illegal> illegal = new IllegalDaoImpl().queryIllegalcph_fdj_type(jsonObject.getString("licencePlate"),
                jsonObject.getInt("engineNumber"),jsonObject.getString("catType"));

        JSONObject jsonObject1 = new JSONObject();

        if (illegal != null){
            jsonObject1.put("total",illegal.size()+"");
            jsonObject1.put("code","200");
            jsonObject1.put("msg","查询成功");
            JSONArray jsonArray = new JSONArray();
            for (Illegal ill : illegal){
                JSONObject jsonObject2 = new JSONObject();
                myDoGet(jsonObject2,ill);
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows",jsonArray);
        }else {
            jsonObject1.put("msg","查询失败");
            jsonObject1.put("code","200");
        }
        resp.getWriter().write(jsonObject1.toString());

    }

    protected void myDoGet(JSONObject jsonObject2 ,Illegal ill){
        jsonObject2.put("id",ill.getId());
        jsonObject2.put("licencePlate",ill.getLicencePlate());
        jsonObject2.put("disposeState",ill.getDisposeState());
        jsonObject2.put("badTime",ill.getBadTime());
        jsonObject2.put("money",ill.getMoney());
        jsonObject2.put("deductMarks",ill.getDeductMarks());
        jsonObject2.put("illegalSites",ill.getIllegalSites());
        jsonObject2.put("noticeNo",ill.getNoticeNo());
        jsonObject2.put("engineNumber",ill.getEngineNumber());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
