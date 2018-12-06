# Virtual-Kubelet Deployment  
Virtual-Kubetlet is an open source Kubernetes Kubelet deployment method that provides a virtual Kubelet implementation scheme for other API-connected JCS for Kubernetes. At present, JD Cloud is developed based on Virtual-Kubelet V0.5.1 version, which provides the scheme of Native Container Pod connected to JCS for Kubernetes.  

## Virtual-Kubelet Automated Deployment  

JD Cloud provides the [Virtual Kubelet Automated Deployment Script][1]. Take CentOS 7.4 64-bit operating system as an example, the steps of downloading and executing the automated deployment script on the terminals that can be connected to the cluster are as follows:  
1. Download and decompress the automated deployment script to the local:  
```
wget http://kubernetes.oss.cn-north-1.jcloudcs.com/virtual-kubelet/jdcloud-virtual-kubelet.tar.gz    
tar -zxvf jdcloud-virtual-kubelet.tar.gz  
```  
2. Enter the jdcloud-virtual-kubelet directory and execute the automated deployment script:   
`  
sh virtual-kubelet.sh 114.**.**.93:6443 cn-****-2a,cn-****-2b g.n2  
`   
The parameter description of script running is as follows:  
- `114.**.**.93：6443`:JCS for Kubernetes service endpoint; you can view and acquire the service endpoint provided by JCS for Kubernetes connected to Virtual-Kubelet on the JCS for Kubernetes details page;  
- `cn-****-2a, cn-****-2b`: Availability Zone running for Virtual-Kubelet; consistent with the Availability Zone supported by JCS for Kubernetes, or a subset of Availability Zone supported by JCS for Kubernetes; for details, refer to [Region and Availability Zone Description] (https://docs.jdcloud.com/cn/jcs-for-kubernetes/regions-and-availabilityzones)；    
- `g.n2`: Classify the Instance Types; set the Instance Type classification selected by default when Virtual-Kubelet creates Native Container Pod, such as: g.n2, c.n2, m.n2, h.g2; for more instance specification types, refer to [Price Overview][2];  
3. Ensure the Virtual-Kubelet status by Kubectl:  
`   
kubectl get pods -n kube-system
`   
```
NAME                                          READY     STATUS     RESTARTS   AGE
virtual-kubelet-cn-east-2a-5cd5bcd4b5-rwlrt   1/1       Running    9          2d
virtual-kubelet-cn-east-2b-7bb6c6f565-zvggm   1/1       Running    3          2d
```  
Ensure the number of Virtual-Kubelet virtual nodes is consistent with the number of specified Availability Zones, and the status is running. It means the Virtual-Kubelet is deployed.  

`
kubectl get nodes
`  
```
NAME                         STATUS    ROLES     AGE       VERSION
k8s-node-*******-90****snb   Ready     <none>    10d       v1.8.12-249.9d2635d
k8s-node-*******-90****snb   Ready     <none>    10d       v1.8.12-249.9d2635d
k8s-node-*******-90****snb   Ready     <none>    10d       v1.8.12-249.9d2635d
virtual-kubelet-cn-****-2a   Ready     agent     3d        v1.8.3
virtual-kubelet-cn-****-2b   Ready     agent     3d        v1.8.3
```  

## Virtual-Kubelet Dependent File Description   

- nc.toml   
- virtual-kubelet-serviceaccount.yaml    
- virtual-kubelet-deployment.yaml    

1. Virtual-Kubelet Launch Configuration File nc.toml, the file content and description are as follows:  

```  
[System]
   OperatingSystem = "Linux"		#Node operating system. It is Linux by default.
[Metadata]
  Region = "cn-east-2"		#The region where the created Native Container Pod is located must be the same region where the JCS for Kubernetes is located
  AvailableZone = "cn-east-2a" 		#The Availability Zone where the created Native Container Pod is located must be the Availability Zone supported by JCS for Kubernetes
  ClusterID = "k8s-1m******lv"	 	#JCS for Kubernetes ID
  PodSubnetId = "subnet-ds******2v"		# The subnet where the Native Container Pod is located must be consistent with the subnet where the JCS for Kubernetes Pod is located.
  PodSecurityGroups = ["sg-12******o7”] 		#Security Group ID Associated to the Subnet
  AccessKey = "4B06***********************01B9" 		#Create AccessKey associated with JCS for Kubernetes
  SecretKey = "EA94************************18A1"		#Create SecretKey associated with JCS for Kubernetes
[Resource]
  ContainerDefaultCPU = "125m"		#The default value of the container cpu when the resource request/limit is not set; 1C=1000m
  ContainerDefaultMEM = "256Mi"		##The default value of the container memory when the resource request/limit is not set; 1G=1024Mi
  Pods = "50"		# The number of Native Container Pods supported by one Virtual-kubelet virtual node by default;
  TotalCPU = "72"		# The total number of CPUs supported by one Virtual-kubelet virtual node by default;
  TotalMEM = "576Gi"		# The total Memory capacity supported by one Virtual-kubelet virtual node by default
  InstanceTypeFamily = "g.n2"		#The Instance Type Family selected by default when Virtual-kubelet virtual node creates the Native Container Pod

```  
2. Virtual-Kubelet Deployment File:  

- virtual-kubelet-serviceaccount: Create service-account corresponding to Virtual-Kubelet, provide permissions of accessing K8S APIserver and operating Pod and other resources.  
- virtual-kubelet-secret, using the X 509 certificate in pem format to conduct 10250 port access verification, for kubectl logs to acquire container logs and for Kubectl exec to execute commands in the container.  

```
apiVersion: v1
kind: ServiceAccount
metadata:
  name: virtual-kubelet
  namespace: kube-system
  labels:
    k8s-app: virtual-kubelet
---
apiVersion: rbac.authorization.k8s.io/v1beta1
kind: ClusterRoleBinding
metadata:
  name: virtual-kubelet
  namespace: kube-system
subjects:
- kind: ServiceAccount
  name: virtual-kubelet
  namespace: kube-system
roleRef:
  apiGroup: rbac.authorization.k8s.io
  kind: ClusterRole
  name: cluster-admin
---
apiVersion: v1
kind: Secret
metadata:
  name: virtual-kubelet
  namespace: kube-system
type: Opaque
data:
  cert.pem: xxxxxxxxxxxxxxxxxxxxxxxxxxx==   #cert.pem content
  key.pem: xxxxxxxxxxxxxxxxxxxxxxxxxxxx==   #key.pem content

```  
3. virtual-kubelet-deployment.yaml defines Deployment, runs the Virtual-Kubelet application (Deployment is highly available and easy to maintain; or you can create virtual-kubelet POD directly)   
- **Description**: In the deployment, the replicas must be 1, i.e. the number of Pods of the specified virtual-kubelet expected to be created is 1  
```
# virtual-kubelet-deployment.yaml 
apiVersion: extensions/v1beta1
kind: Deployment
metadata:
  name: virtual-kubelet-cn-****-2a		#cn-****-2a is the specified Availability Zone when running the script
  namespace: kube-system
  labels:
    k8s-app: kubelet
spec:
  replicas: 1
  selector:
    matchLabels:
      k8s-app: virtual-kubelet-cn-south-1a
  template:
    metadata:
      labels:
        k8s-app: virtual-kubelet-cn-south-1a
    spec:
      hostNetwork: true
      initContainers:
      - name: init-config
        image: virtual-kubelet:1.0 	 #virtual-kubelet image on the JCS for Kubernetes node
        imagePullPolicy: IfNotPresent
        env:
        - name: AVALIABILITY_ZONE
          value: cn-south-1a
        command: ["init-config.sh"]
        volumeMounts:
        - name: configs
          mountPath: "/etc/virtual-kubelet/config"
          readOnly: false
      containers:
      - name: virtual-kubelet
        image: virtual-kubelet:1.0
        imagePullPolicy: IfNotPresent
        env:
        - name: KUBERNETES_SERVICE_HOST
          value: 10.0.0.4
        - name: KUBERNETES_SERVICE_PORT
          value: "6443"
        - name: KUBELET_PORT
          value: "10251"
        - name: APISERVER_CERT_LOCATION
          value: /etc/virtual-kubelet/cert/cert.pem
        - name: APISERVER_KEY_LOCATION
          value: /etc/virtual-kubelet/cert/key.pem
        - name: DEFAULT_NODE_NAME
          value: virtual-kubelet-cn-south-1a
        - name: VKUBELET_POD_IP
          valueFrom:
            fieldRef:
              fieldPath: status.podIP
        volumeMounts:
        - name: credentials
          mountPath: "/etc/virtual-kubelet/cert"
          readOnly: true
        - name: configs
          mountPath: "/etc/virtual-kubelet/config"
          readOnly: true
        command: ["virtual-kubelet"]
        args: [
          "--provider", "jdcloud",
          "--nodename", "$(DEFAULT_NODE_NAME)",
          "--provider-config", "/etc/virtual-kubelet/config/nc-cn-south-1a.toml",
          "--os", "Linux"
        ]
        livenessProbe:
          tcpSocket:
            port: 10251
          initialDelaySeconds: 20
          periodSeconds: 20
      volumes:
      - name: credentials
        secret:
          secretName: virtual-kubelet
      - name: configs
        hostPath:
          path: /etc/jdcloud-virtual-kubelet/config
          type: DirectoryOrCreate
      serviceAccountName: virtual-kubelet
```  

  [1]: http://kubernetes.oss.cn-north-1.jcloudcs.com/virtual-kubelet/jdcloud-virtual-kubelet.tar.gz
  [2]: https://docs.jdcloud.com/cn/native-container/price-overview
