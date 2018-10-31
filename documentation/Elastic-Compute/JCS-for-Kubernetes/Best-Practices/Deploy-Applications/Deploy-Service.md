
# Deploying Service

**Kubernetes Service**   
-Kubernetes Service defines such a kind of abstraction: Logical grouping of Pod, a strategy that can visit them --- usually called micro service. This set of Pods can be visited by Service, usually through Label Selector (check below to see why you might need Services without selectors). Service is REST object in Kubernetes, similar to Pod. Like all REST objects, Service definitions can request apiserver to create new instances based on POST mode.

**JD Cloud Kubernetes integrates load balancer services, supports the creation of LoadBalance-type Services, and provides the secure and reliable network for applications.**
1. Create service that supports LoadBalance type. It's named myservice.yaml and defined as follows:
```
kind: Service
apiVersion: v1
metadata:
  name: servicetest
  labels:
    run: myapp
spec:
  ports:
    - protocol: TCP
      port: 80
      targetPort: 80
      nodePort: 30062
  type: LoadBalancer
  selector:
     run: myapp
```

2. Execute the kubectl creation command to create service; and replace it with the corresponding yaml file name.  
`kubectl create -f myservice.yaml`  
3. Create a set of nginx pod. The mynginx.yaml file is defined as follows:
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

4. Execute the kubectl creation command to create deployment; and replace it with the corresponding yaml file name.
```
kubectl create -f mynginx.yaml
```
5. Check the deployment that has been created and run below command:
`kubectl get deployment my-nginx`
The returned result is shown as follows:
```
NAME       DESIRED   CURRENT   UP-TO-DATE   AVAILABLE   AGE
my-nginx   2         2         2            2           4m
```
6. Check the corresponding pod running state.
`kubectl get pods -l run=myapp -o wide`
The returned result is shown as follows:
```
NAME                        READY     STATUS    RESTARTS   AGE       IP            NODE
my-nginx-864b5bfdc7-6297s   1/1       Running   0          23m       172.16.0.10   k8s-node-vmtwjb-0vy9nuo0ym
my-nginx-864b5bfdc7-lr7gq   1/1       Running   0          23m       172.16.0.42   k8s-node-vm25q1-0vy9nuo0ym
```
7. Check out the service details:
`kubectl describe service servicetest`
You can view the endpoints associated to service:
```
Name:                     servicetest
Namespace:                default
Labels:                   run=myapp
Annotations:              <none>
Selector:                 run=myapp
Type:                     LoadBalancer
IP:                       172.16.61.58
LoadBalancer Ingress:     114.67.227.25
Port:                     <unset>  80/TCP
TargetPort:               80/TCP
NodePort:                 <unset>  30062/TCP
Endpoints:                172.16.0.10:80,172.16.0.42:80
Session Affinity:         None
External Traffic Policy:  Cluster
Events:
  Type     Reason                      Age                From                Message
  ----     ------                      ----               ----                -------
  Normal   EnsuringLoadBalancer        11m (x9 over 26m)  service-controller  Ensuring load balancer
  Normal   EnsuredLoadBalancer         10m                service-controller  Ensured load balancer

```
8. Execute the following command to query the list of enpoints associated to service:
`kubectl get ep servicetest`  
  Return:
```
NAME          ENDPOINTS                       AGE
servicetest   172.16.0.10:80,172.16.0.42:80   28m
```
9. Enter the LoadBalance EIP and port associated with service in the browser and see the following page, which indicates that the nginx service is normal.  
![](https://github.com/jdcloudcom/cn/blob/edit/image/Elastic-Compute/JCS-for-Kubernetes/nginx.jpg)
