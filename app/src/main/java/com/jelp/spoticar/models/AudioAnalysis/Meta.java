package com.jelp.spoticar.models.AudioAnalysis;

import com.google.gson.annotations.SerializedName;

   
public class Meta {

   @SerializedName("analyzer_version")
   String analyzerVersion;

   @SerializedName("platform")
   String platform;

   @SerializedName("detailed_status")
   String detailedStatus;

   @SerializedName("status_code")
   int statusCode;

   @SerializedName("timestamp")
   int timestamp;

   @SerializedName("analysis_time")
   double analysisTime;

   @SerializedName("input_process")
   String inputProcess;


    public void setAnalyzerVersion(String analyzerVersion) {
        this.analyzerVersion = analyzerVersion;
    }
    public String getAnalyzerVersion() {
        return analyzerVersion;
    }
    
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getPlatform() {
        return platform;
    }
    
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }
    public String getDetailedStatus() {
        return detailedStatus;
    }
    
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public int getStatusCode() {
        return statusCode;
    }
    
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
    public int getTimestamp() {
        return timestamp;
    }
    
    public void setAnalysisTime(double analysisTime) {
        this.analysisTime = analysisTime;
    }
    public double getAnalysisTime() {
        return analysisTime;
    }
    
    public void setInputProcess(String inputProcess) {
        this.inputProcess = inputProcess;
    }
    public String getInputProcess() {
        return inputProcess;
    }
    
}