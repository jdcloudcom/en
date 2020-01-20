
# Deploy Service (New Version)
Since 1.12.3-jcs.4, Service supports a new version of LoadBalancer, which supports not only Application Load Balancer (alb), Network Load Balancer (nlb) and Distributed Network Load Balancer (DNLB), but also a wealth of configuration items, as well as reusing the created LoadBalancer, providing users with great flexibility.  

**Description ** Users can still use the old service configuration file, which is compatible to the new version of cluster. In addition, there are as many examples as possible herein to specify the configuration of parameters, while in actual use, the user only needs to fill in one required item to specify lb type, and no other annotation parameter is required to easily use the service


**Kubernetes Service**   
- Kubernetes Service defines such an abstract concept: a logic group of Pod and an accessing policy to them - referred to JD Distributed Service generally. This group of Pod can be accessed by Service, which is achieved through Label Selector (view the following to learn, why Service without selector is needed). One Service is a REST object in Kubernetes, which is similar to Pod. Like all REST objects, Service definition can request apiserver to create a new instance based on POST method.  

**JD Cloud Kubernetes Integrated Load Balancer Service supports creating Service of LoadBalance type, providing a secure and reliable network for the application.**  
- As the created Load Balancer will use the Application Load Balancer quota in local domain, please be sure to provide sufficient quota. 
- One service port corresponds to one group of Load Balancer Listeners and backend servers;
- Where several service port groups are associated with the same nodeport, the listener will be associated with the same backend service;

**service.beta.kubernetes.io/jdcloud-load-balancer-spec** 
- This annotation may or may not be specified. If not specified, the behavior will be consistent with the original service plug-in, creating the ALB instance by default
- Parameters used to define JD LB, supporting changing
- Note: listener and port correspond to each other in order

