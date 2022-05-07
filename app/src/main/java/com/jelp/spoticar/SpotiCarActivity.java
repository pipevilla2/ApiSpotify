package com.jelp.spoticar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;
import com.spotify.protocol.types.Track;

public class SpotiCarActivity extends AppCompatActivity {

    private CardView cvConnect;
    private static final String CLIENT_ID = "fec9df3eda024ea79ebfc02bf68fcf98";
    private static final String REDIRECT_URI = "com.jelp.spoticar://callback";
    private SpotifyAppRemote mSpotifyAppRemote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoticar_activity);

        cvConnect = (CardView) findViewById(R.id.cvConnectar);
        cvConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSeleccionarDispositivo = new Intent(SpotiCarActivity.this, DeviceListActivity.class);
                startActivity(intentSeleccionarDispositivo);
            }
        });
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
}