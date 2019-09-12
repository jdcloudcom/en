# Run Istio on JCS for Kubernetes
During transition from monolithic application to distributed microservice architecture, the developer as well as operation and maintenance staff face many challenges. Istio provides an intact solution, i.e. provide behavior observation and operation control to the entire service mesh to meet diversified demands of microservice applications.

Taking the cluster Version 1.12.3 as an example, this document specifies steps of rapidly installing Istio on JCS for Kubernetes and providing examples of service management.

## I. Install Istio

1. [Create Cluster][1] on JD Cloud Console and install kubectl client to [Connect to Cluster][2];
2. Download required versions in [Istio Version Page](https://github.com/istio/istio/releases) or directly download 1.0.6 by referring to text examples;

    ```
    
    wget https://github.com/istio/istio/releases/download/1.0.6/istio-1.0.6-linux.tar.gz

    tar -zxvf istio-1.0.6-linux.tar.gz
    ```

**Description:**

  The decompressed directory comprises the following contents:

    * install/ contains installation files of .yaml and customized installation can be made according to demands. This document takes istio-demo.yaml as an example;
    * samples/ contains example applications;
    * Binary files of istioctl client are placed in the directory bin/
3. Log in the root directory installed by Istio, add the istioctl client to PATH and install istio-demo;

    ```
    
    export PATH=$PWD/bin:$PATH
    kubectl apply -f install/kubernetes/istio-demo.yaml
    ```

4. After executing commands, a new namespace istio-system can be seen in the cluster;

    `
    kubectl get namespace
    `
    
    Output is as follows

    ```
    
    NAME           STATUS   AGE
    default        Active   16h
    istio-system   Active   7m37s
    jke-system     Active   15h
    kube-public    Active   16h
    kube-system    Active   16h
    ```    
5. After waiting for a second, view if each major service of istio-system is normally started;

    `
    kubectl get pod -n istio-system
    `

    Output is as follows

    ```
    
    NAME                                      READY   STATUS      RESTARTS   AGE
    grafana-5f88cdf98b-mbvgp                  1/1     Running     0          10m
    istio-citadel-5bbbc98c6d-v7kxq            1/1     Running     0          10m
    istio-cleanup-secrets-kgjqx               0/1     Completed   0          10m
    istio-egressgateway-5c65dbd6bc-54mxh      1/1     Running     0          10m
    istio-galley-589df589c9-p82l5             1/1     Running     0          10m
    istio-grafana-post-install-64svr          0/1     Completed   3          10m
    istio-ingressgateway-679d5cdc94-hsrkd     1/1     Running     0          10m
    istio-pilot-74ddc6cf47-4jwhk              2/2     Running     0          10m
    istio-policy-777fbbd848-x7hpf             2/2     Running     0          10m
    istio-security-post-install-4zjnj         0/1     Completed   3          10m
    istio-sidecar-injector-7d559f664c-4qqd2   1/1     Running     0          9m59s
    istio-telemetry-588dd6494-wgtqp           2/2     Running     0          10m
    istio-tracing-6445d6dbbf-88jx4            1/1     Running     0          9m59s
    prometheus-66f96fdfbc-44htl               1/1     Running     0          10m
    servicegraph-658fd9f76d-jrvdp             1/1     Running     0          10m
    ```  

**Description:**

  Instructions to main components of istio are as follows:

    * pilot is responsible for service discover and traffic management;
    * mixer is responsible for IAM and calling information collection;
    * ingressgateway serves as the entry of external traffic;
    * citadel is used for certificate management and security management;

6. Installation of istio is completed, if the above components can normally run;
7. If you need to unload istio, please execute the commands below:

    `
    kubectl delete -f install/kubernetes/istio-demo.yaml
    `

## II. Example Application

The example application is an on-line book directory system displaying book-related information, including book details such as book name, ISBN and sheet as well as book preview function. It is composed of four independent microservices, including detail, productpage, ratings and reviews.
1. Deploy example applications, put into agent service and execute the following commands:

    `
    kubectl apply -f <(istioctl kube-inject -f samples/bookinfo/platform/kube/bookinfo.yaml)
    `
    
2. Wait for a second, execute the following commands and confirm if service is normally started:

    `
    kubectl get service
    `

    Output is as follows:

    ```
    
    NAME          TYPE        CLUSTER-IP     EXTERNAL-IP   PORT(S)    AGE
    details       ClusterIP   10.0.255.166   <none>        9080/TCP   10s
    kubernetes    ClusterIP   10.0.248.1     <none>        443/TCP    16h
    productpage   ClusterIP   10.0.249.165   <none>        9080/TCP   9s
    ratings       ClusterIP   10.0.249.23    <none>        9080/TCP   10s
    reviews       ClusterIP   10.0.252.48    <none>        9080/TCP   10s 

    ```

    `
    kubectl get pod
    `

    Output is as follows:

    ```
    
    NAME                              READY   STATUS    RESTARTS   AGE
    details-v1-5c8dc9bffb-5v5bl       2/2     Running   0          3m17s
    productpage-v1-7dd5bcc8c8-z6hpv   2/2     Running   0          3m16s
    ratings-v1-56d96b5d8-9h9lz        2/2     Running   0          3m17s
    reviews-v1-7d9c799d9c-6rvt9       2/2     Running   0          3m17s
    reviews-v2-8d79fbcfb-dxzfw        2/2     Running   0          3m16s
    reviews-v3-6c9c86db7f-gjsrx       2/2     Running   0          3m16s
    ```
    **Description**
    * The output results show that four service examples are started, including detail, productpage, ratings and reviews, and 3 versions have been started for reviews

3. Execute the following commands and define one Service of the LoadBalance type as the entrance gateway;

    `
    kubectl apply -f samples/bookinfo/networking/bookinfo-gateway.yaml
    `

    Output results are as follows:

    ```
    kubectl get svc istio-ingressgateway -n istio-system
    
    
    NAME                   TYPE           CLUSTER-IP     EXTERNAL-IP      PORT(S)                                                                                                                   AGE
    istio-ingressgateway   LoadBalancer   10.0.250.151   114.XXX.XXX.XXX   80:31380/TCP,443:31390/TCP,31400:31400/TCP,15011:30570/TCP,8060:30615/TCP,853:32610/TCP,15030:30259/TCP,15031:31241/TCP   47m
    ```
    
4. Verify if service of cluster is running normally with external-IP and service name returned by the cluster in the last step. Taking microservice of productpage as an example, the executing commands are as follows:

    ```
    
    curl -I http://{external-IP}/productpage
    
    HTTP/1.1 200 OK
    content-type: text/html; charset=utf-8
    content-length: 5723
    server: envoy
    date: Fri, 19 Apr 2019 09:56:40 GMT
    x-envoy-upstream-service-time: 55
    
   Note: Replace the field external-IP with the service-associated Internet IP
    ```

5. Or, verify the output result by entering url http://{external-IP}/productpage in a browser, refresh for several times, and ratings and reviews of three different versions will be displayed at random.

6. Execute the following commands in order, conduct service management and view output result

  * Execute the following commands to cancel display of ratings and reviews, refresh the browser url in the last step, and then contents of reviews and ratings will no longer displayed

    ```
    
    kubectl apply -f samples/bookinfo/networking/destination-rule-all.yaml

    kubectl apply -f samples/bookinfo/networking/virtual-service-all-v1.yaml
    ```

  * After the following commands are executed and the browser url in the last step is refreshed, it is found that ratings and reviews are displayed at random without any display and red stars

    `
    kubectl apply -f samples/bookinfo/networking/virtual-service-reviews-50-v3.yaml
    `
    
  * It is found that reviews of Version v1 and Version v3 respectively amount to 50%, after viewing corresponding yaml file verification of operation of last step

    ```
    
    - destination:
        host: reviews
        subset: v1
      weight: 50
    - destination:
        host: reviews
        subset: v3
      weight: 50
    ```

  * After the following commands are executed and the browser url in the last step is refreshed, it is found that the ratings and reviews are always in red color. This is because the service traffic is completely switched to v3 due to configuration of corresponding yaml file;

    ```
    
    kubectl apply -f samples/bookinfo/networking/virtual-service-reviews-v3.yaml        

    Corresponding configuration of yaml file is as follows:
    
    - destination:
        host: reviews
        subset: v3
    ```

7. Through the above verification, we can see that istio has the capacity of dynamically configuring traffic rules. Such capacity is completely irrelevant to codes or development framework. Please refer to [Istio Official Help](https://istio.io/docs/tasks/) to continue test more Istio service management functions.

  [1]: https://docs.jdcloud.com/en/jcs-for-kubernetes/create-to-cluster
  [2]: https://docs.jdcloud.com/en/jcs-for-kubernetes/connect-to-cluster