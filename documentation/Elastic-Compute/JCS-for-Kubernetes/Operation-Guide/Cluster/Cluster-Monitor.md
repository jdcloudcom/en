# Cluster Monitoring
## Introduction
- JD Cloud provides JCS for Kubernetes with monitoring data from different resources and different dimensions such as cluster, work node group, work node and Workload, which is convenient for you to grasp the usage status of resources in real time and locate the exception status of cluster or service easily. And it conducts integration with JD Cloud Monitoring, providing monitoring data collection and monitoring data persistence storage functions.  
- JCS for Kubernetes provides two types of resource monitoring: basic monitoring and custom metric monitoring. Basic monitoring is the monitoring of cluster infrastructure such as management node group and work node group, including node status, Pod status, request times of API, API request/response byte, memory utilization rate, CPU utilization rate, disk read/write throughput, network out/in rate,
; Custom Metric Monitoring provides a monitoring indicator for applications that users customize to deploy in the cluster, including CPU used, memory used, etc.  
- By default, JD Cloud provides JCS for Kubernetes with basic resource monitoring, and you can choose to enable Workload Custom Metric Monitoring.  

### Create JCS for Kubernetes that supports monitoring  
1. Log in the Console; select **Elastic Compute** - **JCS for Kubernetes** on the left menu; click to enter the JCS for Kubernetes List page;   
2. Click the **Create** button to enter the cluster creation page;  
3. Confirm to enable the cluster monitoring in the cluster information;  
4. After completing other required information configuration of clusters, click the **OK** button to enter the cluster creation process;  

### Enable/Disable JCS for Kubernetes cluster monitoring  
After cluster is created, you can disable or enable the cluster monitoring again in the Console. After the cluster monitoring is disabled, the Workload Custom Metric Monitoring data is no longer updated and the basic monitoring data is not affected.  

1. Log in the Console; select **Elastic Compute** - **JCS for Kubernetes** - **Cluster Name** on the left menu; click to enter the JCS for Kubernetes Details page;  
2. Select the cluster monitoring switch on the details page; click **Disable** or **Enable** the monitoring of JCS for Kubernetes;  


