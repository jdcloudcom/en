# Product Function

## Multiple Network Interfaces and Multiple IPs

## Multiple Network Interfaces
Based on the instance type of the VM, a single VM can only be associated with 8 ENIs, which belongs to the different subnets of the same virtual private cloud.

## Multiple Private IPs
Based on the instance type of the VM, each ENI of a VM can only be assigned with 21 private IP addresses, and all private IP addresses on the same ENI belong to the same subnet.

### Multiple Public IPs
Each ENI is assigned with 1 IP address of the intranet, which can be associated with 1 elastic IP address.

## Network Interface Migration

### Region Level Network Interface

ENI with region-level attributes are accepted, which breaks through the limitation of available areas of traditional ENI. The ENI can be migrated elastically between VMs in different availability zones within the virtual private cloud.

### Flexible Migration

The ENI can be migrated flexibly between VMs in the virtual private cloud to which it belongs. When the ENI is migrated, the assigned private IP address, elastic IP address, and security group are retained.

## Business Security
 
### Independent Security Policy
Network interface level security policy control is accepted. The ENI can be associated to 5 security groups at most for accurate control of business traffic.

### Business Traffic Separation
The VM can be mounted with multiple ENIs, and the traffic of specific business can be hosted by specific ENI. Different security group policies are applied to different ENIs, which can achieve the accurate separation of business traffic and security policies.

## Routing Control

### Subnet Routing
The VM can be mounted with ENIs belonging to different subnets, and each subnet can be independently set with identity and access management policies and routing forwarding policies, thus realizing the safe isolation of customer business from the network.

### Machine routing
Fine routing policies can be set up inside the VM, and specific types of traffic can be forwarded by specific ENIs or specific IP addresses.



