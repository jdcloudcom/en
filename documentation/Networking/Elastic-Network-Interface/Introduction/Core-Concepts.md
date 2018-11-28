# Core Concepts
Prior to performing actions on elastic network interfaces, please understand the following ENI fundamental concepts and professional terms.

| Concept | Description |
| :- | :- |
| Elastic Network Interface | An elastic network interface is a type of virtual network interface that can be created independently. The ENI can be attached to or detached from a virtual machine. |
| Primary Network Interface | The primary network interface is a special type of ENI that is created with virtual machines and owns the same lifecycle with virtual machines. |
| Secondary Network Interface | The secondary network interface is a type of ENI that can be created and deleted independently and can be plugged elastically. |
| Primary IP | The primary ip is the first private ip assigned to an elastic network interface during creation. This ip can be specified by the user or assigned automatically. Currently the actions of modification and release of primary ip are not supported.  |
| Secondary IP | The secondary ip is the private ip assigned to an elastic network interface other than the primary ip. This ip can be specified by the user or assigned automatically. The action of releasing a secondary ip is supported. |
| Elastic IP | The elastic IP is a public IP address that can be applied independently and flexibly associated and disassociated with private IP. |
| Security group | The security group is a distributed and stateful firewall that filters traffic to and from an ENI. |
| MAC | MAC address is the unique identifier for an ENI. |