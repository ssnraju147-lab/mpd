package com.mpd.app;

public class DeviceClient {
    private boolean ledOn = false;
    private int ticks = 0;

    public String sendCommand(String command) {
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
                return "Unknown command";
        }
        ticks++;
        return "LED=" + (ledOn ? "ON" : "OFF") + " uptimeTicks=" + ticks;
    }
}
