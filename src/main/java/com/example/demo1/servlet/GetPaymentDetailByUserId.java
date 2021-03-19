package com.example.demo1.servlet; /**
 * @author 孙国鹏
 * @date 2021/3/19 11:30
 */

import com.example.demo1.dao.impl.PaymentDaoImpl;
import com.example.demo1.pojo.PaymentDetail;
import com.example.demo1.utils.ServletUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "getPaymentDetailByUserId", value = "/getPaymentDetailByUserIdAndClassifyId")
public class GetPaymentDetailByUserId extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletUtils.Setting(request, response);
        JSONObject jsonObject = ServletUtils.getJSONObject(request);
        PaymentDaoImpl paymentDao = new PaymentDaoImpl();
        List<PaymentDetail> paymentDetailList = paymentDao
                .queryPaymentDetailByUserIdAndClassifyId(jsonObject.optInt("userId") ,
                        paymentDao.queryCostTypeByName(jsonObject.optString("classifyId")).getClassifyId());
        JSONObject jsonObject1 = new JSONObject();
        if (paymentDetailList != null){
            ServletUtils.isOk(jsonObject1 , true);
            jsonObject1.put("total" , paymentDetailList.size());
            JSONArray jsonArray = new JSONArray();
            for (PaymentDetail p:paymentDetailList) {
                JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("chargeUnit" , p.getChargeUnit());
                jsonObject2.put("typeName" , paymentDao.queryGroupByTypeName(p.getTypeName()).getName());
                jsonObject2.put("doorNo" , p.getDoorNo());
                jsonObject2.put("userId" , p.getUserId());
                jsonObject2.put("classifyId" , paymentDao.queryCostTypeByClassifyId(p.getClassifyId()).getName());
                jsonObject2.put("balance" , p.getBalance());
                jsonObject2.put("electricityMoney" , p.getElectricityMoney());
                jsonArray.put(jsonObject2);
            }
            jsonObject1.put("rows" , jsonArray);
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
