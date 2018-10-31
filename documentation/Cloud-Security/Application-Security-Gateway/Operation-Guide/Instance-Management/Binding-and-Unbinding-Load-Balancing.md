# Associate and disassociate Load Balancer

​	 Application Security Gateway must associate with the Load Balancer of 7 layers (ALB) so as to protect HTTP/HTTPs business subject to the Load Balancer.

​	During the Application Security Gateway creation process, it can select to associate with Load Balancer, if there is no available Load Balancer, it may firstly create an Application Security Gateway instance, and associate with the Load Balancer instance after successful creation.

​	After completion of instance creation, it may select to associate different Load Balancers through [Associated Load Balancer] on the instance management page and disassociate through [Disassociate Load Balancer]. The Load Balancer has two types, load of 7 layers and load of 4 layers, the associated Load Balancer currently supported is the Load Balancer of 7 layers, the Load Balancer of 4 layers is not supported now.