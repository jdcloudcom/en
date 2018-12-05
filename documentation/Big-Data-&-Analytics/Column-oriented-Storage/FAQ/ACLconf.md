### How to configure ACL?


#### 1. Create VPC
See Help Center Document for reference: [VPC configuration](/documentation/Networking/Virtual-Private-Cloud/Operation-Guide/VPC-Configuration.md)

#### 2. Create subnet
See Help Center Document for reference: [Subnet configuration](/documentation/Networking/Virtual-Private-Cloud/Operation-Guide/Subnet-Configuration.md)

#### 3. Create ACL
See Help Center Document for reference: [Network ACL configuration](/documentation/Networking/Virtual-Private-Cloud/Operation-Guide/Network-ACL-Configuration.md)

#### 4. Configure ACL rules

##### Inbound Rules:
1) Compulsory rules to be configured:

Priority level | Type | 	Protocol | 	Destination port range | 	Source IP | 	Policy
:---|:---|:---|:---|:---|:---
1	|ssh	|TCP	|22	|0.0.0.0/0|	Accept
2	|ALL ICMP|ALL ICMP	|-	|0.0.0.0/0|	Accept
3	|ALL traffic|	ALL traffic	|1-65535	|103.224.222.0/24|	Accept
4	|ALL traffic	|ALL traffic	|1-65535	|100.65.0.0/16	|Accept
5	|ALL traffic	|ALL traffic	|1-65535	|100.64.0.0/16	|Accept

2) User required rules to be configured:

Priority level | Type | 	Protocol | 	Destination port range | 	Source IP | 	Policy
:---|:---|:---|:---|:---|:---
6	|ALL traffic|	ALL traffic	|1-65535	|User network exit IP (CIDR format) | 	Accept

Note: If the user has multi-Internet IPs needing to access the cluster, multiple rules shall be configured

##### Outbound Rules:
Priority level | Type | 	Protocol | 	Destination port range | 	Source IP | 	Policy
:---|:---|:---|:---|:---|:---
1	|ALL traffic|	ALL traffic	|1-65535	|0.0.0.0/0|	Accept

#### 5. Associate ACLs with corresponding subnets

Notes:
If the user has existing VPC network, subnet, and ACL resource, it only needs to add other than create ACL rules required by Column-based Storage. But it needs to note that new added ACL rules cannot conflict with existing ACL rules for taking effect, otherwise normal use is impossible for the cluster.
