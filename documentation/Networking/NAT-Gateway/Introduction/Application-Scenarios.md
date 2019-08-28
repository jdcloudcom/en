# Application Scenarios


In secure public network access, Virtual Machines can access Internet through NAT Gateway and stop Internet actively initiating connections to access these Virtual Machines Instances.
For shared bandwidth, multiple instances in Intranet share the same NAT public network IP bandwidth to access Internet.
![单NAT网关](../../../../image/Networking/Nat-Gateway/nat-1.png)


Several NAT Gateways can be created in the same VPC and different Subnets at the back end are used to point to different NAT Gateways to isolate different business traffics by the Subnet.
![多NAT网关](../../../../image/Networking/Nat-Gateway/nat-2.png)
