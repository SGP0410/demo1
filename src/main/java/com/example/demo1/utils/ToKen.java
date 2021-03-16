package com.example.demo1.utils;

import java.util.Random;

public class ToKen {
    public static String toKen = null;
    public static String charStr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTYVWXUZ";

    public static String getToKen(){
        return toKen;
    }

    public static void createToken(){
        StringBuffer valSb = new StringBuffer();
        Random random = new Random();
        int length = random.nextInt(35)+15;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charStr.length());
            valSb.append(charStr.charAt(index));
        }
        toKen = valSb.toString();
    }
}
