#  Realize Source IP pass-through at the client based on JD Cloud ALB

# I. Deploy nginx-ingress

## 1.1 Environment Preparation

Download the latest installation deployment file of nginx-ingress controller from github and decompress the deployment file to the local directory:

```
wget https://github.com/nginxinc/kubernetes-ingress/archive/v1.4.5.tar.gz
tar -zxvf v1.4.5.tar.gz
cd kubernetes-ingress-1.4.5/deployments
```

## 1.2 Installation of nginx-ingress controller

1. Create one namespace and service account for nginx-ingress controller:

```
kubectl apply -f common/ns-and-sa.yaml
```

2. Configure a TLS certificate and key for default Server of NGINX and save the TLS certificate and key in secret:

```
kubectl apply -f common/default-server-secret.yaml
```

**Description:** It is suggested to replace the self-issued certificate and key in the default-server-secret.yaml file with appropriate TLS certificate and key.

3. Create config map to save customized configuration of NGINX:

```
kubectl apply -f common/nginx-config.yaml
```

**Description:** Now, data provided by config map is null and you may add customized configuration on demand.

4. Configure RBAC for service account created in Step 1:

```
kubectl apply -f rbac/rbac.yaml
```

5. Create service of NodePort type for nginx-ingress controller:

```
# Modify Service Yaml file

vim nginx-ingress-service.yaml
apiVersion: v1
kind: Service
metadata:
  name: nginx-ingress
  namespace: nginx-ingress
spec:
  externalTrafficPolicy: Cluster
  ports:
  - name: http
    port: 80
    protocol: TCP
    targetPort: http
  - name: https
    port: 443
    protocol: TCP
    targetPort: https
  selector:
    app: nginx-ingress
  type: NodePort
```

**Description:** Now, use of externalTrafficPolicy: Local in spec is not supported. Please delete corresponding fields in the file Service Yaml first and then deploy Service

6. Deploy nginx-ingress controller with the Deployment method:

```
# Modify deployment/nginx-ingress.yaml file
cat deployment/nginx-ingress.yaml
apiVersion: extensions/v1beta1
kind: Deployment
metadata:
  name: nginx-ingress
  namespace: nginx-ingress
spec:
  replicas: 1
  selector:
    matchLabels:
      app: nginx-ingress
  template:
    metadata:
      labels:
        app: nginx-ingress
    spec:
      serviceAccountName: nginx-ingress
      containers:
      - image: nginx/nginx-ingress:1.4.5
        name: nginx-ingress
        ports:
        - name: http
          containerPort: 80
        - name: https
          containerPort: 443
        env:
        - name: POD_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace
        - name: POD_NAME
          valueFrom:
            fieldRef:
              fieldPath: metadata.name
        args:
          - -nginx-configmaps=$(POD_NAMESPACE)/nginx-config
          - -default-server-tls-secret=$(POD_NAMESPACE)/default-server-secret
          - -external-service=$(POD_NAMESPACE)/nginx-ingress
          - -v=3 # Enables extensive logging. Useful for trooublshooting.
         #- -report-ingress-status
         #- -enable-leader-election

# Deploy nginx ingress
kubectl apply -f deployment/nginx-ingress.yaml

# View if nginx-ingress is successfully deployed
kubectl get deploy
NAME            DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
nginx-ingress   1         1         1            1           64m
```

7. View deployment results:

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/ingress_deploy.jpg)

## 1.3 Self-build ALB

### 1.3.1 Create ALB

**Deployment description:** 

- Must use the VPC as the same as that of K8S cluster
- Be sure to select the subnet: k8s-xxx-nat-subnet-xxx
- Manually add AG associated to the cluster working node groups to ALB service group and forward external requests to clusters;
- After cluster working node groups are added/deleted, please manually update ALB service groups;

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_alb.png)

### 1.3.2 Add HTTP protocol listener

1. Frontend listening configuration

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_front_listen.png)

2. Backend forwarding configuration

- Confirm NodePort of nginx-ingress service at first:

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/node_port.png)

3. Create backend forwarding:

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_backend.png)

4. Add backend health check

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_health_check.png)

