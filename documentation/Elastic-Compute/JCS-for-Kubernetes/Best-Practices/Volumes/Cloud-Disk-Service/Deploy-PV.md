
# Deploy Persistent Storage (Adapt to Kubernetes 1.12 version)

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
    volumeID: vol-ogcbkdjg7x      #Please replace the Cloud Disk Service ID with the available Cloud Disk Service ID in the same Availability Zone of JCS for Kubernetes
    fsType: xfs
```     

**Parameter Description:**

1. To use JD Cloud cloud disk as persistent storage in JD Cloud JCS for Kubernetes Service, you should specify the plug-in jdcloudElasticBlockStore when the PersistentVolume is defined;  

2. volumeID: Appoint Cloud Disk Service ID providing persistent volume for JCS for Kubernetes under the same Availability Zone;  

3. fsType: Specify file system type; currently only ext4 and xfs are supplied;  

4. capacity: PV will have specific storage capacity. This is set with the capacity attribute of PV. For more details, please refer to [Help Documentation of Cloud Disk Service](https://docs.jdcloud.com/en/cloud-disk-service/features);

|StorageClass type | Cloud Disk Service Type   |Capacity Range  |Step Size|
| ------ | ------ | ------ |------ |
|hdd.std1	|Capacity Type hdd | [20-16000]GiB  |10GiB|
|ssd.gp1	|General ssd | [20-16000]GiB  |10GiB|
|ssd.io1	|Performance Type ssd | [20-16000]GiB  |10GiB|

5. PersistentVolume can be attached to the machine in any way supported by the resource provider.
  - JD Cloud cloud disk currently supports only ReadWriteOnce --- it can be attached in read/write mode by a single node;  
  - The visit modes include:  
    - ReadWriteOnce --- this volume can be attached by a single node in read/write mode. In the command line, the visit mode is abbreviated as: RWO - ReadWriteOnce

6. JD Cloud provides plug-ins for PersistentVolume with plug-in type: jdcloudElasticBlockStore

Note:  
- As it is restricted that the Cloud Disk Service can be attached with one Virtual Machine, it is suggested to create a deployment set by using replicas=1 when the pvc-based pod is used. StatefulSet can solve the multi-copy issue.  
- The pod migration and pvc migration (detaching old instances/attaching new instances) last for 35 seconds by default.  
- The original pvc can be attached to the new pod by making deployment and deleting the same.  

**2. Create PVC**  

1. One tag selector can be designated via the Persistent Volume Claim (PVC) to further filter this volume. Only volumes that match label and selector can be associated to declaration. The selector consists of two fields:

  - All requirements from matchLabels and matchExpressions are integrated --- they must all be met to match. This example uses matchlabels as filtering criteria to associate the matched PersistentVolume to the PersistentVolumeClaim.

matchLabels: volume must have a label with the value

    - matchExpressions: This is a list of requirements composed of specifying keywords, value lists, and operators associated with keywords and values. Valid operators include In, NotIn, Exists and DoesNotExist.  

2. Access patterns include: ReadWriteOnce -- This volume can be attached by a single node in read / write mode. In the command line, the access mode is abbreviated to: RWO - ReadWriteOnce  

3. The JD Cloud provides the PersistentVolume with a plug-in component of the type: jdcloudElasticBlockStore  
  

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

**4. You can also directly create pod using static storage**

```
kind: Pod
apiVersion: v1
metadata:
  name: pod-static
spec:
  volumes:
    - name: pv-static
      jdcloudElasticBlockStore:
        volumeID: vol-ogcbkdjg7x      #Please replace the Cloud Disk Service ID with the available Cloud Disk Service ID in the same region of JCS for Kubernetes
        fsType: xfs
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

## II. Use JD Cloud cloud disk to define dynamic storage

When the static PVs in the cluster do not match the new PersistentVolumeClaim, the cluster may try to create volumes for PVC dynamically.

1. Instruction About Cloud Disk Service Specification of JD Cloud, see table below; for more details, please refer to [Help Documentation of Cloud Disk Service](https://docs.jdcloud.com/en/cloud-disk-service/features);

|StorageClass type | Cloud Disk Service Type   |Capacity Range  |Step Size|
| ------ | ------ | ------ |------ |
|hdd.std1	|Capacity Type hdd | [20-16000]GiB  |10GiB|
|ssd.gp1	|General ssd | [20-16000]GiB  |10GiB|
|ssd.io1	|Performance Type ssd | [20-16000]GiB  |10GiB| 

2. Create PVC

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

3. View Cluster PVC

`kubectl get pvc`  

Output:  

```
NAME                                         STATUS    VOLUME                                     CAPACITY   ACCESS MODES   STORAGECLASS   AGE
pvc1                                         Bound     pvc-73d8538b-ebd6-11e8-a857-fa163eeab14b   20Gi       RWO            jdcloud-ssd    18s
```  

4. View Cluster PV  

`kubectl get pv`  

Output:  

```
NAME                                       CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS    CLAIM                                                STORAGECLASS   REASON    AGE
pvc-73d8538b-ebd6-11e8-a857-fa163eeab14b   20Gi       RWO            Delete           Bound     default/pvc1                                         jdcloud-ssd              2m
```  

**Note**: Based on StorageClass jdcloud-ssd, a volume is created for PVC. Once PV and PVC are associated, PersistentVolumeClaim associating are exclusive, regardless of the way they are associated. The associate between PVC and PV is one –to- one mapping.

 
