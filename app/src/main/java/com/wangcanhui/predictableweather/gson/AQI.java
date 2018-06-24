package com.wangcanhui.predictableweather.gson;

/**
 * Created by wangcanhui on 2018/6/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String api;
        public String pm25;
    }
}
