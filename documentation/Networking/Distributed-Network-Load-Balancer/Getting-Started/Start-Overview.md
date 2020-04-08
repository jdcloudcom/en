
## Getting Started Overview
The Guide guides you to quickly create a public network Distributed Network Load Balancer of high availability, the Load Balancer is linked to Availability Group to distribute service requests from public network client to the backend server in Availability Group to realize high availability of service.

This Guide includes the following steps:

 1. [Create Public Network Load Balancer Instance](../Getting-Started/Create-Instance.md)
 
    Create a Distributed Network Load Balancer instance of public network type. Distributed Network Load Balancer Instance is logical entity that hosts the Load Balancer business, not corresponding with specific resources.
 
 2. [Create Availability Group](../Getting-Started/Create-AvailabilityGroup.md)
 
    Create an Availability Group. Availability Group is a highly available deployment solution for its business provided by JD Cloud & AI, it is the a logical collection of computing resources, and can be associated with Distributed Network Load Balancer as the backend server group to provide services.

 3. [Create Listener and Backend Service](../Getting-Started/Manage-Instance.md)
 
     Configure a Distributed Network Load Balancer instance, create a listener and a backend service. The listener is responsible for listening client service requests, the backend service is responsible for forwarding the listened service requests to the backend server according to certain policies.
 
 4. [Delete Public Network Load Balancer Instance](../Getting-Started/Delete-Instance.md)
 
     When a Distributed Network Load Balancer Instance of public network is no longer required to provide services according to requirements of business scenario, you can delete it.
