# Relevant Commands About Security Groups
## Security Group List
Used for displaying the information list of all Security Groups on the cloud specified by the user
Command Format:
```bash
# list sgs --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list sgs --cloud cloud-123
```
## Details of Security Groups
Used for displaying details of the Security Groups specified by the user
Command Format:
```bash
# describe sg <Security Group ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe sg sg-123
```
## Create Security Group
Used for creating the Security Group on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create sgs [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "securityGroup": {
    "name": "string",
    "description": "string",
    "vpcId": "string"
  }
}
```
Example:
```bash
create sgs -f /data/json/sgs.json --cloud cloud-123
```
## Delete the Specified Security Group
Used for deleting the Security Group specified by the user
Command Format:
```bash
# del sg <Security Group Instance ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del sg sg-123 --cloud cloud-123
```
