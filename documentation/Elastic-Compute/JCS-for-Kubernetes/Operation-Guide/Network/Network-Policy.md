# Network Policy

## Overview

Network Policy is used to define the network isolation policy between the Pods within the cluster and the network isolation policy between Pods and other external network endpoints. The definition of Network Policy is implemented by the controller provided by network plug-in. For more details, please refer to [Kubernetes.io](https://kubernetes.io/docs/concepts/services-networking/network-policies/).

By default, pods are not isolated so that traffics from any source can be received. Therefore, if you need to define an isolation policy for Pod in a cluster, you can enable Network Policy in it.

## Enable Network Policy

JD Cloud’s Network Policy controller is implemented by integrating Calico’s Felix components. It supports Network Policy based on Kubernetes standard API in defining access polices between containers, and is compatible with [Calico](https://docs.projectcalico.org/v3.8/security/calico-network-policy)’s Network Policy. 

You can enable "Network Policy" when creating a cluster, or enable "Network Policy" for a cluster created.

After Network Policy is enabled in the cluster, you can define the Network Policy resources in the cluster to define precise network isolation policies for different types of applications in the cluster to implement network control between the cluster internal applications or between the cluster applications and the external network endpoints.

## Restrict intra-cluster service access by Network Policy

1.Create an nginx application, and expose it by Service named ngnix.

```
kubectl run nginx --image=nginx

kubectl get pod
NAME                                           READY   STATUS              RESTARTS   AGE
nginx-7db9fccd9b-qrkgd                         1/1     Running             0          54m

kubectl expose deployment nginx --port=80

kubectl get service
NAME         TYPE        CLUSTER-IP     EXTERNAL-IP   PORT(S)   AGE
kubernetes   ClusterIP   10.0.120.1     <none>        443/TCP   130m
nginx        ClusterIP   10.0.122.240   <none>        80/TCP    89m
```

2. Create a Pod named busybox, and access nginx Service created by step 1.

```
kubectl run busybox --image=busybox --restart=Never --command -- sleep 3600

kubectl exec -it busybox /bin/sh
/ # wget nginx
Connecting to nginx (10.0.122.240:80)
saving to 'index.html'
index.html           100% |***************************************************************************************************************************|   612  0:00:00 ETA
'index.html' saved
```

3. Create a network policy to restrict intra-cluster access

networkpolicy.yaml
```
apiVersion: networking.k8s.io/v1
kind: NetworkPolicy
metadata:
  name: access-nginx
spec:
  podSelector:
    matchLabels:
      run: nginx
  ingress:
  - from:
    - podSelector:
        matchLabels:
          access: "true"
```

Create a network policy with the above yaml file

```
kubectl create -f networkpolicy.yaml
```

4. Test the connectivity of nginx with the busybox just created

```
kubectl exec -it busybox /bin/sh
/ # wget nginx
Connecting to nginx (10.0.122.240:80)
wget: can't connect to remote host (10.0.122.240): Connection timed out
```
Since networkpolicy is validated, so busybox fails to access nginx

5. Delete the busybox just created and recreate a busybox and place a label on it

```
kubectl run busybox --image=busybox --restart=Never --labels="access=true" --command -- sleep 3600

kubectl exec -it busybox /bin/sh
/ # wget nginx
Connecting to nginx (10.0.122.240:80)
saving to 'index.html'
index.html           100% |***************************************************************************************************************************|   612  0:00:00 ETA
'index.html' saved
```
If you test with the newly created busybox, then you can normally access nginx

## Restrict cluster services from accessing to public network by Network Policy


1. First of all, create a busybox for testing
```
kubectl run busybox --image=busybox --restart=Never --labels="run=busybox" --command -- sleep 36000
kubectl exec -it busybox /bin/sh
/ # ping www.baidu.com
PING www.baidu.com (180.101.49.12): 56 data bytes
64 bytes from 180.101.49.12: seq=0 ttl=45 time=8.173 ms
64 bytes from 180.101.49.12: seq=1 ttl=45 time=8.017 ms
```

2. Create a network policy, which is restricted from accessing to public network by default
egress-deny.yaml
```
apiVersion: networking.k8s.io/v1
kind: NetworkPolicy
metadata:
  name: egress-test
  namespace: default
spec:
  podSelector:
    matchLabels:
      run: busybox
  policyTypes:
  - Egress
```

```
kubectl create -f egress-deny.yaml
```

3. Re-verify that busybox is unable to access to the Internet
kubectl exec -it busybox /bin/sh
/ # ping www.baidu.com
ping: bad address 'www.baidu.com'

4. Delete the network policy created earlier, and recreate a new network policy for accessing www.baidu.com only

Delete the old network policy
```
kubectl delete networkpolicies. egress-test
```

egress-test.yaml
```
apiVersion: networking.k8s.io/v1
kind: NetworkPolicy
metadata:
  name: egress-test
  namespace: default
spec:
  podSelector:
    matchLabels:
      run: busybox
  policyTypes:
  - Egress
  - Ingress
  egress:
  - to:
    - ipBlock:
        cidr: 180.101.49.12/32
    - ipBlock:
        cidr: 180.101.49.11/32
  - to:
    - ipBlock:
        cidr: 0.0.0.0/0
    ports:
    - protocol: UDP
      port: 53
  ```
  Create a new network policy
  ```
  kubectl create -f egress-test.yaml
  ```
  
  5. Re-verify the connectivity of network
  
  
  



