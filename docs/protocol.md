# MPD Protocol v0.1

## Commands

- `LED_ON`: turn LED on
- `LED_OFF`: turn LED off
- `GET_STATUS`: fetch current state

## Response model

```json
{
  "ledOn": true,
  "uptimeTicks": 12
}
```

## Notes

- `uptimeTicks` increments on each accepted command.
- Unknown commands should return an error representation.
