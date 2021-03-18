package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/18 9:41
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
import java.util.*;

@WebServlet(name = "subwayStationRoute", value = "/subwayStationRoute")
public class SubwayStationRoute extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);

        SubwayDaoImpl subwayDao = new SubwayDaoImpl();
        List<SiteList> siteLists = subwayDao.querySiteListByName(jsonObject.optString("currentName"));
        List<SubwayDetails> subwayDetailsList = new ArrayList<>();
        for (SiteList s:siteLists) {
            subwayDetailsList.add(subwayDao.querySubwayDetailsByLineId(s.getLineId()));
        }

        JSONObject jsonObject1 =new JSONObject();
        if (siteLists != null && subwayDetailsList.size() != 0){
            ServletUtils.isOk(jsonObject1 , true);
            jsonObject1.put("total" , subwayDetailsList.size());
            JSONArray jsonArray = new JSONArray();
            for (SubwayDetails s:subwayDetailsList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("lineId" , s.getLineId());
                jsonObject2.put("lineName" , s.getLineName());
                jsonObject2.put("nextName" , s.getNextName());
                jsonObject2.put("reachTime" , getTime(jsonObject.optString("currentName") ,
                        s, subwayDao));
                jsonObject2.put("currentName" , jsonObject.optString("currentName"));
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("roes" , jsonArray);
        }else {
            ServletUtils.isOk(jsonObject1 , false);
        }
        response.getWriter().write(jsonObject1.toString());

    }

    private int getTime(String countName , SubwayDetails subwayDetails, SubwayDaoImpl subwayDao){
        List<SiteList> siteLists = subwayDao.querySiteListByLineId(subwayDetails.getLineId());
        Collections.sort(siteLists, new Comparator<SiteList>() {
            @Override
            public int compare(SiteList o1, SiteList o2) {
                return o1.getId() - o2.getId();
            }
        });
        int dis = 0;
        for (SiteList s:siteLists) {
            if (subwayDetails.getNextName().equals(s.getName())){
                dis+=s.getDistance();
            }else if (dis != 0 && !s.getName().equals(countName)){
                dis+=s.getDistance();
            }else if (s.getName().equals(countName)){
                dis+=s.getDistance();
                break;
            }
        }
        return dis / subwayDetails.getSpeed();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
