# Use JD Cloud File Service through methods of PV

  PV is the resource in cluster, used for describing the persistent storage data volume, which is defined as a directory stored on the host machine persistently. Mount Directory of [JD Cloud File Service](https://docs.jdcloud.com/en/cloud-file-service/product-overview) may also use PV definitions.
  
  This paper will provide operation steps and application examples using JD Cloud File Service through methods of PV in JCS for Kubernetes.
  
## I. Create CFS File Storage

1. You need to create a [CFS File Storage](https://docs.jdcloud.com/en/cloud-file-service/creating-file-system) first, and it is recommended that you create File Storage in Node Subnet in JCS for Kubernetes;

2. File Storage supports mounting File Storage through the IP address of the mount target, and you can query the IP address of the mount target in the File Storage Details, please refer to [File Storage Information](https://docs.jdcloud.com/en/cloud-file-service/file-system-detail) for detail.

## II. Define PV of NFS type using CFS File Storage in the cluster
    
1. Create one PV of NFS type, descriptions of PV YAML file are as follows:
```
apiVersion: v1
kind: PersistentVolume
metadata:
  name: cfs-pv001
  labels:
    pv: cfs-pv001
spec:
  capacity:
    storage: 1Gi
  accessModes:
    - ReadWriteOnce
  persistentVolumeReclaimPolicy: Recycle
  nfs:
    path: /           #Replace with the directory supported by the attached target, which is attached to the root directory by default
    server: 172.XX.XX.15         #Replace with the attached target IP address of File Storage

```     
**Parameter Description:**

* You can execute the commands below to download instance Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/pv-with-cfs.yml
`

* Before creating PV, please modify the corresponding parameter value in Yaml file according to file storage information.

2. After using Kubectl client [Connection to JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster), executing the following commands to create PV:

```
kubectl create -f pv-with-cfs.yml       # File name pv-with-cfs.yml can be replaced by the file saved in the local directory
```

3. Execute the following commands to confirm PV status
```
kubectl get pv 
NAME        CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS      CLAIM   STORAGECLASS         REASON   AGE
cfs-pv001   1Gi        RWO            Recycle          Available        manual-cfs-storage            7s
 0          7d
```

4. Define one PVC, associate PV created in the previous step to the PVC, descriptions of PVC YAML file are as follows:
```
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: cfs-pvc001
spec:
  accessModes:
    - ReadWriteOnce
  resources:
    requests:
      storage: 1Gi
  selector:
    matchLabels:
      pv: cfs-pv001

```
**Parameter Description:**

* You can execute the commands below to download instance Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/PVC-band-PV-with-cfs.yml
`

* Before creating PVC, please modify the corresponding parameter value in Yaml file based on the definition of PV.

5. Create PVC and verify the association status of PVC to PV

```
kubectl get pvc
NAME         STATUS   VOLUME      CAPACITY   ACCESS MODES   STORAGECLASS         AGE
cfs-pvc001   Bound    cfs-pv001   1Gi        RWO                                  5s

```
6. Create a Pod, mount PVC in Bound status to Pod. Pod Yaml file description is as follows:
```
kind: Pod
apiVersion: v1
metadata:
  name: cfs-pod001
spec:
  containers:
  - name: c1
    image: busybox
    imagePullPolicy: IfNotPresent
    command:
    - /bin/sh
    args:
    - -c
    - "echo 'Hello CFS' > /mnt/cfs/hello.txt; sleep 3000"
    volumeMounts:
    - mountPath: "/mnt/cfs"
      name: cfs-pv001
  volumes:
  - name: cfs-pv001
    persistentVolumeClaim:
      claimName: cfs-pvc001

```     
**Parameter Description:**

* The above-mentioned YAML file mounts PVC to the /mnt/cfs directory of Pod;
* You can execute the commands below to download instance Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/Pod-With-cfs-as-pvc.yml
`

* Before Pod is created, please modify the corresponding parameter value in Yaml file based on the definition of PVC.

7. Create Pod, and verify that Pod can be entered to view the file content under the /mnt/cfs-read directory through execution of the following command, when it is in running status.
```
Kubectl exec -it cfs-pod001 -- /bin/sh
/ # cat /mnt/cfs/hello.txt

```
8. Execute the following command to delete Pod

```
kubectl delete pod cfs-pod002
pod "cfs-pod002" deleted
```

9. Re-create a Pod, and attach the above-said PVC in Pod. Pod  YAML file description is as follows:

```
kind: Pod
apiVersion: v1
metadata:
  name: cfs-pod002
spec:
  containers:
  - name: c1
    image: busybox
    imagePullPolicy: IfNotPresent
    command:
    - /bin/sh
    args:
    - -c
    - 'while true; do ls -l /mnt/cfs/; sleep 2; done'
    volumeMounts:
    - mountPath: "/mnt/cfs"
      name: cfs-pv001
  volumes:
  - name: cfs-pv001
    persistentVolumeClaim:
      claimName: cfs-pvc001

```     
**Parameter Description:**

* The above-mentioned YAML file attaches PVC to the /mnt/cfs directory of Pod
* You can execute the commands below to download instance Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/read-data-from-pvc.txt
`

* Before Pod is created, please modify the corresponding parameter value in Yaml file based on the definition of PVC.

10. Create Pod, and verify that Pod can be entered to view the file content under the /mnt/cfs directory through execution of the following command, when it is in running status.
```
Kubectl exec -it cfs-pod002 -- /bin/sh
/ # cat /mnt/cfs/hello.txt

```
11. It can be found through verification of Step 9 that file hello.txt written into CFS by Pod named as cfs-pod001 is saved in CFS file for storage persistently, and can be shared by Pod named as cfs-pod002.

12. Execute the following command to delete Pod

```
kubectl delete pod cfs-pod002
pod "cfs-pod002" deleted
```