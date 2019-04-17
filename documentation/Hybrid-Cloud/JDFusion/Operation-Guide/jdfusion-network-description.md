# Relevant Commands About Network Interfaces
## Network Interface List
Used for displaying the information list of all network interfaces on the cloud specified by the user
Command Format:
```bash
# list nis --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list nis --cloud cloud-123
```
## Network Interface Details
Used for displaying details of the network interfaces specified by the user
Command Format:
```bash
# describe ni <Network Interface Instance ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe ni ni-123
```
## Create Network Interface
Used for creating the network interface on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create ni [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "netInterface": {
    "name": "string",
    "description": "string",
    "subnetId": "string",
    "zoneId": "string",
    "privateIpAddress": "string",
    "securityGroupId": "string"
  }
}
```
Example:
```bash
create ni -f /data/json/ni.json --cloud cloud-123
```
## Delete the Specified Network Interface
Used for deleting network interface specified by the user
Command Format:
```bash
# del ni <Network Interface ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del ni ni-123 --cloud cloud-123
```
## Associate Network Interface to Virtual Machines
Used for associating the network interfaces specified by the user to the Virtual Machines specified by the user
Command Format:
```bash
# attach ni --from <Network Interface Instance ID> --to <ID of Virtual Machines> --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --from | Required, specifying the network interface ID to be associated |
| --to | Required, specifying the IDs of Virtual Machines to be associated with the network interfaces |

| --cloud | Required, Cloud Instance ID (id of list clouds) |
| --tail | Track the task execution process and do not appear with --no-table at the same time |
| --no-table | Show the ID of the result only and cannot appear with --tail at the same time |
Example:
```bash
attach ni --from ni-123 --to vm-123 --cloud cloud-123
```
## Disassociate the network interfaces from the Virtual Machines
Used for disassociating the network interfaces specified by the user from the Virtual Machines specified by the user
Command Format:
```bash
# detach ni --from <Network Interface Instance ID> --to <ID of Virtual Machines> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --from | Required, specifying the network interface ID to be disassociated |
| --to | Required, specifying the Virtual Machines from which the specified network interfaces are disassociated |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
detach ni --from ni-123 --to vm-123 --cloud cloud-123
```
