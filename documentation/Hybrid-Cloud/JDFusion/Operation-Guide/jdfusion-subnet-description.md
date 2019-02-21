# Relevant Commands About Subnets
## Subnet List
Used for displaying the information lists of all subnets on the cloud specified by the user
Command Format:
```bash
# list subnets --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list subnets --cloud cloud-123
```
## Details of Subnet
Used for displaying details of the subnets specified by the user
Command Format:
```bash
# describe subnet <Subnet Instance ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe subnet subnet-123
```
## Create subnet
Used for creating the subnet on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create subnet [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "subnet": {
    "name": "string",
    "vpcId": "string",
    "cidrBlock": "string",
    "description": "string",
    "zoneId": "string"
  }
}
```
Example:
```bash
create subnet -f /data/json/subnet.json --cloud cloud-123
```
## Delete Specified Subnet
Used for deleting subnets specified by the user
Command Format:
```bash
# del subnet <Subnet Instance ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del subnet subnet-123 --cloud cloud-123
```
