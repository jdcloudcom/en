
# Connect Cluster

 **Install the kubectl Client**

The Kubernetes command-line client kubectl may allow you to connect from the client computer to the JCS for Kubernetes for application deployment.

## 1. kubectl version 

The kubectl version can be the same as the cluster version, or the cluster version +1. When the cluster version is 1.12.3, the recommended download version of Kubectl is 1.12.3;

## 2. Install and set the kubectl client

Open the [Kubernetes Version Page](https://github.com/kubernetes/kubernetes/blob/master/CHANGELOG-1.12.md), find the client binaries (aka kubectl), select the client for the corresponding operating system, and then copy the link address. Example, select kubectl version 1.12.3 under Centos 7.4 64-bit system with the link address of https://dl.k8s.io/v1.12.3/kubernetes-client-linux-amd64.tar.gz;

JD Cloud provides the kubectl client of Version 1.12.3, and you can directly download it for use. For details, please refer to the following commands:

```
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/kubectl/1.12.3/kubernetes-client-linux-amd64.tar.gz
tar -zxvf kubernetes-client-linux-amd64.tar.gz
cd kubernetes/client/bin
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
Client Version: version.Info{Major:"1", Minor:"12", GitVersion:"v1.12.3", GitCommit:"5d26aba6949f188fde1af4875661e038f538f2c6", GitTreeState:"clean", BuildDate:"2018-04-23T23:17:12Z", GoVersion:"go1.12.3", Compiler:"gc", Platform:"linux/amd64"}
Server Version: version.Info{Major:"1", Minor:"12+", GitVersion:"v1.12.3-23.56f6f14",GitCommit:"9d2635d891e745a24d6863cd61b0767575a5e79c", GitTreeState:"", BuildDate:"2018-07-23T10:39:25Z", GoVersion:"go1.12.3", Compiler:"gc", Platform:"linux/amd64"}
```
