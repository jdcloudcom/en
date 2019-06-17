
# Deployment Operation Instructions
## Overview
　　Deployment is a resource orchestration file which can be edited by the user. The Hybrid Cloud Deployment function uses templates as a standard to describe resource configuration information and dependencies in batches to achieve unified deployment of resources, and can realize resource configuration backup of platforms on the same cloud and platforms across the cloud and resource recovery and replication through its specific reverse deployment pattern. The Deployment engine can complete the automated build and deployment of resources with definitions of Deployment to realize purposes such as unified management of resources and automatic operation and maintenance.

- Support Visual Operation and Editing of Interface
- Support "Standard" JSON-style syntax, which can be converted to a code editor;
- Support historical change log view and rollback of deployment of Resource Orchestration;
- Support flexible variable definitions and references;
- Support flexible cross-referencing of attributes between resources;
- Support view of detailed execution report;
- Support Deployment Clone Function;

## Application Scenarios

- ### Resource Batch Create
  By creating Deployment and starting execution, it can batch create and flexibly build various application scenarios, the specific operation process is as follows:

![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/create-reses.png)

 1. Firstly, go to the Deployment Create page, select the cloud platform, fill in the name, description and other basic information, and then click the add resource button to carry out batch maintenance of resources


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/create-deployment.png)


 2. Select resource type, and fill in the resource alias (note: the resource alias is used only when the build engine creates a resource and will not be attached to any attribute of the resource, which shall not be confused with the resource name), and click **Next Step** to enter the resource attribute editing interface (the operation here is basically the same as the creation page of resource management). After completion, click **OK** to complete the description and definition of the resource to be added. If other resources will be added continuously, repeat the process, and finally click **Submit


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/add-resources-1.png)

![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/add-resources-3.png)


 3. After Deployment creation succeeded, the record can be queried on the list page, click **Execute** button on the right, start to execute the Orchestration task to build resource (note: the same Deployment record can be modified and executed repeatedly, the build engine performs differentiated build by comparing changes with each change, and the system supports rollback with respect to the results of each execution)


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/demolist-deployment.png)


 4. After implementing operations with respect to Deployment Start, a notification of ‘Deployment execution is in the task queue’ will be received, after completion of the task execution, a message from the system will be received to report the execution result, and click to view details (note: if the task fails, the detailed reasons for failure can be viewed in the execution report).


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/demolist-deployment.png)

![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/report-deployment.png)


- #### Resource Configuration Backup and Cross-Cloud Replication Build
  The configuration information of existing resources in the cloud platform can be exported and the execution can be restarted again to rapidly build resources and restore application scenarios by utilizing the reverse deployment function of Deployment, which greatly reduces the workload of manual operation, the specific operation process is as follows:


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/backup-reses.png)


 1. Firstly, go to the Deployment Create page, select the cloud platform, fill in the name, description and other basic information, and select the existing resources on the cloud platform to add them to Deployment, batch import resource configuration information (the resource alias rule here is consistent with the Deployment create rule)


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/backup-deployment.png)


 2. For security, the Deployment generated from reverse deployment is in a read-only state, which cannot be executed and rolled back, operations only must be performed after cloning and generating the same Deployment


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/clone-deployment.png)


 3. By executing Deployment generated from cloning, resources can be built in batches to realize backup recovery of application scenarios, and their cloud platform attributes can be modified to attributes pf other cloud platforms and other resource, so as to facilitate cross-cloud replication, migration and capacity expansion of resources


## Q&A
- #### How to use JSON CODE Edit Mode?

 - ##### Overview

  JSON CODE Edit Mode of Deployment is a quick operation method differentiated from visual editing, which can use JSON standard format code to quickly define a Deployment to support text copy, paste, cut and other operations. Visual editing and JSON CODE mode can be switched freely and compatible with each other.
 
 - ####Structure Description
