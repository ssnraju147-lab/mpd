#include "mpd_protocol.h"

static mpd_device_state_t g_state = {false, 0};

void mpd_init(void) {
    g_state.led_on = false;
    g_state.uptime_seconds = 0;
}

bool mpd_handle_command(mpd_command_t cmd, mpd_device_state_t* out_state) {
    switch (cmd) {
        case MPD_CMD_LED_ON:
            g_state.led_on = true;
            break;
        case MPD_CMD_LED_OFF:
            g_state.led_on = false;
            break;
        case MPD_CMD_GET_STATUS:
            break;
        default:
            return false;
    }

    g_state.uptime_seconds += 1;

    if (out_state != 0) {
        *out_state = g_state;
    }

    return true;
}

mpd_device_state_t mpd_get_state(void) {
    return g_state;
}
