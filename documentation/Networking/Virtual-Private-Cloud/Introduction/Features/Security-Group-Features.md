# **Security Group**

### **Basic Concept**

Security group is a distributed and stateful virtual firewall with the function of filtering. It can realize the control of the access of VM network, thereby it can control the access traffic of one or more VMs.

When creating the VM, corresponding security group can be associated. Add the VMs with same requirement regarding the network security isolation within the same area into the same security group. Perform security filtering on the inbound and outbound traffic of the VM through configuring the security group policy.

The new security group will implement All drop rule for all egress / ingress traffic by default. The egress contains a default configuration which allows all traffic; you can add or remove the rules of security groups at any time, and the new rules will be automatically applied to all VMs associated with this security group.

You can create 50 security groups under each VPC in each zone. Each security group can be added up to 100 rules in both-way, which can satisfy your requirement regarding network security isolation.

Each machine can be associated with up to 5 security groups for the sake of realizing the precise control regarding the access traffic of VM.



### **Security Group Template**

#### Currently, console provides three default security group templates:

Linux Security Group Opens 22 Ports: Only the TCP 22 port in which SSH logs is exposed to EIP, and the port of intranet is all-pass.
Windows Security Group Opens Port 3389: Only the TCP 3389 port in which MSTSC logs is exposed to EIP, and the port of intranet is all-pass.
Default Security Group Opens All Ports: Expose all ports to the EIP and the intranet. It has certain security risks.



### Difference Between the Security Group and the Network ACL:

| Network ACL                      | Security Group                                   |
| ---------------------------- | ---------------------------------------- |
| Stateless                       | Stateful                                   |
| Effective at subnet level | Effective at VM-instance level |
| Support permission rules and rejection rules | Support permission rules |
| It can be automatically applied to all VMs in subnet | Security group rules can be applied to all associated VM instances |



### **Security Group Rules**

##### 1, Content of Security Group Rules

● Type: Common application types, such as SSH, PING or HTTP, etc. Customized TCP and UDP can also be chosen.

● Agreement: The type of the agreement shall be displayed according to the selected application type.

● Target Port: For the range of VM ports acted by the security group, the value shall be 1-65535. Single port such as "22" or port’s range such as "20-22" can be filled.

● Source/Destination IP: IP addresses or address segments (CIDR) which allows access / can be accessed only support IPv4. If 0.0.0.0/0 is filled, it means that it can be accessed by all IP addresses.

● Policy: Allowed (default).

● Remarks: Identify rules and purpose. Up to 256 characters can be input.



##### 2, Restrictions of Security Group Rule

● The security group created by user has the following rules by default

   A. Inbound Direction: Reject all traffic

   B. Outbound Direction: Due to the requirements of internal service, port of TCP 80 and ports of UDP 67, 68 and 161 are opened. The rest traffic is rejected

● Policy of the security group will always show "Allow"; you cannot create the rule of "reject" the access.

● Security group is stateful — if you configure the outbound rule into the condition that VM is allowed to send a request to the outside, the response traffic for that request will be allowed to flow inward regardless of the rules of inbound security group, and vice versa.

● You can add and delete the rules at any time. New security group policy will be automatically applied to the VMs associated with the security group.



##### 3, Security Group Priority

When a VM is associated with multiple security groups, the rules for each security group will be filtered for the sake of creating a new set of security group rules. Determine that whether the access is allowed or not based on the new rules.



##### 4, Restrictions of Security Group

Security group is applicable to the VM instances in any network environment; 　　

