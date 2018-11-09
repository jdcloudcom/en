# Deployment Helm  
## Introduction  
**1. Introduction to Helm**  
Helm is a package management tool, packing Kubernetes resources (such as deployments, services and ingress) into a chart. With Helm, it can conveniently save chart in the chart repository for saving and sharing. Helm supports the version management releasing application configuration, making release configurable, simplifying version control, package, release, deletion, update and other operations for Kubernetes deployment and application.  
As shown by investigation report released by Kubernetes, 64% users use Helm to manage applications run in the environment of Kubernetes. Now, Helm is independent of Kubernetes and is the CNCF independent project.    
**2. Helm Architecture Chart**  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/Helm架构图.png)  
 The Helm architecture consists of the Helm client, the Tiller server end and the Chart repository. Upon deploying Tiller in Kubernetes, the Helm client can obtain the Chart package from the Chart repository, and install and deploy the same in JCS for Kubernetes.  
 **3. Features**  
 Helm is a management tool for the Kubernetes package, having the capacities below:  
- Creating new charts  
-	Packing charts in tgz files  
-	Interacting with the chart repository  
-	Installing and un-installing applications of Kubernetes  
-	Managing life cycle of charts installed with Helm    
**4. Helm Components**  
Helm has two major components, including the Helm client and the Tiller server:  
Helm client: This is command line tool used for the terminal users, with responsibilities below:  
-	Developing local chart  
-	Managing repository  
-	Interacting with Tiller server  
-	Sending charts to be installed  
-	Requesting information about release revision  
-	Requesting updating or un-installing release revision installed  
Tiller server: The Tiller service is deployed in JCS for Kubernetes. By interacting with the Tiller server, the Helm client can finally interact with the Kubernetes API server. Responsibilities of Tiller servers include:  
-	Listening requests from Helm client  
-	Building a release by combining chart and configuration  
-	Installing in Kubernetes and track subsequent release  
-	Updating or charting by interacting with Kubernetes  
The client is responsible for management chart, while the server is responsible for managing the release  

