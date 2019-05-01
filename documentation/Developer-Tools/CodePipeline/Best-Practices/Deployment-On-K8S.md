# Construct and deploy to JCS for Kubernetes
The document takes an example of constructing Golang software project and deploying it to JCS for Kubernetes cluster to describe how to use CodePipeline.

The basic operation process is as follows:

1) Create source code in JD Cloud - CodeCommit

2) Create Registry and Repository in JD Cloud - Container Registry

3) Compile and build the example source code in JD Cloud - CodeBuild to produce images and store them in Container Registry

4) Create clusters in JD Cloud - JCS for Kubernetes

Please ensure that CodeBuild task, JCS for Kubernetes and CodePipeline are in the same region.


### Clone example codes to the CodeCommit

The code example url is: https://code.jdcloud.com/JDCloud-Codebuild/golang-demo

Please clone the example code to the CodeCommit and the address of the CodeCommit is https://code.jdcloud.com/


### Create Repository in Container Registry

**I. Creation of Registry**

 1. Turn on the Console, select [Elastic Compute - Container Registry - Registry](https://cns-console.jdcloud.com/host/containerregistry/list) and select **Create  
    ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Container-Registry/创建注册表页面.png)  
 2. Select a region from cn-north-1, cn-east-2 and cn-south-1  
 3. Complete a name which is unique globally and is unchangeable; such name shall contain more than 3 characters but not more than 32 characters, started and ended with lower case letters and numbers; and the use of lower case letters, numbers and line-through (-) is supported  
 4. Description is not the compulsory item, which cannot exceed 256 characters and cannot be altered  
 5. The registry URI is automatically produced IN THE format of registry name-region abbreviation.jcr.service.jdcloud.com  
 6. Click **OK  

**II. Creation of Repository**

 1. Turn on [Elastic Compute - Container Registry - Repository](https://cns-console.jdcloud.com/host/containerrepository/list) and select **Create  
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/Container-Registry/新建镜像仓库.png)  
 2. Select a region from cn-north-1, cn-east-2 and cn-south-1  
 3. Select registry  
 4. Complete the name which shall contain more than 3 characters but not more than 255 characters; the name under the same registry is unique and unchangeable; the use of multiple namespace stages is supported, which are separated with a /; the namespace of each stage shall not be empty, started and ended with lower case letters and numbers; and the use of lower case letters, numbers, line-through (-) and underline (_) is supported  
 5. Description is not the compulsory item, which cannot exceed 256 characters and cannot be altered  
 6. Repository URI and registry URI/repository name are automatically produced  
 7. Click **OK  




### Create compilation task in the CodeBuild

Create a new task in the CodeBuild, with specific information as below:

-  Application name: Golang-Demo
-  Compile images: golang/golang:1.12
-  Code source: JD Cloud-CodeCommit
-  Codebase: Select an example code, devops-demo/golang-demo
-  Branch: master
-  Building command: Insert building commands as follows
 ```
 cmds:
  - name: Make output
    cmd: mkdir -p output;env
  - name: Unit Test
    cmd: go test ./... || exit 1
  - name: Build
    cmd: GOPATH=${WORKSPACE}/workspace; go install demo
  - name: Copy file
    cmd: cp -r bin output

# Package-extracting path is the required choice
out_dir: 'output'

 ```

-  Building type: Repository
-  Repository: Select the created Container Registry
-  Advanced Configuration: Keep the default option

Save, to complete the preparation of CodeBuild task.


![](/image/codepipeline/best-ct.PNG)
	

### Building clusters in JCS for Kubernetes

 1. Open the Console and select [Elastic Compute>>JCS for Kubernetes>>Cluster Service>>Cluster](https://cns-console.jdcloud.com/host/kubernetes/list)   
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/新建Kubernetes集群集群信息.png)  
 
 2. Select a region for creation, click **Create**. It is suggested that the region and availability zone where the selected cluster is located shall be selected according to specific business conditions; by default, all availability zones under the specified region are selected and it is suggested to follow the default mode; or, any selected availability zone can be canceled, but it shall ensure at least one availability zone shall be selected.  
 
 3. Set name and description: Name cannot be null
 
 4. Cluster version: Support the version 1.12.3 now.
 
 5. Manage Node CIDR: It cannot be overlapped with CIDR of other VPC, and the value range of CIDR mask 24 ~ 27. For setting rules of CIDR, please refer to CIDR rules of VPC. 
 
 6. Client certificate and basic authentication: They are enabled by default and are suggested to be totally kept; at least one shall be kept in the enabled status; client certificate: the certificate based on the base64 code is used for verifying the cluster service end for the client end; basic authentication: after it is enabled, the client is allowed to make verification with the user name and password in cluster server.  
 
 7. Add Accesskey: Select the started Accesskey; if the Access Key is unavailable, please go to the Access Key management page, crate a new Access Key and keep it in starting status. Please refer to Accesskey management.  
 
