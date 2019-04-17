# Relevant Commands About Cloud Information
## Cloud Information List
Used for displaying the information list of all clouds registered by the user
Command Format:
```bash
# list clouds [--vendor <Cloud Vendor>]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| --vendor | Cloud Vendor |
Example:
```bash
list clouds --vendor jdcloud
```
## Details of Cloud Information
Used for displaying details of the clouds specified by the user
Command Format:
```bash
# describe cloud <Cloud Instance ID>
```
Parameters:
None
Example:
```bash
describe cloud cloud-123
```
## Registration Cloud Information
Used for registering the specified cloud on the JD Fusion platform according to the configuration platform in the JSON format
Command Format:
```bash
# register cloud [ -f <File Name> | -i <Data in JSON format> ]
```
Parameters:
| Parameter Name | Parameter Description |
| ---- | ---- |
| -f/--file | Either -f or -i must be selected for the file name and the data in the JSON format must be used as the content |
| -i/--input | Either -f or -i must be selected and the data in the JSON format must be used as the content |
Example of JSON Format:
```json
{
  "cloud": {
    "name": "string",
    "vendor": "string",
    "info": {},
    "metadata": {}
  }
}
```
Example:
```bash
register cloud -i '{"cloud":{"name":"mycloud111","vendor":"jdcloud","info":{"access_key":"my_access_key","secret_key":"my_secret_key","region":"cn-north-1"},"metadata":{}}}'
```
-The content of the parameter i is in the standard JSON format, which can be marked with the single quotation marks ('') under the Linux environment. However, under the Windows environment, the parameter shall be transferred with the double quotation marks ("") of the JSON character string without any single quotation marks ('').
## Log out Cloud Information
Log out the cloud information specified by the user from the JD Fusion platform
Command Format:
```bash
# unregister cloud <Cloud Instance ID>
```
Parameters:
None
Example:
```bash
unregister cloud cloud-123
```
