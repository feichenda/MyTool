package com.lenovo.feizai.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author feizai
 * @date 2021/5/29 0029 上午 9:39:00
 * @annotation
 */
public class TimeUtil {

    public final static String DATEFORMAT = "yyyy-MM-dd";
    public final static String DATEFORMAT1 = "HH:mm";
    public final static String TIMEORMAT = "HH:mm:ss";
    public final static String DATEFORMAT2 = "HH:mm:ss.s";
    public final static String DATEFORMAT3 = "HH:mm:ss.ss";
    public final static String DATEFORMAT4 = "HH:mm:ss.sss";
    public final static String DATEFORMAT5 = "yyyy-MM-dd HH:mm";
    public final static String DATEFORMAT6 = "yyyy-MM-dd HH:mm:ss";
    public final static String DATEFORMAT7 = "yyyy-MM-dd HH:mm:ss.s";
    public final static String DATEFORMAT8 = "yyyy-MM-dd HH:mm:ss.s";
    public final static String DATEFORMAT9 = "yyyy-MM-dd HH:mm:ss.sss";

    /**
     * 获取当前时间
     * @return Date
     */
    public static Date getDate() {
        return new Date();
    }
    /**
     * 获取当前时间戳
     * @return Timestamp
     */
    public static Timestamp getTimestamp() {
        return dateToTimestamp(getDate());
    }

    /**
     * Date转Timestamp
     * @param date
     * @return Timestamp
     */
    public static Timestamp dateToTimestamp(Date date) {
        return new Timestamp(date.getTime());
    }

    /**
     * Timestamp转Date
     * @param timestamp
     * @return Date
     */
    public static Date timestampToDate(Timestamp timestamp) {
        return new Date(timestamp.getTime());
    }

    /**
     * Timestamp转字符串
     * @param timestamp
     * @param dateformat
     * @return
     */
    public static String timestampToString(Timestamp timestamp,String dateformat) {
        SimpleDateFormat format = new SimpleDateFormat(dateformat);
        return format.format(timestamp.getTime());
    }

    /**
     * 字符串转Date
     * @param dateString
     * @param dateformat
     * @return
     * @throws ParseException
     */
    public static Date stringToDate(String dateString,String dateformat) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(dateformat);
        return format.parse(dateString);
    }

    /**
     * 字符串转Timestamp
     * @param dateString
     * @param dateformat
     * @return
     * @throws Exception
     */
    public static Timestamp stringToTimestamp(String dateString,String dateformat) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat(dateformat);
        Date date = format.parse(dateString);
        return dateToTimestamp(date);
    }

    /**
     * 获取当前年份
     * @return
     */
    public static String getYear() {
        return String.format("%tY", getDate());
    }

    /**
     * 获取当前月份
     * @return
     */
    public static String getMouth() {
        return String.format("%tm", getDate());
    }

    /**
     * 获取当前天数
     * @return
     */
    public static String getDay() {
        return String.format("%td", getDate());
    }

    /**
     * 获取当前小时数
     * @return
     */
    public static String getHour() {
        return String.format("%tH", getDate());
    }

    /**
     * 获取当前分数
     * @return
     */
    public static String getMinute() {
        return String.format("%tM", getDate());
    }

    /**
     * 获取当前秒数
     * @return
     */
    public static String getSecond() {
        return String.format("%tS", getDate());
    }

    /**
     * 获取当前时区
     * @return
     */
    public static String getTimeZone() {
        return TimeZone.getDefault().getID();
    }

}
