
# Deploy StorageClass

StorageClass provides a way to describe storage class (class) for JCS for Kubernetes, consisting of provisioner, parameters, volumeBindingMode, reclaimPolicy and other fields, which will be used when class needs to dynamically assign persistent volume.  
JD Cloud has provided CSI plug-in for JCS for Kubernetes, defining provisioner as a JD Cloud CSI plug-in, which can use JD Cloud Cloud Disk Service to provide persistent volume for JCS for Kubernetes. Currently, three kinds of storageclass are provided by default in JCS for Kubernetes:

```
kubectl get storageclass

NAME                PROVISIONER                 AGE
default (default)   zbs.csi.jdcloud.com         39d
jdcloud-hdd         zbs.csi.jdcloud.com         39d
jdcloud-ssd         zbs.csi.jdcloud.com         39d

```
Or, you can also create customized Storageclass:
```
apiVersion: storage.k8s.io/v1
kind: StorageClass
metadata:
  name: csi-ssdio
parameters:
  fstype: ext4
  type: ssd.io1
provisioner: zbs.csi.jdcloud.com
reclaimPolicy: Delete
volumeBindingMode: WaitForFirstConsumer
```
**Parameter Description:**  
1. provisioner: zbs.csi.jdcloud.com, which cannot be modified; identifier is created using the JD Cloud Cloud Disk Service Provisioner plug-in.

2. type: The following 3 types of Cloud Disk Service are available

|StorageClass type | Cloud Disk Service Type   |Capacity Range  |Step Size|
| ------ | ------ | ------ |------ |
|hdd.std1	|Capacity Type hdd | [20-16000]GiB  |10GiB|
|ssd.gp1	|General ssd | [20-16000]GiB  |10GiB|
|ssd.io1	|Performance Type ssd | [20-16000]GiB  |10GiB|

2. reclaimPolicy: Persistent Volume, dynamically created by storage class, will specify the recycle policy in the field reclaimPolicy, being Delete or Retain. If reclaimPolicy is not designated when the storageClass object is created, Delete is the default value.

3、parameters  
  - type: Set the parameter value as hdd.std1 ssd.gp1 or ssd.io1, respectively corresponding to JD Cloud's Capacity HDD, General SSD and Performance SSD Cloud Disks;
  - fstype: Set the file system type, with the optional parameter values of xfs and ext4. If fstype is not specified, ext4 will be used as the file system type by default. For example: fstype=ext4;
  - volumeBindingMode: The optional parameters include WaitForFirstConsumer and Immediate, with the default value of Immediate.


4. When creating the Persistent Volume Claim, one specific storageclass resource can be associated with the storageClassName field, one Persistent Volume can be dynamically created and associated according to definitions of storageClass or the Persistent Volume with the same storageClassName and with satisfactory parameters can be directly associated. For more details, please refer to [Deploy CSI Persistent Volume](./Deploy-PV-New.md)  ;

5. For more descriptions of the parameter storageClass, please refer to [Kubernetes Parameter Instruction](https://kubernetes.io/docs/concepts/storage/storage-classes/). 