Create working node group:  
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/新建Kubernetes集群工作节点组.png)   
 
8. VPC: Select a created VPC. It is recommended to create Virtual Private Cloud; the mask value range shall be 16~18.  

9. Working Node CIDR: For setting rules, please refer to CIDR rules under VPC and the value range of CIDR mask is 16~18.   

10. Support customized images of JD Cloud only. 

11. Specification: Select different types of Virtual Machines according to specific business situations and the Virtual Machines support Generation II specification. Please refer to the Instance Type.  

12. Count: The default count is 3; the count can be changed by clicking **Increase**, **Decrease** or inputting the number; the maximum count is the count of Virtual Machines to be created in Node CIDR; and the minimum value is the quota of Virtual Machines.

13. Name: The default name is nodegroup1 and is unchangeable, supporting Chinese, numbers, uppercase and lowercase letters, English underline “_” and line-through “-”, with at most 32 characters. Working node groups under the same cluster shall not have the same name.  

14. The following advanced options are optional  
Description: Description cannot exceed 256 characters  
System disk: The default capacity of a local disk is 100G and is unchangeable.  
Tag: Set labels added to working nodes; the key consists of a prefix and the name; the prefix cannot exceed 253 characters, while the name and the value cannot exceed 63 characters; the prefix consists of DNS sub-domain, but the key value must be started with letters and numbers and support “-”, “ _ ”, “.”, uppercase letters, lowercase letters and numbers; and at most 5 label groups can be added.

15. After completing relevant settings, click **OK** to enter Elastic Compute>>JCS for Kubernetes>>Cluster Service>>Cluster and view created JCS for Kubernetes. Generally, creation process only requires a few minutes. Please wait with patience.



**Output of Tokens Effective for a Long Time**

Please refer to [Automatically and Periodically Get Tokens Effective for a Long Term](../../../Elastic-Compute/Container-Registry/Best-Practices/Deploy-Application.md).



### Create CodePipeline

The detailed operation steps are shown as below:

1. Click **Create** and select **Quickly Create**. Configure the name of CodePipeline, e.g., pipeline-k8s-demo

     ![](/image/codepipeline/pipeline-k8s-demo.PNG)

2. Configure Source Codes

  The default stage name is the source code and add the source code. Select JD Cloud - CodeCommit during operation, and select the example code devops-demo/golang-demo.
  
   ![](/image/codepipeline/best-k8s-source.PNG)


3. Configure Construction.

  The default stage name is co stage, add constructed operation.   
  
   ![](/image/codepipeline/best-k8s-build3.PNG)


-  Operation type: Building
-  Operation name: Use the default name only
-  Operation Provider: CodeBuild
-  Code source: Build source code of this task, and select the source code operation created in the previous step.
-  Task: Select the compilation task created in CodeBuild, e.g. Golang-Demo
-  Manual confirmation: If manual confirmation is selected, the operation will be executed after the user clicks **Confirm**.
     
   
 
4. Configure Deployment.
 
  The default stage name is Deployment stage, add deployed operation.  
 
   ![](/image/codepipeline/best-k8s-deploy.PNG)
     
-  Operation type: Deployment
-  Operation name: Use the default name only
-  Operation provider: JCS for Kubernetes
-  Target cluster: Select k8s clusters created
-  Create deployment method: Please select the page and fill in application details
    -  Application name: such as golang-deployment
    -  Image source: Select CodeBuild and deploy images output by compiling to k8s clusters
    -  Count of container groups (replicas): Please fill in count of replica
    -  Image Pulling Confidentiality Dictionary (imagePullSecrets): When the outputting images of CodeBuild are selected to be deployed, it needs to configure the field imagePullSecrets.    
-  Manual confirmation: If manual confirmation is selected, the operation will be executed after the user clicks **Confirm**.

 
4. To successfully access deployment applications, please add the Load Balancer service to such deployment in the JCS for Kubernetes-Service Page.  

Create yaml as follows:

	```
	kind: Service
	apiVersion: v1
	metadata:
	  name: lb-demo
	  namespace: default
	  labels:
	    k8s-app: kubernetes-test
	spec:
	  ports:
	    - protocol: TCP
	      port: 80
	      targetPort: 8088
	      nodePort: 30190
	  selector:
	    app: golang-deployment
	  type: LoadBalancer
	  sessionAffinity: None
	  externalTrafficPolicy: Cluster 
	```
 
 
Save and release.

Effects of successfully released applications with Public IP: 8088 access are as follows:

![](/image/codepipeline/best-success.PNG)


