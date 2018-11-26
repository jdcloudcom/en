
# Create Docker Image

**Create Docker Image**
Docker Hub is the Public Image Container Registry of Docker, owning a large amount of high quality images which can be downloaded for use directly. If the requirement can not be met, you may create container images; below we introduce the method for creating docker images with Dockerfile.  
## 1. To install Docker,
      you may refer to 【docker installation](https://docs.docker.com/install/)。  
## 2、Create Dockerfile File  
Create a new directory, in which create a new dockerfile file.  
```
[root@docker ~]# mkdir nginx-dockerfile
[root@docker ~]# cd nginx-dockerfile
[root@docker nginx-dockerfile]# vi Dockerfile
```  
Dockerfile with contents as follows:
```
FROM nginx
RUN echo ' <h1> Hello, Docker! </h1> ' > /usr/share/nginx/html/index.html
```  
**Remark:**  
    The Dockerfile includes two instructions:  
　　FROM: Essential command, take certain image as base image; take centos for example. For example FROM <image_name>, or FROM <image_name>: <tag>. If not added tag, is latest by default. Seek for base image in local Container Registry at first, if there is none, query in docker registry online.  
　　RUN: When creating new images, command in the system can be executed, for example, install certain software and setup environment variables.  
    Besides FROM, RUN instructions, there are following common instructions:  
　　ENV: Setup system environment variables with two formats ENV <key> <value>；ENV <key1>=<value1> <key2>=<value2>...  
    MAINTAINER: Indicate the author of Dockerfile and his contact information  
　　EXPOSE: Open ports in the container, but do not map host machine. Facilitate to carry on development and test on host machine. In the format of: EXPOSE <port1> [<port2>...]  
　　CMD: Set the command to be executed, often for an operation that is specified when the Container starts. Such as executing customized script services, or executing system commands. There can only be one CMD, and if there are more than one CMD in Dockerfile, only the last CMD takes effect. In the format of: CMD <command>  
## 3. Execute build to create image
   Use docker build command to create image
```
[root@docker nginx-dockerfile]# docker build -t newnginx .
```
   -t option is used to docker build new images to facilitate marking images created, show current directory and can also indicate the directory that dockerfile file is located in.
## 4.Check Image List
```
[root@docker nginx-dockerfile]# docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
newnginx                latest              c9038ef5f829        3 minutes ago       108.5 MB
docker.io/nginx         latest              3f8a4339aadd        2 weeks ago         108.5 MB
```

## 5.Store images in Container Registry
    
   Image repositories are divided into private image Container Registry and public Container Registry and please refer to deploy private Container Registry for details. Below we take the public container registry DockerHub for example.  
    i. Create account https://hub.docker.com/ in DockerHub and remember the user name (For example myname) and password
    ii. Play Tag for Image 
```
[root@docker nginx-dockerfile]# docker tag newnginx myname/newnginx
```
  iii. Login to DockerHub
```
[root@docker nginx-dockerfile]# docker login
Enter username and password
```
  iv. push image to DockerHub
```
[root@docker nginx-dockerfile]# docker push myname/newnginx
```
## 6.Use this image when creating container instance
   
   When creating a container instance, enter myname/newnginx to image name.
