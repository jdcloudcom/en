## JCS for Kubernetes System Log
### Introduction
Now, the JCS for Kubernetes log type for access of Log service is the **System Log**.

In the full-text retrieval module, the system log of JCS for Kubernetes only supports the full-text retrieval of all content of originalMsg (log original), and in the key value retrieval module, it supports the key value retrieval of all fields.

### Field Description
Log Field | Log Description | Log Type 
-- | -- | -- 
cluster_id  | Cluster id | string 
region_id  | Region | string 
source  | Name of Log File/Source Identifier | string 
stream  | Output Device | string 
severity  | Log Level | string 
time  | Log time, the field is taken as the time field of backend storage | string 
file  | Module Name of Collection Log. e.g., etcd kube-controller | string 
originalMsg  | Log Original | string 
appName  | Application Identifier | string 
container_image  | Docker Image | string 
container_name  | Container Name | string 
host  | Machine Name | string 
namespace_name  | Name of Namespace | string 
pod_id  | pod id| string 
pod_name  | pod Name | string 