```
version: "v1"                                            # [Version Number} only "v1 is supported"
loadBalancerId: "alb-xxxxxx"                             # Reuse the existing LB. After this parameter is specified, only the settings for listeners,nodeSelector will take effect, and other settings will be ignored. If the listener port is repeated, the error will be reported
loadBalancerType: "alb(default)/nlb/dnlb"                # [Required] Type of JD LB to be created, which does not support changing after creation
securityGroupIds: ["sg-xxxxxxxx1","sg-xxxxxxxx2"]        # Optional. If it is not specified, the default security group will be associated. Changes will trigger disassociation of SG and the last SG cannot be disassociated
internal: true/false(default)                            # true means that LB instance will not associate EIP, which is for internal use only; while false means external service, which will associate EIP. Modification might trigger creation, association or disassociation, rather than automatic deletion of IPs
elasticIp:                                               # Pay By Configuration for Creation by Default
  elasticIpId: "fip-xxxxxxxxxxx"                         # It will not create a new FIP if it is not null during creation. For changing the Public IP associated with LB, if such IP is associated with another resource, an error will be reported
  bandwidthMbps: 100                                     # Default 5M bandwidth; changes will trigger expansion or contraction, but the IP of Monthly Package does not support this parameter
  provider: "bgp/no_bgp"                                 # Type of Public IP
  reclaimPolicy: "delete/retain(default)"                # Reclaim policy for EIP of LB; delete: delete together with LB (not support IP of Monthly Package); retain: Retain IP when deleting LB
listeners:                                               # For configuration of LB’s listener corresponding to each port, the count of listeners must be consistent with the count of ports 
  - protocal: "Http"                                     # Modification will trigger deletion and reconstruction, resulting in a temporary service outage; listener protocol,alb:Tcp,Http,Https,Tls;nlb:Tcp;dnlb:Tcp
    connectionIdleTimeSeconds: 1800                      # Connection time-out period, alb/nlb is valid
    backend:                                             # General configuration of backend on JD LB
      proxyProtocol: false                               # [alb Tcp Protocol] Obtain actual ip, with the value of False (not obtained) or True (obtained; support Proxy Protocol v1 version); the default value is False (Optional)
      connectionDrainingSeconds: 300                     # [nlb]Maximum connection holding time before deleting target; the default value is 300s, with the value range of [0-3600] (Optional)
      sessionStickyTimeout: 300                          # [nlb] Session persistence time-out period, which will take effect when the sessionStickiness is enabled; the default value is 300s, with the value range of [1-3600] (Optional)
      sessionStickiness: false                           # Backend persistence of backend service, with the value of false (disabled) or true (enabled), and the default value is false. [alb Http Protocol, RoundRobin algorithm] supports session persistence based on cookie; [nlb] supports session persistence based on packet source destination IP (Optional)
      algorithm: "IpHash/LeastConn/RoundRobin(default)"  # Scheduling algorithm, with the value range of [IpHash, RoundRobin, and LeastConn] (The meaning of the value range is: source Ip hash, weighted round robin and minimum weighted connection). The default values are RoundRobin (weighted round robin) (Optional), nlb:; dnlb:; alb
      httpCookieExpireSeconds: 0                         # [alb Http Protocol] Expiration time of cookie, which will take effect when the sessionStickiness is enabled, with the value range of [0-86400] and the default value is 0 (indicating that cookie has the same life cycle as the browser) (Optional)
      httpForwardedProtocol: false                       # [alb Http Protocol] Protocol obtaining Load Balancer, with the value of False (not obtained) or True (obtained), and the default value is False (Optional)
      httpForwardedPort: false                       # [alb Http Protocol] Port obtaining Load Balancer, with the value of False (not obtained) or True (obtained), and the default value is False (Optional) 
      httpForwardedHost: false                       # [alb Http Protocol] host information obtaining Load Balancer, with the value of False (not obtained) or True (obtained), and the default value is False (Optional)
      httpForwardedVip: false                       # [alb Http Protocol] vip obtaining Load Balancer, with the value of False (not obtained) or True (obtained), and the default value is False (Optional)
    healthCheckSpec:                                     # Configuration of Health Check 
      protocol: "http"                                   # Health Check Protocol [alb, nlb] with the values of Http and Tcp, while [dnlb] has the value of Tcp
      port: 80                                           # Check port, with the value range of [0,65535], and the default value is 0; the port of each backend instance for receiving load balancer traffic will be the port by default (Optional)
      healthyThresholdCount: 3                           # Health Threshold, with the value range of [1,5], and the default value is 3 (Optional)
      unhealthyThresholdCount: 3                           # Ill health Threshold, with the value range of [1,5], and the default value is 3 (Optional)
      checkTimeoutSeconds: 3                             # Response Time-out Period, with the value range of [2,60], and the default value is 3s (Optional)
      intervalSeconds: 5                             # Health Check Interval, with the value range of [5,300], and the default value is 5s (Optional)
      httpPath: "/"                                      # Check Path, the target path of health check, which must be started with "/" and the length shall not exceed 1000 characters. The double quotation marks '"’ are not supported and specific file path can be entered. The root directory is the default directory. It is required when protocol is http, and only HTTP Protocol is supported (Optional)
      httpCode: ["2xx","3xx","4xx"]                      # HTTP status code to be used when checking successful response from backend target server. You can specify a single value (for example, "200"; the value range is 200-499) and a range of consecutive values (for example, "201-205"; the value range is 200-499 and the preceding parameter is less than the following) as well as a class of consecutive value abbreviation (for example: "3xx", equivalent to "300-399"; the value range is 2xx, 3xx and 4xx). Many values are separated with "," (for example, "200,202-207,302,4xx"). It supports only 2xx, 3xx and 4xx currently. It supports only HTTP Protocol, and is [2xx, 3xx] (Optional) by default
  - protocol: "https"
    certificateId: "cert19070379d79dd76c11b679"          # alb valid, which is required if the protocol is https or tls; certificate id can be obtained from jd console
    connectionIdleTimeSeconds: 1800
    backend: 
      connectionDrainingSeconds: 300
      sessionStickyTimeout: 300
      sessionStickiness: false
      algorithm: "IpHash/LeastConn/RoundRobin(default)"
    healthCheckSpec: 
      healthyThresholdCount: 3
      unhealthyThresholdCount: 3
      checkTimeoutSeconds: 3
      intervalSeconds: 5
nodeSelector: "key1=value,key2 in (aaa,bbb,ccc)"         # key is the key in lable of node; value of the value in lable of node. It can be specified manually which node is associated to the LB backend. When the cluster is in large scale, it is necessary to associate all nodes to the LB backend, so as to reduce frequent changes in the LB backend due to cluster scaling

```
## Create ALB service
1. Create service of LoadBalancer alb type, file named alb-service.yaml is defined as follows:
```
kind: Service
apiVersion: v1
metadata:
  name: alb-service
  labels:
    run: myapp
  annotations:
    service.beta.kubernetes.io/jdcloud-load-balancer-spec: |
      version: "v1"  
      loadBalancerType: alb
      internal: false
      elasticIp:
        bandwidthMbps: 10
        provider: "bgp"
        reclaimPolicy: "delete"
      listeners:
        - protocol: "http"
          connectionIdleTimeSeconds: 600
          backend:
            sessionStickiness: true
            algorithm: "IpHash"
          healthCheckSpec:
            protocol: "http"                   #healthcheck part does not specify port. nodeport port will be used by default as well for Health Check after K8s assigns a nodeport. If the user has assigned a special nodeport for providing alive detection service, it can specify port
            healthyThresholdCount: 3
            unhealthyThresholdCount: 3
            checkTimeoutSeconds: 3
            intervalSeconds: 5
            httpPath: "/"
            httpCode: ["2xx","3xx","4xx"]
        - protocol: "http"
          connectionIdleTimeSeconds: 1800
          backend:
            proxyProtocol: false
            sessionStickiness: false
            algorithm: "LeastConn"
            httpCookieExpireSeconds: 0
            httpForwardedProtocol: false
            httpForwardedPort: false
            httpForwardedHost: false
            httpForwardedVip: false
        - protocol: "tcp"
          connectionIdleTimeSeconds: 600
          backend:
            algorithm: "IpHash"
            proxyProtocol: false
spec:
  externalTrafficPolicy: Local
  ports:
    - name: http1
      protocol: TCP
      port: 8080
      targetPort: 80
      nodePort: 30790
    - name: http2
      protocol: TCP
      port: 8081
      targetPort: 80
    - name: tcp
      port: 8082
      targetPort: 80
  type: LoadBalancer
  selector:
     run: myapp
```

