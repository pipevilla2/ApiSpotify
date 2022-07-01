package com.jelp.spoticar.models.AudioAnalysis;

import com.google.gson.annotations.SerializedName;

   
public class Track {

   @SerializedName("num_samples")
   int numSamples;

   @SerializedName("duration")
   double duration;

   @SerializedName("sample_md5")
   String sampleMd5;

   @SerializedName("offset_seconds")
   int offsetSeconds;

   @SerializedName("window_seconds")
   int windowSeconds;

   @SerializedName("analysis_sample_rate")
   int analysisSampleRate;

   @SerializedName("analysis_channels")
   int analysisChannels;

   @SerializedName("end_of_fade_in")
   double endOfFadeIn;

   @SerializedName("start_of_fade_out")
   double startOfFadeOut;

   @SerializedName("loudness")
   double loudness;

   @SerializedName("tempo")
   double tempo;

   @SerializedName("tempo_confidence")
   double tempoConfidence;

   @SerializedName("time_signature")
   int timeSignature;

   @SerializedName("time_signature_confidence")
   int timeSignatureConfidence;

   @SerializedName("key")
   int key;

   @SerializedName("key_confidence")
   double keyConfidence;

   @SerializedName("mode")
   int mode;

   @SerializedName("mode_confidence")
   double modeConfidence;

   @SerializedName("codestring")
   String codestring;

   @SerializedName("code_version")
   double codeVersion;

   @SerializedName("echoprintstring")
   String echoprintstring;

   @SerializedName("echoprint_version")
   double echoprintVersion;

   @SerializedName("synchstring")
   String synchstring;

   @SerializedName("synch_version")
   int synchVersion;

   @SerializedName("rhythmstring")
   String rhythmstring;

   @SerializedName("rhythm_version")
   int rhythmVersion;


    public void setNumSamples(int numSamples) {
        this.numSamples = numSamples;
    }
    public int getNumSamples() {
        return numSamples;
    }
    
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }
    
    public void setSampleMd5(String sampleMd5) {
        this.sampleMd5 = sampleMd5;
    }
    public String getSampleMd5() {
        return sampleMd5;
    }
    
    public void setOffsetSeconds(int offsetSeconds) {
        this.offsetSeconds = offsetSeconds;
    }
    public int getOffsetSeconds() {
        return offsetSeconds;
    }
    
    public void setWindowSeconds(int windowSeconds) {
        this.windowSeconds = windowSeconds;
    }
    public int getWindowSeconds() {
        return windowSeconds;
    }
    
    public void setAnalysisSampleRate(int analysisSampleRate) {
        this.analysisSampleRate = analysisSampleRate;
    }
    public int getAnalysisSampleRate() {
        return analysisSampleRate;
    }
    
    public void setAnalysisChannels(int analysisChannels) {
        this.analysisChannels = analysisChannels;
    }
    public int getAnalysisChannels() {
        return analysisChannels;
    }
    
    public void setEndOfFadeIn(double endOfFadeIn) {
        this.endOfFadeIn = endOfFadeIn;
    }
    public double getEndOfFadeIn() {
        return endOfFadeIn;
    }
    
    public void setStartOfFadeOut(double startOfFadeOut) {
        this.startOfFadeOut = startOfFadeOut;
    }
    public double getStartOfFadeOut() {
        return startOfFadeOut;
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
    
    public void setCodestring(String codestring) {
        this.codestring = codestring;
    }
    public String getCodestring() {
        return codestring;
    }
    
    public void setCodeVersion(double codeVersion) {
        this.codeVersion = codeVersion;
    }
    public double getCodeVersion() {
        return codeVersion;
    }
    
    public void setEchoprintstring(String echoprintstring) {
        this.echoprintstring = echoprintstring;
    }
    public String getEchoprintstring() {
        return echoprintstring;
    }
    
    public void setEchoprintVersion(double echoprintVersion) {
        this.echoprintVersion = echoprintVersion;
    }
    public double getEchoprintVersion() {
        return echoprintVersion;
    }
    
    public void setSynchstring(String synchstring) {
        this.synchstring = synchstring;
    }
    public String getSynchstring() {
        return synchstring;
    }
    
    public void setSynchVersion(int synchVersion) {
        this.synchVersion = synchVersion;
    }
    public int getSynchVersion() {
        return synchVersion;
    }
    
    public void setRhythmstring(String rhythmstring) {
        this.rhythmstring = rhythmstring;
    }
    public String getRhythmstring() {
        return rhythmstring;
    }
    
    public void setRhythmVersion(int rhythmVersion) {
        this.rhythmVersion = rhythmVersion;
    }
    public int getRhythmVersion() {
        return rhythmVersion;
    }
    
}