5. Add service group

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_backend_server_group.png)

6. Check backend service

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/check_backend_server.png)

**Remarks**: For more details, refer to [Help Documentation of Application Load Balancer](https://docs.jdcloud.com/en/application-load-balancer/features).

# II. Verify nginx-ingress

## 2.1 Deployment Application Service

```
cat nginx-demo.yaml

apiVersion: v1
kind: Service
metadata:
  name: nginx-demo-svc
spec:
  ports:
  - port: 80
    protocol: TCP
    targetPort: 80
  selector:
    app: nginx-demo
  type: ClusterIP
---
apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-demo-deployment
  labels:
    app: nginx
spec:
  replicas: 3
  selector:
    matchLabels:
      app: nginx-demo
  template:
    metadata:
      labels:
        app: nginx-demo
    spec:
      containers:
      - name: nginx
        image: nginxdemos/hello:latest
        ports:
        - containerPort: 80
        
kubectl create -f nginx-demo.yaml
service/nginx-demo-svc created
deployment.apps/nginx-demo-deployment created

kubectl describe svc nginx-demo-svc
Name:              nginx-demo-svc
Namespace:         nginx-ingress
Labels:            <none>
Annotations:       <none>
Selector:          app=nginx-demo
Type:              ClusterIP
IP:                172.16.57.227
Port:              <unset>  80/TCP
TargetPort:        80/TCP
Endpoints:         172.16.0.13:80,172.16.0.22:80,172.16.0.25:80
Session Affinity:  None
Events:            <none>

kubectl get pod -o wide
NAME                                     READY   STATUS    RESTARTS   AGE   IP            NODE                         NOMINATED NODE
nginx-demo-deployment-66b4db8457-jz862   1/1     Running   0          94s   172.16.0.25   k8s-node-vm9mkx-9ev36exmct   <none>
nginx-demo-deployment-66b4db8457-ndsww   1/1     Running   0          94s   172.16.0.13   k8s-node-vmw0tr-9ev36exmct   <none>
nginx-demo-deployment-66b4db8457-pwwgz   1/1     Running   0          94s   172.16.0.22   k8s-node-vmhrsr-9ev36exmct   <none>
```

## 2.2 Configure ingress resource

```
cat ingress.yaml
apiVersion: extensions/v1beta1
kind: Ingress
metadata:
  name: myingress
  annotations:
    metadata.annotations.kubernetes.io/ingress.class: "nginx "     #designates Ingress Controller used for creating Ingress Resource, and Nginx Controller created above is used for this instance
spec:
  rules:
  - host: nginx-ingress-test.jdcloud
    http:
      paths:
      - path: /nginx-demo
        backend:
          serviceName: nginx-demo-svc
          servicePort: 80
```

## 2.3 Access Service Through ALB+NginxIngress

Log in ALB Console, search Public IP associated to self-built ALB and add DNS configuration in local client.

```
# Please replace the IP mapped by the domain with the Public IP associated with the self-built ALB

bash-3.2# echo "157.**.**.125  nginx-ingress-test.jdcloud" >> /etc/hosts
bash-3.2# ping -c 5 nginx-ingress-test.jdcloud
PING nginx-ingress-test.jdcloud (157.255.51.125): 56 data bytes
64 bytes from 157.**.**.125: icmp_seq=0 ttl=47 time=39.891 ms
64 bytes from 157.**.**.125: icmp_seq=1 ttl=47 time=40.189 ms
64 bytes from 157.**.**.125: icmp_seq=2 ttl=47 time=40.066 ms

--- nginx-ingress-test.jdcloud ping statistics ---
5 packets transmitted, 5 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 39.727/40.446/42.359/0.969 ms
bash-3.2#
```

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/access_nginx_demo.png)

# III. Verify Source IP Pass-through

## 3.1 Deploy echoserver Application

1. Description for Yaml file is as follows:

