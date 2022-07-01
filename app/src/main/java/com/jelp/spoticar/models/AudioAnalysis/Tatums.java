package com.jelp.spoticar.models.AudioAnalysis;

import com.google.gson.annotations.SerializedName;

   
public class Tatums {

   @SerializedName("start")
   double start;

   @SerializedName("duration")
   double duration;

   @SerializedName("confidence")
   double confidence;


    public void setStart(double start) {
        this.start = start;
    }
    public double getStart() {
        return start;
    }
    
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }
    
    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }
    public double getConfidence() {
        return confidence;
    }
    
}