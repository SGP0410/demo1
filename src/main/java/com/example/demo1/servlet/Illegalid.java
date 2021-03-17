package com.example.demo1.servlet;

import com.example.demo1.dao.impl.IllegalDaoImpl;
import com.example.demo1.pojo.Illegal;
import com.example.demo1.utils.ServletUtils;
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
 * @date 2021/3/17 11:04 星期三
 */
/**
 * 违章查询 通过违章id 查询违章信息
 *      {"id":"1"}
 */
@WebServlet( name =  "getIllegalid",value = "/getIllegalid")
public class Illegalid extends Illegallist {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.Setting(req,resp);

        JSONObject jsonObject = ServletUtils.getJSONObject(req);
        Illegal illegals = new IllegalDaoImpl().queryIllegalid(jsonObject.getInt("id"));
        JSONObject jsonObject1 = new JSONObject();

        if (illegals != null){
            jsonObject1.put("msg","查询成功");
            jsonObject1.put("code","200");
            myDoGet(jsonObject1,illegals);
        }else {
            jsonObject1.put("msg","查询失败");
            jsonObject1.put("code","500");
        }

        resp.getWriter().write(jsonObject1.toString());




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
