
# Deploy Private Image Container Registry  
**Private Image Container Registry**
    Private Image Container Registry can be a unified platform for customer to store and manage inner container images and can provide better performance, safety and manageability compared with public Container Registry. JD Cloud is currently providing [Container Registry](https://docs.jdcloud.com/cn/container-registry/product-overview) product, which can be used directly.  
    Take Harbor as an example to explain how to build a Private Image Repository for customers. Harbor is an enterprise-level Registry server for storing and distributing Docker images:  
**Installation Steps:**
1. Create VM instance
a. Create a VM in the JD Cloud Console and refer to [the creation of Linux instance](https://docs.jdcloud.com/cn/virtual-machines/account-preparation-linux) for details.
b. Deploy selection of regions according to container and select the same region or nearer regions. At present, the container is online only in cn-north-1 and we choose to Create VM instance in cn-north-1.
c. Operation system, recommended to use Ubuntu 16.04 or Centos 7.4
d. The VM shall be configured minimally to 2 cores 4GB and 4 cores 8GB is suggested.
e. Bandwidth may affect the download speed of image, the larger the bandwidth is, the faster the download speed, and can be determined comprehensively according to the size of image and the quantity of images that are created in batch.
f. Created a VM with 114.67.241.169 as its public address. Log in VM in the root mode.
2. Deploy Docker
    Ubuntu 16.04 Deployment method
```
apt-get update
apt-get -y install apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://mirrors.tuna.tsinghua.edu.cn/docker-ce/linux/ubuntu/gpg | apt-key add -
add-apt-repository "deb [arch=amd64] https://mirrors.tuna.tsinghua.edu.cn/docker-ce/linux/ubuntu $(lsb_release -cs) stable"
apt-get update
apt-get install -y docker-ce
```
Centos 7.4 Deployment Method
```

yum install -y yum-utils device-mapper-persistent-data lvm2
yum-config-manager --add-repo https://mirrors.tuna.tsinghua.edu.cn/docker-ce/linux/centos/docker-ce.repo
yum makecache fast
yum -y install docker-ce
service docker start
```  
3. Install Docker-Compose
Ubuntu 16.04 Deployment method
```

apt-get   install python-pip –y
pip install docker-compose
```  
Centos 7.4 Deployment Method
```

yum install python-pip –y
pip install docker-compose
```  
4. Download and unzip Harbor
```

wget   http://harbor.orientsoft.cn/harbor-v1.4.0/harbor-offline-installer-v1.4.0.tgz
tar xf  harbor-offline-installer-v1.4.0.tgz
```  
5. Apply for Https certificate
   You may apply for free certificate in https://freessl.org/. Take domain harbortest.jdpoc.com for example; it is required that the domain points to the IP address of Create VM instance 114.67.241.169.
   If there is not a domain name, apply for a domain name from domain name service of JD Cloud.
   CA certificate and all the contents of it shall be stored in /data/cert/server.crt; the content of private key shall be stored in /data/cert/server.key.
```

cd ..
mkdir -p /data/cert
cd /data/cert
vim server.crt
vim server.key
cd ..
cd ..
cd root
```  
6. Deploy Harbor
    Modify Harbor settings
```

cd harbor
vim harbor.cfg
```  
The following four parameters are required to be modified with modified content marked in red as follows
   i.      It is modified to domain address of the user.
```
hostname = harbortest.jdpoc.com
```
  ii.      Modified to https; JD Cloud uses https protocol to encrypt the transmitting for relevant information of Container Registry, therefore, it is required to support https
```
ui_url_protocol = https
```
iii.      To be safe, the customer is suggested to change the password.
```
harbor_admin_password = ********
```
  iv. Turn off the account register function. The new user can be created only by administrator account.
```
self_registration = off
```
7. Apply Harbor to create private image Container Registry
Create private items, log in harbor website and select New Item with test as item name; do not choose Public as access level.
    Create Image, Create Directory
```
mkdir -p /etc/docker/certs.d/harbortest.jdpoc.com
```
  It is required to copy the key pair of the domain name /root/cert/server.crt to the created directory /etc/docker/certs.d/harbortest.jdpoc.com  
  This machine may use following commands  
```
cp /data/cert/server.crt !$
```
  Login Harbor
```
docker login harbortest.jdpoc.com
```
   Successful login
8. Create and upload image
   Create Dockerfile file
```
mkdir nginx-dockerfile
cd nginx-dockerfile
vim Dockerfile
```
   Dockerfile with contents as follows:
```
FROM nginx
RUN echo '<h1>Hello, JD Cloud!</h1>' > /usr/share/nginx/html/index.html
EXPOSE 80
```  
Remark:
       The Dockerfile includes two instructions:
　　FROM: Essential command, take certain image as base image; take centos for example. For example FROM <image_name>, or FROM <image_name>: <tag>. If not added tag, is latest by default. Seek for base image in local Container Registry at first, if there is none, query in docker registry online.
　　RUN: When creating new images, command in the system can be executed, for example, install certain software and setup environment variables.
　　EXPOSE: Open ports in the container, but do not map host machine. Facilitate to carry on development and test on host machine. In the format of: EXPOSE <port1> [<port2>...]
       Besides FROM, RUN, EXPOSE instructions, there are following common instructions:
　　ENV: Setup system environment variables with two formats ENV <key> <value>；ENV <key1>=<value1> <key2>=<value2>...
       MAINTAINER: Indicate the author of Dockerfile and his contact information
       CMD: Set the command to be executed, often for an operation that is specified when the Container starts. Such as executing customized script services, or executing system commands. There can only be one CMD, and if there are more than one CMD in Dockerfile, only the last CMD takes effect. In the format of: CMD <command>
    Execute build to create image
```
docker build -t newnginx .
```  
    Play Tag for Image
```
docker tag newnginx harbortest.jdpoc.com/test/newnginx:latest
```
    push image to private image Container Registry
```
docker push harbortest.jdpoc.com/test/newnginx:latest
```  
9. Deploy Container
 Add secrets to secrets of container service
The Container Instance List page after successful creation, with the container at the public IP of 116.196.76.86
10. Access to container
Input http://116.196.76.86/ and get successful verification.
Instructions about the deploy of private image Container Registry:
1.   JD Cloud is responsible for relevant problems of VM created by JD Cloud. Refer to http://vmware.github.io/harbor/ for relevant problems of Harbor and more details.