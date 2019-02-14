
# Security Group

Security Group is a kind of distributed virtual firewall with status and package filtering function, which implements the network access control of resources so as to control access traffic of one or multiple resources.

When create a Native Container Instance or Native Container Pod, corresponding Security Group can be associated, i.e., add Native Container Instances or Native Container Pods with same network security isolation requirements in the same region into the same Security Group. Perform security filtering for access traffic of Native Container Instance and Native Container Pod by configuring Security Group policies.

Create security group defaults to an All drop rule for all egress/ingress traffic, you can add or remove rules for a security group at any time, and the new rule is automatically applied to all resources associated with that security group.

You can create 50 security groups under each VPC in each zone. Each security group can add up to 100 rules in both directions to meet your network security isolation needs.

Each Native Container Instance or Native Container Pod must associate with at least one Security Group (maximum 5 Security Groups) to implement accurate control for access traffic of Native Container Instance or Native Container Pod.

**Security Group Template**:

Currently, console provides three default security group templates:

Linux Security Group Opens 22 Ports: Only expose the TCP 22 port of the SSH login to the public network and intranet

Windows Security Group Opens 3389 Ports: Only expose the TCP 3389 port of the MSTSC login to the public network and intranet

The default security group allows all traffic: Expose all ports to the EIP and the intranet. It has certain security risks.

The security group operation guide, also refer to the [security group configuration][1].


  [1]: https://docs.jdcloud.com/en/virtual-private-cloud/security-group-configuration