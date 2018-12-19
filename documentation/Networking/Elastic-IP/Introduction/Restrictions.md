# Use Restrictions

Please keep the following restrictions in mind when using the Elastic IP.

- Currently, JD Cloud supports a maximum of 10 Elastic IPs are created for each region. If more quotas are required, please create case for application.

- Elastic IP can associate only with the resource in the same region (including Virtual Machine, container, Load Balancer, and NFV instance).

- Elastic IP in the Virtual Private Cloud supports associating Elastic IP with Virtual Machine, container, Load Balancer, or NFV only at the ratio of 1:1.

- The bandwidth set when creating Elastic IP is outbound bandwidth, namely the bandwidth for access to public network from JD Cloud.

- For single Elastic IP, multiple associations/disassociations can be performed in a day. If it is required to change the IP of the resource that has associated Elastic IP, the resource shall be disassociated from current IP before associating with a new IP.

- The billing methods for Elastic IP include monthly package, pay by configuration, and pay by consumption, which all support the increase or decrease of the upper limit of bandwidth. For the Elastic IP with Monthly Package, the amount difference before and after the adjustment of bandwidth will be converted into the use duration of the Elastic IP after the adjustment.

- The Elastic IP with Availability Zone attribute as “Availability Zone A” can only be associated with instance in Availability Zone A, such as Virtual Machine, container, Load Balancer (excluding the Load Balancer simultaneously available for Availability Zone A and Availability Zone B) , and NFV Instance in Availability Zone A.