```javascript
 {
 "deployment": {
 "info": {
 "name": "", //Name
 "description": "", // Description
 "version": "", //Version number, default 1.0, no other values are accepted now
 "readOnly": {0} // Value type, {0}: read and write, 1: read-only
 },
 "content": { //Resource Description, Object Type
 "vms": {}, //Virtual Machines
 "subnets": {}, //Subnet
 "networkInterfaces": {}, //Elastic Network Interface
 "vpcs": {}, //Virtual Private Cloud
 "keypairs": {}, //Secret Key Pair
 "disks": {}, //Cloud Disk Service
 "eips": {}, //Elastic IP
 "diskAttachment": {}, //Disk Attach
 "eipAssociate": {}, //Elastic IP
 "netInterfaceAttachment": {}, //Network Interface Attach
 "slbs": {}, //Load Balancer
 "vserverGroups": {}, //Virtual Server Group of Load Balancer
 "httpListeners": {}, //Load Balancer Listener
 "rds": {}, //Cloud Database RDS Instance
 "rdsDatabase": {}, //RDS Database
 "rdsAccount": {}, //RDS Account
 "rdsAccountGrant": {}, //Account Authorization
 "bucket": {}, //Object Storage Service
 "avaiGroup": {}, //Availability Group
 "instanceTemplate": {}, //Instance Template
 "variables": {} //Variable Definition
 }
 }
}
```
Description: for the standard format of resource description, it can click **JSON CODE** for view after adding the resource.

 - Restrictions
   * The field validity validation and business legitimacy validation (for example, whether the IP Address format is standard or not, whether it belongs to the scope of CIDR, etc.) will not be performed for Resource Orchestration through JSON CODE mode, so please operate with care

- #### How to quickly build orchestration templates by use of variables?

 - Overview
   - When creating Deployment, the use of variables can enhance flexibility and improve reusability of orchestration template. Use of resource variables can achieve pre-association between resources. For example, to batch build a set of applications, including one Virtual Private Cloud, one Subnet, one VM Instance, one Public IP, and the names of all resources are "web-a", parameters can be defined in Deployment according to the following example:
```json
{
 "deployment": {
 "info": {
 "cloudID": "9b73cc4e-ffc8-4ca0-b628-ecd909d13a8f",
 "name": "application-demo",
 "description": "application",
 "version": "1.0",
 "readOnly": 0
 },
 "content": {
 "eipAssociate": {
 "eip_associate_1": {
 "cloudID": "9b73cc4e-ffc8-4ca0-b628-ecd909d13a8f",
 "instanceId": "${vms.vm_instance_1.id}",
 "eipId": "${eips.eip_1.id}",
 "instanceType": "vm"
 }
 },
 "vpcs": {
 "vpc_1": {
 "cloudID": "9b73cc4e-ffc8-4ca0-b628-ecd909d13a8f",
 "name": "${variables.name}",
 "description": "",
 "cidrBlock": "192.168.0.0/16"
 }
 },
 "subnets": {
 "subnet_1": {
 "cloudID": "9b73cc4e-ffc8-4ca0-b628-ecd909d13a8f",
 "az": "cn-qingdao-c",
 "vpcId": "${vpcs.vpc_1.id}",
 "cidrBlock": "0.0.0.0/0",
 "description": "",
 "name": "${variables.name}"
 }
 },
 "vms": {
 "vm_instance_1": {
 "az": "cn-qingdao-c",
 "name": "${variables.name}",
 "hostName": "",
 "description": "",
 "vpcId": "${vpcs.vpc_1.id}",
 "subnetId": "${subnets.subnet_1.id}",
 "tags": [],
 "privateIpAddress": "",
 "imageId": "coreos_2023_4_0_64_30G_alibase_20190319.vhd",
 "instanceFlavorType": "ecs.se1.large",
 "securityGroupId": "${sgs.sg_1.id}",
 "internetMaxBandwidthIn": 1,
 "internetMaxBandwidthOut": 1,
 "password": "",
 "passwordInherit": false,
 "userData": "",
 "keyPairName": "",
 "systemDisk": {
 "category": "cloud_ssd",
 "diskSize": 40,
 "description": ""
 }
 }
 },
 "eips": {
 "eip_1": {
 "cloudID": "9b73cc4e-ffc8-4ca0-b628-ecd909d13a8f",
 "name": "eip",
 "bandwidth": 1,
 "provider": "bgp"
 }
 },
 "variables": {
 "name": "web-a"
 }
 }
 }
}


```
 - Operation Instructions to Variable Selector
 1. To facilitate the use of variables, the system provides a variable selector, which can quickly extract and use variables. Click the lower **Use Variable** button on the page of adding resource to call out the variable selector, select the variable and click replication so that such variable can be pasted for use at any location


![创建实例](https://github.com/jdcloudcom/cn/blob/edit/image/JDFusion/res-variables.png)






