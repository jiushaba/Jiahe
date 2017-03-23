package com.zdlog.jiahe.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/3/23 0023.
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
