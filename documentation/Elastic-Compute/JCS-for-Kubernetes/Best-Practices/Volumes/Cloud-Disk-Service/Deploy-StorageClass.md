
# Deploying StorageClass

StorageClass provides a way for JCS for Kubernetes to describe storage classes, including fields such as provisioner, parameters, and reclaimPolicy, which are used when class needs to dynamically allocate persistent storage.  
JD Cloud provides customized volume plug-in [kubernetes.io/jdcloud-ebs](https://kubernetes.io/docs/concepts/storage/storage-classes/) for JCS for Kubernetes, defines provisioner as JD Cloud customized volume plug-in, and provides persistent storage for JCS for Kubernetes with JD Cloud cloud disk. At present, in the JCS for Kubernetes service, we provide three kinds of storageclass.

```
kubectl get storageclass

NAME                PROVISIONER                 AGE
default (default)   kubernetes.io/jdcloud-ebs   39d
jdcloud-hdd         kubernetes.io/jdcloud-ebs   39d
jdcloud-ssd         kubernetes.io/jdcloud-ebs   39d

```

You can also create customized Storageclass:

```
kind: StorageClass
apiVersion: storage.k8s.io/v1
metadata:
  name: mystorageclass-hdd1
provisioner: kubernetes.io/jdcloud-ebs
parameters:
  zones: cn-north-1a, cn-north-1b
  fstype: ext4
reclaimPolicy: Retain
```

**Parameter Description:**  

1. provisioner: Set the parameter value to [kubernetes.io/jdcloud-ebs](https://kubernetes.io/docs/concepts/storage/storage-classes/), and it should not be modified. Identity is created with the JD Cloud cloud disk Provisioner plug-in.

2. reclaimPolicy: Persistent Volume, dynamically created by storage class, will specify the recycle policy in the field reclaimPolicy, being Delete or Retain. If reclaimPolicy is not designated when the storageClass object is created, Delete is the default value.

3. parameters  
  - type: Set the parameter value as ssd.gp1, ssd.io1 or hdd.std1, respectively corresponding to General Type SSD Cloud Disk, Performance Type SSD Cloud Disk and Capacity Type HDD Cloud Disk of JD Cloud;
  - fstype: Set the file system type, with optional parameter values of fstyle and ext4. If no fstyle is specified, ext4 will be used as the default file system type; for example, fstyle = ext4;  
  - zones: Set availability zones of Cloud Disk Service according to region of clusters; you are not required to set this parameter for the region supporting a single availability zone; you may choose one availability zone or all availability zones for the region supporting multiple availability zones (separate parameter values with ","), for example zones=cn-north-1a, cn-north-1b; when selecting all availability zones, the created Cloud Disk Service will be distributed to one availability zone at random according to the name hash algorithm; for correspondence between region and availability zone, please refer to the table below:  

|Region | Availability Zone   |
| ------ | ------ | 
|cn-north-1	|Availability Zone A	cn-north-1a  |
|cn-north-1	|Availability Zone B	cn-north-1b  |
|cn-north-1	|Availability Zone C	cn-north-1c  |
|cn-east-1	|Availability Zone A	cn-east-1a  |
|cn-east-2	|Availability Zone A	cn-east-2a  |
|cn-east-2	|Availability Zone B	cn-east-2b  |
|cn-south-1	|Availability Zone A	cn-south-1a   |

4. When creating the Persistent Volume Claim, one specific storageclass resource can be associated with the storageClassName field, one Persistent Volume can be dynamically created and associated according to definitions of storageClass or the Persistent Volume with the same storageClassName and with satisfactory parameters can be directly associated; for more details, please refer to [Deploy Persistent Volume](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-pv);

5. For more descriptions of the parameter storageClass, please refer to [Kubernetes Parameter Instruction](https://kubernetes.io/docs/concepts/storage/storage-classes/). 


 
