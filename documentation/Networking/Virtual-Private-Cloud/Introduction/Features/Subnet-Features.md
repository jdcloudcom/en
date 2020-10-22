## **Subnet**

### Basic Concept

Subnet is an IP address block within the range of its VPC IP address. Currently, cloud resources in VPC are deployed in subnets, such as VMs, containers and load balancers. Subnet is in VPC. After creating the VPC, you can create the subnet in VPC. Network segments of the subnets under the same VPC cannot overlap. Network segments of the subnets in different VPCs can overlap.



### Attributes of Multi-available Zone

JD Cloud & AI has two types of subnets: Standard Subnet and Edge Subnet.

Standard Subnet is deployed cross AZs under a region. You need not to select an AZ when creating a subnet. Resources in the subnet can only be created and used based on a certain AZ and by distributing in multiple AZs. The cross-AZ subnet design provide maximal flexibility for business planning, deployment and expansion:

- When users apply the planning, they shall only require to divide the subnet according to the type of service without considering the available areas, which can simplify the planning process;
- PaaS applications, such as user’s cloud database clusters, etc. only require to select one subnet when performing cross-AZ deployment. When the business accesses to the database, it is only required to configure one set of ACL rules. The complexity of user’s configuration is reduced and the use experience is improved.
- When users want to add new AZ, PaaS applications, such as database services, etc. do not require to add new subnets and control rules of business access, and they can directly create new database services based on the new AZ in the original subnet. Scalability of user’s database business is good;
- Users can create high-available services by themselves. VPC IP can shift across AZ, which is convenient for the users to create high-available services across AZ.

Edge Subnet associates with an edge zone. You need to select an EZ when creating an Edge Subnet. Resources in the subnet can only be created under this EZ. The Edge Subnet has advantages such as unified scheduling and unified presence of computing resources of this Edge Subnet by the central computing center, provision of a network with low latency, low cost of bandwidth and high bandwidth quality.