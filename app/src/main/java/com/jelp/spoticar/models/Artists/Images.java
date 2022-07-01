package com.jelp.spoticar.models.Artists;

import com.google.gson.annotations.SerializedName;

   
public class Images {

   @SerializedName("height")
   int height;

   @SerializedName("url")
   String url;

   @SerializedName("width")
   int width;


    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    
}