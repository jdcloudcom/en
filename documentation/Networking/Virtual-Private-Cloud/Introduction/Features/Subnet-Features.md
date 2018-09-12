## **Subnet**

### Basic Concept

Subnet is an IP address block within the range of its VPC IP address. Currently, cloud resources in VPC are deployed in subnets, such as VMs, containers and load balancer. Subnet is in VPC. After creating the VPC, you can create the subnet under VPC. Network segments of the subnets under the same VPC cannot overlap. Network segments of the subnets in different VPCs can overlap.



### Attributes of Multi-available Zone

The subnet of JD Cloud can perform cross-availability-zone deployment under the region. You do not require to select the AZ area when creating subnets. The resources in subnet can be created and used based on only one AZ area and can also be created and used by distributing to multiple AZ areas. The design of cross-AZ-subnet provides maximum flexibility for business’s planning, deployment and expansion:

- Advantage 1: When users apply the planning, they shall only require to divide the subnet according to the type of service without considering the available areas, which can simplify the planning process;
- Advantage 2: PaaS applications, such as user’s cloud database clusters, etc. only require to select one subnet when performing cross-AZ deployment. When the business accesses to the database, it is only required to configure one set of ACL rules. The complexity of user’s configuration is reduced and the use experience is improved.
- Advantage 3: When users want to add new AZ, PaaS applications, such as database services, etc. do not require to add new subnets and control rules of business access, and they can directly create new database services based on the new AZ in the original subnet. Scalability of user’s database business is good;
- Advantage 4: Users can create high-available services by themselves. VPC IP can shift across AZ, which is convenient for the users to create high-available services across AZ.