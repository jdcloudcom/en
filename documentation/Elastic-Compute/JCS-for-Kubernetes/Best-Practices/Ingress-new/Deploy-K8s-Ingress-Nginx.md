
# Kubernetes ingress-nginx Deployment and Use Example
Ingress is an entry for access of internal cluster service from external of JCS for Kubernetes, with concept and interpretation reference listed as follows. You may provide URL, Load Balancer, SSL, name-based Virtual Machines and others available for external access in Ingress configuration. Users can request ingress by sending POST Ingress resources to the API server. 

  ```
   internet
        |
   [ Ingress ]
   --|-----|--
   [ Services ]
  ```
Ingress controller is responsible for realizing Ingress. Ingress controller will not be automatically started in JCS for Kubernetes by default and you may deploy the customized Ingress Controller of any type in one pod.

Kubernetes ingress-nginx is the ingress controller developed based on nginx and provided by the community. This document will take this as an example to show how to access dashboard and other services through ingress. For more detailed setting, please refer to [Kubernetes ingress-nginx](https://github.com/kubernetes/ingress-nginx).

I. Install Kubernetes ingress-nginx
1. Install deployment file from github:

```

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/nginx-0.30.0/deploy/static/mandatory.yaml
```

    **Description**: All examples in this document are tested and run on the 1.16 version of cluster. If the cluster version is different, some configuration items may need to be adjusted slightly.
2. Install fix.yaml to avoid constant error by controller;

```
apiVersion: v1
kind: Service
metadata:
  name: ingress-nginx
  namespace: ingress-nginx
spec:
  type: ClusterIP
  ports:
  - name: http
    port: 80
    targetPort: 80
    protocol: TCP
  - name: https
    port: 443
    targetPort: 443
    protocol: TCP
  selector:
    app: ingress-nginx
```

3. Execute the following commands and confirm if Deployment configured with ingress-nginx controller is normally running:

```

kubectl get deployments  -n ingress-nginx

NAME                      DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
nginx-ingress-controller   1         1         1            1           24d
```
4. Expose ingress controller to public network by Service LoadBalancer:

```

apiVersion: v1
kind: Service
metadata:
  labels:
    app.kubernetes.io/name: ingress-nginx
    app.kubernetes.io/part-of: ingress-nginx
  name: nginx-ingress-controller
  namespace: ingress-nginx
spec:
  externalTrafficPolicy: Cluster
  ports:
  - port: 80
    protocol: TCP
    targetPort: 80
    name: http
  - port: 443
    protocol: TCP
    targetPort: 443
    name: https
  selector:
    app.kubernetes.io/name: ingress-nginx
    app.kubernetes.io/part-of: ingress-nginx
  type: LoadBalancer
```


```

    kubectl create -f X.yaml        # Please use corresponding Yaml file name to replace X.yaml
```
5. Wait for a time period, confirm if Service has been configured and get the field External IP configured on Service

```

kubectl get svc -n nginx-ingress

NAME                        TYPE           CLUSTER-IP    EXTERNAL-IP    PORT(S)                      AGE
nginx-ingress-controller   LoadBalancer   10.X.XX.231   114.67.127.227   80:30494/TCP,443:30467/TCP   24d

    Description: External IP of Service will be used as VIP of nginx-ingress controller to provide public network access entry for use of Ingress of ingress controller in clusters
```

II. Access Kubernetes Dashboard through ingress
1. Confirm that the Kubernetes Dashboard has been already installed, if not, refer to [Access Dashboard](../Connect-Dashboard.md)
```
kubectl get service -n kube-system

NAME                   TYPE           CLUSTER-IP    EXTERNAL-IP                  PORT(S)         AGE
kubernetes-dashboard   ClusterIP      10.0.123.87    <none>                      443:31382/TCP   5d23h
```
   
2. Configure ingress rules required by Dashboard under kube-system name space
```
apiVersion: extensions/v1beta1
kind: Ingress
metadata:
  annotations:
    nginx.ingress.kubernetes.io/backend-protocol: HTTPS
  name: dashboard
  namespace: kube-system
spec:
  rules:
  - host: kubernetes-dashboard.jdcloud
    http:
      paths:
      - backend:
          serviceName: kubernetes-dashboard
          servicePort: 443
        path: /
```
    **Description**: The host kubernetes-dashboard.jdcloud in the example needs to be replaced by the user's own host. In this example, the resolved IP corresponding to the host is the public IP 114.67.127.227 exposed by service nginx-ingress-controller in step 5 in the first chapter.

3. Access dashboard
   Open https://kubernetes-dashboard.jdcloud in the browser 
   
III. Access nginx through ingress
1. Create a test nginx pod
```
kubectl create namespace test
kubectl run test-nginx --image=nginx --restart=Never --port=80 -n test
kubectl expose pod -n test test-nginx --port=80 --target-port=80 --type=ClusterIP
```
2. Create corresponding ingress rule
```
apiVersion: networking.k8s.io/v1beta1
kind: Ingress
metadata:
 name: ingress-test
 namespace: test
 annotations:
   kubernetes.io/ingress.class: "nginx"
spec:
 rules:
 - host: k8s-ingress-nginx-controller-test.jdcloud
   http:
     paths:
     - path: /
       backend:
         serviceName: test-nginx
         servicePort: 80
```
    **Description**: The host k8s-ingress-nginx-controller-test.jdcloud in the example needs to be replaced by the user's own host. In this example, the resolved IP corresponding to the host is the public IP 114.67.127.227 exposed by service nginx-ingress-controller in step 5 in the first chapter.
    
3. Test Verification
Open http://k8s-ingress-nginx-controller-test.jdcloud or https://k8s-ingress-nginx-controller-test.jdcloud in the browser


 
