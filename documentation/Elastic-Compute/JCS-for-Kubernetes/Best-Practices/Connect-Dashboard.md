
# Visit Dashboard

JD Cloud JCS for Kubernetes Service has been preset with Dashboard plug-ins.

## I. Access to dashboard via the two methods below  

**Method 1: Visit dashboard (https 6443 port) through API server;**  
To visit dashboard in this way, you first need to generate and install the P12 security certificate based on the cluster's config file, with the specific steps as follows:  
1) Get client certificate and save it in kubecfg.crt after base64 transcoding.  
`grep 'client-certificate-data' ~/.kube/config | head -n 1 | awk '{print $2}' | base64 -d > kubecfg.crt`  
2) Get the public key of the client and save it in kubecfg.key after base64 transcoding.  
`grep 'client-key-data' ~/.kube/config | head -n 1 | awk '{print $2}' | base64 -d > kubecfg.key`  
3) Extract the contents of kubecfg.crt and kubecfg.key files, generate P12 security certificates, and save them in kubecfg.p12 files.  
`openssl pkcs12 -export -clcerts -inkey kubecfg.key -in kubecfg.crt -out kubecfg.p12 -name "kubernetes-client"`  
   Description: When generating the security certificate, you need to set the extraction password. You can set the customized password or set password to be empty.  
4) Download the security certificate to the local office, and with the Windows7 operating system as an example, the steps for the installation of the certificate are as follows:  
Double click the certificate file to pop up the certificate import wizard dialog box, confirm the certificate file to be imported  
 ![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/导入证书2.png)  
Input the customized password that is set when the security certificate is generated  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/导入证书3.png)  
Set the location where the certificate is saved  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/导入证书4.png)  
Complete certificate import  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/导入证书5.png)  
5) In the browser, input `https://****/api/v1/namespaces/kube-system/services/https:kubernetes-dashboard:/proxy/`, where, `****` should be replaced with the service endpoints queried from Kubernetes cluster details page to visit dashboard;  

**Method 2: Visit dashboard through LoadBalance services**    
1) To visit dashboard through the LoadBalance service, you need to first create LoadBalance-type service in the cluster, with the yaml file as follows: 
```
kind: Service
apiVersion: v1
metadata:
  name: dashboard-lb
  labels:
    k8s-app: kubernetes-dashboard
spec:
  ports:
    - protocol: TCP
      port: 8443
      targetPort: 8443
      nodePort: 30063
  type: LoadBalancer
  selector:
     k8s-app: kubernetes-dashboard
```  
2) Perform the following command to create services in the kube-system namespace:  
`
kubectl create -f dashboard-lb.yaml --namespace=kube-system
`  
3) Query the EIP of the newly created service in the kube-system namespace:  
`
kubectl get services -n kube-system
`  
4) In the browser, input https://****:port in the browser, where**** should be replaced with the EIP associated with the load balance service, and port should be replaced with the port in the service spec, which is 8443 in this example, to visit dashboard.  
## II. dashboard Identity Authentication  
User identity authentication is required for viewing the resource information of cluster in dashboad;  
**Take the token of the admin service account as an example, with the specific methods of operation as follows:**  
1. View all secrets in kube-system namespace:  

kubectl get secret -n kube-system
`  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/admintoken列表.png)  
2. Check the secret details of the admin service account. The cluster is admin-user-token-b6djq, and the b6djq part should be replaced according to its own cluster:  
`
kubectl describe secret admin-user-token-b6djq -n kube-system
`  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/查看admintoken.png)  
3. Copy the corresponding token information in the Data entry into the dashboard window token input box, and click OK;  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/输入令牌.png)   

4. You can also add token information to the config file user item, and then you can choose Kubeconfig for identity authentication.  

