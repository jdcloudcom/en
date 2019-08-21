# Deploy nfs-client-provisioner                  

The NFS type storage in JCS for Kubernetes has no built-in Provisioner. But you can configure the external Provisioner in the cluster for NFS.

Nfs-client-provisioner is an external Provisioner of open source NFS, which provides Persistent Volume to JCS for Kubernetes with NFS Server and supports dynamic creation of PV. However, nfs-client-provisioner itself does not provide NFS. It needs the storage provided by existing NFS server.

In this document, Cloud File Service (CFS) of JD Cloud is used as the NFS server and descriptions for nfs-client-provisioner deployment process will be provided.

## I. Deployment Description

* nfs-client-provisioner will be run in the method of deployment in the cluster and the replica number is 1;

* nfs-client-provisioner itself is run in the cluster as the external Provisioner;

* When Storage Class is defined with nfs-client-provisioner, provisioner in the Storage Class must be identical to PROVISIONER_NAME defined in nfs-client-provisioner;

* When the user creates PVC with StorageClass associated with the nfs-client-provisioner service, the subdirectory will be created in the cfs file by nfs-client-provisioner and PV will be initialized and created;

* PV naming format provided on NFS server by nfs-client-provisioner: ${namespace}-${pvcName}-${pvName};

* After PV is deleted, nfs-client-provisioner will archive or delete pv subdirectory;
  
* Archiving PV naming format provided on NFS server by nfs-client-provisioner: archieved-${namespace}-${pvcName}-${pvName};

* Each nfs-client-provisioner deployment corresponds to one CFS file storage. If you need to associate several CFS file storage in clusters, please deploy several nfs-client-provisioner deployments by referring to the examples.

## II. Connect to Cluster

 With the Kubernetes command line client kubectl, you can connect to JCS for Kubernetes from the client computer, realizing application deployment. For details, please refer to use of Kubectl client [Connect to JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster).

## III. Deploy nfs-client-provisioner

nfs-client-provisioner is run in the cluster via deployment and nfs-client-provisioner needs to access kube-api to get PVC object changes. If RBAC is enabled for your cluster, provisioner must be authorized. For detailed deployment description, please refer to the document below.

**Description**: You need to install nfs drive on the Node of cluster. For drive installation process, please refer to [Attached File Storage](https://docs.jdcloud.com/en/cloud-file-service/mount-file-system)

```
#Run the commands below under Node terminal:

sudo yum install –y nfs-utils
```

1. Create Service Account, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/nfs-client-provisioner/ServiceAccount.yml
`

* Yaml file description:

```
kind: ServiceAccount
apiVersion: v1
metadata:
  name: nfs-client-provisioner
```

* Create Service Account with the Yaml file:

`
kubectl create -f ServiceAccount.yml
`

* Create Service Account by using a command line

`
kubectl create serviceaccount nfs-client-provisioner        #Create a Service Account in the name of nfs-client-provisioner
`

2. Create Cluster Role, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/nfs-client-provisioner/ClusterRole.yml
`

* Yaml file description:

```
kind: ClusterRole
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: nfs-client-provisioner-runner
rules:
  - apiGroups: [""]
    resources: ["persistentvolumes"]
    verbs: ["get", "list", "watch", "create", "delete"]
  - apiGroups: [""]
    resources: ["persistentvolumeclaims"]
    verbs: ["get", "list", "watch", "update"]
  - apiGroups: ["storage.k8s.io"]
    resources: ["storageclasses"]
    verbs: ["get", "list", "watch"]
  - apiGroups: [""]
    resources: ["events"]
    verbs: ["create", "update", "patch"]
```

* Create Cluster Role by using the Yaml file:

`
kubectl create -f ClusterRole.yml
`

3. Create Cluster Role Binding, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/nfs-client-provisioner/ClusterRoleBinding.yml
`

* Yaml file description:

```
kind: ClusterRoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: run-nfs-client-provisioner
subjects:
  - kind: ServiceAccount
    name: nfs-client-provisioner
    namespace: default
roleRef:
  kind: ClusterRole
  name: nfs-client-provisioner-runner
  apiGroup: rbac.authorization.k8s.io
```

* Create Cluster Role by using the Yaml file:

`
kubectl create -f ClusterRoleBinding.yml
`

4. Create Role, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/nfs-client-provisioner/Role.yml
`

* Yaml file description:

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: leader-locking-nfs-client-provisioner
rules:
  - apiGroups: [""]
    resources: ["endpoints"]
    verbs: ["get", "list", "watch", "create", "update", "patch"]
```

* Create Cluster Role by using the Yaml file:

`
kubectl create -f Role.yml
`

5. Create Role Binding, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/nfs-client-provisioner/RoleBinding.yml
`

* Yaml file description:

```
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: leader-locking-nfs-client-provisioner
subjects:
  - kind: ServiceAccount
    name: nfs-client-provisioner
    # replace with namespace where provisioner is deployed
roleRef:
  kind: Role
  name: leader-locking-nfs-client-provisioner
  apiGroup: rbac.authorization.k8s.io
```

* Create Cluster Role by using the Yaml file:

`
kubectl create -f RoleBinding.yml
`

6. Create nfs-client-provisioner Deployment, and Yaml file download and description are as follows:

* Download Yaml file:

`
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/CFS/nfs-client-provisioner/Deploy.yml
`

* Yaml file description:

```
kind: Deployment
apiVersion: extensions/v1beta1
metadata:
  name: nfs-client-provisioner
spec:
  replicas: 1
  strategy:
    type: Recreate
  template:
    metadata:
      labels:
        app: nfs-client-provisioner
    spec:
      serviceAccountName: nfs-client-provisioner
      containers:
        - name: nfs-client-provisioner
          image: quay.io/external_storage/nfs-client-provisioner:latest
          imagePullPolicy: IfNotPresent
          volumeMounts:
            - name: nfs-client-root
              mountPath: /persistentvolumes
          env:
            - name: PROVISIONER_NAME
              value: jdcloud-cfs			#PROVISIONER_NAME Value must be consistent with the Provisioner field value of StorageClass
            - name: NFS_SERVER
              value: 172.**.**.10			#Replace it with the attached target IP address of file storage
            - name: NFS_PATH
              value: /cfs			#Replace with the directory supported by the attached target, which is attached to the /cfs directory by default
      volumes:
        - name: nfs-client-root
          nfs:
            server: 172.**.**.10			#Replace it with the attached target IP address of file storage
            path: /cfs			#Replace with the directory supported by the attached target, which is attached to the /cfs directory by default
```

* Create Deployment by using Yaml file:

`
kubectl create -f Deploy.yml
`

IV. Verify Running Status of nfs-client-provisioner

View running status of nfs-client-provisioner Deployment in clusters. When all Pods are running and the running replica number is inconsistent with the expected replica number, it means that nfs-client-provisioner is successfully run.

```
kubectl get deployment
NAME                     DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
nfs-client-provisioner   1         1         1            1           42m
```
