# JDFusion


## Introduction
Relevant interfaces related to Virtual Machines, Network Interfaces, Cloud Disk Service, networks and relational database, Object Storage Service, etc.


### Version
v1


## API
|Interface Name|Request Method|Function Description|
|---|---|---|
|**associateVpcEipById**|PUT|Associate Elastic IP to Virtual Machines|
|**attachDiskToVmInstanceByDiskId**|PUT|Attach Cloud Disk to Virtual Machines|
|**attachVpcNetworkInterfaceById**|PUT|Attach Network Interface to Virtual Machines|
|**createDisk**|POST|Create Cloud Disk according to the cloud provider|
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
|**getCloudInfoById**|GET|Obtain designated cloud information|
|**getCloudInfos**|GET|Obtain cloud registration information of the current user|
|**getDiskById**|GET|Search corresponding Cloud Disk resource information according to the cloud provider|
|**getDisks**|GET|Search corresponding Cloud Disk resource information according to the cloud provider|
|**getTaskInfoById**|GET|Read running results and running status with designated ID|
|**getTaskInfoHistoryById**|GET|Read running results and running status with designated ID|
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
|**rebootVmInstanceById**|PUT|Only instance with Running status can be rebooted.|
|**registCloudInfo**|POST|Associate cloud for designated users|
|**removeDiskById**|DELETE|Delete cloud disk|
|**startVmInstanceById**|PUT|Start an instance. The instance status must be Stopped in order to call its interface.|
|**stopVmInstanceById**|PUT|Stop running an instance. Only instance with Running status can carry out the operation.|
|**unregistCloudInfo**|DELETE|Obtain designated cloud information|
