package com.jelp.spoticar.services;

import com.jelp.spoticar.modelresponses.AudioAnalysisResponse;
import com.jelp.spoticar.modelresponses.TracksResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AudioAnalysisService {

    /***** GET  List of Stracks from Spotify*****/
    @Headers("Accept: application/json")
    @GET("v1/audio-analysis/{id}")
    Call<AudioAnalysisResponse> getAudioAnalysTrack(@Header("Content-Type") String content_type,
                                       @Header("Authorization") String authorization,@Path("id") String id);

}