```
cat echo-server.yaml

apiVersion: v1
kind: Service
metadata:
  labels:
    app: echo-server
  name: echo-server-svc
  namespace: nginx-ingress
spec:
  ports:
  - name: http
    port: 80
    protocol: TCP
    targetPort: 8080
  selector:
    app: echo-server
  type: ClusterIP
---
apiVersion: apps/v1
kind: Deployment
metadata:
  name: echo-server-deployment
  namespace: nginx-ingress
  labels:
    app: echo-server
spec:
  replicas: 1
  selector:
    matchLabels:
      app: echo-server
  template:
    metadata:
      labels:
        app: echo-server
    spec:
      containers:
      - image: mirrorgooglecontainers/echoserver:1.4
        imagePullPolicy: IfNotPresent
        name: echocontainer
        ports:
        - containerPort: 8080
          protocol: TCP
      restartPolicy: Always
```

2. Confirm echoserver deployment situation:

```
# View service status
kubectl get pod -l "app=echo-server" -o wide
NAME                                      READY   STATUS    RESTARTS   AGE   IP            NODE                         NOMINATED NODE
echo-server-deployment-655f555cd4-9qxrv   1/1     Running   0          70s   172.16.0.45   k8s-node-vm9mkx-9ev36exmct   <none>

# View service details
kubectl describe svc echo-server-svc
Name:              echo-server-svc
Namespace:         nginx-ingress
Labels:            app=echo-server
Annotations:       kubectl.kubernetes.io/last-applied-configuration:
                     {"apiVersion":"v1","kind":"Service","metadata":{"annotations":{},"labels":{"app":"echo-server"},"name":"echo-server-svc","namespace":"ngin...
Selector:          app=echo-server
Type:              ClusterIP
IP:                172.16.61.78
Port:              http  80/TCP
TargetPort:        8080/TCP
Endpoints:         172.16.0.45:8080
Session Affinity:  None
Events:            <none>
```

## 3.2 Configure Ingress for echoserver

1. Edit `myingress` and add path to associate added echoserver service:

```
kubectl get ing/myingress -o yaml
apiVersion: extensions/v1beta1
kind: Ingress
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"extensions/v1beta1","kind":"Ingress","metadata":{"annotations":{"metadata.annotations.kubernetes.io/ingress.class":"nginx"},"name":"myingress","namespace":"nginx-ingress"},"spec":{"rules":[{"host":"nginx-ingress-test.jdcloud","http":{"paths":[{"backend":{"serviceName":"nginx-demo-svc","servicePort":80},"path":"/nginx-demo"}]}}]}}
    metadata.annotations.kubernetes.io/ingress.class: nginx
  creationTimestamp: "2019-07-25T03:13:49Z"
  generation: 2
  name: myingress
  namespace: nginx-ingress
  resourceVersion: "286035"
  selfLink: /apis/extensions/v1beta1/namespaces/nginx-ingress/ingresses/myingress
  uid: 38a99206-ae8a-11e9-8dde-fa163ebfb4dc
spec:
  rules:
  - host: nginx-ingress-test.jdcloud
    http:
      paths:
      - backend:
          serviceName: nginx-demo-svc
          servicePort: 80
        path: /nginx-demo
      - backend:
          serviceName: echo-server-svc
          servicePort: 80
        path: /echo-server
status:
  loadBalancer: {}
```

2. After the Yaml file is saved, Ingress will be automatically updated according to Yaml file contents submitted;

## 3.3 Verify Support to Source IP Pass-through

1. Verify the client public IP in this instance with `14.ab.cd.240`

```
[root@succ-test ~]# curl -H "Host: nginx-ingress-test.jdcloud"
http://157.**.**.125:80/echo-server
CLIENT VALUES:
client_address=172.16.0.21
command=GET
real path=/echo-server
query=nil
request_version=1.1
request_uri=http://nginx-ingress-test.jdcloud:8080/echo-server

SERVER VALUES:
server_version=nginx: 1.10.0 - lua: 10001

HEADERS RECEIVED:
accept=*/*
connection=close
host=nginx-ingress-test.jdcloud
user-agent=curl/7.29.0
x-forwarded-for=14.ab.cd.240, 172.16.32.4
x-forwarded-host=nginx-ingress-test.jdcloud
x-forwarded-port=80
x-forwarded-proto=http
x-real-ip=172.16.32.4
BODY:
-no body in request-
```

