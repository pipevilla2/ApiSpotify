package com.jelp.spoticar.modelresponses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jelp.spoticar.models.Tracks.Tracks;

public class TracksResponse {

    @SerializedName("tracks")
    @Expose
    private Tracks tracks;

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

}
