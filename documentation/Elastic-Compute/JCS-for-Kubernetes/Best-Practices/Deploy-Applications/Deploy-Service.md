
# Deploying Service

Kubernetes Service defines such a kind of abstraction: Logical grouping of Pod, a strategy that can visit them --- usually called micro service. This set of Pods can be visited by Service, usually through Label Selector (check below to see why you might need Services without selectors).

Service is REST object in Kubernetes, similar to Pod. Like all REST objects, Service definitions can request apiserver to create new instances based on POST mode.

JD Cloud Kubernetes integrates Load Balancer services, supports the creation of LoadBalance-type Services, and provides the secure and reliable network for applications.

1. Create service that supports LoadBalance type. The yaml file is defined as follows:

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
2. Execute the kubectl creation command to create service; and replace it with the corresponding yaml file name.

kubectl create -f .yaml
3. Create a set of nginx pod. The yaml file is defined as follows:

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
4. Execute the kubectl creation command to create deployment; and replace it with the corresponding yaml file name.

kubectl create -f .yaml
5. Check the deployment that has been created and return the result as follows:


6. Check the corresponding pod running state and the returned result is as follows:


7. Check out the service details, you can view the endpoints associated to service:


8. Execute the following command to query the list of enpoints associated to service:


9. Enter the LoadBalance EIP and port associated with service in the browser and see the following page, which indicates that the nginx service is normal.

