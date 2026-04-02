#ifndef MPD_PROTOCOL_H
#define MPD_PROTOCOL_H

#include <stdint.h>
#include <stdbool.h>

#ifdef __cplusplus
extern "C" {
#endif

typedef enum {
    MPD_CMD_LED_ON = 1,
    MPD_CMD_LED_OFF = 2,
    MPD_CMD_GET_STATUS = 3
} mpd_command_t;

typedef struct {
    bool led_on;
    uint32_t uptime_seconds;
} mpd_device_state_t;

void mpd_init(void);
bool mpd_handle_command(mpd_command_t cmd, mpd_device_state_t* out_state);
mpd_device_state_t mpd_get_state(void);

#ifdef __cplusplus
}
#endif

#endif
