package com.jelp.spoticar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpotiCarActivity extends AppCompatActivity {

    private CardView cvConnect;

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
        // We will start writing our code here.
    }

    private void connected() {
        // Then we will write some more code here.
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Aaand we will finish off here.
    }
}