# Integrate with Container Registry  

See [Help documentation of Container Registry](https://docs.jdcloud.com/en/container-registry/create-image) for use method of Container Registry.
For example, the registry is myregistry, the repository is myrepo, the image version number is latest and the region is cn-north-1. Users can make the alternation depending on specific conditions.  

**For one-time use, the Token is valid within its validity period and is time-effective**  
With this scheme, only permissions of all Docker Images under one Registry can be gotten.  
1. Get Token and among Docker client login commands, one character string after -p is the content of docker-password:  
For example, login command of Docker client is as follows: docker login -u jdcloud -p cWj36rigll1J2k8u 1227-cn-north-1.jcr.service.jdcloud.com. Namely, cWj36rigll1J2k8u is a part of docker-password.  
2. When creating secret in the name of my-secret, please execute the following command, with relevant contents to be modified based on reality:  
```
kubectl create secret docker-registry my-secret --docker-server=myregistry-cn-north-1.jcr.service.jdcloud.com --docker-username=jdcloud --docker-password=cWj36rigll1J2k8u --docker-email=l****@jd.com
```  
3. When resources are creating, my-secret is used by imagePullSecrets:  
For example
```
apiVersion: extensions/v1beta1   #1.16 Cluster should be changed to apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    run: nginx
  name: nginx
spec:
  replicas: 1
  selector:
    matchLabels:
      run: nginx
  template:
    metadata:
      labels:
        run: nginx
    spec:
      containers:
      - image: myregistry-cn-north-1.jcr.service.jdcloud.com/myrepo:latest
        imagePullPolicy: Always
        name: nginx
      imagePullSecrets:
      - name: my-secret
```  

**For long-term use, login permission of Container Registry will be automatically obtained**  
With this scheme, permissions of Docker Image of all Registries under the account can be gotten.  
1. You can make base 64-bit code for Access Key and Access Key Secret of user:  
`
printf  22BC1***********02C8C  | base64   #22BC1***********02C8C are Access Key and Access Key Secret
`  
Output contents, i.e. Access Key and Access Key Secret can be applied for base 64-bit coding:   
2. Create a secret.yaml file:  
`
vi secret.yaml
`  
The content is as follows:
```
apiVersion: v1
kind: Secret
metadata: 
  name: c-tokens-fresher-secret
  
type: Opaque
data: 
  ak: NE*******************xQjk= # is modified to as the base64-bit code of the user’s Access Key, as required
  sk: RU*******************4QTE= # is modified as the base64 code of the user’s Access Key Secret, as required
```
3. Create cronjod.yaml file:  
`
vi cronjob.yaml
`  
The content is as follows:
```
apiVersion: batch/v1
kind: Job
metadata:
  name: init-jcr-token-refresher
spec:
  template:
    metadata:
      name: init-jcr-token-refresher
    spec:
      serviceAccountName: jcr-credential
      restartPolicy: Never
      hostNetwork: true
      containers:
      - name: init-jcr-token-refresher
        env:
        - name: ACCESS_KEY
          valueFrom:
            secretKeyRef:
              name: c-tokens-fresher-secret
              key: ak
        - name: SECRET_KEY
          valueFrom:
            secretKeyRef:
              name: c-tokens-fresher-secret
              key: sk
        imagePullPolicy: IfNotPresent
        image: jdcloud-cn-north-1.jcr.service.jdcloud.com/jdcloudiaas/jcrtoken:cronjob-14.6
---
apiVersion: v1
kind: ServiceAccount
metadata:
  name: jcr-credential
  namespace: default
---
apiVersion: rbac.authorization.k8s.io/v1beta1
kind: ClusterRoleBinding
metadata:
  name: jcr-credential-rbac
subjects:
  - kind: ServiceAccount
    name: jcr-credential
    namespace: default
roleRef:
  kind: ClusterRole
  name: cluster-admin
  apiGroup: rbac.authorization.k8s.io
---
apiVersion: batch/v1beta1
kind: CronJob
metadata:
  name: jdcloud-jcr-credential-cron
spec:
  schedule: "*/5 * * * *"
  successfulJobsHistoryLimit: 2
  failedJobsHistoryLimit: 2
  jobTemplate:
    spec:
      backoffLimit: 4
      template:
        spec:
          serviceAccountName: jcr-credential
          terminationGracePeriodSeconds: 0
          restartPolicy: Never
          hostNetwork: true
          containers:
          - name: jcr-token-refresher
            env:
            - name: ACCESS_KEY
              valueFrom:
                secretKeyRef:
                  name: c-tokens-fresher-secret
                  key: ak
            - name: SECRET_KEY
              valueFrom:
                secretKeyRef:
                  name: c-tokens-fresher-secret
                  key: sk
            imagePullPolicy: IfNotPresent
            image: jdcloud-cn-north-1.jcr.service.jdcloud.com/jdcloudiaas/jcrtoken:cronjob-14.6
```  
Note: If the clusters are in different regions, e.g. East China or South China, please replace the image addresses accordingly to jdcloud-cn-east-2.jcr.service.jdcloud.com/jdcloudiaas/jcrtoken:cronjob-14.6 or jdcloud-cn-south-1.jcr.service.jdcloud.com/jdcloudiaas/jcrtoken:cronjob-14.6

4. Execute the following commands to run:
```
kubectl create -f secret.yaml
kubectl create -f cronjob.yaml
```
5. When resources are creating, please select the image under the ak and sk users and adopt jcr-pull-secret as imagePullSecrets:  
For example:
```
apiVersion: extensions/v1beta1  #1.16 Cluster should be changed to apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    run: nginx
  name: nginx
spec:
  replicas: 1
  selector:
    matchLabels:
      run: nginx
  template:
    metadata:
      labels:
        run: nginx
    spec:
      containers:
      - image: myregistry-cn-north-1.jcr.service.jdcloud.com/myrepo:latest
        imagePullPolicy: Always
        name: nginx
      imagePullSecrets:
      - name: jcr-pull-secret
```
