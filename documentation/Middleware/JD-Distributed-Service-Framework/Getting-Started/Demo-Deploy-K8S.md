# : Quick Start of Kubernetes Application Deployment

## Environment Preparation

1. Create JCS for Kubernetes in "JCS for Kubernetes" in "Cloud Service".

2. Image Download

| Content |  Type | Size | Address |
|---|---|---|---|
| Sample Program Package Image | Image | 493.11MB  | https://jdsf-demo.s3.cn-north-1.jdcloud-oss.com/k8s.tar  |
| Sample Program Package | Dockerfile and jar Package | 14.62MB  | https://jdsf-demo.s3.cn-north-1.jdcloud-oss.com/k8sDemo.zip  |


## Deployment Application

#### STEP1: Create Kubernetes Resource Pool

Click **Create Resource Pool** in "Resource Pool Management", select JCS for Kubernetes and save. Please pay attention to vpc configuration in JCS for Kubernetes.

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo-k8s-1.png)

#### STEP2: Create Kubernetes Application

Click **Create Application** in "Application Management", select JCS for Kubernetes deployment method and save the same.

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo-k8s-2.png)

#### STEP3: Initiate Deployment

1. Click **Initiate Deployment** for created Kubernetes applications in "Application Management" to pop up the deployment page.

2. Deployment page: Configure deployment information and then click **Initiate Deployment**.

Resource selection:

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo-k8s-3.png)
 
Configuration setting:

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo-k8s-4.png)
 
In addition, Kubernetes is deployed with: start command, environment variable, storage, application life cycle management and other configurations (not required)


#### STEP4: Deployment Result

1. Click Kubernetes application in "Application Management", select "Instance Deployment Information" page and configure filtering condition.

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo-k8s-5.png)

2. Request service in container:

Input in container:

```
  curl localhost:8000/helloK8s  
```

![](../../../../image/Internet-Middleware/JD-Distributed-Service-Framework/demo-k8s-6.png)




