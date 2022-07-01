package com.jelp.spoticar.modelsparameters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TracksParam {

    @SerializedName("Content-Type")
    @Expose
    public String Content_type;

    @SerializedName("offset")
    @Expose
    public Integer Offset;

    @SerializedName("sort")
    @Expose
    public String Sort;


    public TracksParam(String content_type, Integer offset, String sort)
    {
        Content_type = content_type;
        Offset = offset;
        Sort = sort;
    }
}
