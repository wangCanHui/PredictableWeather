package com.wangcanhui.predictableweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangcanhui on 2018/6/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
