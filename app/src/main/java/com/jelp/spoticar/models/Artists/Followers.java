package com.jelp.spoticar.models.Artists;

import com.google.gson.annotations.SerializedName;

   
public class Followers {

   @SerializedName("href")
   String href;

   @SerializedName("total")
   int total;


    public void setHref(String href) {
        this.href = href;
    }
    public String getHref() {
        return href;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }
    
}