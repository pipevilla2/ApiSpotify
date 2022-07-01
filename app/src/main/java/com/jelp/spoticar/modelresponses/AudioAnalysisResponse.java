package com.jelp.spoticar.modelresponses;

import java.util.List;

import com.jelp.spoticar.models.AudioAnalysis.Track;
import com.jelp.spoticar.models.AudioAnalysis.Meta;
import com.jelp.spoticar.models.AudioAnalysis.Bars;
import com.jelp.spoticar.models.AudioAnalysis.Beats;
import com.jelp.spoticar.models.AudioAnalysis.Sections;
import com.jelp.spoticar.models.AudioAnalysis.Segments;
import com.jelp.spoticar.models.AudioAnalysis.Tatums;

import com.google.gson.annotations.SerializedName;


public class AudioAnalysisResponse {

    @SerializedName("meta")
    Meta meta;

    @SerializedName("track")
    Track track;

    @SerializedName("bars")
    List<Bars> bars;

    @SerializedName("beats")
    List<Beats> beats;

    @SerializedName("sections")
    List<Sections> sections;

    @SerializedName("segments")
    List<Segments> segments;

    @SerializedName("tatums")
    List<Tatums> tatums;


    public void setMeta(Meta meta) {
        this.meta = meta;
    }
    public Meta getMeta() {
        return meta;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
    public Track getTrack() {
        return track;
    }

    public void setBars(List<Bars> bars) {
        this.bars = bars;
    }
    public List<Bars> getBars() {
        return bars;
    }

    public void setBeats(List<Beats> beats) {
        this.beats = beats;
    }
    public List<Beats> getBeats() {
        return beats;
    }

    public void setSections(List<Sections> sections) {
        this.sections = sections;
    }
    public List<Sections> getSections() {
        return sections;
    }

    public void setSegments(List<Segments> segments) {
        this.segments = segments;
    }
    public List<Segments> getSegments() {
        return segments;
    }

    public void setTatums(List<Tatums> tatums) {
        this.tatums = tatums;
    }
    public List<Tatums> getTatums() {
        return tatums;
    }

}
