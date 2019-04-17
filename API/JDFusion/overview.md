# JDFusion


## Introduction
Relevant interfaces related to Virtual Machines, Network Interfaces, Cloud Disk Service, networks and relational database, Object Storage Service, etc.


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**applyDeployment**|POST|Application Deployment|
|**associateVpcEipById**|PUT|Associate Elastic IP to Virtual Machines|
|**attachDiskToVmInstanceByDiskId**|PUT|Attach Cloud Disk to Virtual Machines|
|**attachVpcNetworkInterfaceById**|PUT|Attach Network Interface to Virtual Machines|
|**cloneDeployment**|PUT|Clone Deployment Information|
|**createBucket**|POST|Create OSS bucket according to the provided information|
|**createChannel**|POST|Create data synchronization channel|
|**createDatasource**|POST|Create data source|
|**createDeployment**|POST|Create deployment information|
|**createDisk**|POST|Create Cloud Disk according to the cloud provider|
|**createRdsAccounts**|POST|Create an account with designated RDS instance according to provided information|
|**createRdsDatabase**|POST|Create a database with designated RDS instance according to provided information|
|**createRdsInstance**|POST|Create the RDS instance according to provided information|
|**createTransferTask**|POST|Create Task|
|**createVmInstance**|POST|Create Virtual Machines according to the cloud provider|
|**createVmKeypair**|POST|Create key pair according to the cloud provider|
|**createVpc**|POST|Create VPC according to the cloud provider|
|**createVpcEip**|POST|Assign Public IP according to the cloud provider|
|**createVpcLBHttpListener**|POST|Create HTTP listener|
|**createVpcNetworkInterface**|POST|Create Network Interface according to the cloud provider|
|**createVpcSecurityGroup**|POST|Create Security Group according to the cloud provider|
|**createVpcSlb**|POST|Create load balancer according to the cloud provider|
|**createVpcSubnet**|POST|Create subnet according to the cloud provider|
|**createVpcVServerGroup**|POST|Create Virtual Server Group and add Backend Server|
|**deleteBucket**|DELETE|Delete OSS bucket information with designated ID|
|**deleteChannel**|DELETE|Delete channel|
|**deleteDatasource**|DELETE|Delete data source|
|**deleteDeployment**|DELETE|Delete deployment information|
|**deleteRdsAccount**|DELETE|Delete the account information with designated user name on the designated RDS instance|
|**deleteRdsByInstId**|DELETE|Delete the RDS instance information with designated ID|
|**deleteRdsDatabase**|DELETE|Delete the database information with designated database name on the designated RDS instance|
|**deleteTransferTask**|DELETE|Delete tasks according to the designated ID|
|**deleteVmInstanceById**|DELETE|Delete Virtual Machines by Virtual Machine id|
|**deleteVmKeypairByName**|DELETE|Delete key pair|
|**deleteVpcById**|DELETE|Delete VPC|
|**deleteVpcEipById**|DELETE|Release Public IP|
|**deleteVpcNetworkInterfaceById**|DELETE|Delete Elastic Network Interface|
|**deleteVpcSecurityGroupById**|DELETE|Delete Security Group|
|**deleteVpcSlbById**|DELETE|Delete SLB|
|**deleteVpcSubnetById**|DELETE|Delete subnet|
|**detachDiskToVmInstanceByDiskId**|PUT|Detach Cloud Disk from Virtual Machines|
|**detachVpcNetworkInterfaceById**|PUT|Detach Network Interface|
|**disassociateVpcEipById**|PUT|Disassociate EIP|
|**dryrunDeployment**|POST|Pre-deployment|
|**editDeployment**|PUT|Modify deployment information|
|**editTransferTask**|PUT|Modify tasks according to the designated ID|
|**getBucketByName**|GET|Search corresponding OSS bucket information according to the cloud providers|
|**getBucketFiles**|GET|Get file list on the designated OSS bucket according to the filtering conditions|
|**getBuckets**|GET|Search corresponding OSS bucket list according to the cloud providers|
|**getChannels**|GET|Search information of data synchronization channel|
|**getCloudInfoById**|GET|Obtain designated cloud information|
|**getCloudInfos**|GET|Obtain cloud registration information of the current user|
|**getDatasources**|GET|Search data source|
|**getDeploymentResult**|GET|Search executive results|
|**getDeploymentVersions**|GET|Search application records|
|**getDeployments**|GET|Search deployment information list|
|**getDeploymentsById**|GET|Search deployment information|
|**getDeploymentsVersion**|GET|Search detailed information of application records|
|**getDiskById**|GET|Search corresponding Cloud Disk resource information according to the cloud provider|
|**getDisks**|GET|Search corresponding Cloud Disk resource information according to the cloud provider|
|**getRdsAccountsByInstId**|GET|Get the account information on the designated RDS instance according to the filtering conditions|
|**getRdsAccountsByInstIdAndAccountName**|GET|Get the account information on the designated RDS instance according to the filtering conditions|
|**getRdsByInstId**|GET|Search corresponding RDS instance information according to the cloud providers|
|**getRdsDatabaseByInstIdAndDbName**|GET|Get the database information on the designated RDS instance according to the filtering conditions|
|**getRdsDatabasesByInstId**|GET|Get the database information on the designated RDS instance according to the filtering conditions|
|**getRdsInstances**|GET|Search corresponding RDS instance information according to the cloud providers|
|**getTaskInfoById**|GET|Read running results and running status with designated ID|
|**getTaskInfoHistoryById**|GET|Read running results and running status with designated ID|
|**getTransferTaskById**|GET|Get the task information according to the designated ID|
|**getTransferTaskFailedFiles**|GET|Search the file list of failed migrations according to the designated task id|
|**getTransferTaskProgress**|GET|Search the migration progress according to the designated id|
|**getTransferTasks**|GET|Get the task list|
|**getVmImages**|GET|Obtain information of the image resource according to the filter conditions|
|**getVmInstanceTypes**|GET|Specification list of Virtual Machines|
|**getVmInstances**|GET|Search information of corresponding Virtual Machine resource according to the cloud provider|
|**getVmInstancesById**|GET|Search information of corresponding VM resource according to the cloud provider|
|**getVmKeypairs**|GET|Search information of corresponding key pair resource according to the cloud provider|
|**getVmKeypairsByName**|GET|Search information of corresponding key pair resource according to the cloud provider|
|**getVpcById**|GET|Search information of corresponding VPC resource according to the cloud provider|
|**getVpcEipById**|GET|Search information of corresponding Public IP resource according to the cloud provider|
|**getVpcEips**|GET|Search information of corresponding Public IP resource according to the cloud provider|
|**getVpcNetworkInterfaceById**|GET|Search information of corresponding Network Interface resource according to the cloud provider|
|**getVpcNetworkInterfaces**|GET|Search information of corresponding Network Interface resource according to the cloud provider|
|**getVpcSecurityGroupById**|GET|Search information of corresponding Security Group resource according to the cloud provider|
|**getVpcSecurityGroups**|GET|Search information of corresponding Security Group resource according to the cloud provider|
|**getVpcSlbById**|GET|Search information of corresponding SLB resource according to the cloud provider|
|**getVpcSlbs**|GET|Search information of corresponding Load Balancer resource according to the cloud provider|
|**getVpcSubnetById**|GET|Search information of corresponding subnet resource according to the cloud provider|
|**getVpcSubnets**|GET|Search information of corresponding subnet resource according to the cloud provider|
|**getVpcVServerGroups**|GET|Obtain information of the server group according to the filter conditions|
|**getVpcs**|GET|Search VPC resource list|
|**grantRdsAccount**|PUT|Assign database permissions to the RDS account|
|**rebootVmInstanceById**|PUT|Only instance with Running status can be rebooted.|
|**registCloudInfo**|POST|Associate cloud for designated users|
|**removeDiskById**|DELETE|Delete cloud disk|
|**reverseDeployment**|POST|Reversely generate deployment according to the existing resources|
|**revokeRdsAccount**|DELETE|Assign database permissions to the RDS account|
|**rollbackDeploymentsVersion**|PUT|Application Deployment Rollback|
|**startChannel**|PUT|Start data synchronization|
|**startTransferTask**|PUT|Start the task according to the designated ID|
|**startVmInstanceById**|PUT|Start an instance. The instance status must be Stopped in order to call its interface.|
|**stopChannel**|PUT|Stop data synchronization|
|**stopTransferTask**|PUT|Stop the task according to the designated ID|
|**stopVmInstanceById**|PUT|Stop running an instance. Only instance with Running status can carry out the operation.|
|**unregistCloudInfo**|DELETE|Obtain designated cloud information|
