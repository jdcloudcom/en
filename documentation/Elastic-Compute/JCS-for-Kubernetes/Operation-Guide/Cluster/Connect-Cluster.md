# Connect Cluster

 **Install the kubectl Client**

The Kubernetes command-line client kubectl may allow you to connect from the client computer to the JCS for Kubernetes for application deployment.

## 1. kubectl version 

The kubectl version can be the same as the cluster version, or the cluster version +1. When the cluster version is 1.8.12, the recommended download version of Kubectl is 1.8.12;

## 2. Install and set the kubectl client

Open the [Kubernetes Version Page](https://github.com/kubernetes/kubernetes/blob/master/CHANGELOG-1.8.md), find the client binaries (aka kubectl), select the client for the corresponding operating system, and then copy the link address.

For example, select kubectl version 1.8.12 with the link address of https://dl.k8s.io/v1.8.12/kubernetes-client-linux-amd64.tar.gz ：

Execute the following commands under Centos 7.4 64-bit system:

```
wget https://dl.k8s.io/v1.8.12/kubernetes-client-linux-amd64.tar.gz
tar -zxvf kubernetes-client-linux-amd64.tar.gz
cd kubernetes/client/bin
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin/kubectl
```
For the details of other system installations, please refer to https://kubernetes.io/docs/tasks/tools/install-kubectl/

## 3. Configuration Cluster Credentials

The credentials are in the JCS for Kubernetes-Cluster Service-Cluster-Details Page-kubectl Client Configuration. Copy the credentials to the local $HOME/.kube/config; after the configuration is completed, you can use kubectl to access the Kubernetes cluster from the local computer.
