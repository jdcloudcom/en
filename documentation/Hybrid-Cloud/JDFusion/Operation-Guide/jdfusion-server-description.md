# Relevant Commands About Server Groups
## List of Server Groups
Used for displaying the information list of all server groups on the cloud specified by the user
Command Format:
```bash
# list vservergroups --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list vservergroups --cloud cloud-123
```
## Create the Server Group
Create the Virtual Server Group and add the backend server according to the configuration file in the JSON format
Command Format:
```bash
# create vsg [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
```
json
{
  "vserverGroup": {
    "loadBalancerId": "string",
    "vserverGroupName": "string",
    "backendServers": [
      {
        "serverId": "string",
        "port": 0,
        "weight": 0
      }
    ]
  }
}
```
Example:
```bash
create vsg -f /data/json/vsg.json --cloud cloud-123
```
