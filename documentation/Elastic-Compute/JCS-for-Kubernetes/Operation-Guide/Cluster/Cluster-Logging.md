# Cluster Log

## Overview

- JD Cloud offers JCS for Kubernetes with the types of system log, user log and container real-time log, in which the system log is integrated with the user log and log service for the convenience of multi-dimensional search, retrieval and analysis by users to provide effective support for daily operation and maintenance and management.

## System Log

Since JD Cloud JCS for Kubernetes is a hosted cluster, the services on Master node, such as kube-apiserver, kube-controller-manager, are run as cabinet service. Users will manage their own kubernetes business through Kubernetes API server. Therefore, we have provided the system log features to help users better understand the running status of JCS for Kubernetes.

### View system log

The system log does not require users to conduct any operation on JCS for Kubernetes since all new JCS for Kubernetes by default will send the system log to the log service backend. Users can view them in the log service at any time. The specify operation steps are as follows  
1. Enter the log collection management page, select the created log collection, click the "View" button, enter the log details page, select the collection configuration "unconfigured" status log subject, click the "Collection Configuration" button to enter the collection configuration page.  
2. Click the "Add Collection Configuration" button to enter the adding collection configuration page.  
3. Select the product (JCS for Kubernetes), log type (System log), select "All Instances" or "Select Instances" for the collection instance, and click "Save" to complete the settings of collection configuration.  
- All instances: Collect **all instances in all regions** of the user product, including automatically collect the follow-up newly increased instances.    
- Select instances: Select partial instances; you may collect the instances you are paying attention to. Up to 20 instances can be added.  
For more operations of the log service, you can access [Help Documentation of Log Service](../../../../Management/Log-Service/Getting-Started/LogService-Started.md)

### System Log Module

The system log includes the following module

| Module Name                  | Description                  | 
| :-------------------:| :-------------------: | 
| kube-apiserver                 | Kubernetes API server                 | 
| kube-proxy-master                 |  Network Agent Service on Master Node                | 
| kube-scheduler                 | Kubernetes Scheduler                   | 
| kube-controller-manager                   | Management Controller                  | 
| scheduler-extender                  |  Scheduler Extension                 | 
| etcd                  | Provide Kubernetes metadata storage                   | 
| dockerd                 | docker daemon                   | 
| kubelet                 | Container Service on Management Node                   | 


### Definition of System Log Metadata

| Field Name                  | Definition                  | 
| :-------------------:| :-------------------: | 
| cluster_id             | Cluster id                  |
| region_id                  | Region id                  |
| source                  | Log file name                  |
| stream                  | Output Device                  |
| severity                  | Log Level                  |
| time                 | Log Time Stamp                  |
| file                 | Module Name of Collection Log                  |
| originalMsg                  | Log Original                  |
| appName                  | Application Identifier                  |
| container_image                  | Container Image                  |
| container_name                  | Container Name                  |
| host                  | Machine Name                  |
| namespace_name                  | Name of Namespace                  |
| pod_id                  | pod id                  |
| pod_name                  | pod Name                  |



## User Log

After the user log features are enabled, agents deployed on the working node will collect all the standard output logs run in the container on the working node group and forward to the log server, and then users can search and analyze relevant logs at the log server.

### Create JCS for Kubernetes supporting user logs

1. Log in the Console; select **Elastic Compute**-**JCS for Kubernetes** on the left menu; click to enter the JCS for Kubernetes List page;  
2. Click the **Create** button to enter the cluster creation page;  
3. Confirm to enable the log service in the cluster information;  
4. After completing other required information configuration of clusters, click the **OK** button to enter the cluster creation process;    
5. Log service set k8s-log-{ClusterID} of the related cluster will be automatically created. ClusterID is the only identifier of the new JCS for Kubernetes  

### Enable/disable user log of JCS for Kubernetes
After cluster is created, you can disable or enable the cluster user log again in the Console. After the cluster user log is disabled, the stored log will not be affected; once enabled again, the new log will be sent to the corresponding log set.

1. Log in the Console; select **Elastic Compute**-**JCS for Kubernetes**-**Cluster Name** on the left menu; click to enter the JCS for Kubernetes Details page;  
2. Select the log service on the details; click **Disable** or **Enable** the user log of JCS for Kubernetes;  

