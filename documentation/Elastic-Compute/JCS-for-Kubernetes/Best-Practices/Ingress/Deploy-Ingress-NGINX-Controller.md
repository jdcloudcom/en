# Nginx-ingress controller deployment
Ingress is an entry for access of internal cluster service from external of JCS for Kubernetes, with concept and interpretation reference listed as follows. You may provide URL, Load Balancer, SSL, name-based Virtual Machines and others available for external access in Ingress configuration. Users can request ingress by sending POST Ingress resources to the API server. 

  ```
   internet
        |
   [ Ingress ]
   --|-----|--
   [ Services ]
  ```
Ingress controller is responsible for realizing Ingress. Ingress controller will not be automatically started in JCS for Kubernetes by default and you may deploy the customized Ingress Controller of any type in one pod.

Taking officially open-source Nginx-ingress controller as an example, this document specifies deployment of Controller and definition of Ingress. For more details of external Ingresss Controller, please refer to [Official Document of Kubernetes](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/).

I. Environment Preparation
1. Download the latest installation deployment file of nginx-ingress controller from github and decompress the deployment file to the local directory:

    ```
    
    wget https://github.com/nginxinc/kubernetes-ingress/archive/v1.4.5.tar.gz

    tar -zxvf v1.4.5.tar.gz
    ```

    **Description**: This document specifies how to deploy nginx-ingress controller on the Version 1.12.3 cluster. If a different cluster version is adopted, please select other suitable ginx-ingress controller installation and deployment files.
2. Log in decompressed installation directory of nginx-ingress controller;

    `
    cd kubernetes-ingress-1.4.5/deployments
    `

II. Installation of nginx-ingress controller

1. Create one namespace and service account for nginx-ingress controller:

    `
    kubectl apply -f common/ns-and-sa.yaml
    `

2. Configure a TLS certificate and key for default Server of NGINX and save the TLS certificate and key in secret:

    `
    kubectl apply -f common/default-server-secret.yaml
    `

    **Description**: It is suggested to replace the self-issued certificate and key in the default-server-secret.yaml file with appropriate TLS certificate and key.

3. Create config map to save customized configuration of NGINX:

    `
    kubectl apply -f common/nginx-config.yaml
    `

    **Description**: Now, data provided by config map is null and you may add customized configuration on demand.
  
4. Configure RBAC for service account created in step 1:

    `
    kubectl apply -f rbac/rbac.yaml
    `

5. Deploy nginx-ingress controller with the Deployment method:

    `
    kubectl apply -f deployment/nginx-ingress.yaml
    `

6. Execute the following commands and confirm if Deployment configured with nginx-ingress controller is normally running:

    ```
    
    kubectl get deployment -n nginx-ingress

    NAME            DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
    nginx-ingress   1         1         1            1           24d
    ```
7. In JCS for Kubernetes, each Pod has one unique internal IP Address, but Pod in Deployment can be deleted or created at any time, causing continuous change of Pod IP Address. As a result, it needs to create one Service to expose applications in Pod to the external. Service has the unique fixed IP Address and can provide Load Balancer to the member Pod added at the backend. You can use Service of the LoadBalance type in JCS for Kubernetes of JD Cloud to associate and create one Application Load Balancer for Service, and expose the nginx-ingress controller application associated with the Service backend via the Public IP associated via the Load Balancer to the public network:

    ```
    
    apiVersion: v1
    kind: Service
    metadata:
      name: nginx-ingress       # suggests that Service shall use the name identical name of Deployment which is corresponding to nginx-ingress controller
      namespace: nginx-ingress
    spec:
      type: LoadBalancer
      ports:
      - port: 80
        targetPort: 80
        protocol: TCP
        name: http
      - port: 443
        targetPort: 443
        protocol: TCP
        name: https
      selector:
        app: nginx-ingress
    ```
    **Description**: Now, use of externalTrafficPolicy: Local in spec is not supported. Please delete corresponding fields in the file Service Yaml first and then deploy Service.

    Define the above Service to the Yaml file and create corresponding Service by executing the following commands:

    ```
    
    kubectl create -f X.yaml        # Please use corresponding Yaml file name to replace X.yaml
    ```
    **Description**: Now, data provided by config map is null and you may add customized configuration on demand.
8. Wait for a time period, confirm if Service has been configured and get the field External IP configured on Service

    ```
    
    kubectl get svc -n nginx-ingress

    NAME            TYPE           CLUSTER-IP    EXTERNAL-IP    PORT(S)                      AGE
    nginx-ingress   LoadBalancer   10.X.XX.231   114.XX.XX.XX   80:30494/TCP,443:30467/TCP   24d

    Description: External IP of Service will be used as VIP of nginx-ingress controller, to provide public network access entry for use of Ingress of nginx-ingress controller in clusters
    ```
9. At last, add one environment variable pair "-args -external-service=nginx-ingress" in the Deployment file nginx-ingress.yaml of Ingress Controller, configure Ingress Controller to use External IP related to Service name as public network entry IP:

    ```
    
    args:
      - -nginx-configmaps=$(POD_NAMESPACE)/nginx-config
      - -default-server-tls-secret=$(POD_NAMESPACE)/default-server-secret
      - -external-service=nginx-ingress       #Add new content

    kubectl apply -f deployment/nginx-ingress.yaml        #Redeploy nginx-ingress controller
    ```
10. Execute the following commands to confirm if the Pod related to nginx-ingress controller is running normally, and then deployment of nginx ingress controller is completed:

    ```
    
    kubectl get pod -n nginx-ingress

    Output result:
    NAME                            READY   STATUS    RESTARTS   AGE
    nginx-ingress-6hz6b             1/1     Running   0          24d
    nginx-ingress-kbgbk             1/1     Running   0          24d
    nginx-ingress-nt68q             1/1     Running   0          24d
    ```

III. Reference Link

After Nginx-ingress Controller is deployed, you can deploy Ingress Resource in JCS for Kubernetes. JD Cloud provides the following deployment schemes based on Nginx-ingress Controller. For details, please refer to the following documents.

1. [Deploy Ingress Resource of http/https Type](https://docs.jdcloud.com/en/jcs-for-kubernetes/Deploy-Ingress-Resource);
2. [Realize Source IP Pass-through at the Client Based on JD Cloud ALB](https://docs.jdcloud.com/en/jcs-for-kubernetes/nginx-ingress-source-ip).
    
    


