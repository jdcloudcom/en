# Relevant Commands About HTTP Listening
## Create HTTP Listening
Create HTTP listening according to configuration file in the JSON format
Command Format:
```bash
# create listener [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| -f/--file | Either -f or -i must be selected for the file name and the data in the JSON format must be used as the content |
| -i/--input | Either -f or -i must be selected and the data in the JSON format must be used as the content |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
| --tail | Track the task execution process and do not appear with --no-table at the same time |
| --no-table | Show the ID of the result only and cannot appear with --tail at the same time |
Example of JSON Format:
```json
{
  "httpListener": {
    "loadBalancerId": "string",
    "listenerPort": 0,
    "backendServerPort": 0,
    "vserverGroupId": "string",
    "bandwidth": 0,
    "healthCheckConnectPort": 0,
    "healthyThreshold": 0,
    "unhealthyThreshold": 0,
    "healthCheckTimeout": 0,
    "healthCheckInterval": 0,
    "healthCheckHttpCode": "string"
  }
}
```
Example:
```bash
create listener -f /data/json/listener.json --cloud cloud-123
```
