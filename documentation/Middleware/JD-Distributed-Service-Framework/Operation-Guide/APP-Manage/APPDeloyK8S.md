#  Kubernetes Application Deployment

By adopting the fully-hosted management node, JCS for Kubernetes provides simple, easy-to-use, high-reliable and powerful container management service to users. However, on the JD Distributed Service Framework, users can conveniently deploy Kubernetes Container application via Kubernetes deployment. How to realize Kubernetes container application deployment, deletion, application expansion and contraction, configuration of Load Balancer, etc. via JDSF Console are specified as follows.

The followings are covered in this chapter:
- Deploy Application
- Delete Application
- Scaling
- Configure Load Balancer
- Configure Application Log
- Configure Application Monitoring


## Operation Scenario

If a JD Cloud & AI user has created JCS for Kubernetes on JD Cloud & AI, then the application will need to be deployed in the cluster. At this point, the user can complete the application deployment through the interface operation via the JDSF Console.

## Environment Preparation

1. JCS for Kubernetes of JD Cloud & AI has been purchased and enabled.

2. Resources required are enabled, such as: JDSF, etc.

3. The image required to be deployed has been uploaded to JD Cloud & AI Container Registry.

4. If the application monitoring function is required to be used, the cluster monitoring switch in JCS for Kubernetes shall be enabled in advance.

5. **Note:** 

-  It requires authorization during pulling image when using the Kubernetes deployment. Therefore, please enable authorization in advance in Kubernetes. For details of authorization, please refer to [Integrated Container Registry](../../../../Elastic-Compute/JCS-for-Kubernetes/Best-Practices/Deploy-Container-Registry.md).

-  Load Balancer cost will be generated when using Kubernetes.



## Operation Steps


### Deploy Application


#### Step 1: Create a namespace and a Kubernetes cluster resource pool in JDSF

1. Create a namespace in JDSF. For the process, refer to: [Namespace](../Namespace.md).

This step is optional. You can also use the Kubernetes namespace directly instead of the JDSF namespace.

If you choose to deploy in the JDSF namespace, you can use either the JDSF registration center or the Kubernetes for service registration discovery, which can facilitate user to conduct operation and management on the console. If you do not choose the JDSF namespace, you can use Kubernetes only for service registration discovery.

2. Create a Kubernetes cluster resource pool in JDSF. For the process, refer to: [Create Resource Pool](../Resource-Manage/Resource-List.md).

#### Step 2: Create application

In the page of creating applications, select the creation of Kubernetes application. 

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/yybs-cjyy-k8s.png)

#### Step 3: Initiate deployment to application

Select the K8S application to be deployed in the application management list, and click **Initiate Deployment** in the operations to enter configuration deployment information page. Wherein, the basic information, container and image information are required to be filled in, while advanced configuration portion is optional.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-pzbs-jbxx.png)


1. Description on basic information, container and image information items.

| Field | Description |
| :- | :- |
|  Resource Pool |  The cluster created by the user in JCS for Kubernetes, in which the application will be deployed currently. |
|  JDSF Namespace | JDSF namespace of the target for the current deployment operation. If you choose to deploy in the JDSF namespace, you can use either the JDSF registration center or the K8S for service registration discovery, which can facilitate user to conduct operation and management on the console. If you do not choose the JDSF namespace, you can use Kubernetes only for service registration discovery.   |
|  Kubernetes Namespace | Kubernetes namespace of the target for the current deployment operation. |
|  Image |  Container Registry and image tag information, etc. |

2. Create a Kubernetes namespace.

In JDSF, click to operate "Create a Kubernetes Namespace", to create a namespace directly under Kubernetes.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-create-np.png)


#### Step 4: Execute deployment

After deployment, operation such as rollback and re-deployment can be made.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-bsxq.png)




### Delete Application

1. Log in the JD Distributed Service Framework Console. Click **Application Management** on the left side navigation bar and log in the application list page.

2. For applications to be deleted, click **Delete** on the operation bar.

3. Before deleting the data, a user needs to well complete data backup work on his/her own.




### Scaling 

For expansion in Kubernetes resource pool, you can make configuration in JD Distributed Service Framework.

1. Log in the JD Distributed Service Framework Console. Click **Application Management** on the left side navigation bar and log in the application list page.

2. Select the application for configuration expansion and contraction, click application name and enter the application details.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq.png)

Click **Details** in the operation bar and adjust total number and specification of running Pod in application setting.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq-step1.png)

3. Configure expansion and contraction conditions. At present, auto expansion and contraction as well as manual expansion and contraction are supported.

