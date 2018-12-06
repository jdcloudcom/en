
# Deploy Persistent Storage

JD Cloud Kubernetes Service integrates JD Cloud cloud disk, and you can use JD Cloud cloud disk service as persistent storage in the cluster.  

## I. Use JD Cloud disk to define static storage.
    
**1. Create PV**
```
kind: PersistentVolume
apiVersion: v1
metadata:
  name: pv-static
  labels:
    type: jdcloud-ebs
spec:
  capacity:
    storage: 30Gi
  accessModes:
    - ReadWriteOnce
  persistentVolumeReclaimPolicy: Retain
  jdcloudElasticBlockStore:
    volumeID: vol-ogcbkdjg7x
    fsType: xfs
```     
**Parameter Description:**

1、To use JD Cloud cloud disk as persistent storage in JD Cloud JCS for Kubernetes Service, you should specify the plug-in jdcloudElasticBlockStore when the PersistentVolume is defined;  
2、volumeID: Specify a cloud disk ID that provides persistent storage for JCS for Kubernetes Services under the same geographical area;  
3、fsType: Specify file system type; currently only ext4 and xfs are supplied;  
4、capacity: PV will have specific storage capacity. This is set with the capacity attribute of PV.  
5、PersistentVolume can be attached to the machine in any way supported by the resource provider.
JD Cloud cloud disk currently supports only ReadWriteOnce --- it can be attached in read/write mode by a single node;  
The visit modes include:  
ReadWriteOnce --- this volume can be attached by a single node in read/write mode  
ReadOnlyMany --- this volume can be attached in read-only mode by multiple nodes  
ReadWriteMany --- this volume can be attached by multiple nodes in read/write mode  
In the command line, the visit mode is abbreviated as:  
RWO - ReadWriteOnce  
ROX - ReadOnlyMany  
RWX - ReadWriteMany  
JD Cloud provides plug-ins for PersistentVolume with plug-in type: jdcloudElasticBlockStore

**2. Create PVC**

The declaration can specify a label selector to further filter the volume. Only volumes that match label and selector can be associated to declaration. The selector consists of two fields:

All requirements from matchLabels and matchExpressions are integrated --- they must all be met to match.

This example uses matchlabels as filtering criteria to associate the matched PersistentVolume to the PersistentVolumeClaim.

matchLabels: volume must have a label with the value

matchExpressions: This is a list of requirements composed of specifying keywords, value lists, and operators associated with keywords and values. Valid operators include In, NotIn, Exists and DoesNotExist.
```
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: pv-static-pvc
spec:
  accessModes:
    - ReadWriteOnce
  storageClassName: ""
  resources:
    requests:
      storage: 30Gi
  selector:
    matchLabels:
      type: jdcloud-ebs
```
**3. Create Pod**
```
kind: Pod
apiVersion: v1
metadata:
  name: pod-static
spec:
  volumes:
    - name: pv-static
      persistentVolumeClaim:
        claimName: pv-static-pvc
  containers:
    - name: busybox-static
      image: busybox
      command:
         - sleep
         - "600"
      imagePullPolicy: Always
      volumeMounts:
        - mountPath: "/usr/share/mybusybox/"
          name: pv-static
```
View pod status
View the attach status of volume

## II. Use JD Cloud cloud disk to define dynamic storage

When the static PVs in the cluster do not match the new PersistentVolumeClaim, the cluster may try to create volumes for PVC dynamically.

- About Cloud Disk Service Specification of JD Cloud  

| storageClassName | Corresponding Type | Specification Requirement |
| ------ | ------ | ------ |
| jdcloud-ssd | SSD Cloud Disk | Capacity Range: 20-1,000G, Step Size: 10G |
| jdcloud-hdd | Premium Hdd Cloud Disk | Capacity Range: 20-3,000G, Step Size: 10G |  

Create PVC
```
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: pvc1
spec:
  accessModes:
    - ReadWriteOnce
  storageClassName: jdcloud-ssd
  resources:
    requests:
      storage: 20Gi
```  
View Cluster PVC
`kubectl get pvc`  
Output:  
```
NAME                                         STATUS    VOLUME                                     CAPACITY   ACCESS MODES   STORAGECLASS   AGE
pvc1                                         Bound     pvc-73d8538b-ebd6-11e8-a857-fa163eeab14b   20Gi       RWO            jdcloud-ssd    18s
```  
View Cluster PV
`kubectl get pv`  
Output:  
```
NAME                                       CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS    CLAIM                                                STORAGECLASS   REASON    AGE
pvc-73d8538b-ebd6-11e8-a857-fa163eeab14b   20Gi       RWO            Delete           Bound     default/pvc1                                         jdcloud-ssd              2m
```  
Based on StorageClass jdcloud-ssd, a volume is created for PVC. Once PV and PVC are associated, PersistentVolumeClaim associating are exclusive, regardless of the way they are associated. The associate between PVC and PV is one –to- one mapping.

 
