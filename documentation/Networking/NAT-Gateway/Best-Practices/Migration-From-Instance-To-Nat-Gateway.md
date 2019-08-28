# Migrate from NAT Instance to NAT Gateway

If the user is already using the NAT instance, you can migrate the NAT instance to the NAT Gateway by following these steps.

1. Create NAT Gateway in Subnet Creating NAT Instance

2. Edit the Route Table that originally points to the NAT instance, it is assumed that the Route Table already has a Route Table item, the destination address is 0.0.0.0/0  The next hop type is the VM, and the address of the next hop is the VM where the NAT instance is located
On the Route Table, 8 rout entries are created, the target segment are 1.0.0.0/8, 2.0.0.0/7, 4.0.0.0/6, 8.0.0.0/5, 16.0.0.0/4, 32.0.0.0/3, 64.0.0.0/2 and 128.0.0.0/1 respectively, all the next hops are the NAT instances.
According to the longest match rule of the Route Table, the data packages to any IP will be matched to these 8 routes. Because the 0.0.0.0/0 route is no longer in effect

3. Change the next hop of 0.0.0.0/0 route to the newly created NAT Gateway.

4. Deletes the 8 routes created previously, one by one, traffic to the corresponding network segment is routed to the NAT gateway after deleting one route

Note:

       1. During the migration process, existing TCP connections are broken and need to be reconnected. New connections are not affected. UDP Not Affected
       
       2. Public IP associated with NAT instance will not be migrated to NAT Gateway, after migration, Public IP will change, please adjust relevant rules in time

       3. If using multiple NAT instances, the user can consider replacing instances with one or more NAT Gateways depending on the actual traffic and number of connections
