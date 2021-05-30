# MyTool

#### 介绍

这是工具类

#### 安装教程

1. 直接复制工具类到您的目录就可以使用了

#### 使用说明

1. TimeUtil.java

```text
    getYear                 : 获取当前年份  
    getMouth                : 获取当前月份  
    getDay                  : 获取当前天数  
    getHour                 : 获取当前小时数  
    getMinute               : 获取当前分钟数  
    getSecond               : 获取当前秒数  
    getSafeDateFormat       : 获取安全的日期格式  
    millis2String           : 将时间戳转为时间字符串  
    string2Millis           : 将时间字符串转为时间戳  
    string2Date             : 将时间字符串转为 Date 类型  
    date2String             : 将 Date 类型转为时间字符串  
    date2Millis             : 将 Date 类型转为时间戳  
    millis2Date             : 将时间戳转为 Date 类型  
    getTimeSpan             : 获取两个时间差（单位：unit）  
    getFitTimeSpan          : 获取合适型两个时间差  
    getNowMills             : 获取当前毫秒时间戳  
    getNowString            : 获取当前时间字符串  
    getNowDate              : 获取当前 Date  
    getTimeSpanByNow        : 获取与当前时间的差（单位：unit）  
    getFitTimeSpanByNow     : 获取合适型与当前时间的差  
    getFriendlyTimeSpanByNow: 获取友好型与当前时间的差  
    getMillis               : 获取与给定时间等于时间差的时间戳  
    getString               : 获取与给定时间等于时间差的时间字符串  
    getDate                 : 获取与给定时间等于时间差的 Date  
    getMillisByNow          : 获取与当前时间等于时间差的时间戳  
    getStringByNow          : 获取与当前时间等于时间差的时间字符串  
    getDateByNow            : 获取与当前时间等于时间差的 Date  
    isToday                 : 判断是否今天  
    isLeapYear              : 判断是否闰年  
    getChineseWeek          : 获取中式星期  
    getUSWeek               : 获取美式式星期  
    isAm                    : 判断是否上午  
    isPm                    : 判断是否下午  
    getValueByCalendarField : 根据日历字段获取值  
    getChineseZodiac        : 获取生肖  
    getZodiac               : 获取星座
    getShowTime             :将时间转换成显示的时间格式，参考微信
```

2. TextUtil.java

```text
    isEmpty                 : 判断字符串是否为空  
    isTrimEmpty             : 去除空格，判断字符串是否为空  
    isSpace                 : 判断字符串是否有空格  
    equals                  : 比较两个字符串是否相等  
    equalsIgnoreCase        : 比较两个字符串是否相等，忽略大小写  
    null2Length0            : null 转空串  
    length                  : 获取字符串长度   
    upperFirstLetter        : 将字符串的第一个字母设置为大写     
    lowerFirstLetter        : 将字符串的第一个字母设置为小写     
    reverse                 : 倒置字符串  
    toDBC                   : 将字符串转换为半角  
    toSBC                   : 将字符串转换为全角  
    format                  : 格式化字符串  
```

3. MD5Util.java

```text
    string2MD5              :MD5加码 生成32位md5码
    convertMD5              :加密解密算法 执行一次加密，两次解密
    使用例子:
    public static void main(String args[]) {
        String s = new String("1111");
        System.out.println("原始：" + s);
        System.out.println("MD5后：" + string2MD5(s));
        System.out.println("加密的：" + convertMD5(s));
        System.out.println("解密的：" + convertMD5(convertMD5(s)));
    }
```

4. GsonUtil.java
```text
    GsonString              :将对象转成json格式
    GsonToBean              :将json转成特定的cls的对象
    jsonToList              :json字符串转成list
    GsonToListMaps          :json字符串转成list中有map的
    GsonToMaps              :json字符串转成map的
    isJson                  :判断是否为JSON格式的字符串
```

#### 参与贡献

1. https://github.com/Blankj/AndroidUtilCode（感谢这位大佬提供）
