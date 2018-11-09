
# Security Group

A security group is a distributed, stateful packet filtering virtual firewall that controls network access to a container to identity and access management to one or more container instances.

When you create a container instance, you can associate the corresponding security group with the container instance with the same network security isolation requirement in the same region to the same security group. Configure the security group policy to perform security filtering on the inbound and outbound traffic of the container instance.

Create security group defaults to an All drop rule for all egress/ingress traffic, you can add or remove rules for a security group at any time, and the new rule is automatically applied to all resources associated with that security group.

You can create 50 security groups under each VPC in each zone. Each security group can add up to 100 rules in both directions to meet your network security isolation needs.

Each container instance must be associated to at least one security group and can be bound to up to 5 security groups for precise control of container instance access traffic.

Security Group Template:

Currently, console provides three default security group templates:

Linux Security Group Opens 22 Ports: Only expose the TCP 22 port of the SSH login to the public network and intranet

Windows Security Group Opens 3389 Ports: Only expose the TCP 3389 port of the MSTSC login to the public network and intranet

The default security group allows all traffic: Expose all ports to the EIP and the intranet. It has certain security risks.

The security group operation guide, also refer to the security group configuration.

