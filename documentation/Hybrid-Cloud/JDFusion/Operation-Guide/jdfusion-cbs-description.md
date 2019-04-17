# Relevant Commands About Cloud Disks
## Cloud Disk List
Used for displaying the information list of all cloud disks on the cloud specified by the user
Command Format:
```bash
# list disks --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list disks --cloud cloud-123
```
## Details of Cloud Disk
Used for displaying details of the cloud disk specified by the user
Command Format:
```bash
# describe disk <Cloud Disk Instance ID> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe disk disk-123
```
## Create Cloud Disk
Used for creating the cloud disk on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create disk [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "disk": {
    "name": "string",
    "description": "string",
    "diskSizeGB": 0,
    "az": "string",
    "diskType": "string",
    "snapshotId": "string",
    "tags": [
      {
        "tagKey": "string",
        "tagValue": "string"
      }
    ]
  }
}
```
Example:
```bash
create disk -f /data/json/disk.json --cloud cloud-123
```
## Delete the Specified Cloud Disk
Used for deleting the cloud disk specified by the user
Command Format:
```bash
# del disk <Cloud Disk Instance ID> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del disk disk-123 --cloud cloud-123
```
## Associate the cloud disks to the Virtual Machines
Used for associating the cloud disk specified by the user to the Virtual Machines specified by the user
Command Format:
```bash
# attach disk --from <Cloud Disk Instance ID> --to <IDs of Virtual Machines> --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --from | Required, specifying the cloud disk ID to be associated |
| --to | Required, specifying the IDs of Virtual Machines to be associated with the cloud disk |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
| --tail | Track the task execution process and do not appear with --no-table at the same time |
| --no-table | Show the ID of the result only and cannot appear with --tail at the same time |
Example:
```bash
attach disk --from disk-123 --to vm-123 --cloud cloud-123
```
## Disassociate the cloud disk from the Virtual Machines
Used for disassociating the cloud disks specified by the user from the Virtual Machines specified by the user
Command Format:
```bash
# detach disk --from <Cloud Disk Instance ID> --to <IDs of Virtual Machines> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --from | Required, specifying the cloud disk ID to be disassociated |
| --to | Required, specifying the Virtual Machines from which the specified cloud disks are disassociated |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
detach disk --from disk-123 --to vm-123 --cloud cloud-123