2. echoserver returns x-forwarded-for=14.ab.cd.240, 172.16.32.4`, and the first IP is the client Public IP to be verified.

3. Conclusion: Build a seven-layer ALB for NginxIngress Controller to realize ClientIP pass-through for the entire link.

# IV. Upgrade Ingress to HTTPS

## 4.1 Prepare SSL certificate and CA Public Key

1. You can use service of [SSL Certificate](https://docs.jdcloud.com/en/ssl-certificate/product-overview) provided by JD Cloud;

2. You can build CA or SSL by yourself. For details, please refer to [Create CA certificates and private keys by yourself](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-CA-SSL)；

3. If you already have CA certificates and private keys, please skip to 4.2 Create Load Balancer Certificates by ignoring this step.

## 4.2 Create Load Balancer Certificates

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_ca.png)

## 4.3 Create HTTPS Listener

Create listener, adopt https protocol and select an appropriate certificates

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/create_https_listen.png)

Select existing http backend

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/add_http_backend.png)

## 4.4 Verify ALB of https Protocol

### Verify browser access

![](../../../../../image/Elastic-Compute/JCS-for-Kubernetes/https_access_nginx_demo.png)

### Verify IP pass-through

```
[root@succ-test ~]# curl https://nginx-ingress-test.jdcloud:443/echo-server --cacert ca.pem
CLIENT VALUES:
client_address=172.16.0.21
command=GET
real path=/echo-server
query=nil
request_version=1.1
request_uri=http://nginx-ingress-test.jdcloud:8080/echo-server

SERVER VALUES:
server_version=nginx: 1.10.0 - lua: 10001

HEADERS RECEIVED:
accept=*/*
connection=close
host=nginx-ingress-test.jdcloud
user-agent=curl/7.29.0
x-forwarded-for=14.ab.cd.240, 172.16.32.3       #14.ab.cd.240 is the client IP passed through to the following service
x-forwarded-host=nginx-ingress-test.jdcloud
x-forwarded-port=80
x-forwarded-proto=http
x-real-ip=172.16.32.3
BODY:
-no body in request-
```

# V. Enable IP Pass-through Function for Ingress of Associated LoadBalancer Service

## 5.1 Create Service

1. When Service of LoadBalancer type is created, ALB of TCP type will be created on JD Cloud platform at the same time.

```
apiVersion: v1
kind: Service
metadata:
  name: nginx-ingress-auto
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

2. Search Service details, to get ALB Public IP automatically created. In this document, `117.ab.cd.209` is used as ALB IP to verify source IP pass-through

## 5.2 Modify ALB Through JD Cloud Console and Support Source IP Pass-through

The backend service **Source IP Pass-through** function automatically created for Service is disabled and can be manually enabled by logging in JD Cloud Console:
   > 1. Edit `http` backend service of Load Balancer
   > 2. Enable `Get Actual IP`

**Remarks**: After Service is re-edited in JCS for Kubernetes, configuration in ALB will be automatically refreshed; you need to manually enable the source IP pass-through function for ALB following service in the JD Cloud Console.

## 5.3 Modify ConfigMap of ingress

Edit nginx-ingress/nginx-config ConfigMap to add the following information:

```
data:
  proxy-protocol: "True"
  real-ip-header: "proxy_protocol"
  set-real-ip-from: "${k8s-xxx-node-subnet-xxx cidr}"  # set-real-ip-from: 172.16.32.0/20
```

## 5.4 Verify IP pass-through

1. Verify the client public IP in this instance with `14.ab.cd.240`

```
[root@succ-test ~]# curl -H "Host: nginx-ingress-test.jdcloud" http://117.48.227.209:80/echo-server
CLIENT VALUES:
client_address=172.16.0.21
command=GET
real path=/echo-server
query=nil
request_version=1.1
request_uri=http://nginx-ingress-test.jdcloud:8080/echo-server

SERVER VALUES:
server_version=nginx: 1.10.0 - lua: 10001

HEADERS RECEIVED:
accept=*/*
connection=close
host=nginx-ingress-test.jdcloud
user-agent=curl/7.29.0
x-forwarded-for=14.ab.cd.240
x-forwarded-host=nginx-ingress-test.jdcloud
x-forwarded-port=80
x-forwarded-proto=http
x-real-ip=14.119.106.240
BODY:
-no body in request-
```

2. The information `x-forwarded-for=14.ab.cd.240` returned by echoserver is identical to the client IP. This means the client source IP has been passed through the following segment;

## 5.5 Upgrade https for ingress

The backend service **Source IP Pass-through** function automatically created for Service is disabled and can be manually enabled by logging in JD Cloud Console:
   > 1. Edit `https` backend service of Load Balancer
   > 2. Enable `Get Actual IP`

**Remarks**: After Service is re-edited in JCS for Kubernetes, configuration in ALB will be automatically refreshed; you need to manually enable the source IP pass-through function for ALB following service in the JD Cloud Console.

### 5.5.1 Prepare SSL certificate and CA public key

1. You can use service of [SSL Certificate](https://docs.jdcloud.com/en/ssl-certificate/product-overview) provided by JD Cloud;

2. You can build CA or SSL by yourself. For details, please refer to [Create CA certificates and private keys by yourself](https://docs.jdcloud.com/en/jcs-for-kubernetes/deploy-CA-SSL)；

3. If you already have CA certificates and private keys, please skip to 5.5.2 Create Secrete resources by ignoring this step.

### 5.5.2 Create Secret resources

1. Create secret according to SSL certificates applied for by users.

```
kubectl create secret tls ingress-ssl-secret --cert web-server.pem --key web-server-key.pem
```

2. View secret which is successfully created
```
kubectl describe secret/ingress-ssl-secret
Name:         ingress-ssl-secret
Namespace:    nginx-ingress
Labels:       <none>
Annotations:  <none>