2. Execute kubectl creating command to create a service, in which it is replaced with the corresponding yaml file name  
`kubectl create -f myservice.yaml`  

3. Create a group of nginx pod. The mynginx.yaml file is defined as follows:
```
apiVersion: apps/v1beta1
kind: Deployment
metadata:
  name: my-nginx
spec:
  selector:
    matchLabels:
      run: myapp
  replicas: 2
  template:
    metadata:
      labels:
        run: myapp
    spec:
      containers:
      - name: my-nginx
        image: nginx
        ports:
        - containerPort: 80
```

4. Execute kubectl creating command to create a deployment, in which it is replaced with the corresponding yaml file name
```
kubectl create -f mynginx.yaml
```
5. View deployment which is successfully created and execute the following command:
`kubectl get deployment my-nginx`
Returned results are as follows:
```
NAME       DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
my-nginx   2         2         2            2           4m
```
6. View running status of corresponding pod,  
`kubectl get pods -l run=myapp -o wide`  
Returned results are as follows:  
```
NAME                        READY     STATUS    RESTARTS   AGE       IP            NODE
my-nginx-864b5bfdc7-6297s   1/1       Running   0          23m       172.16.0.10   k8s-node-vmtwjb-0vy9nuo0ym
my-nginx-864b5bfdc7-lr7gq   1/1       Running   0          23m       172.16.0.42   k8s-node-vm25q1-0vy9nuo0ym
```
7. View details of service:  
`kubectl describe service myservice`    
```
Selector:                 run=myapp
Type:                     LoadBalancer
IP:                       10.0.253.58
LoadBalancer Ingress:     114.67.110.200, 10.0.240.11
Port:                     https  8080/TCP
TargetPort:               80/TCP
NodePort:                 https  30789/TCP
Endpoints:                10.0.192.15:80,10.0.192.5:80
Port:                     http  8081/TCP
TargetPort:               80/TCP
NodePort:                 http  31353/TCP
Endpoints:                10.0.192.15:80,10.0.192.5:80
Port:                     tcp  8082/TCP
TargetPort:               80/TCP
NodePort:                 tcp  32477/TCP
Endpoints:                10.0.192.15:80,10.0.192.5:80
Port:                     tls  8083/TCP
TargetPort:               80/TCP
NodePort:                 tls  32761/TCP
Endpoints:                10.0.192.15:80,10.0.192.5:80
Session Affinity:         None
External Traffic Policy:  Local
HealthCheck NodePort:     31614
Events:
  Type     Reason                      Age                From                Message
  ----     ------                      ----               ----                -------
  Normal   EnsuringLoadBalancer        11m (x9 over 26m)  service-controller  Ensuring load balancer
  Normal   EnsuredLoadBalancer         10m                service-controller  Ensured load balancer

```  
**Note: LoadBalancer Ingress:114.67.110.200 is an external Public IP; "Ensured load balancer" indicates load balancer creation succeeded**  

8. Enter the LoadBalance Public IP and port associated with service in the browser. When you see the following page, it indicates that the nginx service is normal. It can also be verified through curl command   
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/nginx.jpg)

## Create NLB service
1. Create service of LoadBalancer nlb type, file named alb-service.yaml is defined as follows:
```
apiVersion: v1
kind: Service
metadata:
  labels:
    app: nlb
  name: nlb
  annotations:
    service.beta.kubernetes.io/jdcloud-load-balancer-spec: |
      version: "v1"
      loadBalancerType: nlb
      internal: false
      listeners:
        - protocol: "tcp"
          connectionIdleTimeSeconds: 1800
          backend:
            connectionDrainingSeconds: 300
            sessionStickyTimeout: 300
            algorithm: "IpHash"
spec:
  ports:
  - name: tcp
    port: 8085
    protocol: TCP
    targetPort: 80
  selector:
    run: myapp
  type: LoadBalancer
status:
  loadBalancer: {}

```

2. Steps for testing and verification are the same with those of alb service

## Create DNLB service
1. Create service of LoadBalancer nlb type, file named dnlbservice.yaml is defined as follows:
```
apiVersion: v1
kind: Service
metadata:
  labels:
    app: dnlb
  name: dnlb
  annotations:
    service.beta.kubernetes.io/jdcloud-load-balancer-spec: |
      version: "v1"
      loadBalancerType: dnlb
      internal: false
      listeners:
        - protocol: "tcp"
          connectionIdleTimeSeconds: 1800
          backend:
            algorithm: "IpHash"
spec:
  ports:
  - name: tcp
    port: 8086
    protocol: TCP
    targetPort: 80
  selector:
    run: myapp
  type: LoadBalancer
status:
  loadBalancer: {}

```

2. Steps for testing and verification are the same with those of alb service


