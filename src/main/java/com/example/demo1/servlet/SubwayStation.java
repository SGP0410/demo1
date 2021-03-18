package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/18 11:18
 */

import com.example.demo1.dao.impl.SubwayDaoImpl;
import com.example.demo1.pojo.SiteList;
import com.example.demo1.pojo.SubwayDetails;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "subwayStation", value = "/subwayStation")
public class SubwayStation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        SubwayDaoImpl subwayDao = new SubwayDaoImpl();
        SubwayDetails subwayDetails = subwayDao.querySubwayDetailsByLineId(jsonObject.getInt("lineId"));
        List<SiteList> siteLists = subwayDao.querySiteListByLineId(jsonObject.getInt("lineId"));

        JSONObject jsonObject1 = new JSONObject();
        if (subwayDetails != null && siteLists != null){
            ServletUtils.isOk(jsonObject1 , true);
            jsonObject1.put("lineName" , subwayDetails.getLineName());
            JSONArray jsonArray = new JSONArray();
            for (SiteList s:siteLists) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("id" , s.getId());
                jsonObject2.put("name" , s.getName());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("metroStepsList" , jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1 , false);
        }
        response.getWriter().write(jsonObject1.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
