# Migrate from NAT Instance to NAT Gateway

If the user is already using the NAT instance, you can migrate the NAT instance to the NAT Gateway by following these steps.

1. Create NAT Gateway in Subnet Creating NAT Instance

2. Edit the Route Table that originally points to the NAT instance, it is assumed that the Route Table already has a Route Table item, the destination address is 0.0.0.0/0  The next hop type is the VM, and the address of the next hop is the VM where the NAT instance is located;
Modify this route table item to: The destination address 0.0.0.0/0 remains the same while the type of next hop is modified to NAT Gateway. In the next hop, select the newly created NAT Gateway and save the configuration, then the traffic accesses public network through NAT instances will be switched to NAT Gateway

Note:

       1. During the migration process, existing TCP connections are broken and need to be reconnected. New connections are not affected.
       
       2. Public IP associated with NAT instance will not be migrated to NAT Gateway, after migration, Public IP will change, please adjust relevant rules in time

       3. If using multiple NAT instances, the user can consider replacing instances with one or more NAT Gateways depending on the actual traffic and number of connections
