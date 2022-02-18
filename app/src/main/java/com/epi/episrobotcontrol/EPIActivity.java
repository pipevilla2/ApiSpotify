package com.epi.episrobotcontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.lang.invoke.ConstantCallSite;

public class EPIActivity extends AppCompatActivity {

    private CardView cvConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epiactivity);

        cvConnect = (CardView) findViewById(R.id.cvConnectar);
        cvConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSeleccionarDispositivo = new Intent(EPIActivity.this, DeviceListActivity.class);
                startActivity(intentSeleccionarDispositivo);
            }
        });
    }
}