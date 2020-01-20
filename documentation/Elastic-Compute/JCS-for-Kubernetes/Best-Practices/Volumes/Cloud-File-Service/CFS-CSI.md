# Use JD Cloud File Service through methods of CSI plug-in and static PV

Both 1.14 and 1.16 versions of JD Cloud JCS for Kubernetes use CSI as the default storage plug-in. For detailed introduction of CSI, please refer to [CSI](https://kubernetes.io/blog/2019/01/15/container-storage-interface-ga/). PV, the resource in JCS for Kubernetes, is the volume plug-in of Volume type, is used for describing Persistent Volume data volume and has Pod life cycle independent to PV in service. [JD Cloud File Service](https://docs.jdcloud.com/en/cloud-file-service/product-overview) supports the NFS protocol. Therefore, the PV definition of nfs type can be used in JCS for Kubernetes.

PV supports two configuration methods:

* Static: Created by the cluster administrator, it has actual storage details of capacity, accessMode, type and others and can be directly used;

* Dynamic: When statically created PV is not matched with any user-defined PersistentVolumeClaim, the cluster will attempt to dynamically create Volume for PVC. Volume configuration is based on the StorageClasses definition; PVC will discover PV based on storageClassName field.

This document provides operation steps and application examples for installing NFS CSI plug-in in JCS for Kubernetes and using JD Cloud File Service through methods of static configuration PV.

**Nouns**:

* PV: Persistent Volume, the data volume describing Persistent Volume;

* PVC: Persistent Volume Claim, the request claim describing persistent volume;

* SC: Storage Class, provides a method describing storage "class" and provides storage configuration for dynamically associated PV; it can be associated to PVC only when PV has the StorageClassName identical to that of PVC;
  
## I. Create CFS File Storage

1. You need to create a [CFS File Storage](https://docs.jdcloud.com/en/cloud-file-service/creating-file-system) first, and it is recommended that you create File Storage in Node Subnet in JCS for Kubernetes;

2. File Storage supports mounting File Storage through the IP address of the mount target, and you can search the IP address of the mount target in the File Storage Details, please refer to [File Storage Information](https://docs.jdcloud.com/en/cloud-file-service/file-system-detail) for detail.

## II. Connect to Cluster

 With the Kubernetes command line client kubectl, you can connect to JCS for Kubernetes from the client computer, realizing application deployment. For details, please refer to use of Kubectl client [Connect to JCS for Kubernetes](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster).

## III. Define PV of NFS type by using CFS File Storage in the cluster


1. Install nfs csi driver
csi-attacher-rbac.yaml
```
# This YAML file contains RBAC API objects that are necessary to run external
# CSI attacher for nfs flex adapter

apiVersion: v1
kind: ServiceAccount
metadata:
  name: csi-attacher

---
kind: ClusterRole
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: external-attacher-runner
rules:
  - apiGroups: [""]
    resources: ["persistentvolumes"]
    verbs: ["get", "list", "watch", "update"]
  - apiGroups: [""]
    resources: ["nodes"]
    verbs: ["get", "list", "watch"]
  - apiGroups: ["storage.k8s.io"]
    resources: ["volumeattachments"]
    verbs: ["get", "list", "watch", "update"]

---
kind: ClusterRoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: csi-attacher-role
subjects:
  - kind: ServiceAccount
    name: csi-attacher
    namespace: default
roleRef:
  kind: ClusterRole
  name: external-attacher-runner
  apiGroup: rbac.authorization.k8s.io
```
b.csi-nodeplugin-rbac.yaml
```
# This YAML defines all API objects to create RBAC roles for CSI node plugin
apiVersion: v1
kind: ServiceAccount
metadata:
  name: csi-nodeplugin

---
kind: ClusterRole
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: csi-nodeplugin
rules:
  - apiGroups: [""]
    resources: ["persistentvolumes"]
    verbs: ["get", "list", "watch", "update"]
  - apiGroups: [""]
    resources: ["nodes"]
    verbs: ["get", "list", "watch", "update"]
  - apiGroups: ["storage.k8s.io"]
    resources: ["volumeattachments"]
    verbs: ["get", "list", "watch", "update"]
---
kind: ClusterRoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: csi-nodeplugin
subjects:
  - kind: ServiceAccount
    name: csi-nodeplugin
    namespace: default
roleRef:
  kind: ClusterRole
  name: csi-nodeplugin
  apiGroup: rbac.authorization.k8s.io
```
c.csi-attacher-nfsplugin.yaml
```
# This YAML file contains attacher & csi driver API objects that are necessary
# to run external CSI attacher for nfs

kind: Service
apiVersion: v1
metadata:
  name: csi-attacher-nfsplugin
  labels:
    app: csi-attacher-nfsplugin
spec:
  selector:
    app: csi-attacher-nfsplugin
  ports:
    - name: dummy
      port: 12345

---
kind: StatefulSet
apiVersion: apps/v1beta1
metadata:
  name: csi-attacher-nfsplugin
spec:
  serviceName: "csi-attacher"
  replicas: 1
  template:
    metadata:
      labels:
        app: csi-attacher-nfsplugin
    spec:
      serviceAccount: csi-attacher
      containers:
        - name: csi-attacher
          image: quay.io/k8scsi/csi-attacher:v1.0.1
          args:
            - "--v=5"
            - "--csi-address=$(ADDRESS)"
          env:
            - name: ADDRESS
              value: /csi/csi.sock
          imagePullPolicy: "IfNotPresent"
          volumeMounts:
            - name: socket-dir
              mountPath: /csi

        - name: nfs
          image: quay.io/k8scsi/nfsplugin:canary
          args :
            - "--nodeid=$(NODE_ID)"
            - "--endpoint=$(CSI_ENDPOINT)"
          env:
            - name: NODE_ID
              valueFrom:
                fieldRef:
                  fieldPath: spec.nodeName
            - name: CSI_ENDPOINT
              value: unix://plugin/csi.sock
          imagePullPolicy: "IfNotPresent"
          volumeMounts:
            - name: socket-dir
              mountPath: /plugin
      volumes:
        - name: socket-dir
          emptyDir:
```

d.csi-nodeplugin-nfsplugin.yaml
```
# This YAML file contains driver-registrar & csi driver nodeplugin API objects
# that are necessary to run CSI nodeplugin for nfs
kind: DaemonSet
apiVersion: apps/v1beta2
metadata:
  name: csi-nodeplugin-nfsplugin
spec:
  selector:
    matchLabels:
      app: csi-nodeplugin-nfsplugin
  template:
    metadata:
      labels:
        app: csi-nodeplugin-nfsplugin
    spec:
      serviceAccount: csi-nodeplugin
      hostNetwork: true
      containers:
        - name: node-driver-registrar
          image: quay.io/k8scsi/csi-node-driver-registrar:v1.0.2
          lifecycle:
            preStop:
              exec:
                command: ["/bin/sh", "-c", "rm -rf /registration/csi-nfsplugin /registration/csi-nfsplugin-reg.sock"]
          args:
            - --v=5
            - --csi-address=/plugin/csi.sock
            - --kubelet-registration-path=/var/lib/kubelet/plugins/csi-nfsplugin/csi.sock
          env:
            - name: KUBE_NODE_NAME
              valueFrom:
                fieldRef:
                  fieldPath: spec.nodeName
          volumeMounts:
            - name: plugin-dir
              mountPath: /plugin
            - name: registration-dir
              mountPath: /registration
        - name: nfs
          securityContext:
            privileged: true
            capabilities:
              add: ["SYS_ADMIN"]
            allowPrivilegeEscalation: true
          image: quay.io/k8scsi/nfsplugin:canary
          args :
            - "--nodeid=$(NODE_ID)"
            - "--endpoint=$(CSI_ENDPOINT)"
          env:
            - name: NODE_ID
              valueFrom:
                fieldRef:
                  fieldPath: spec.nodeName
            - name: CSI_ENDPOINT
              value: unix://plugin/csi.sock
          imagePullPolicy: "IfNotPresent"
          volumeMounts:
            - name: plugin-dir
              mountPath: /plugin
            - name: pods-mount-dir
              mountPath: /var/lib/kubelet/pods
              mountPropagation: "Bidirectional"
      volumes:
        - name: plugin-dir
          hostPath:
            path: /var/lib/kubelet/plugins/csi-nfsplugin
            type: DirectoryOrCreate
        - name: pods-mount-dir
          hostPath:
            path: /var/lib/kubelet/pods
            type: Directory
        - hostPath:
            path: /var/lib/kubelet/plugins_registry
            type: Directory
          name: registration-dir
```


2. Create one PV of NFS type. Descriptions of PV YAML file are as follows:

```
apiVersion: v1
kind: PersistentVolume
metadata:
  name: data-nfsplugin
  labels:
    name: data-nfsplugin
spec:
  accessModes:
  - ReadWriteMany
  capacity:
    storage: 10Gi
  storageClassName: ""    A required item when the value of #storageClassName is null
  csi:
    driver: csi-nfsplugin
    volumeHandle: data-id
    volumeAttributes: 
      server: 10.0.0.5    #Replace it with the attached target IP address of file storage
      share: /cfs         #Replace with the directory supported by the attached target, which is attached to the /cfs directory by default

```   


3. Define one PVC, associate PV created in the previous step to the PVC, descriptions of PVC YAML file are as follows:

```
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: data-nfsplugin
spec:
  accessModes:
  - ReadWriteMany
  storageClassName: ""     A required item when the value of #storageClassName is null
  resources:
    requests:
      storage: 10Gi
  selector:
    matchExpressions:
    - key: name
      operator: In
      values: ["data-nfsplugin"]

```


4. Verify the association status of PVC to PV:

```
kubectl get pvc
NAME                        STATUS        VOLUME                                     CAPACITY   ACCESS MODES   STORAGECLASS   AGE
data-nfsplugin              Bound         data-nfsplugin                             10Gi       RWX                           8m2s

```

5. Create a Pod, attach PVC in Bound status to Pod. Pod Yaml file description is as follows:

```
apiVersion: v1
kind: Pod
metadata:
  name: nginx1 
spec:
  containers:
  - image: maersk/nginx
    imagePullPolicy: Always
    name: nginx
    ports:
    - containerPort: 80
      protocol: TCP
    volumeMounts:
      - mountPath: /var/www
        name: data-nfsplugin 
  volumes:
  - name: data-nfsplugin
    persistentVolumeClaim:
      claimName: data-nfsplugin

```  


6. Access nfs file

```
kubectl exec -it nginx1 /bin/sh
cd /var/www

```

