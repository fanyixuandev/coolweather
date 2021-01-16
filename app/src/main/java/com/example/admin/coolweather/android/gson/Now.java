package com.example.admin.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2021/1/15.
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
