package com.jelp.spoticar.models.Artists;

import com.google.gson.annotations.SerializedName;

   
public class ExternalUrls {

   @SerializedName("spotify")
   String spotify;


    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }
    public String getSpotify() {
        return spotify;
    }
    
}