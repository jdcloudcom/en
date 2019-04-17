# Relevant Commands about Public IP(s) 
## List of Public IP(s)
Used for displaying the information list of all Public IP(S) on the cloud specified by the user
Command Format:
```bash
# list eips --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list eips --cloud cloud-123
```
## Details of Public IP(s)
Used for displaying details of the public IP(s) specified by the user
Command Format:
```bash
# describe eip <Elastic IP Instance ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |

| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe eip eip-123
```
## Assignment of Public IP
Used for assigning the public IP on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create eip [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]

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
  "allocate": {
    "name": "string",
    "bandwidth": "string",
    "provider": "string"
  }
}
```
Example:
```bash
create eip -f /data/json/eip.json --cloud cloud-123
```
## Delete Specified Public IP
Used for deleting the public IP specified by the user
Command Format:
```bash
# del eip <Elastic IP Instance ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del eip eip-123 --cloud cloud-123
```
## Associate EIP to the Virtual Machines
Used for associating the Public IP specified by the user to the Virtual Machines specified by the user
Command Format:
```bash
# attach eip --from <Public IP Instance ID> --to <IDs of Virtual Machines> --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --from | Required, specifying the Public IP ID to be associated |
| --to | Required, specifying the IDs of Virtual Machines to be associated with the public IP ID |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
| --tail | Track the task execution process and do not appear with --no-table at the same time |
| --no-table | Show the ID of the result only and cannot appear with --tail at the same time |
Example:
```bash
attach eip --from eip-123 --to vm-123 --cloud cloud-123
```
## Disassociate the public IP from the Virtual Machines
Used for disassociating the public IP specified by the user from the Virtual Machines specified by the user
Command Format:
```bash
# detach eip --from <Public IP Instance ID> --to <IDs of Virtual Machines> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --from | Required, specifying the public IP ID to be disassociated |
| --to | Required, specifying the Virtual Machines from which the specified public IPs are disassociated |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
detach eip --from eip-123 --to vm-123 --cloud cloud-123
