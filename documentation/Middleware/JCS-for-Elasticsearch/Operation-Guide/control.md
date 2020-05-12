## IAM
### Introduction of IAM
Core functions of Identity and Access Management (IAM) Service mainly comprises user identity management and resource access management. User can use IAM to create, manage sub-users and control the operation permission of them to access JD Cloud resources. The primary account can use IAM to authorize resources in the management account to others without sharing account password or access secret key and assign minimum permissions for the users as required to reduce the security risks of enterprise information.</br>

The IAM function of JCS for Elasticsearch is realized via [IAM](https://docs.jdcloud.com/en/iam/product-overview), and the user needs to go to [IAM Menu](https://iam-console.jdcloud.com/summary) to set permission of sub-account and user role.</br>

For more information on IAM, please go to [IAM](https://docs.jdcloud.com/en/iam/product-overview) to view.</br>
### ES IAM Policy

#### System Policy

Now, 2 system policies have been preset in ES and user can authorize the same to sub-account on demand. The preset policies of the system are as follows:</br>

System Policy Name | Permission Description | Type | Resource Scope | Description 
:---: | :--- | :--- | :--- | :---
JDCloudElasticSearchAdmin  | Read Permission of JCS for Elasticsearch | System Type | All Resources of JCS for Elasticsearch Under Primary Account | Provide the user with permissions of creating and managing all cluster instances of es, including Kibana access permission |
JDCloudElasticSearchRead  | Administrator Permission of JCS for Elasticsearch | System Type | All Resources of JCS for Elasticsearch Under Primary Account | Provide the user with permissions of viewing ES cluster instances, including the kibana access permission and excluding operation permissions such as creation and deletion. |

#### Dependence Policy
Resource policies reliant by sub-account are as follows, which can be added when the system policies cannot meet use demands:</br>

API Name | Permission Description | Permission Type | Remarks |  
:---: | :--- | :--- | :--- | 
JDCloudRenewalAdmin  | Renewal Administrator Permission | System Policy | Add when a sub-user can execute the renewal operation |
JDCloudOrderPayment  | Cashier Desk Payment Permission | System Policy | Add when a sub-user can create resources and make renew operation |


#### Customized Policy

If system policies cannot meet your use demands, please refer to [Operation Guide](https://docs.jdcloud.com/en/iam/policy-management) of IAM and authorize corresponding operation permissions to the sub-account by [Customized Policy](https://iam-console.jdcloud.com/policy/generator). Now, operation-level permissions supported by ES are as follows:</br>

Interface Name | Permission Description | Permission Type | Resource Range |  
:---: | :--- | :--- | :--- | 
describeInstanceConfigs  | Get es Configuration Information | Read | All Resources of JCS for Elasticsearch Under Primary Account |
describeInstanceConfig  | Get es Configuration Information Based on Version| Read | All Resources of JCS for Elasticsearch Under Primary Account |
describeInstances  | Search es Instance List | Read | All Resources of JCS for Elasticsearch Under Primary Account |
describeInstance | Search es Instance Detail | Read | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
describeKibana  | Access kibana | Read | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
describeDicts  | Get Dictionary File Name Uploaded by es Instance | Read | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
describeInstanceNodes  | Get es Instance Node List | Read | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
describeAutoSnapshot  | auto snapshot Setting Search | Read | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
describeSnapshots  | Search snapshot List | Read | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
createInstance  | Create an es Instance with Specified Configuration | Write | All Resources of JCS for Elasticsearch Under Primary Account |
deleteInstance  | Delete a Single es Instance | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
modifyInstanceName | Modify es Instance Name | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
modifyInstanceSpec  | Change es instance configuration; select one of the three | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
disableDicts  | Close the customized dictionary. Clear Dictionaries Uploaded by the User at the Same Time | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
uploadDict  | Load Local Dictionary Files and Upload to es | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
deleteDict  | Delete a Single Dictionary File | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
createSnapshot  | Create a Single snapshot | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
modifyAutoSnapshot | auto snapshot Setting | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
describeKibana | Access Kibana | Write | Some Selectable Resources of JCS for Elasticsearch Under Primary Account |
