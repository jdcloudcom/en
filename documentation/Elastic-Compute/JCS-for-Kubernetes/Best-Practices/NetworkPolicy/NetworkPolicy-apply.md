
# Define Network Policy

After enabling Network Policy in the cluster, you can define Network Policy resources in the cluster, and accurate network isolation strategies for different types of applications in the cluster to realize network control between internal applications of the cluster or between the cluster application and external network terminal.

**Operation Description**

 1. Refer to [Network Policy Deployment Instructions]() for JD Cloud Network Policy Instructions;
 2. Before defining Network Policy resource, you first need to [Enable Network Policy]();
 3. You need to use Kubectl client [Connect to Cluster](https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster).

**Operation Steps:**

**I. Create a set of test Pod to verify the network connection between Pods under the circumstance that Network Policy is not defined**

 1. Create a namespace with the name of policy-test for test:

 `
kubectl create namespace policy-test
 `

 2. Create a deployment using nginx image, label as un=nginx in the test naming space:

 ```
kubectl run deployment-nginx --image=nginx --replicas=2 -n policy-test

Wait for a period of time until all Pods are in the running status:
kubectl get pod --show-labels -n policy-test -o wide
NAME                                READY   STATUS    RESTARTS   AGE   IP           NODE                         NOMINATED NODE   LABELS
deployment-nginx-7777ff954d-b8w29   1/1     Running   0          91s   10.0.0.46    k8s-node-vmgvar-jo700huqmx   <none>           pod-template-hash=7777ff954d,run=deployment-nginx
deployment-nginx-7777ff954d-m6xm7   1/1     Running   0          91s   10.0.0.218   k8s-node-vm8opj-t9tmdz7rop   <none>           pod-template-hash=7777ff954d,run=deployment-nginx
 ```

 3. Create a Pod to test the network connectivity of the above nginx Pod:
```
kubectl run nginx-test --rm -it --image=busybox --restart=Never -- /bin/sh 

Enter the following command in the command line terminal of nginx-test to test the connectivity of nginx Pod

wget -O- 10.0.0.46

View returned contents to confirm that nginx can be accessed
```

**II. Deploy a Network Policy denying all network access to reverify the network connectivity between Pods**

1. In order to define Network policy for pod in policy-test namespace, deny all network accesses

```
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/NetworkPolicy/denyall.yml

Contents of Yaml file are as follows:

kind: NetworkPolicy
apiVersion: networking.k8s.io/v1
metadata:
  name: default-deny
  namespace: policy-test
spec:
  podSelector:
    matchLabels: {}
```
2. Use the said Yaml file to create Network Policy:

`
kubectl create -f denyall.yml

`
3. Recreate a Pod to test the network connectivity of the above nginx Pod

```
kubectl run nginx-test --rm -it --image=busybox --restart=Never -- /bin/sh 

Enter the following command in the command line terminal of nginx-test to test the connectivity of nginx Pod

wget -O- 10.0.0.46

View the returned contents to confirm that access is denied
```

**III. Deploy a Network Policy allowing part of Pods to access designated Pods and reverify the network connectivity between Pods**

1. In order to define Network policy for pod in policy-test namespace, deny all network accesses

```
wget https://kubernetes.s3.cn-north-1.jdcloud-oss.com/NetworkPolicy/allow-nginx.yml

Contents of Yaml file are as follows:

kind: NetworkPolicy
apiVersion: networking.k8s.io/v1
metadata:
  name: allow-nginx
  namespace: policy-test
spec:
  podSelector:
    matchLabels:
      run: deployment-nginx
  ingress:
    - from:
      - podSelector:
          matchLabels:
            run: nginx-test
```
2. Use the said Yaml file to create Network Policy:

`
kubectl create -f allow-nginx.yml

`
3. Recreate a Pod to test the network connectivity of the above nginx Pod

```
kubectl run nginx-test --rm -it --image=busybox --restart=Never -- /bin/sh 

View label in nginx-test Pod:
kubectl get pod nginx-test --show-labels
NAME         READY   STATUS    RESTARTS   AGE   LABELS
nginx-test   1/1     Running   0          89m   run=nginx-test


Enter the following command in the command line terminal of nginx-test to test the connectivity of nginx Pod

wget -O- 10.0.0.46

View returned contents to confirm that nginx can be accessed
```
4. Create another Pod without label run=nginx-test, retest the connectivity of nginx Pod

```
kubectl run nginx-test-withoutlabel --rm -it --image=busybox --restart=Never -- /bin/sh 

View label in nginx-test-withoutlabel Pod:
kubectl get pod nginx-test-withoutlabel --show-labels
NAME                      READY   STATUS    RESTARTS   AGE    LABELS
nginx-test-withoutlabel   1/1     Running   0          2m8s   run=nginx-test-withoutlabel


Enter the following command in the command line terminal of nginx-test-withoutlabel to test the connectivity of nginx Pod

wget -O- 10.0.0.46

View the returned contents to confirm that access is denied
```