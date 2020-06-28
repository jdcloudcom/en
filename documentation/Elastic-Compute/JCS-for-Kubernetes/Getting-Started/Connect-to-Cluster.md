
# Connect Cluster

 **Install the kubectl Client**

The Kubernetes command-line client kubectl may allow you to connect from the client computer to the JCS for Kubernetes for application deployment.

## 1. kubectl version 

The kubectl version can be the same as the cluster version, or the cluster version +1. When the cluster version is 1.16.4, the recommended download version of Kubectl is 1.16.4;

## 2. Install and set the kubectl client


JD Cloud provides the kubectl client of Version 1.16.4, and you can directly download it for use. For details, please refer to the following commands:

```
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/kubectl/1.16.4/kubectl
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin/kubectl
```
For the details of other system installations, please refer to [Official Documents](https://kubernetes.io/docs/tasks/tools/install-kubectl/)

## 3. Configuration Cluster Credentials

The credentials are in the JCS for Kubernetes-Cluster Service-Cluster-Details Page-kubectl Client Configuration. Copy the credentials to the local $HOME/.kube/config; after the configuration is completed, you can use kubectl to access the Kubernetes cluster from the local computer.
Example, execute the following commands under Centos 7.4 64-bit system:
```
mkdir -p ~/.kube
touch ~/.kube/config
vi ~/.kube/config
```
Completing evidence saving and executing commands below for verification:  
`kubectl version`  
The following contents mean that the configuration is successful.  
```
Client Version: version.Info{Major:"1", Minor:"16", GitVersion:"v1.16.4", GitCommit:"224be7bdce5a9dd0c2fd0d46b83865648e2fe0ba", GitTreeState:"clean", BuildDate:"2019-12-11T12:47:40Z", GoVersion:"go1.12.12", Compiler:"gc", Platform:"linux/amd64"}
Server Version: version.Info{Major:"1", Minor:"16+", GitVersion:"v1.16.4-12.8d683d9", GitCommit:"8d683d982b20a8f28a62ad502db0f352e50f621c", GitTreeState:"clean", BuildDate:"2019-12-30T09:24:27Z", GoVersion:"go1.12.12", Compiler:"gc", Platform:"linux/amd64"}
```
