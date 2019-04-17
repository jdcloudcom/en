# Relevant Commands About Load Balancers
## List of Load Balancer
Used for displaying the information list of all Load Balancers on the cloud specified by the user
Command Format:
```bash
# list slbs --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list slbs --cloud cloud-123
```
## Details of Load Balancers
Used for displaying details of the Load Balancers specified by the user
Command Format:
```bash
# describe slb <Load Balancer Instance ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe slb slb-123
```
## Create Load Balancer
Used for creating the Load Balancer on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create slb [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "slb": {
    "name": "string",
    "subnetId": "string",
    "loadBalancerSpec": "string"
  }
}
```
Example:
```bash
create slb -f /data/json/slb.json --cloud cloud-123
```
## Delete Specified Load Balancers
Used for deleting the Load Balancers specified by the user
Command Format:
```bash
# del slb <Load Balancer Instance ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del slb slb-123 --cloud cloud-123
```
