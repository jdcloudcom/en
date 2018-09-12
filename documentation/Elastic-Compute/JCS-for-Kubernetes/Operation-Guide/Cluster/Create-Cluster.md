
# Create Cluster

**Operation Instructions**

 1. A working node group will be created by default when creating the cluster;
 2. Working node group is created based on the high availability group, and the working nodes will be evenly distributed in corresponding high available group to reduce the impact on your business when a physical failure occurs in a single availability zone;
 3. Management node CIDR cannot overlap with working node CIDR;
 4. Working node CIDR shall be allocated in the selected VPC. Please try to choose a new VPC to deploy the Kubernetes Service;
 5. For the related resources automatically created by Kubernetes Service, such as VM, Cloud Disk Service, Elastic IP and load balancer, please do not perform the operations of deleting or modifying name regarding the products of single resource. Please perform all operations on the functions provided on cluster and work node group page.

**Steps of Creating Cluster**

   For details, please refer to the creation of Kubernetes Service.