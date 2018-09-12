
# Visit Dashboard

JD Cloud Kubernetes Service has been preset with Dashboard plug-ins.

I. Check dashboard plug-ins

1. View the allocated NodePort

2. Check controller


II. Visit dashboard

1. Visit dashboard (https 6443 port) through API server.

To visit dashboard in this way, you first need to generate and install the P12 security certificate based on the cluster's config file, with the specific steps as follows:

1) Get client certificate and save it in kubecfg.crt after base64 transcoding.

grep 'client-certificate-data' ~/.kube/config | head -n 1 | awk '{print $2}' | base64 -d > kubecfg.crt

2) Get the public key of the client and save it in kubecfg.key after base64 transcoding.
grep 'client-key-data' ~/.kube/config | head -n 1 | awk '{print $2}' | base64 -d > kubecfg.key

3) Extract the contents of kubecfg.crt and kubecfg.key files, generate P12 security certificates, and save them in kubecfg.p12 files.
openssl pkcs12 -export -clcerts -inkey kubecfg.key -in kubecfg.crt -out kubecfg.p12 -name "kubernetes-client"
     Description: When generating the security certificate, you need to set the extraction password. You can set the customized password or set password to be empty.

4) Download the security certificate to the local office, and with the Windows7 operating system as an example, the steps for the installation of the certificate are as follows:

Double click the certificate file to pop up the certificate import wizard dialog box;

Confirm the certificate file to be imported


Input the customized password that is set when the security certificate is generated


Set the location where the certificate is saved


Complete certificate import



5) In the browser, input https://****/api/v1/namespaces/kube-system/services/https:kubernetes-dashboard:/proxy/, where, **** should be replaced with the service endpoints queried from k8s cluster details page to visit dashboard;

2. Visit dashboard through LoadBalance services;

 1) To visit dashboard through the LoadBalance service, you need to first create LoadBalance-type service in the cluster, with the yaml file as follows:

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
2) Perform the following command to create services in the kube-system namespace:

kubectl create -f dashboard-lb.yaml --namespace=kube-system
3) Query the EIP of the newly created service in the kube-system namespace

kubectl get services -n kube-system
4) In the browser, input https://****:port/api/v1/namespaces/kube-system/services/https:kubernetes-dashboard:/proxy/ in the browser, where**** should be replaced with the EIP associated with the Load Balance service, and port should be replaced with the port in the service spec, which is 8443 in this example, to visit dashboard.

III. dashboard identity authentication

User identity authentication is required for viewing the resource information of cluster in dashboad:


Take the token of the admin service account as an example, with the specific methods of operation as follows:

1. View all secrets in kube-system namespace:

kubectl get secret -n kube-system

2. View the secret details corresponding to the admin service account, and **** should be replaced with the specific secret name:

kubectl describe secret **** -n kube-system

3. Copy the corresponding token information in the Data entry into the dashboard window token input box, and click OK.

4. You can also add token information to the config file user item, and then you can choose Kubeconfig for identity authentication.