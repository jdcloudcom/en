# Deploy persistent volume (Adapt to Kubernetes 1.14 and 1.16 versions)

CSI is used by default by JD Cloud JCS for Kubernetes in 1.14 and 1.16 versions as a storage plug-in, which integrates Cloud Disk Service CSI driver. Users who use these two versions of hosted Kubernetes can refer to the following steps to create and use the cloud disk

## I. Use JD Cloud Cloud Disk Service to define static storage
    
**1. Create PV**
```
kind: PersistentVolume
apiVersion: v1
metadata:
  name: pv-csi-static
  labels:
    type: jdcloud-csi-ebs
spec:
  capacity:
    storage: 20Gi
  accessModes:
    - ReadWriteOnce
  persistentVolumeReclaimPolicy: Retain
  csi:  
    driver: zbs.csi.jdcloud.com  
    fsType: ext4  
    volumeHandle: vol-xxxxxxxxx      #Please replace the Cloud Disk Service ID with the Cloud Disk Service ID whose status is available in the same Availability Zone of JCS for Kubernetes
  storageClassName: jdcloud-ssd

```     
**Parameter Description:**

1. If you need to use JD Cloud Cloud Disk Service for persistent volume in JD Cloud JCS for Kubernetes service, please specify csi driver as zbs.csi.jdcloud.com when defining PersistentVolume;  

2. volumeID: Appoint Cloud Disk Service ID providing persistent volume for JCS for Kubernetes under the same Availability Zone;  

3. fsType: Specify file system type; it now supports ext4 and xfs only; 

4. storageClassName: Specify storageClass of the corresponding Cloud Disk Service

5. capacity: PV will have specific storage capacity. This is set using the capacity attribute of PV. For more details, please refer to [Cloud Disk Service Help Documentation](https://docs.jdcloud.com/en/cloud-disk-service/features);

|StorageClass type | Cloud Disk Service Type   |Capacity Range  |Step Size|
| ------ | ------ | ------ |------ |
|hdd.std1	|Capacity Type hdd | [20-16000]GiB  |10GiB|
|ssd.gp1	|General ssd | [20-16000]GiB  |10GiB|
|ssd.io1	|Performance Type ssd | [20-16000]GiB  |10GiB|

6. PersistentVolume can be attached to the machine in any way that the resource provider supports.  
  - JD Cloud Cloud Disk Service currently supports only one mode ReadWriteOnce - This volume can be attached by a single node in read/write mode;  
  - Access modes include:  
    - ReadWriteOnce - This volume can be attached by a single node in read/write mode. In the command line, the access mode is abbreviated to: RWO - ReadWriteOnce
  
Note:  
- As it is restricted that the Cloud Disk Service can be attached with one Virtual Machine, it is suggested to create a deployment set by using replicas=1 when the pvc-based pod is used. StatefulSet can solve the multi-copy issue.  
- The pod migration and pvc migration (detaching old instances/attaching new instances) last for 35 seconds by default.  
- The original pvc can be attached to the new pod by making deployment and deleting the same.  

**2. Create PVC**  

1. One tag selector can be designated via the Persistent Volume Claim (PVC) to further filter this volume. Only volumes that match tag and selector can be associated to declaration. The selector consists of two fields:

  - All the requirements from matchLabels and matchExpressions are together by "and" - they have to be fully met for matching. In this example, matchlabels are used as a filter condition to associate a matching PersistentVolume to PersistentVolumeClaim.

    - matchLabels: volume must have a tag having this value

    - matchExpressions: This is a list of requirements, consisting of the specified keywords, the list of values, and the operational characters related to the keywords and values. Valid operational characters include In, NotIn, Exists and DoesNotExist.  

2. Access modes include: ReadWriteOnce - This volume can be attached by a single node in read/write mode. In the command line, the access mode is abbreviated to: RWO - ReadWriteOnce  

3、storageClassName: Specify storageClass of the corresponding Cloud Disk Service  
  

```
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: pv-static-pvc
spec:
  accessModes:
    - ReadWriteOnce
  resources:
    requests:
      storage: 20Gi
  selector:
    matchLabels:
      type: jdcloud-csi-ebs
  storageClassName: jdcloud-ssd
```

**3. Create Pod**
```
kind: Pod
apiVersion: v1
metadata:
  name: test-csi-static
spec:
  volumes:
    - name: test-csi
      persistentVolumeClaim:
        claimName: pv-static-pvc
  containers:
    - name: busybox-static
      image: busybox
      command:
         - sleep
         - "600"
      imagePullPolicy: IfNotPresent
      volumeMounts:
        - mountPath: "/usr/share/mybusybox/"
          name: test-csi
```


## II. Use JD Cloud Cloud Disk Service to define dynamic storage

When static PV is not matched with any created PersistentVolumeClaim, the cluster might attempt to dynamically create volume for PVC.

1. Refer to the following table for instruction about Cloud Disk Service specification of JD Cloud. For more details, please refer to [Cloud Disk Service Help Documentation](https://docs.jdcloud.com/en/cloud-disk-service/features);

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
  name: dynamic-pvc
spec:
  accessModes:
    - ReadWriteOnce
  storageClassName: jdcloud-ssd
  resources:
    requests:
      storage: 20Gi
```  
3. Create Pod  

```
kind: Pod
apiVersion: v1
metadata:
  name: test-csi-dpvc
spec:
  volumes:
    - name: test-csi
      persistentVolumeClaim:
        claimName: dynamic-pvc
  containers:
    - name: busybox-static
      image: busybox
      command:
         - sleep
         - "600"
      imagePullPolicy: IfNotPresent
      volumeMounts:
        - mountPath: "/usr/share/mybusybox/"
          name: test-csi
```  
4. View cluster PV  

`kubectl get pv`  

Output:  
```
NAME                                       CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS    CLAIM                                                STORAGECLASS   REASON    AGE
pvc-17950c18-2dd8-11ea-a0a9-fa163e4cf8ac   20Gi       RWO            Delete           Bound    default/dynamic-pvc                 jdcloud-ssd                     2m56s
```  
**Note**: Volume is created for PVC based on StorageClass jdcloud-ssd. Once PV is associated with PVC, the association of PersistentVolumeClaim is exclusive, no matter how they are associated. The association of PVC and PV is a one-to-one mapping.
