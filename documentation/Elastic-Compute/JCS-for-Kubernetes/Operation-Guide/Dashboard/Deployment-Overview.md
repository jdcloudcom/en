# Deployment Overview
Deployment provides a declarative definition method to Pod and ReplicaSet to replace the former ReplicationController and to conveniently management applications.  
Typical application scenarios include:  
- Creating Pod and ReplicaSet by defining Deployment  
- Rolling Upgrade and Rollback Application  
- Capacity Expansion and Reduction  
- Suspension and Continuing of Deployment  

**Create Deployment**  
1. Open the Console, and enter [Elastic Compute>>JCS for Kubernetes>>Workloads>>Deployment](https://cns-console.jdcloud.com/host/kubernetesdeployment/list)  
2. Select the JCS for Kubernetes, (After the JCS for Kubernetes is created, you need to wait for the working node group to be created before more operations)  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/Deployment选择集群.png)  
3. Click **Create** to enter the creation page  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/创建Deployment.png)    
4. Support ‘Import from yaml file’ or edit yaml file online, and support full screen display  
5. After the editing is complete, click **Confirm** to enter [Elastic Compute>>JCS for Kubernetes>>Workloads>>Deployment](https://cns-console.jdcloud.com/host/kubernetesdeployment/list) to view  
6. Click the name to enter the details page, where you can view basic information, Pod template, Condition, Yaml files, and events  

**Update Deployment**   
1. Open the Console, and enter [Elastic Compute>>JCS for Kubernetes>>Workloads>>Deployment](https://cns-console.jdcloud.com/host/kubernetesdeployment/list)  
2. Click **Update** to enter the editing page  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/更新Deployment.png)  
3. Click **Confirm** after the editing is complete  

**Delete Deployment**    
1. Open the Console, and enter [Elastic Compute>>JCS for Kubernetes>>Workloads>>Deployment](https://cns-console.jdcloud.com/host/kubernetesdeployment/list)  
2. Click **Delete** to enter the deletion confirmation popup  
3. Click **Confirm  
