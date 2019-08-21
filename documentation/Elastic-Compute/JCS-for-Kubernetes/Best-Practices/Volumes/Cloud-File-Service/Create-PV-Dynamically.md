# Dynamically create PV by using nfs-client-provisioner               

Nfs-client-provisioner is an external Provisioner of open source NFS, which provides Persistent Volume to JCS for Kubernetes with NFS Server. [Deploy nfs-client-provisioner](https://docs.jdcloud.com/en/jcs-for-kubernetes/nfs-client-provisioner) and then you can dynamically create PV in JCS for Kubernetes.

## I. Connection to Cluster

 With the Kubernetes command line client kubectl, you can connect to JCS for Kubernetes from the client computer, realizing application deployment. For details, please refer to use of Kubectl client [Connect to JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster).

## II. Deploy nfs-client-provisioner

For details, refer to [Deploy nfs-client-provisioner](https://docs.jdcloud.com/en/jcs-for-kubernetes/nfs-client-provisioner) in clusters.

## III. Dynamic Creation of PV

StorageClass provides PVC with configurations used for dynamically discovering and binding PV. Therefore, when one Storage Class using nfs-client-provisioner is created and corresponding StorageClassName is specified when correspondingly specified StorageClassName is displayed when PVC is created, PV of NFS type can be dynamically created in JCS for Kubernetes based on CFS.

1. Create Storage Class and Yam file download and descriptions are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/storageClass-With-jdcloud-cfs.yml
`

* Yaml file description:

```
apiVersion: storage.k8s.io/v1
kind: StorageClass
metadata:
  name: auto-cfs-storage
provisioner: Definitions in jdcloud-cfs        #nfs-client-provisioner deployment env must be kept consistent with PROVISIONER_NAME
parameters:
  archiveOnDelete: "When false"          #archiveOnDelete is defined as false, please delete the directory corresponding to NFS Server but is kept if it is defined as true;
```

* Create Storage Class by using Yaml files:

`
kubectl create -f storageClass-With-jdcloud-cfs.yml
`

* View Storage Class status

```
kubectl get storageClass auto-cfs-storage
NAME               PROVISIONER   AGE
auto-cfs-storage   jdcloud-cfs   5m15s
```

2. Create PVC, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/Create-PV-dynamically.yml
`

* Yaml file description:

```
kind: PersistentVolumeClaim
apiVersion: v1
metadata:
  name: auto-pv-with-nfs-client-provisioner
spec:
  storageClassName: auto-cfs-storage        #Use nfs-client-provisioner as Storage Class Name of NFS external provisioner;
  accessModes:
    - ReadWriteMany
  resources:
    requests:
      storage: Size of corresponding attached directory in 1Mi      #NFS Server; now, attached directory capacity is not restricted for CFS file storage; but storage shall not exceed the maximum capacity limit of file storage
```

* Create PVC by using the Yaml file:

`
kubectl create -f Create-PV-dynamically.yml
`

* View PVC status

```
kubectl get pvc auto-pv-with-nfs-client-provisioner
NAME                                  STATUS   VOLUME                                     CAPACITY   ACCESS MODES   STORAGECLASS       AGE
auto-pv-with-nfs-client-provisioner   Bound    pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7   1Mi        RWX            auto-cfs-storage   10s


kubectl describe pvc auto-pv-with-nfs-client-provisioner
Name:          auto-pv-with-nfs-client-provisioner
Namespace:     default
StorageClass:  auto-cfs-storage
Status:        Bound
Volume:        pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7         #PV name dynamically created according to Storage Class configuration
Labels:        <none>
Annotations:   pv.kubernetes.io/bind-completed: yes
               pv.kubernetes.io/bound-by-controller: yes
               volume.beta.kubernetes.io/storage-provisioner: jdcloud-cfs
Finalizers:    [kubernetes.io/pvc-protection]
Capacity:      1Mi
Access Modes:  RWX
Events:
```

4. Verify PV statuses dynamically created according to Storage Class configuration:

* The Volume field value in the last operation step is the PV name dynamically created; PV is automatically associated to corresponding PVC; and please view PV status and details:

```
kubectl get pv pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7
NAME                                       CAPACITY   ACCESS MODES   RECLAIM POLICY   STATUS   CLAIM                                         STORAGECLASS       REASON   AGE
pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7   1Mi        RWX            Delete           Bound    default/auto-pv-with-nfs-client-provisioner   auto-cfs-storage            15m


kubectl describe pv pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7
Name:            pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7
Labels:          <none>
Annotations:     pv.kubernetes.io/provisioned-by: jdcloud-cfs
Finalizers:      [kubernetes.io/pv-protection]
StorageClass:    auto-cfs-storage
Status:          Bound
Claim:           default/auto-pv-with-nfs-client-provisioner
Reclaim Policy:  Delete
Access Modes:    RWX
Capacity:        1Mi
Node Affinity:   <none>
Message:         
Source:
    Type:      NFS (an NFS mount that lasts the lifetime of a pod)
    Server:    10.XX.XX.11      #Attached target and IP address in CFS file storage
    Path:      /cfs/default-auto-pv-with-nfs-client-provisioner-pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7      # Subdirectories automatically created by nfs-client-provisioner in NFS Server
    ReadOnly:  false
Events:        <none>
```

5. Create one Virtual Machine in the Nat subnet of JCS for Kubernetes, attach CFS file storage to a VM and verify directories added in CFS file storage. Verification steps and descriptions are as follows:

* Log in Virtual Machines. For details, please refer to [Log in Linux Instance](https://docs.jdcloud.com/en/virtual-machines/connect-to-linux-instance);
* Install the utils client by running the following commands under the CentOS terminal:

`
sudo yum install –y nfs-utils
`

* Attach CFS file storage on Virtual Machines to the cfs directory by running commands below:

```
mkdir /cfs      #Create one new directory on Virtual Machines
mount -t nfs 172.XX.XX.10:/cfs /cfs     #Attach nfs 172.XX.XX.10:/cfs to the cfs directory of virtual machines and replace 172.XX.XX.10 with the attached target IP of cloud file storage
```

* After successful attach, view directories associated to PV in the cloud file storage under cfs directory of Virtual Machines by running following commands:

```
cd /cfs       #Log in the cfs directory on Virtual Machines

ls -a       #View contents in the cfs directory
default-auto-pv-with-nfs-client-provisioner-pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7        #ls outputs contents, verify the subdirectory added under cfs directory, subdirectory name and directory consistent with PV Source.Path

```

* For more details, please refer to Cloud File Service [Attach File Storage](https://docs.jdcloud.com/en/cloud-file-service/mount-file-system).

## IV. Creating Pod by Using PVC Created in Step 3

1. Create one Pod, attach PVC created in Step 3 as the volume and add one file in the specified directory. Yaml file download and descriptions are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/pod-touch-cfs.yml
`

* Yaml file description:

```
kind: Pod
apiVersion: v1
metadata:
  name: pod-touch-cfs
spec:
  containers:
  - name: test-pod
    image: busybox
    imagePullPolicy: IfNotPresent
    command:
      - "/bin/sh"
    args:
      - "-c"
      - "touch /mnt/SUCCESS && exit 0 || exit 1"            #Create a file in the name of SUCCESS under the directory /mnt and write it in helloworld
    volumeMounts:
      - name: nfs-pvc
        mountPath: "/mnt"           #Attach volume to the /mnt directory of Pod
  restartPolicy: "Never"
  volumes:
    - name: nfs-pvc
      persistentVolumeClaim:
        claimName: auto-pv-with-nfs-client-provisioner          #Specify the name of PVC associated with the cloud file storage
```

* Create Pod with the Yaml file:

`
kubectl create -f pod-touch-cfs.yml
`

* View Pod status

```
kubectl get pod pod-touch-cfs
NAME            READY   STATUS    RESTARTS   AGE
pod-touch-cfs   1/1     Running   0          11s

Execute exec to log in pod and verify file content
kubectl exec -it pod-touch-cfs /bin/sh
/ # cat /mnt/SUCCESS
helloworld
```

2. Re-log in the Virtual Machines of Nat subnet in Step 3 and view added file contents under cloud file storage directory associated with PV under the /cfs directory of Virtual Machines by running commands below:

```
cd /cfs       #Log in the cfs directory on Virtual Machines

ls -a       #View contents in the cfs directory
default-auto-pv-with-nfs-client-provisioner-pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7        #ls outputs contents, verify the subdirectory added under cfs directory, subdirectory name and directory consistent with PV Source.Path

cat default-auto-pv-with-nfs-client-provisioner-pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7/SUCCESS
helloworld        #View contents of added file SUCCESS under the subdirectory as the same as the PV Source.Path
```

3. Delete pod pod-touch-cfs

```
kubectl delete pod pod-touch-cfs
pod "pod-touch-cfs" deleted
```

4. Re-create one Pod, and attach the above PVC in the Pod. Pod  YAML download and description are as follows:

* Download YAML file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/verify-pv-cfs.yml
`

* Description for YAML file is as follows:

```
kind: Pod
apiVersion: v1
metadata:
  name: verify-pv-cfs
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
      claimName: auto-pv-with-nfs-client-provisioner          #Specify the name of PVC associated with the cloud file storage
```

* Create Pod by using the Yaml file

```
kubectl create -f verify-pv-cfs.yml
pod/verify-pv-cfs created
```

* View Pod running status

```
kubectl get pod verify-pv-cfs
NAME            READY   STATUS    RESTARTS   AGE
verify-pv-cfs   1/1     Running   0          15s

View logs outputted by Pod verify-pv-cfs:
kubectl logs verify-pv-cfs
total 1
-rw-r--r--    1 root     root            18 Aug  7 07:29 SUCCESS

exec logs in Pod verify-pv-cfs to view contents of the SUCCESS file:
kubectl exec -it verify-pv-cfs /bin/sh
/ # cat /mnt/cfs/SUCCESS
helloworld
```

5. Delete pod verify-pv-cfs

```
kubectl delete pod verify-pv-cfs
pod "verify-pv-cfs" deleted
```

## V. Delete PVC and verify recycling policies of directories corresponding to CFS

1. Delete PVC auto-pv-with-nfs-client-provisioner by running the following commands:

```
kubectl delete pvc auto-pv-with-nfs-client-provisioner
persistentvolumeclaim "auto-pv-with-nfs-client-provisioner" deleted

```

2. Confirm running status of PV pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7 attached to PVC:

```
kubectl get pv pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7
Error from server (NotFound): persistentvolumes "pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7" not found

After the above results are outputted, please indicate that PV pvc-c44da35f-b8bc-11e9-b6cc-fa163e229fe7 associated to PVC has been automatically deleted
```


3. Re-log in the Virtual Machines of Nat subnet in Step 3 and view added file contents under cloud file storage directory associated with PV under the /cfs directory of Virtual Machines by running commands below:

```
cd /cfs       #Log in the cfs directory on Virtual Machines

ls -a       #View contents in the cfs directory
Output content description: If the outputted content is null, it means that after PVC and PV are deleted, the subdirectories and file contents, automatically created by nfs-client-provisioner in CFS file storage, have been successfully recycled
```
