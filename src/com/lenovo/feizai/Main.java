package com.lenovo.feizai;

import com.lenovo.feizai.util.TextUtil;
import com.lenovo.feizai.util.TimeUtil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String s = null;
            System.out.println(TextUtil.equals(s,null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
