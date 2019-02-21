# Relevant Commands About Virtual Machines
## List of Virtual Machines
Used for displaying the information lists of all Virtual Machines on the cloud specified by the user
Command Format:
```bas
# list vms --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list vms --cloud cloud-123
```
## Details of Virtual Machines
Used for displaying details of the Virtual Machines specified by the user
Command Format:
```bash
# describe vm <Instance IDs of Virtual Machines> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe vm vm-123
```
## Create Virtual Machines
Used for creating the Virtual Machines on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create vm [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "vms": {
    "az": "string",
    "name": "string",
    "hostName": "string",
    "description": "string",
    "subnetId": "string",
    "tags": [
      {
        "tagKey": "string",
        "tagValue": "string"
      }
    ],
    "privateIpAddress": "string",
    "imageId": "string",
    "instanceFlavorType": "string",
    "securityGroupId": "string",
    "internetMaxBandwidthIn": 0,
    "internetMaxBandwidthOut": 0,
    "password": "string",
    "passwordInherit": true,
    "userData": "string",
    "keyPairName": "string",
    "systemDisk": {
      "category": "string",
      "diskSize": 0,
      "description": "string"
    }
  }
}
```
Example:
```bash
create vm -f /data/json/vm.json --cloud cloud-123
```
## Delete the Specified Virtual Machines
Used for deleting the Virtual Machines specified by the user
Command Format:
```bash
# del vm <Instance IDs of Virtual Machines> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del vm vm-123 --cloud cloud-123
```
## Start Virtual Machines
Start the Virtual Machines specified by the user
Command Format:
```bash
# start vm <Instance ID of Virtual Machines>
```
Parameters:
None
Example:
```bash
start vm vm-123
```
## Stop Virtual Machines
Stop the Virtual Machines specified by the user
Command Format:
```bash
# stop vm <Instance ID of Virtual Machines>
```
Parameters:
None
Example:
```bash
stop vm vm-123
```
## Reboot Virtual Machines
Reboot the Virtual Machines specified by the user
Command Format:
```bash
# reboot vm <Instance ID of Virtual Machines>
```
Parameters:
None
Example:
```bash
reboot vm vm-123
```
