
# Add GPU working node group

## **Steps for creating working node group:**

 1. Turn on the Console and enter the working node group creation page.

 2. Select the GPU node specification
    
    * Instance Type: Select the GPU type in the drop-down list;
    * Instance Type: The GPU standard type is provided now and each vCPU corresponds to the hyper-threading core of one Intel Xeon processor. For details, please refer to Instructions of [GPU Standard Type](https://docs.jdcloud.com/en/virtual-machines/instance-type-family#user-content-6)

 3. For more details, please refer to the Help Documentation of [Create Working Node Group](https://docs.jdcloud.com/en/jcs-for-kubernetes/create-nodegroup).

 **Note**: GPU Type only can be provided for Beta in a single availability zone, i.e. cn-north-1;

## **Install GPU node driver:**

After the working node group is created and is running, you need to install NVIDIA device plugin and NVIDIA GPU drive on GPU nodes.

### **I. Deploy k8s-device-plugin**

NVIDIA device plugin can run on the Kubernetes node with the daemonset method, communicate with kubelet via the gRPC method, report GPU count on nodes to kubelet and make physical checkup for GPU at the same time, so as to guarantee that the container running GPU in clusters is normally running. For installation steps of NVIDIA device plugin, please refer to the instructions below:

1. Contents in yaml files of NVIDIA device plugin are as follows:

```
apiVersion: extensions/v1beta1
kind: DaemonSet
metadata:
  name: nvidia-device-plugin-daemonset
  namespace: kube-system
spec:
  updateStrategy:
    type: RollingUpdate
  template:
    metadata:
      # Mark this pod as a critical add-on; when enabled, the critical add-on scheduler
      # reserves resources for critical add-on pods so that they can be rescheduled after
      # a failure.  This annotation works in tandem with the toleration below.
      annotations:
        scheduler.alpha.kubernetes.io/critical-pod: ""
      labels:
        name: nvidia-device-plugin-ds
    spec:
      tolerations:
      # Allow this pod to be rescheduled while the node is in "critical add-ons only" mode.
      # This, along with the annotation above marks this pod as a critical add-on.
      - key: CriticalAddonsOnly
        operator: Exists
      - key: nvidia.com/gpu
        operator: Exists
        effect: NoSchedule
      containers:
      - image: jdcloud-cn-north-1.jcr.service.jdcloud.com/k8s-device-plugin:1.11                # NVIDIA device plugin image name
        name: nvidia-device-plugin-ctr
        securityContext:
          allowPrivilegeEscalation: false
          capabilities:
            drop: ["ALL"]
        volumeMounts:
          - name: device-plugin
            mountPath: /var/lib/kubelet/device-plugins
      volumes:
        - name: device-plugin
          hostPath:
            path: /var/lib/kubelet/device-plugins
```
2. Deploy NVIDIA device plugin with the daemonset method:

`
kubectl create -f https://jke-component-cn-north-1.s3.cn-north-1.jdcloud-oss.com/apps/gpu/spec/nvidia-device-plugin.yml
`

3. Execute the following commands and confirm if deamonset of NVIDIA device plugin is normally running:

```
kubectl get daemonset -n kube-system

NAME                             DESIRED   CURRENT   READY   UP-TO-DATE   AVAILABLE   NODE SELECTOR   AGE
nvidia-device-plugin-daemonset   5         5         5       5            5           <none>          34m
```

### **II. Deploying NVIDIA GPU Driver of Designated Version**

You need to install the NVDIA GPU driver in the GPU node and drive GPU nodes running in JCS for Kubernetes with the Daemonset method.

JD Cloud provides GPU driver image files for two models of NVIDIA, i.e. Tesla P40 and Tesla V100. The image files are built based on NVIDIA-Linux-x86_64-410.104.run. If you need to use the NVIDIA GPU drive of this version, please set image name as jdcloud-cn-north-1.jcr.service.jdcloud.com/nvidia-gpu-driver-installer:v1.

The instance takes the above NVIDIA GPU drive image for example, indicating how JD Cloud installs NVIDIA GPU on GPU nodes of Nvidia Tesla P40 type.

1. Contents of Yaml file for NVDIA GPU driver file are as follows:

```
apiVersion: apps/v1
kind: DaemonSet
metadata:
  name: nvidia-driver-installer
  namespace: kube-system
  labels:
    k8s-app: nvidia-driver-installer
spec:
  selector:
    matchLabels:
      k8s-app: nvidia-driver-installer
  updateStrategy:
    type: RollingUpdate
  template:
    metadata:
      labels:
        name: nvidia-driver-installer
        k8s-app: nvidia-driver-installer
    spec:
      affinity:
        nodeAffinity:               # Describe node affinity rules restricting pod scheduling
          requiredDuringSchedulingIgnoredDuringExecution:
            nodeSelectorTerms: 
            - matchExpressions:             # Describe node selector rules required to be meet by node label, and JD Cloud adds one label group for GPU Node by default, with contents below: jdcloud.com/jke-accelerator=nvidia-tesla-p40
              - key: jdcloud.com/jke-accelerator                #label key added by JD Cloud for GPU Node by default
                operator: In
                values: 
                - nvidia-tesla-p40              # label value added by JD Cloud for GPU Node by default, with Value determined according to GPU model
      tolerations:
      - operator: "Exists"              # key is null, and operator means that all key, value and effects matched at the time of Exists
      hostNetwork: true
      hostPID: true
      volumes:
      - name: dev
        hostPath:
          path: /dev
      - name: nvidia-install-dir-host
        hostPath:
          path: /home/kubernetes/bin/nvidia
      - name: root-mount
        hostPath:
          path: /
      initContainers:
      - image: jdcloud-cn-north-1.jcr.service.jdcloud.com/nvidia-gpu-driver-installer:v1                #GPU driver image name built by JD Cloud based on NVIDIA-Linux-x86_64-410.104.run 
        name: nvidia-driver-installer
        securityContext:
          privileged: true
        env:
          - name: NVIDIA_INSTALL_DIR_HOST
            value: /home/kubernetes/bin/nvidia
          - name: NVIDIA_INSTALL_DIR_CONTAINER
            value: /usr/local/nvidia
          - name: ROOT_MOUNT_DIR
            value: /root
        volumeMounts:
        - name: nvidia-install-dir-host
          mountPath: /usr/local/nvidia
        - name: dev
          mountPath: /dev
        - name: root-mount
          mountPath: /root
      containers:
      - image: "jdcloud-cn-north-1.jcr.service.jdcloud.com/k8s/pause-amd64:3.1"
        name: pause
```

**Note**: For correspondence between GPU node specification and node label, please refer to the table below:

|GPU Specification | Node Label key   |Node Label value  |
| ------ | ------ | ------ |
|p.n1p40 Series|jdcloud.com/jke-accelerator  | nvidia-tesla-p40 |
|p.n1v100 Series	|jdcloud.com/jke-accelerator | nvidia-tesla-v100  |


2. Deploy NVIDIA GPU driver with the daemonset method:

`
kubectl create -f https://jke-component-cn-north-1.s3.cn-north-1.jdcloud-oss.com/apps/gpu/spec/nvidia-driver-installer-daemonset.yaml
`

3. Execute the following commands and confirm if deamonset driven by NVIDIA GPU is normally running:

```
kubectl get daemonset -n kube-system

NAME                             DESIRED   CURRENT   READY   UP-TO-DATE   AVAILABLE   NODE SELECTOR   AGE
nvidia-driver-installer   5         5         5       5            5           <none>          13s
```

4. After the above steps are completed, you can create one pod by referring to the following examples of yaml file and verify correctness of NVIDIA GPU driver.

```
apiVersion: v1
kind: Pod
metadata:
  name: gpu-pod
spec:
  containers:
  - name: cuda-container
    image: nvidia/cuda:9.0-base
    resources:
      limits:
        nvidia.com/gpu: 0
    command:
      - /bin/sh
      - -c
      - "while true; do nvidia-smi;sleep 1 ; done"

```

Wait for a period, execute kubectl logs gpu-pod and verify output results by referring to the figure below.

![验证GPU驱动](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/checkGPUdriver.png)

### **III. Deploying NVIDIA GPU Driver of Customized Version**

You can also build customized images according to NVIDIA GPU model and the driver of latest version provided by NVIDIA officially, and complete installation of the NVIDIA driver. For details, please refer to [Deploy NVIDIA GPU Driver of Customized Version](https://docs.jdcloud.com/en/jcs-for-kubernetes/custom-gpu-driver).