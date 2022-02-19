package com.epi.episrobotcontrol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends Activity {

    ImageView btnOn, btnOff;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Button encender, apagar;
    Handler bluetoothIn;

    final int handlerState = 0;
    private BluetoothAdapter btAdapter = null;
    private BluetoothSocket btSocket = null;
    private StringBuilder recDataString = new StringBuilder();
    private ConnectedThread mConnectedThread;
    private static final UUID BTMODULEUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private static String address = null;
    private LottieAnimationView lottieAnimationView;
    private String dispositivoAlCualConectarSiempre;

    @SuppressLint("HandlerLeak")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        btnOn = (ImageView) findViewById(R.id.bton);
        btnOff = (ImageView) findViewById(R.id.btoff);
        encender = findViewById(R.id.Encender);
        apagar = findViewById(R.id.Apagar);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottieAnimation);

        btAdapter = BluetoothAdapter.getDefaultAdapter();
        checkBTState();


        btnOff.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                btnOn.setVisibility(View.VISIBLE);
                btnOff.setVisibility(View.GONE);
                mConnectedThread.write("2");
            }
        });

        btnOn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                btnOn.setVisibility(View.GONE);
                btnOff.setVisibility(View.VISIBLE);
                mConnectedThread.write("1");
            }
        });

        encender.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mConnectedThread.write("1");
            }
        });

        apagar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mConnectedThread.write("0");
            }
        });
    }


    @SuppressLint("MissingPermission")
    private BluetoothSocket createBluetoothSocket(BluetoothDevice device) throws IOException {
        return device.createRfcommSocketToServiceRecord(BTMODULEUUID);
    }

    @SuppressLint("MissingPermission")
    @Override
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        address = intent.getStringExtra(DeviceListActivity.EXTRA_DEVICE_ADDRESS);
        dispositivoAlCualConectarSiempre = address;
        ConnectOrRecconect(address);

    }

    private void ConnectOrRecconect(String address) {
        BluetoothDevice device = btAdapter.getRemoteDevice(address);

        try {
            btSocket = createBluetoothSocket(device);
        } catch (IOException e) {
            Toast.makeText(getBaseContext(), "La creacción del Socket fallo", Toast.LENGTH_LONG).show();
        }
        try {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            btSocket.connect();
        } catch (IOException e) {
            try
            {
                btSocket.close();
            } catch (IOException e2)
            {
                //insert code to deal with this
            }
        }
        mConnectedThread = new ConnectedThread(btSocket);
        mConnectedThread.start();
        mConnectedThread.write("x");
    }


    @Override
    public void onPause()
    {
        super.onPause();
        try
        {
            btSocket.close();
        } catch (IOException e2) {}
    }

    @SuppressLint("MissingPermission")
    private void checkBTState() {

        if(btAdapter==null) {
            Toast.makeText(getBaseContext(), "El dispositivo no soporta bluetooth", Toast.LENGTH_LONG).show();
        } else {
            if (btAdapter.isEnabled()) {
            } else {
                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBtIntent, 1);
            }
        }
    }

    private class ConnectedThread extends Thread {
        private final InputStream mmInStream;
        private final OutputStream mmOutStream;

        public ConnectedThread(BluetoothSocket socket) {
            InputStream tmpIn = null;
            OutputStream tmpOut = null;

            try {
                tmpIn = socket.getInputStream();
                tmpOut = socket.getOutputStream();
            } catch (IOException e) { }

            mmInStream = tmpIn;
            mmOutStream = tmpOut;
        }


        public void run() {
            byte[] buffer = new byte[256];
            int bytes;

            while (true) {
                try {
                    bytes = mmInStream.read(buffer);
                    String readMessage = new String(buffer, 0, bytes);
                    bluetoothIn.obtainMessage(handlerState, bytes, -1, readMessage).sendToTarget();
                } catch (IOException e) {
                    break;
                }
            }
        }

        public void write(String input) {
            byte[] msgBuffer = input.getBytes();
            try {
                mmOutStream.write(msgBuffer);
            } catch (IOException e) {
                Toast.makeText(getBaseContext(), "Reconectando", Toast.LENGTH_LONG).show();
                ConnectOrRecconect(dispositivoAlCualConectarSiempre);
            }
        }
    }
}