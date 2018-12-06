# Create native container Pod in JCS for Kubernetes using Virtual-Kubelet
Create native container Pod using Kubectl client tool after finishing Virtual-Kubetlet deployment in JCS for Kubernetes.  

## Use Restrictions of Native Container Pod Created by Virtual Kubelet   
- Native Container Pod does not currently support service associated to Kubernetes;  
- Native Container Pod does not support dynamic PVC mount; corresponding Cloud Disk needs to have file system when mounting existing Cloud Disk or static PV.  
- Name setting specification of Native Container Pod: Cannot exceed 253 characters, may include multiple labels, separated with “.”. Label supports numbers, lowercase letters, and English line-through “-”, and does not support the start characters and end characters with the name of “-”; and cannot exceed 63 characters;  
- Not support setting DNSPolicy;  
- Native Container Pod can mount up to 7 Cloud Disks as the volume;  
- Native Container Pod can define up to 8 Containers; the number of Containers is subject to the number of added volumes.  
- Using Kubctl exec to execute commands in container does not support -t parameter;  
- Native Container Pod creates system disk for the defined Container by default, and the setting parameters of the system disk is as follows:  
```
annotations:
    jdcloud.com/NativeContainer.SystemDisk.Name: distTest
    jdcloud.com/NativeContainer.SystemDisk.Type: ssd
    jdcloud.com/NativeContainer.container-test1.SystemDisk.SizeGB: "40"
    jdcloud.com/NativeContainer.container-test1.SystemDisk.FSType: ext4
    jdcloud.com/NativeContainer.SystemDisk.AutoDelete: "false"
```  

## Use steps (take CentOS 7.4 64-bit operating system as an example)  

1. Log in to the server where kubectl is installed and can connect to the JCS for Kubernetes service endpoint. For Kubectl client installation and settings, refer to [Install and Set kubectl] (https://docs.jdcloud.com/cn/jcs-for-kubernetes/connect-to-cluster)；  

2. Download [jdcloud-virtual-kubelet.tar.gz] (http://kubernetes.oss.cn-north-1.jcloudcs.com/virtual-kubelet/jdcloud-virtual-kubelet.tar.gz) and decompress the files to enter the decompression directory, execute virtual-kubelet.sh script. For details, refer to [Virtual-Kubelet Deployment](https://docs.jdcloud.com/cn/native-container/deploy-virtual-kubelet)；  

3. After the virtual-kubelet deployment is complete, execute the following commands to ensure that virtual-kubelet is running normally.  
`  
kubectl get nodes		#Ensure that virtual-kubelet virtual nodes are running normally  
`  
```
NAME                         STATUS    ROLES     AGE       VERSION
k8s-node-*******-90lirk7snb   Ready     <none>    10d       v1.8.12-249.9d2635d
k8s-node-*******-90lirk7snb   Ready     <none>    10d       v1.8.12-249.9d2635d
k8s-node-*******-90lirk7snb   Ready     <none>    10d       v1.8.12-249.9d2635d
virtual-kubelet-cn-****-2a   Ready     agent     3d        v1.8.3
virtual-kubelet-cn-****-2b   Ready     agent     3d        v1.8.3
```  
`  
kubectl get pods -n kube-system -o wide		#Ensure that virtual-kubelet plugins are running normally
`  
```
NAME                                          READY     STATUS             RESTARTS   AGE       IP           NODE
virtual-kubelet-cn-****-2a-7b****f7f-plmnp    1/1       Running            0          6h        10.0.128.5   k8s-node-v****4-90****snb
virtual-kubelet-cn-****-2b-78****c4b7-mk8nv   1/1       Running            0          6h        10.0.128.3   k8s-node-v****a-90****snb
```   
4. The example for creating Yaml of Native Container Pod using virtual-kubelet is as follows:  
The content of pod_example.yaml is as follows:  
```
apiVersion: v1
kind: Pod
metadata:
  name: pod-example
  annotations:
    jdcloud.com/NativeContainer.SystemDisk.Name: distTest
    jdcloud.com/NativeContainer.SystemDisk.Type: ssd
    jdcloud.com/NativeContainer.container-test1.SystemDisk.SizeGB: "40"
    jdcloud.com/NativeContainer.container-test1.SystemDisk.FSType: ext4
    jdcloud.com/NativeContainer.SystemDisk.AutoDelete: "false"
spec:
  containers:
  - name: container-test1
    image: busybox:latest
    command: ["/bin/sh", "-c", "while true; do date && echo Welcome to JDCLOUD! && sleep 5;done"]
    imagePullPolicy: Never
    resources:
      requests:
        memory: "64Mi"
        cpu: "1"
  - name: container-test2
    image: busybox:latest
    command: ["/bin/sh", "-c", "while true; do date && echo Welcome to JDCLOUD! && sleep 5;done"]
    imagePullPolicy: Never
    resources:
      requests:
        memory: "64Mi"
        cpu: "1"
      limits:
        memory: "100Mi"
        cpu: "2"
  nodeSelector:
    kubernetes.io/hostname: virtual-kubelet-cn-****-1a		#Compulsory, must be consistent with the Availability Zone selected when deploying virtual-kubelet
  tolerations:
  - key: virtual-kubelet.io/provider
    operator: Exists
```    
`    
kubectl create -f pod_example.yaml  
`    

- **Precautions for creating Native Container Pod by Virtual-Kubelet:**    

  - In the yaml file of pod, you must add nodeSelector and tolerations   
  - In nodeSelector, kubernetes. io/hostname: hostname is compulsory  

```
nodeSelector:
    kubernetes.io/role: agent
    beta.kubernetes.io/os: linux
    type: virtual-kubelet
    kubernetes.io/hostname: virtual-kubelet-{AZ}		#Compulsory, must be consistent with the Availability Zone selected when deploying virtual-kubelet
tolerations:
- key: virtual-kubelet.io/provider
  operator: Exists

```    
