package com.lenovo.feizai;

import com.lenovo.feizai.util.TimeUtil;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String s = null;
            System.out.println(TimeUtil.timestampToString(TimeUtil.getTimestamp(),TimeUtil.LONG_DATEFORMAT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
