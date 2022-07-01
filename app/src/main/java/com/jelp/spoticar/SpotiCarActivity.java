package com.jelp.spoticar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.jelp.spoticar.modelresponses.AudioAnalysisResponse;
import com.jelp.spoticar.modelresponses.TracksResponse;
import com.jelp.spoticar.models.Tracks.Item;
import com.jelp.spoticar.network.BasicResponse;
import com.jelp.spoticar.network.RetrofitClientInstance;
import com.jelp.spoticar.services.AudioAnalysisService;
import com.jelp.spoticar.services.TracksService;
import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;
import com.spotify.protocol.types.Track;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;

public class SpotiCarActivity extends AppCompatActivity {

    private CardView cvConnect;
    private static final String CLIENT_ID = "9f72e5ab1a05407285d75d915f9e7adb";
    private static final String REDIRECT_URI = "com.jelp.spoticar://callback";
    private SpotifyAppRemote mSpotifyAppRemote;


    TracksService _tracksService;

    AudioAnalysisService _audioAnalysisService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoticar_activity);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        cvConnect = (CardView) findViewById(R.id.cvConnectar);
        cvConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSeleccionarDispositivo = new Intent(SpotiCarActivity.this, DeviceListActivity.class);
                startActivity(intentSeleccionarDispositivo);
            }
        });

        try {
            List<Item> listTracks = getListTracks();

            com.jelp.spoticar.models.AudioAnalysis.Track _trackInformation = getTrackInformation("3S2R0EVwBSAVMd5UMgKTL0");

            String hola = "";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        ConnectionParams connectionParams =
                new ConnectionParams.Builder(CLIENT_ID)
                        .setRedirectUri(REDIRECT_URI)
                        .showAuthView(true)
                        .build();

        SpotifyAppRemote.connect(this, connectionParams,
                new Connector.ConnectionListener() {

                    public void onConnected(SpotifyAppRemote spotifyAppRemote) {
                        mSpotifyAppRemote = spotifyAppRemote;
                        Toast.makeText(getBaseContext(), "Conectado!", Toast.LENGTH_LONG).show();
                        connected();
                    }

                    public void onFailure(Throwable throwable) {
                        Toast.makeText(getBaseContext(), throwable.getMessage(), Toast.LENGTH_LONG).show();
                        Log.e("MyActivity", throwable.getMessage(), throwable);
                    }
                });
    }

    @Override
    protected void onStop() {
        super.onStop();
        SpotifyAppRemote.disconnect(mSpotifyAppRemote);
    }

    private void connected() {
        mSpotifyAppRemote.getPlayerApi().play("spotify:playlist:37i9dQZF1DX2sUQwD7tbmL");
        mSpotifyAppRemote.getPlayerApi()
                .subscribeToPlayerState()
                .setEventCallback(playerState -> {
                    final Track track = playerState.track;
                    if (track != null) {

                        Toast.makeText(getBaseContext(), track.name + " by " + track.artist.name, Toast.LENGTH_LONG).show();
                    }
                });
    }


    public List<Item> getListTracks() throws IOException {
        _tracksService = RetrofitClientInstance.getRetrofitInstance().create(TracksService.class);
        Call<TracksResponse> callLists = _tracksService.getListTracks("application/json", "Bearer" + " " + Configuration.OAuthToken(), "regalame una noche", "track");
        TracksResponse _listsResponse = null;
        _listsResponse = callLists.execute().body();
        return _listsResponse.getTracks().getItems();
    }

    public com.jelp.spoticar.models.AudioAnalysis.Track getTrackInformation(String id) throws IOException {
        _audioAnalysisService= RetrofitClientInstance.getRetrofitInstance().create(AudioAnalysisService.class);
//        Call<AudioAnalysisResponse> callLists=_audioAnalysisService.getAudioAnalysTrack("application/json","Bearer" + " " + Configuration.OAuthToken(),id);
//        AudioAnalysisResponse _listsResponse = null;
//        _listsResponse = callLists.execute().body();
//        return  _listsResponse.getTrack();


        try {
            Call<AudioAnalysisResponse> call = _audioAnalysisService.getAudioAnalysTrack("application/json", "Bearer" + " " + Configuration.OAuthToken(), id);
            Response<AudioAnalysisResponse> response = call.execute();
            if (response != null && !response.isSuccessful() && response.errorBody() != null) {
                Converter<ResponseBody, BasicResponse> errorConverter = RetrofitClientInstance.getRetrofitInstance().responseBodyConverter(BasicResponse.class, new Annotation[0]);
                BasicResponse error = errorConverter.convert(response.errorBody());
                //DO ERROR HANDLING HERE
                String hola = "";
                return null;
            }
            AudioAnalysisResponse registrationResponse = response.body();

            String hola="";
            //DO SUCCESS HANDLING HERE
        } catch (IOException e) {
            return null;
            //DO NETWORK ERROR HANDLING HERE
        }
return null;

    }

}