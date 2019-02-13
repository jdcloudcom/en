# Construct and deploy to JCS for Kubernetes
The document takes an example of constructing Golang software project and deploying it to JCS for Kubernetes cluster to describe how to use CodePipeline.

The detailed operation steps are shown as below:

1. Click **Create** and select **Quickly Create**. Configure the name of CodePipeline, e.g., pipeline-test, click **Next**.

2. Configure Source Codes
  The default stage name is Source Code; add the atomic operation of source code. Select codecommit in the atomic operation, then select golang-demo-for-k8s provided by the platform.
  Example code address: https://code.jdcloud.com/devops-demo/golang-demo

3. Configure Construction.
  The default stage name is co stage, add constructed atomic operation.   
     1. Select **CodeBuild** in Atomic Operation, select the previously configured source code operation in the Entering Operation, shown as below.    
        ![](/image/codepipeline/best-build.png)
 
     2. Create the project to be compiled in the CodeBuild project. Example code is shown as below:   
        ![](/image/codepipeline/best-build-2.png) 
 
4. Configure Deployment.
  The default stage name is Deployment stage, add deployed atomic operation.  
     1. Select **JCS for Kubernetes** in the atomic operation, select the previously configured construction operation in the Entering Operation. The user needs to create the cluster in advance and provide the Deployment for deployment in the CodePipeline.
        The examples are as follows:
        ![](/image/codepipeline/best-k8s.png)
        Example Deployment:
	```
	apiVersion: apps/v1beta1
	kind: Deployment
	metadata:
	  name: golang-test-demo-deployment
	spec:
	  replicas: 3
	  template:
	    metadata:
	      labels:
		app: golang-test-demo
	    spec:
	      containers:
		- name: golang-test-demo
		  image: nginx:1.7.9
		  ports:
		    - containerPort: 8088
	      imagePullSecrets:
		- name: my-secret	
	```
       Where, the image needs to be replaced with the output for constructing operation.
       ![](/image/codepipeline/best-docker.png)  
       
     2. Add a Load Balancer service on k8s Cluster page for the Deployment.      
	```
	kind: Service
	apiVersion: v1
	metadata:
	  name: lb-test
	  namespace: default
	  labels:
	    k8s-app: kubernetes-test
	spec:
	  ports:
	    - protocol: TCP
	      port: 80
	      targetPort: 80
	      nodePort: 30090
	  selector:
	    app: nginx
	  type: LoadBalancer
	  sessionAffinity: None
	  externalTrafficPolicy: Cluster  
	```

5. Save and release.
Successful released applications can be accessed with a browser.