Type:  kubernetes.io/tls

Data
====
tls.crt:  1448 bytes
tls.key:  1675 bytes
```

### 5.5.3 ingress resource again to add tls fields

`kubectl edit ingress myingress`

```
kubectl get ingress myingress -o yaml

apiVersion: extensions/v1beta1
kind: Ingress
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"extensions/v1beta1","kind":"Ingress","metadata":{"annotations":{"metadata.annotations.kubernetes.io/ingress.class":"nginx"},"name":"myingress","namespace":"nginx-ingress"},"spec":{"rules":[{"host":"nginx-ingress-test.jdcloud","http":{"paths":[{"backend":{"serviceName":"nginx-demo-svc","servicePort":80},"path":"/nginx-demo"}]}}]}}
    metadata.annotations.kubernetes.io/ingress.class: nginx
  creationTimestamp: "2019-07-25T03:13:49Z"
  generation: 4
  name: myingress
  namespace: nginx-ingress
  resourceVersion: "309938"
  selfLink: /apis/extensions/v1beta1/namespaces/nginx-ingress/ingresses/myingress
  uid: 38a99206-ae8a-11e9-8dde-fa163ebfb4dc
spec:
  rules:
  - host: nginx-ingress-test.jdcloud
    http:
      paths:
      - backend:
          serviceName: nginx-demo-svc
          servicePort: 80
        path: /nginx-demo
      - backend:
          serviceName: echo-server-svc
          servicePort: 80
        path: /echo-server
  tls:
  - hosts:
    - nginx-ingress-test.jdcloud
    secretName: ingress-ssl-secret
status:
  loadBalancer: {}
```

### 5.5.4 Browser access verification

1. Log in ALB Console, search Public IP associated to self-built ALB;

2. Add DNS configuration in /etc/hosts of local server: IP refers to the Public IP associated to ALB searched in the last step, and domain refers to the names of Virtual Machines: nginx-ingress-test.jdcloud, configured in ingress resource rule;

3. Enter nginx-ingress-test.jdcloud/echo-server in the browser to verify output results.

**Remarks**: When the customized CA certificate is used, the browser will notify that the certificate is not trusted. In such case, you can import the ca.pem file of self-built CA to the operating system and set it as permanently trustful.

