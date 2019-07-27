# Mount Object Storage Service Bucket in JCS for Kubernetes
S3fs is a FUSE-based file system, which allows Linux to mount Bucket to the local file system and S3fs can remain the original format of the object. By using S3fs, a Bucket can be mounted into the Linux system as a folder and used as a system folder. For more details, please refer to [Attach Bucket on Linux Instances by Using S3fs](https://docs.jdcloud.com/en/object-storage-service/s3fs). This document specifies how to attach Object Storage Service Bucket to working nodes of JCS for Kubernetes with the method Daemonset, and provides application examples to illustrate how to share specified Bucket storage between two Pods.

## I. Deploying BUCKET Attached with S3 via the Method DaemonSet

1. Create one secret to save the secret key file of Object Storage Service Bucket, the file is saved with the name of s3fs-secret.yaml and the following commands are executed to create the secret object;

    ```
    wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/s3fs/s3fs-secret.yaml                #Please modify Access_Key_ID, Access_Key_Secret in s3fs-secret.yaml file first, then execute secret creation operation

    kubectl create -f s3fs-secret.yaml
    ```
    
    Contents of Yaml file are as follows:

    ```
    
    apiVersion: v1
    kind: Secret
    metadata:
      name: s3fs-secret
      namespace: default
    type: Opaque
    stringData:
      passwd-s3fs: |-
        Access_Key_ID:Access_Key_Secret     #Please replace Access_Key_ID and Access_Key_Secret respectively with contents of Access Key with access permission of Object Storage Service Bucket;
    ```

2. Create the Pod with s3fs file system with the Daemonset method, deploy Daemonset on the working node which allows use of Object Storage Service Bucket, and deploy Daemonset to all working nodes of cluster in this example:

  * Execute the commands below to create Daemonset object:

    ```
    wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/s3fs/s3fs-ds.yaml                #Plesase modify Object Storage Service Bucket related contents in s3fs-ds.yaml file first, then execute Daemonset creation operation

    kubectl create -f s3fs-ds.yaml
    ``` 
  **Note**: In this example. Daemonset uses s3fs image provided by JD Cloud, you may refer to help documentation descriptions of [Build s3fs Customized Image](https://docs.jdcloud.com/en/jcs-for-kubernetes/s3fs-custom-image) to build customized image
  * Contents of Yaml file are as follows:
    ```
    
    apiVersion: extensions/v1beta1
    kind: DaemonSet
    metadata:
      name: s3fs-mount
    spec:
      selector:
        matchLabels:
          name: s3fs-mount
      template:
        metadata:
          labels:
            name: s3fs-mount
        spec:
          containers:
          - name: s3fs-mount
            image: jdcloud-cn-north-1.jcr.service.jdcloud.com/jdcloud/oss-volumes:latest       #s3fs image provided by JD Cloud, you can use customized s3fs image for replacement
            securityContext:
              privileged: true        # cannot be changed, or Object Storage Service Bucket cannot be attached
            env:
            - name: S3_BUCKET
              value: Please replace value of storage-1026     #value with name of Object Storage Service Bucket  
            - name: S3_URL
              value: Pleas replace value of https://s3.cn-north-1.jdcloud-oss.com        #value with Internet Endpoint of Object Storage Service Bucket
            - name: MNT_POINT
              value: Value of /data    #value may not be changed or be replaced with the attached directory in the container with Object Storage Service Bucket; if it needs to modify value, please modify the mountPath value of volume with the name of mntdatas3fs, to guarantee that the shared directories are consistent in name;
            volumeMounts:
            - name: mntdatas3fs
              mountPath: Value of /data:shared       #mountPath may not be changed; if value of ENV MNT_POINT is changed, value of mountPath must be changed at the same time, to keep the shared directory name consistent
            - name: mysecret
              mountPath: "/mysecret"
          volumes:
          - name: mntdatas3fs
            hostPath:
              path: /mnt/data-s3fs
          - name: mysecret
            secret:
              secretName: s3fs-secret
              items:
              - key: passwd-s3fs
                path: Value of passwd-s3fs        #path cannot be changed, because the s3fs instruction will check permission (0600) of the file/mysecret/passwd-s3fs
                mode: Value of 0600        #mode cannot be changed, because the s3fs instruction will check permission (0600) of the file/mysecret/passwd-s3fs

    ```

* **Note**:

  * If it is required to access s3fs mount directories in Pod using the specified UID and GID, add runAsUser or runAsGroup definitions in the SecurityContext.
  * If it is required to add other s3fs customized parameters in CMD exec directive of s3fs-mount container, it can be added through OPTION of env; for example, authorize all users to access MNT_POINT, add a new set of env definitions, and name is set to OPTION and value is defined as allow_other (ENV OPTION allow_other):

    ```
    - name: OPTION
      value: allow_other
    ```



* Execute the following commands to confirm if all Daemonset is in running status:
    ```
    
    kubectl get daemonset s3fs-mount

    NAME         DESIRED   CURRENT   READY   UP-TO-DATE   AVAILABLE   NODE SELECTOR   AGE
    s3fs-mount   3         3         3       3            3           <none>          73m
    ```

4. When each Daemonset is running, applications of shared Object Storage Service Bucket can be deployed in the cluster by referring to the following examples.

## II. Example Application

Two Pods will be created by the example application, the first Pod will create a file with the name of SUCCESS in Object Storage Service, and the second Pod will write the content "helloworld" in the file with the name of SUCCESS.

1. When deploying the first Pod, create one file in Object Storage Service with the name of SUCCESS, save the Yaml file with the name of test-s3fs-pod1.yaml and execute the following commands to create Pod objects:

    ```
    wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/s3fs/test-s3fs-pod1.yaml

    kubectl create -f test-s3fs-pod1.yaml
    ```
    
    Contents of Yaml file are as follows:
    ```
    
    kind: Pod
    apiVersion: v1
    metadata:
      name: test-s3fs-pod-1
    spec:
      containers:
      - name: test-s3fs-pod-1
        image: busybox:latest
        command:
        - "/bin/sh"
        args:
        - "-c"
        - "touch /mnt/SUCCESS && sleep 60000 || exit 1"
        volumeMounts:
        - name: mntdatas3fs
          mountPath: "/mnt"
      restartPolicy: "Never"
      volumes:
      - name: mntdatas3fs
        hostPath:
          path: /mnt/data-s3fs
      ```
      Execute the following commands to confirm if pod is in running status:

      ```
      
      kubectl get pod test-s3fs-pod-1

      NAME              READY   STATUS    RESTARTS   AGE
      test-s3fs-pod-1   1/1     Running   0          9s
      ```
      After execution, the newly-created empty file with the name SUCCESS can be viewed under [Bucket Details] - [Object Management Tab Page] of Object Storage Service specified when deploying Daemonset in the last step;
   
2. For deployment of the second Pod, please write the character "helloworld" in the SUCESS file created in the last step, save the Yaml file with the name test-s3fs-pod2.yaml and execute the following commands to create Pod objects:

    ```
    wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/s3fs/test-s3fs-pod2.yaml

    kubectl create -f test-s3fs-pod1.yaml
    ```
    
    Contents of Yaml file are as follows:
    ```
    
    kind: Pod
    apiVersion: v1
    metadata:
      name: test-s3fs-pod-2
    spec:
      containers:
      - name: test-s3fs-pod-2
        image: busybox:latest
        command:
        - "/bin/sh"
        args:
        - "-c"
        - "echo helloworld > /mnt/SUCCESS && sleep 60000 || exit 1"
        volumeMounts:
        - name: mntdatas3fs
          mountPath: "/mnt"
      restartPolicy: "Never"
      volumes:
      - name: mntdatas3fs
        hostPath:
          path: /mnt/data-s3fs
      ```
    Execute the following commands to confirm if pod is in running status:

    ```
    
    kubectl get pod test-s3fs-pod-2

    NAME              READY   STATUS    RESTARTS   AGE
    test-s3fs-pod-2   1/1     Running   0          11s
    ```
    After execution, the output content "helloworld" can be viewed in the file with the name of SUCCESS created in the last step.
