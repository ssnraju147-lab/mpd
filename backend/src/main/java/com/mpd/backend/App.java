package com.mpd.backend;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        DeviceService service = new DeviceService();
        System.out.println(service.handle("GET_STATUS"));
    }
}

class DeviceService {
    private final Gson gson = new Gson();
    private boolean ledOn = false;
    private int ticks = 0;

    public String handle(String command) {
        switch (command) {
            case "LED_ON":
                ledOn = true;
                break;
            case "LED_OFF":
                ledOn = false;
                break;
            case "GET_STATUS":
                break;
            default:
                return "{\"error\":\"unknown command\"}";
        }

        ticks++;

        Map<String, Object> payload = new HashMap<>();
        payload.put("ledOn", ledOn);
        payload.put("uptimeTicks", ticks);
        return gson.toJson(payload);
    }
}
