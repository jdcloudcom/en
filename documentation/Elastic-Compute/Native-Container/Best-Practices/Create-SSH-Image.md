
# Produce image with SSH

As for producing container images, please refer to the part for docker image production; below we introduce the production of images with SSH based on centos; Dockerfile shall be modified.

Dockerfile with contents as follows:
```

FROM centos:latest
MAINTAINER jcloud www.jdcloud.com
RUN yum install openssh-server net-tools -y
RUN mkdir /var/run/sshd
RUN echo 'root:jcloudA#699' | chpasswd
RUN sed -i 's/PermitRootLogin prohibit-password/PermitRootLogin yes/' /etc/ssh/sshd_config
RUN sed -i '/Port 22/a\Port 4011' /etc/ssh/sshd_config
RUN ssh-keygen -A
EXPOSE 4011
CMD ["/usr/sbin/sshd","-D"]
```

Instructions:

　　FROM: Essential command, take certain image as base image; take centos for example. For example FROM <image_name>, or FROM <image_name>: <tag>. If not added tag, is latest by default. Seek for base image in local Container Registry at first, if there is none, query in docker registry online.  
　　MAINTAINER: Indicate the author of Dockerfile and his contact information  
　　RUN: When creating new images, command in the system can be executed, for example, install certain software and setup environment variables. echo 'root:jcloud' | chpasswd, the user name is root; passport is jcloudA#699 and customer is required to get it changed at creating  
　　EXPOSE: Open ports in the container, but do not map host machine to facilitate carrying on development and test on host machine.  
    Remark: It is not suggested to use Port 22 for safety consideration and this instance use Port 4011 to provide SSH; user may select other ports as required. (If it is required to map to ports of host machine, -p host_port:container_port may be used during the running of container)  
　　 CMD: Set the command to be executed, often for an operation that is specified when the container starts. Such as executing customized script services, or executing system commands. There can only be one CMD, and if there are more than one CMD in Dockerfile, only the last CMD takes effect.
