package com.mpd.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final DeviceClient deviceClient = new DeviceClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView statusText = findViewById(R.id.statusText);
        Button ledOn = findViewById(R.id.btnLedOn);
        Button ledOff = findViewById(R.id.btnLedOff);
        Button getStatus = findViewById(R.id.btnStatus);

        ledOn.setOnClickListener(v -> statusText.setText(deviceClient.sendCommand("LED_ON")));
        ledOff.setOnClickListener(v -> statusText.setText(deviceClient.sendCommand("LED_OFF")));
        getStatus.setOnClickListener(v -> statusText.setText(deviceClient.sendCommand("GET_STATUS")));
    }
}
