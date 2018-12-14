**FAQ**

- **Q: VPC quota of single user?**</br>
  A: JD Cloud allows users to create no more than 10 VPCs in the same Region. Users can create or delete VPCs within this limited number according to actual usage;</br>
- **Q: Can CIDR be repeated between subnets? What’s the requirements?**</br>
  A: The CIDR of the subnet in a same VPC is not allowed to repeat. If the value entered by the user conflicts with the existing CIDR, there will be a corresponding notification. The range scope of the CIDR subnet mask is limited to 16~28.</br>
- **Q: What is the subnet quota of single user?**</br>
  A: JD Cloud allows users to create no more than 10 subnets in the a VPC. Users can create or delete subnets within a limited number based on actual use. </br>
- **Q:  What is the EIP quota of single user?**</br>
  A: JD Cloud allows users to apply for no more than 10 EIP in the same area. Users can apply for or delete EIP within the limited number according to actual use. </br>
- **Q: What is the EIP bandwidth range?**</br>
  A: The EIP bandwidth ranges from 1~200Mbps. </br>
- **Q: After associating an EIP to a resource, why the resource still cannot access the public network?**</br>
  A:  After resources in a VPC are associated to EIPs, you need to add a route rule to the public network in the route table of the subnet where the resources resides. The destination end is the public network segment (for example, all addresses: 0.0.0.0/0), both the next hop type and the address are Internet.  </br>
- **Q:When filling the source and destination IP addresses of the network ACL, what does the default value of 0.0.0.0/0 mean?**</br>
  A: 0.0.0.0/0 means to select all IP addresses. </br>
- **Q: What is the rule implementation order of the network ACL?**</br>
  A: Network ACL rules are matched according to the priority you set when created. The smaller number has the higher priority level;Once a rule matched, it will be immediately executed. If no rule been matched, the access will be denied. When two network ACL rules have the same priority, the rule matchs first will be executed. You are suggested do not set two network ACL rules with the same priority number, cause it may not be executed in the way you expect.