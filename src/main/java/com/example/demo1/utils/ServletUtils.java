package com.example.demo1.utils;


import org.json.JSONObject;

import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;

public class ServletUtils {

    /**
     * 设置字符集并接受数据
     * @param request
     * @param response
     * @return 以JSONObject格式返回接收到的数据
     */
    public static void Setting(HttpServletRequest request, HttpServletResponse response){

        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            request.setCharacterEncoding("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取接收的数据
     * @param request
     * @return 返回JSONObject
     */
    public static JSONObject getJSONObject(HttpServletRequest request){
        BufferedReader reader = null;
        try {
            //解析接收的数据
            reader = request.getReader();
            String json = reader.readLine();
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 获取图片的访问地址
     * @param request
     * @return 返回图片的访问地址
     */
    public static String getImageUrl(HttpServletRequest request){
        return null;
    }


}
