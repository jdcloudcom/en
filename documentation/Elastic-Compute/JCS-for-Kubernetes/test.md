# Environment Preparation  

K8s is deployed in the jdstack privatization environment, and jdstack is deployed in an edge node data center  

## JDstack VPN Configuration (internal use)
1. Download VPN client and install  https://www.softether-download.com/en.aspx?product=softether  
   The component shall be SoftEther Client, and the Operating System shall be selected according to the user environment
2. After the client is installed, select "(Upper left corner)" and connect to **Create VPN Settings**, a pop-up window will show as below; then select **Yes  
3. After the virtual network adapter is created, select to add a new VPN connection  
4. Fill in the relevant configurations such as VPN IP, user name and password in accordance with the "Windows Information" or "Mac Information" given in the document. https://cf.jd.com/pages/viewpage.action?pageId=286701433  
5. After such configurations are completed, log in http://console.jdcloud.local/   User name: IAAS Password: YM8kU2tvU6Nd   Note: This account is for temporary use

References: https://cf.jd.com/pages/viewpage.action?pageId=180384952  


## JDstack Jump Server (internal use)
After the jdstack VPN configurations are completed and connected, log in JDstack Jump Server to conduct image upload, kubectl command and other operations.
For the host IP of jump server, user name and password, please refer to the Section "linux Jump Server Login": https://cf.jd.com/pages/viewpage.action?pageId=286701433


## Configurations of JCS for Kubernetes and Container Registry
0. Console url http://console.jdcloud.local/ 

1. Enter Console Elastic Compute - JCS for Kubernetes, and click **Create  

2. Create cluster  
a)	Region, the current region is a specific edge node area  
b)	User name, user-customized  
c)	Cluster version, only the 1.12.3 edge version is supported currently  
d)	Manage the node CIDR, and select a CIDR which is not in conflict with the VPC where the current cluster is located  
e)	Access Key, select an activated Access Key  
f)	Virtual Private Cloud (VPC), the VPC where the cluster is located  
g)	Working node CIDR, select a CIDR from the VPC and assign it to Kubernetes  
h)	Specification, the specification of working node  
i)	Count, the default count is 3  
j)	Name, the name of working node group, user-customized  
k)	After the above items are all filled in, confirm to create the cluster  

2. Click **Elastic Compute - JCS for Kubernetes** on the Console, and confirm that the cluster status is changed from "Creating" to "Running"

3.	Click **Cluster - Cluster Name - Kubectl Client Configuration**, and copy JCS for Kubernetes certificate into the file ~/.kube/config of a client host that can connect to the cluster  

4.	Verify the connectivity of cluster 
```
kubectl get nodes
```

5.	Enter Console Elastic Compute-Container Registry  

6.	Create a registry with a user-customized name and click **OK** for creation  

7.	Click **Registry** - **Add Repository or create Repository  

8.	Click **Registry** - **Obtain a token  

9.	Upload the image for testing to Container Registry by the docker command  
a)	docker login -u jdcloud -p xxx test-jcr-cn-stackstag-1.jcr.service.jdcloud.com  
b)	docker tag nginx:latest test-jcr-cn-stackstag-1.jcr.service.jdcloud.com/nginx:latest  
c)	docker push test-jcr-cn-stackstag-1.jcr.service.jdcloud.com/nginx:latest  

10. Click **Elastic Compute-Container Registry-Repository** on the Console and confirm that the test image has been successfully uploaded

11.	Create the secret of Container Registry in JCS for Kubernetes  
```
a)	kubectl create secret docker-registry my-secret --docker-server=test-jcr-cn-stackstag-1.jcr.service.jdcloud.com --docker-username=jdcloud --docker-password=xxx
```


# Operation steps  


1.	Create applications for testing by using the file of test.yaml  

a. Create via the Console  
  Enter the Elastic Compute - JCS for Kubernetes - Workloads - Deployment menu, click **Create** and copy the content of the file of test.yaml into the Console Textbox. Click **OK** to create  
  
b. Create via command line  
```
kubectl create -f test.yaml
```

test.yaml
```
apiVersion: apps/v1beta2   
kind: Deployment
metadata:
  labels:
    run: nginx
  name: nginx
spec:
  replicas: 1
  selector:
    matchLabels:
      run: nginx
  template:
    metadata:
      labels:
        run: nginx
    spec:
      containers:
      - image: test-jcr-cn-stackstag-1.jcr.service.jdcloud.com/nginx:latest
        imagePullPolicy: Always
        name: nginx
      imagePullSecrets:
      - name: my-secret
```


2. View the running status of applications in the cluster  
Clicking **Elastic Compute - JCS for Kubernetes - Workloads - Deployment** on the Console, it is able to see that nginx is in the deployment list
Click **nginx** to further view the application details, including but not limited to configuration item information, Yaml files, Pod logs, monitoring and events.

Such details can also be viewed via command line
```
kubectl get pods

NAME                    READY   STATUS    RESTARTS   AGE
nginx-bcb8f8d47-lrbgw   1/1     Running   0          20s
```
