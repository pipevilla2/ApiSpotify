package com.jelp.spoticar.models.AudioAnalysis;

import com.google.gson.annotations.SerializedName;

   
public class Sections {

   @SerializedName("start")
   double start;

   @SerializedName("duration")
   double duration;

   @SerializedName("confidence")
   double confidence;

   @SerializedName("loudness")
   double loudness;

   @SerializedName("tempo")
   double tempo;

   @SerializedName("tempo_confidence")
   double tempoConfidence;

   @SerializedName("key")
   int key;

   @SerializedName("key_confidence")
   double keyConfidence;

   @SerializedName("mode")
   int mode;

   @SerializedName("mode_confidence")
   double modeConfidence;

   @SerializedName("time_signature")
   int timeSignature;

   @SerializedName("time_signature_confidence")
   int timeSignatureConfidence;


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
    
    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }
    public double getLoudness() {
        return loudness;
    }
    
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public double getTempo() {
        return tempo;
    }
    
    public void setTempoConfidence(double tempoConfidence) {
        this.tempoConfidence = tempoConfidence;
    }
    public double getTempoConfidence() {
        return tempoConfidence;
    }
    
    public void setKey(int key) {
        this.key = key;
    }
    public int getKey() {
        return key;
    }
    
    public void setKeyConfidence(double keyConfidence) {
        this.keyConfidence = keyConfidence;
    }
    public double getKeyConfidence() {
        return keyConfidence;
    }
    
    public void setMode(int mode) {
        this.mode = mode;
    }
    public int getMode() {
        return mode;
    }
    
    public void setModeConfidence(double modeConfidence) {
        this.modeConfidence = modeConfidence;
    }
    public double getModeConfidence() {
        return modeConfidence;
    }
    
    public void setTimeSignature(int timeSignature) {
        this.timeSignature = timeSignature;
    }
    public int getTimeSignature() {
        return timeSignature;
    }
    
    public void setTimeSignatureConfidence(int timeSignatureConfidence) {
        this.timeSignatureConfidence = timeSignatureConfidence;
    }
    public int getTimeSignatureConfidence() {
        return timeSignatureConfidence;
    }
    
}