## Preconditions  
- The JCS for Kubernetes has been created. For [Creating Cluster], please see Getting Started for JCS for Kubernetes of JCS for Kubernetes.(https://docs.jdcloud.com/cn/jcs-for-kubernetes/create-to-cluster)  
- Taking the deployment of Centos7.4 64-bit as an example, install Kubectl and connect JCS for Kubernetes. For [Cluster Connection], please refer to Getting Started.(https://docs.jdcloud.com/cn/jcs-for-kubernetes/connect-to-cluster)  
## Installation Deployment
1. Download corresponding versions. At present, Kubernetes Version 1.8.12 is adopted by JD Cloud. Please choose the Helm Version [2.7.2](https://github.com/helm/helm/releases?after=v2.8.0)  
`wget https://storage.googleapis.com/kubernetes-helm/helm-v2.7.2-linux-amd64.tar.gz`  
2. Unzip  
 `tar -zxvf helm-v2.7.2-linux-amd64.tar.gz`  
3. Find the binary system file in the unzipped directory, and move the same to the desired position
 `mv linux-amd64/helm /usr/local/bin/helm`
4. Run commands below  
 `helm help`  
5. Add permissions for Tiller. For details, see [Role-based Access Control](https://docs.helm.sh/using_helm/#role-based-access-control). Create rbac-config.yaml, with contents below:  
```
apiVersion: v1
kind: ServiceAccount
metadata:
  name: tiller
  namespace: kube-system
---
apiVersion: rbac.authorization.k8s.io/v1beta1
kind: ClusterRoleBinding
metadata:
  name: tiller
roleRef:
  apiGroup: rbac.authorization.k8s.io
  kind: ClusterRole
  name: cluster-admin
subjects:
  - kind: ServiceAccount
    name: tiller
    namespace: kube-system
```  
   Execute the commands below:  
   `kubectl create -f rbac-config.yaml`  
6. Initialize Helm and install Tiller service  
```
helm init --upgrade --service-account tiller --tiller-image registry.docker-cn.com/rancher/tiller:v2.7.2
```  
7. Run commands below  
`helm version`  
The following information given means that the installation is successful.  
```
Client: &version.Version{SemVer:"v2.7.2", GitCommit:"8478fb4fc723885b155c924d1c8c410b7a9444e6", GitTreeState:"clean"}
Server: &version.Version{SemVer:"v2.7.2", GitCommit:"8478fb4fc723885b155c924d1c8c410b7a9444e6", GitTreeState:"clean"}
```  
## Use of Helm
1. For first installation of Helm, Helm is pre-configured to the official Kubernetes chart repo. This repo comprises charts which are well planned and maintained. This charts repo is named as stable by default. 
Updating chart List  
`helm repo update`  
Searching all available charts:  
`helm search`
```
NAME                                 	VERSION  	DESCRIPTION                                       
stable/acs-engine-autoscaler         	2.2.0    	Scales worker nodes within agent pools            
stable/aerospike                     	0.1.7    	A Helm chart for Aerospike in Kubernetes          
stable/anchore-engine                	0.2.6    	Anchore container analysis and policy evaluatio...
stable/apm-server                    	0.1.0    	The server receives data from the Elastic APM a...
stable/ark                           	1.2.2    	A Helm chart for ark                 
...
```  
Searching charts Relevant to mysql    
`helm search mysql`  
```
NAME                            	VERSION	DESCRIPTION                                       
stable/mysql                    	0.10.2 	Fast, reliable, scalable, and easy to use open-...
stable/mysqldump                	1.0.0  	A Helm chart to help backup MySQL databases usi...
stable/prometheus-mysql-exporter	0.2.1  	A Helm chart for prometheus mysql exporter with...
stable/percona                  	0.3.3  	free, fully compatible, enhanced, open source d...
stable/percona-xtradb-cluster   	0.3.0  	free, fully compatible, enhanced, open source d...
stable/phpmyadmin               	1.3.0  	phpMyAdmin is an mysql administration frontend    
stable/gcloud-sqlproxy          	0.6.0  	Google Cloud SQL Proxy                            
stable/mariadb                  	5.2.3  	Fast, reliable, scalable, and easy to use open-...
```  
Viewing chart Information  
`helm inspect stable/mysql`  
```
appVersion: 5.7.14
description: Fast, reliable, scalable, and easy to use open-source relational database
  system.
engine: gotpl
home: https://www.mysql.com/
icon: https://www.mysql.com/common/logos/logo-mysql-170x115.png
keywords:
- mysql
- database
- sql
maintainers:
- email: o.with@sportradar.com
  name: olemarkus
- email: viglesias@google.com
  name: viglesiasce
name: mysql
sources:
- https://github.com/kubernetes/charts
- https://github.com/docker-library/mysql
version: 0.10.2
...
```  
2. Install Software Package  
**- WordPress Deployment**  
WordPress Introduction:  
WordPress was created in 2003, and gradually becomes the self-service blog tool used the most worldwide.  
Executing Commands Below:  
`helm install stable/wordpress`  
Outputting Information Below:  
```
NAME:   boisterous-aardwolf
LAST DEPLOYED: Thu Nov  8 16:24:36 2018
NAMESPACE: default
STATUS: DEPLOYED

RESOURCES:
==> v1beta1/Deployment
NAME                           DESIRED  CURRENT  UP-TO-DATE  AVAILABLE  AGE
boisterous-aardwolf-wordpress  1        1        1           0          1s

==> v1beta1/StatefulSet
NAME                         DESIRED  CURRENT  AGE
boisterous-aardwolf-mariadb  1        1        1s
...
```
As the Cloud Disk Service is required for the deployment, please create a PVC.  
Enter commands below:  
`kubectl get pvc`  
Outputting Information Below:  
···
NAME                                 STATUS    VOLUME    CAPACITY   ACCESS MODES   STORAGECLASS   AGE
boisterous-aardwolf-wordpress        Pending                                       default        2m
data-boisterous-aardwolf-mariadb-0   Pending                                       default        2m
···  
Creating PVC with the name of boisterous-aardwolf-wordpress and data-boisterous-aardwolf-mariadb-0:  
Taking boisterous-aardwolf-wordpress for example, please create the boisterous-aardwolf-wordpress.yaml file, with contents below:  
```
apiVersion: v1
kind: PersistentVolumeClaim
metadata:
  name: boisterous-aardwolf-wordpress
spec:
  accessModes:
    - ReadWriteOnce
  storageClassName: jdcloud-ssd
  resources:
    requests:
      storage: 20Gi
```  
Deleting the original boisterous-aardwolf-wordpress:  
`kubectl delete pvc boisterous-aardwolf-wordpress`  
Executing creation:  
`kubectl create -f boisterous-aardwolf-wordpress.yaml`  
Create PVC with the name of data-boisterous-aardwolf-mariadb-0 according to the method.  
Waite for a second and execute commands below:  
`kubectl get pod`  
Output information below. If the status is running, it means the deployment succeeds.  
```
NAME                                             READY     STATUS    RESTARTS   AGE
boisterous-aardwolf-mariadb-0                    1/1       Running   0          57m
boisterous-aardwolf-wordpress-7b94db45db-s4g8f   1/1       Running   0          57m
```  
Execute commands below  
`kubectl get svc`  
Output information below  
```
NAME                            TYPE           CLUSTER-IP       EXTERNAL-IP    PORT(S)                      AGE
boisterous-aardwolf-mariadb     ClusterIP      192.168.57.31    <none>         3306/TCP                     1h
boisterous-aardwolf-wordpress   LoadBalancer   192.168.60.113   114.67.94.77   80:31860/TCP,443:30346/TCP   1h
kubernetes                      ClusterIP      192.168.56.1     <none>         443/TCP                      2d
```  
114.67.94.77 is the IP for external access, with the access address of WordPress URL: http://114.67.94.77 and the information displayed below:  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/WordPress1.png)  
WordPress Admin URL: http://114.67.94.77/admin  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/WordPress2.png)   
User Name:user  
Password:`$(kubectl get secret --namespace default boisterous-aardwolf-wordpress -o jsonpath="{.data.wordpress-password}" | base64 --decode)`  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/WordPress3.png)   

## Reference Information
1. For details of Helm, please refer to the [Helm Official Website](https://docs.helm.sh/)   
2. [Kubeapps Hub](https://hub.kubeapps.com). As the public chart application repository, common applications as Nginx, Jenkins and Redis are provided in the format of chart now.  