### View user log
After the user enables the log service of JCS for Kubernetes, the log service set k8s-log-{ClusterID} of the related cluster will be automatically created and then the user can view it in the log service.

1. Log in JD Cloud console, select **Management** - **Log Service** at the left menu to enter the log set management page.  
2. Select the region corresponding to JCS for Kubernetes, find the log set named as k8s-log-{ClusterID} in the log set list. ClusterID is the only identifier of the new JCS for Kubernetes.  
3. Click **Log Set** to enter the log subject page, select the log subject to be viewed and click **Retrieval** to view it.  

For more operations of the log service, you can access [Help Documentation of Log Service](../../../../Management/Log-Service/Getting-Started/LogService-Started.md)


### Definition of User Log Metadata

| Field Name                  | Definition                  | 
| :-------------------:| :-------------------: | 
| pin             | User identifier                  |
| logtopicUID                  |     Log Subject ID              |
| stream                  | Output Device                  |
| timestamp                 | Log Time                |
| az                | Availability Zone                  |
| cluster_id                | Cluster ID                  |
| container_name                  | Container Name                  |
| host_name                 | Node Machine Name                  |
| instance_id                  | Node Virtual Machine id                  |
| instance_name                  | Node Virtual Machine Name                  |
| logtype                  |       Log Type {System, User}            |
| namespace_name                  | Name of Namespace                  |
| object_name                  |    k8s Object Name, e.g. pod name               |
| region_id                  | Region                  |
| serverity                  | Log Level                  |
| source                  | Log file name                  |
| content                  | Log Original                  |


### Restrictions on User Log Collection Agent
Restrictions on File Collection


|        Types                  |           Restrictions                       |
| ------------------------ | -------------------------------- |
| Types                   | Restrictions                     |
| File Code             | utf-8                            |
| Log File Size       | max size=100MB                   |
| Log File Round Robin       | max files=5                      |
| Collection Behavior at Log Resolution Block | Discard                           |
| Soft Link                | Support                           |
| Single Log Size       | max size=32k                     |
| Multiple Collection Configuration Related to the Same One File | Not Support                        |
| File Open Behavior       | Write Once Read Many                     |
| First Log Collection Behavior | There is a db saving Pos and collecting logs from the new offset |
| Non-standard Text Log    | Not Support                        |

Resource, Performance Restriction

|        Types                  |           Restrictions                       |
| ------------------------ | -------------------------------- |
| Log Handling Capacity | Single Node 2MB/s                    |
| Monitoring Directory Count  | 2 Root Directories                     |
| Monitoring File Count  | k8s Maximum Pod Count X Maximum Container Count in Pod |
| Default Resource Restriction | Backend Restriction                      |

Error Processing Restriction

|        Types                  |           Restrictions                       |
| ------------------------ | -------------------------------- |
| Network Error Processing | Limited Retry |
| Resource Quota Exceed Processing | Monitoring Alarm |
| Maximum Attempt Time for Time-out | 5s           |
| Network Error Processing | Limited Retry |


### Other Restrictions

1. Currently, the user log doesn't support customized collection. Standard output contents in containers of all users will be collected by default once the log service is enabled. When deploying business, users can redirect the business log to stdout stderr  
2. Not support sidecar mode  
3. Not support running log collection agent in non-JD Cloud hosted cluster    
4.1.8 version JCS for Kubernetes doesn't support log features. Users are recommended upgrading to the updated version as soon as possible  


## Container Real-time Log

In addition to system log and user log, JCS for Kubernetes provides Console to view the container real-time log, like kubectl logs.

### View container real-time log
1. Log in the Console; select **Elastic Compute** - **JCS for Kubernetes** - **Workloads** - **Pod** on the left menu; click to enter the Pod Details;   
2. Select **Container** on the tab column in the Details to enter the container list; select the container to be viewed and click it to enter Container Details  
3. Select **Log** on the tag column in the Container Details to enter the container log page  
4. In the container log page, select the container, time interval, log output rows and maximum log bytes, click **Search** to see the container log in the below window  


