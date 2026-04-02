#include <cassert>
#include "mpd_protocol.h"

int main() {
    mpd_init();

    mpd_device_state_t state{};
    bool ok = mpd_handle_command(MPD_CMD_LED_ON, &state);
    assert(ok);
    assert(state.led_on);

    ok = mpd_handle_command(MPD_CMD_LED_OFF, &state);
    assert(ok);
    assert(!state.led_on);

    ok = mpd_handle_command((mpd_command_t)99, &state);
    assert(!ok);

    return 0;
}
