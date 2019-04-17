# Relevant Commands About Key Pairs
## List of Key Pairs
Used for displaying the information list of all key pairs on the cloud specified by the user
Command Format:
```bash
# list kps --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
list kps --cloud cloud-123
```
## Details About Key Pairs
Used for displaying details of the names specified by the user
Command Format:
```bash
# describe keypair <name of Key Pair> [ --cloud <Cloud Instance ID> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Cloud Instance ID (id of list clouds) |
Example:
```bash
describe keypair kp-name
```
### **Create Key Pairs**
Used for creating the key pairs on the specified cloud according to the configuration file in the JSON format
Command Format:
```bash
# create keypair [ -f <File Name> | -i <Data in JSON Format> ] --cloud <Cloud Instance ID> [ --tail ] [ --no-table ]
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
  "keypair": {
    "name": "string",
    "publicKey": "string"
  }
}
```
Example:
```bash
create keypair -f /data/json/keypair.json --cloud cloud-123
```
## Delete the Specified Key Pair
Used for deleting the name specified by the user
Command Format:
```bash
# del keypair <name of Key Pair> --cloud <Cloud Instance ID>
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --cloud | Required, Cloud Instance ID (id of list clouds) |
Example:
```bash
del keypair kp-name --cloud cloud-123
```
