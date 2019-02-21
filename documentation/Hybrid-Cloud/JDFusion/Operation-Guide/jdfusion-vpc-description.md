# Relevant Commands of VPCs
## List of VPCs
Used for displaying the information list of all VPCs on the cloud specified by the user
Command Format:
```bash
# list vpcs --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list vpcs --cloud cloud-123
```
## Details of VPCs
Used for displaying details of the VPCs specified by the user
Command Format:
```bash
# describe vpc <VPC Instance ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe vpc vpc-123
```
## Create VPC
Used for creating VPCs on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create vpc [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "vpc": {
    "name": "string",
    "addressPrefix": "string",
    "description": "string",
    "cidrBlock": "string",
    "userCidr": "string"
  }
}
```
Example:
```bash
create vpc -f /data/json/vpc.json --cloud cloud-123
```
## Delete the Specified VPCs
Used for deleting the VPCs specified by the user
Command Format:
```bash
# del vpc <VPC Instance ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del vpc vpc-123 --cloud cloud-123
```
