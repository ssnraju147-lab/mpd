let ledOn = false;
let ticks = 0;

function sendCommand(command) {
  switch (command) {
    case 'LED_ON':
      ledOn = true;
      break;
    case 'LED_OFF':
      ledOn = false;
      break;
    case 'GET_STATUS':
      break;
    default:
      return 'Unknown command';
  }
  ticks += 1;
  return `LED=${ledOn ? 'ON' : 'OFF'} uptimeTicks=${ticks}`;
}

const status = document.getElementById('status');
document.getElementById('onBtn').addEventListener('click', () => {
  status.textContent = sendCommand('LED_ON');
});
document.getElementById('offBtn').addEventListener('click', () => {
  status.textContent = sendCommand('LED_OFF');
});
document.getElementById('statusBtn').addEventListener('click', () => {
  status.textContent = sendCommand('GET_STATUS');
});
