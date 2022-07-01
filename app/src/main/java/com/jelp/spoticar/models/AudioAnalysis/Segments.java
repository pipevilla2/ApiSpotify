package com.jelp.spoticar.models.AudioAnalysis;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Segments {

   @SerializedName("start")
   double start;

   @SerializedName("duration")
   double duration;

   @SerializedName("confidence")
   double confidence;

   @SerializedName("loudness_start")
   double loudnessStart;

   @SerializedName("loudness_max_time")
   double loudnessMaxTime;

   @SerializedName("loudness_max")
   double loudnessMax;

   @SerializedName("loudness_end")
   double loudnessEnd;

   @SerializedName("pitches")
   List<Double> pitches;

   @SerializedName("timbre")
   List<Double> timbre;


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
    
    public void setLoudnessStart(double loudnessStart) {
        this.loudnessStart = loudnessStart;
    }
    public double getLoudnessStart() {
        return loudnessStart;
    }
    
    public void setLoudnessMaxTime(int loudnessMaxTime) {
        this.loudnessMaxTime = loudnessMaxTime;
    }
    public double getLoudnessMaxTime() {
        return loudnessMaxTime;
    }
    
    public void setLoudnessMax(int loudnessMax) {
        this.loudnessMax = loudnessMax;
    }
    public double getLoudnessMax() {
        return loudnessMax;
    }
    
    public void setLoudnessEnd(int loudnessEnd) {
        this.loudnessEnd = loudnessEnd;
    }
    public double getLoudnessEnd() {
        return loudnessEnd;
    }
    
    public void setPitches(List<Double> pitches) {
        this.pitches = pitches;
    }
    public List<Double> getPitches() {
        return pitches;
    }
    
    public void setTimbre(List<Double> timbre) {
        this.timbre = timbre;
    }
    public List<Double> getTimbre() {
        return timbre;
    }
    
}