# Use JD Cloud File Service through methods of static PV

PV, the resource in JCS for Kubernetes, is the volume plug-in of Volume type, is used for describing Persistent Volume data volume and has Pod life cycle independent to PV in service. [JD Cloud File Service](https://docs.jdcloud.com/en/cloud-file-service/product-overview) supports the NFS protocol. Therefore, the PV definition of nfs type can be used in JCS for Kubernetes.

PV supports two configuration methods:

* Static: Created by the cluster administrator, it has actual storage details of capacity, accessMode, type and others and can be directly used;

* Dynamic: When statically created PV is not matched with any user-defined PersistentVolumeClaim, the cluster will attempt to dynamically create Volume for PVC. Volume configuration is based on the StorageClasses definition; PVC will discover PV based on storageClassName field.

This document provides operation steps and application examples using JD Cloud File Service through methods of static configuration PV in JCS for Kubernetes.

**Nouns**:

* PV: Persistent Volume, the data volume describing Persistent Volume;

* PVC: Persistent Volume Claim, the request claim describing persistent volume;

* SC: Storage Class, provides a method describing storage "class" and provides storage configuration for dynamically associated PV; it can be associated to PVC only when PV has the StorageClassName identical to that of PVC;
  
## I. Create CFS File Storage

1. You need to create a [CFS File Storage](https://docs.jdcloud.com/en/cloud-file-service/creating-file-system) first, and it is recommended that you create File Storage in Node Subnet in JCS for Kubernetes;

2. File Storage supports mounting File Storage through the IP address of the mount target, and you can query the IP address of the mount target in the File Storage Details, please refer to [File Storage Information](https://docs.jdcloud.com/en/cloud-file-service/file-system-detail) for detail.

## II. Connect to Cluster

 With the Kubernetes command line client kubectl, you can connect to JCS for Kubernetes from the client computer, realizing application deployment. For details, please refer to use of Kubectl client [Connect to JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster).

## III. Define PV of NFS type using CFS File Storage in the cluster

**Description**: You need to install nfs drive on the Node of cluster. For drive installation process, please refer to [Attached File Storage](https://docs.jdcloud.com/en/cloud-file-service/mount-file-system)

```
#Run the commands below under Node terminal:

sudo yum install –y nfs-utils
```

    
1. Create one StorageClass and descriptions for StorageClass file are as follows:

```
apiVersion: storage.k8s.io/v1
kind: StorageClass
metadata:
  name: manual-cfs-storage
provisioner: kubernetes.io/no-provisioner       #nfs does not have internal provisioner
```

**Parameter Description**:

* You can execute the commands below to download Yaml file examples:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/storageClass-for-PV.yml
`

* StorageClass provides PVC with configurations used for dynamically discovering and associating PV of NFS type.

2. Create StorageClass with the following commands and view StorageClass statuses:

```
kubectl create -f storageClass-for-PV.yml       #storageClass-for-PV.yml can be replaced with a file name stored in a local directory
storageclass.storage.k8s.io/manual-cfs-storage created

kubectl get sc manual-cfs-storage
NAME                 PROVISIONER                    AGE
manual-cfs-storage   kubernetes.io/no-provisioner   33m

```

3. Create one PV of NFS type and associate the Storage Classs configuration created in the last step. Description for the PV YAML file is as follows:

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
  mountOptions:
  - vers=4
  - noresvport
  persistentVolumeReclaimPolicy: Recycle
  storageClassName: manual-cfs-storage          #use Storage Class created in Step 1; it can be replaced with other customized Storage Class Name;
  nfs:
    path: /cfs                  #Replace with the directory supported by the attached target, which is attached to the root directory by default
    server: 172.**.**.10        #Replace with the attached target IP address of File Storage

```   

**Parameter Description:**

* You can execute the commands below to download Yaml demo file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/CFS-As-PV.yml
`

* Before creating PV, please modify the corresponding parameter value in Yaml file according to CFS file storage information.

4. Create PV with the following commands and view PV status:

```
kubectl create -f CFS-As-PV.yml       #pv-with-cfs.yml can be replaced with a file name stored in a local directory
persistentvolume/cfs-pv001 created

kubectl get pv
NAME        CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS      CLAIM   STORAGECLASS         REASON   AGE
cfs-pv001   1Gi        RWO            Recycle          Available           manual-cfs-storage            14m
```

5. Define one PVC, associate PV created in the previous step to the PVC, descriptions of PVC YAML file are as follows:

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
  storageClassName: manual-cfs-storage          #Please use the StorageClassClass as the same as that used in the PV Yaml file

```

**Parameter Description:**

* You can execute the commands below to download Yaml demo file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/PVC-Bound-With-PV.yml
`

* Before creating PVC, please ensure that StorageClassName used by PVC and PV are the same.

6. Create PVC and verify the association status of PVC to PV

```
kubectl create -f PVC-Band-With-PV.yml
persistentvolumeclaim/cfs-pvc001 created


kubectl get pvc
NAME         STATUS   VOLUME      CAPACITY   ACCESS MODES   STORAGECLASS         AGE
cfs-pvc001   Bound    cfs-pv001   1Gi        RWO            manual-cfs-storage   14s

```

7. Create a Pod, mount PVC in Bound status to Pod. Pod Yaml file description is as follows:

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
* You can execute the commands below to download Yaml demo file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/Pod-With-PVC-Mounted.yml
`

* Before Pod is created, please modify the corresponding parameter value in Yaml file based on the definition of PVC.

8. Create Pod, and verify that Pod can be entered to view the file content under the /mnt/cfs-read directory through execution of the following command, when it is in running status.

```
kubectl create -f Pod-With-PVC-Mounted.yml
pod/cfs-pod001 created

kubectl get pod cfs-pod001
NAME         READY   STATUS    RESTARTS   AGE
cfs-pod001   1/1     Running   0          13s

kubectl exec -it cfs-pod001 /bin/sh
/ # cat /mnt/cfs/hello.txt
Hello CFS

```

8. Execute the following command to delete Pod

```
kubectl delete pod cfs-pod001
pod "cfs-pod001" deleted
```

10. Re-create a Pod, and attach the above-said PVC in Pod. Pod  YAML file description is as follows:

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
    - 'while true; do ls -l /mnt/cfs-read/; sleep 2; done'
    volumeMounts:
    - mountPath: "/mnt/cfs-read"
      name: cfs-pv001
  volumes:
  - name: cfs-pv001
    persistentVolumeClaim:
      claimName: cfs-pvc001

```   

**Parameter Description:**

* The above-mentioned YAML file attaches PVC to the /mnt/cfs-read directory of Pod
* You can execute the commands below to download Yaml demo file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/read-data-from-pvc.yml
`

* Before Pod is created, please modify the corresponding parameter value in Yaml file based on the definition of PVC.

11. Create Pod, and verify that Pod can be entered to view the file content under the /mnt/cfs directory through execution of the following command, when it is in running status.

```
kubectl create -f read-data-from-pvc.yml
pod/cfs-pod002 created

kubectl get pods cfs-pod002
NAME                READY   STATUS    RESTARTS   AGE
cfs-pod002          1/1     Running   0          77s


kubectl exec -it cfs-pod002 /bin/sh
/ # cat /mnt/cfs-read/hello.txt
Hello CFS

```

12. It can be found through verification of Step 11 that file hello.txt written into CFS by Pod named as cfs-pod001 is saved in CFS file for storage persistently, and can be shared by Pod named as cfs-pod002.

13. Execute the following command to delete Pod

```
kubectl delete pod cfs-pod002
pod "cfs-pod002" deleted
```