
# Common Problems


Q: What is Kubernetes?

A: Kubernetes is an open source container cluster management system that enables large-scale deployment and management of containerized applications.

Q: What are the zones where the JCS for Kubernetes is available?

A: It is now on line in cn-north-1, cn-south-1, cn-east-2, and will be on line in more zones in the future.

Q: Which Kubernetes versions do JCS for Kubernetes support?

A: At present, it only supports Kubernetes version 1.12.3, and will support more Kubernetes versions in the future.

Q: Is docker client version preset in the work node?


A: docker-ce-17.06.2.ce-3.el7.centos.x86_64.

Q: Can v1 version of the image be used in JCS for Kubernetes?


A: It will not support it.

Q: What is the relationship between the service definition in JCS for Kubernetes and the related Application Load Balancer created?


A: One Application Load Balancer can be associated and created for one service; one service port corresponds to one group of Load Balancer Listeners and backend servers;

Q: What are the naming conventions for the service name in JCS for Kubernetes and the name of service port?


A: The service name and the service port name respectively contain 14 characters at most, and the rules comply with the naming conventions of Application Load Balancer [Backend Server](https://docs.jdcloud.com/en/application-load-balancer/backend-management) and [Listener](https://docs.jdcloud.com/en/application-load-balancer/listener-management). Where any name exceeds 14 characters in length, the first 14 characters will be automatically captured and cited to the backend server and listener of corresponding Application Load Balancer. The names comply with k8s conventions, but are inconsistent with the naming convention of the Application Load Balancer, causing failure in creating the listener or the Load Balancer.

