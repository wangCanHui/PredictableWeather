package com.wangcanhui.predictableweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangcanhui on 2018/6/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