1) Auto Expansion and Contraction

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq-step2-zdks-2.png)

For example, when auto expansion is configured as above, it means when cpu load exceeds 50% of the cap of resource configured for application deployment at present, Kubernetes will automatically create one Pod expansion application instance. If all Pod resources exceed 50% of the resource cap of each Pod after completion of expansion, Kubernetes will continue the expansion and contraction until 5 Pods are left. When application load falls back, Kubernetes will be automatically contracted, with some Pod removed to recover resources. It should be noted that auto expansion and contraction (HPA) is supported only when above version 1.12.3-jcs.4 JD Cloud & AI Kubernetes is supported.


2) Manual Expansion and Contraction

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq-step2-sdks.png)

For example, when configuration is made as shown above, the number of application instance will be modified to the number setting. If the current setting value is less than the number of instances deployed at present, contraction will be made; if the current setting value is greater than the number of instances deployed at present, expansion will be made.


4. Configure expansion and contraction specification.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq-step3.png)




### Configure Load Balancer


1. Log in the JD Distributed Service Framework Console. Click **Application Management** on the left side navigation bar and log in the application list page.

2. Select the application for configuration, click application name and enter the application details.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq.png)

3. Click **Details** in the operation bar and carry out Load Balancer configuration in application setting.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/k8s-zyc-yyxq-fzjh.png)

Please refer to [Nginx-ingress controller Deployment](../../../../Elastic-Compute/JCS-for-Kubernetes/Best-Practices/Ingress/Deploy-Ingress-NGINX-Controller.md)



### Configure Application Log

The Application Log shall be configured on "Configuration and Deployment" page.

1. Log in the JD Distributed Service Framework Console. Click **Application Management** on the left side navigation bar and log in to the application list page. Click **Initiate Deployment** in the operation.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/yylb.png)

2. Find configuration of "Application Log" in the advanced configuration. Enable the configuration switch and fill out log information.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyrz-yyjk.png)

| Information Item	| Description	| 
| :- | :- | 
|  Log Set	|  Application Log will be collected through the cloud log, so please prepare log set in advance. For the creation of log set, please refer to: [Log Set Management](../../../../Management/Log-Service/Operation-Guide/LogSet/LogSetManagement.md)	| 
|Log Path | The path is used for log collection, and please fill out the absolute path.| 
| AK/SK | The available Access Key/Access Key Secret under the current user name is required to be filled out. For such information, please refer to: [Accesskey Management](../../../../User-Service/Account-Management/AccessKey-Management.md)|  

 
3. After being deployed, application running information in different resource pools can be viewed in application running information in application detail.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyxq.png)

4. Click **Log** in the operation to redirect to the log information page. The collected log information can be viewed through retrieval.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyrz-rzfw.png)




### Configure Application Monitoring

Thw Application Monitoring shall be configured on "Configuration and Deployment" page.

1. Enable cluster monitoring in Kubernetes.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyjk-k8s.png)

2. Log in the JD Distributed Service Framework Console. Click **Application Management** on the left side navigation bar and log in to the application list page. Click **Initiate Deployment** in the operation.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/yylb.png)

3. Find configuration of "Application Monitoring" in the advanced configuration. Enable the configuration switch and fill out the log information.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyrz-yyjk.png)
| Information Item	| Description	| 
| :- | :- | 
| Collectio Port | Collection Port | 
| Collection Path | Prometheus will carry out collection through this path and report the collected results to Monitoring. | 

4. After being deployed, the application running information in different resource pools can be viewed in application running information in application detail.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyxq.png)

5. Click **Monitoring** in the operation to redirect to the monitoring information page. Monitoring graph can be viewed by customizing metrics method.
![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyjk-zdyjk.png)

For usage of Custom Metric Monitoring, please refer to: [Usage Description for Custom Metric Monitoring](../../../../Management/Monitoring/Operation-Guide/custom-monitoring/custom-monitoring-overview.md) 


[i.e.] View Application Monitoring in Custom Metric Monitoring

In the case that the statistics of monitoring metrics random number custom_metrics_random_num_gauge has been customized and the application has been successfully deployed. The method to view the metrics in "Custom Metric Monitoring" shall be:

STEP1: Select **JCS for Kubernetes (System)** in "Namespace" option,

STEP2: Select monitoring metric "custom_metrics_random_num_gauge"

STEP3: Select aggregation method and dimension. Then you can view monitoring graph.

![](../../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/fqbs-yyjk-zdyjk-2.png)

