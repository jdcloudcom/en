# Use Restrictions

Please keep the following restrictions in mind when using the Elastic IP.

- Currently, JD Cloud supports a maximum of 10 Elastic IPs are applied for each region. If more quotas are required, please create case for application.

- Elastic IP can associate only the resource in the same region (including Virtual Machine, container, Load Balancer, and NFV instance).

- Elastic IP in the Virtual Private Cloud supports only Elastic IP associating Virtual Machine or Load Balancer at 1:1.

- The bandwidth set when applying for Elastic IP is uplink bandwidth, namely the bandwidth for access to public network from JD Cloud.

- For single Elastic IP, multiple associations/disassociations can be performed in a day. If it is required to change the IP of the resource that has associated Elastic IP, the resource shall disassociate current IP before associating new IP.

- The billing methods include monthly package, pay by configuration, and pay by consumption for Elastic IP, which all support the increase or decrease of the upper limit of bandwidth. For the Elastic IP with Monthly Package, the amount difference before and after the adjustment of bandwidth will be converted into the use duration of the Elastic IP configuration after the adjustment.

- The attribute of IP Availability Zone is the Elastic IP of “Availability Zone A” only associating Virtual Machine, container, Load Balancer (excluding the Load Balancer simultaneously available for Availability Zone A and Availability Zone B), and NFV Instance.

