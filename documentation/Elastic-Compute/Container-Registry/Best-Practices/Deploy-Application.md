# Continuous Deployment of Containerized Applications


**I. Integration to Native Container**

 Log in the creation page of the native container through the 3 methods below:

a. Turn on the console, log in Elastic Compute-Native Container-Container Instance and click **Create**.

b. Turn on the console, log in Elastic Compute-Container Registry-Repository and click **Create Container**.

c. Turn on the console, log in Elastic Compute-Container Registry-Image List and click **Create Container**.

Check JD Cloud images in the image option and check the registry address and image name.

Note: Select repositories under different regions as much as possible.

II. Integration to JCS for Kubernetes

For example, the registry is myregistry, the repository is myrepo, the image version number is latest and the region is cn-north-1. Users can make the alternation depending on specific conditions.

1. Save secret and name it as my-secret:

kubectl create secret docker-registry my-secret --docker-server=myregistry-cn-north-1.jcr.service.jdcloud.com --docker-username=jdcloud --docker-password=C********u --docker-email=l****@jd.com

2. Create a yaml file with the file name of registrysecret

apiVersion: v1

kind: ReplicationController

metadata:

  name: webapp

spec:
  replicas: 2

  template:
  
   metadata:
      
   name: webapp
      
   labels：
   
   app: webapp
        
   spec:
   
   containers:
   
   name: testsecret
   
   imagePullPolicy: Always

   image: myregistry-cn-east-2.jcr.service.jdcloud.com/myrepo:latest
   
   ports:
   
   containerPort: 80
   
   imagePullSecrets:
   
   name: my-secret

3. Create: kubectl create -f registrysecret

4. View details: kubectl describe rc webapp
