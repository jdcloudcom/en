**FAQ**

- **Q: VPC quota of single user?**</br>
  A: JD Cloud & AI allows users to create no more than 10 VPCs in the same Region. Users can create or delete VPCs within this limited number according to actual usage;</br>
  
- **Q: Can CIDR be repeated between subnets? What’s the requirements?**</br>
  A: The CIDR of the subnet in a same VPC is not allowed to repeat. If the value entered by the user conflicts with the existing CIDR, there will be a corresponding notification. The range scope of the CIDR subnet mask is limited to 16~28.</br>
  
- **Q: What is the subnet quota of single user?**</br>
  A: JD Cloud & AI allows users to create no more than 10 subnets in the a VPC. Users can create or delete subnets within a limited number based on actual use. </br>
  
- **Q:  What is the EIP quota of single user?**</br>
  A: JD Cloud & AI allows users to apply for no more than 10 EIP in the same area. Users can apply for or delete EIP within the limited number according to actual use. </br>
  
- **Q: What is the EIP bandwidth range?**</br>
  A: The EIP bandwidth ranges from 1~200Mbps. </br>
  
- **Q: After associating an EIP to a resource, why the resource still cannot access the public network?**</br>
  A:  After resources in a VPC are associated to EIPs, you need to add a route rule to the public network in the route table of the subnet where the resources resides. The destination end is the public network segment (for example, all addresses: 0.0.0.0/0), both the next hop type and the address are Internet.  </br>
  
- **Q: What does the 0.0.0.0/0, ::/0 shown by default mean when I fill in the source and destination IP of Network ACL?**</br>
  A: 0.0.0.0/0 represents to select all IPv4 addresses and ::/0 represents all IPv6 addresses.</br>
  
- **Q: What is the rule implementation order of the network ACL?**</br>
  A: Network ACL rules are matched according to the priority you set when created. The smaller number has the higher priority level;Once a rule matched, it will be immediately executed. If no rule been matched, the access will be denied. When two network ACL rules have the same priority, the rule matchs first will be executed. You are suggested do not set two network ACL rules with the same priority number, cause it may not be executed in the way you expect.</br>
  
- **Q: When the VPC Route Table Transmission Route reaches the quota cap, how to handle the added routes for route transmission?**</br>
  A: When a batch of route entries to be updated + existing entries in a Transmission Route Table are higher than transmission route quota, any entry of this route will be updated to the VPC Route Table and will block update of subsequent incoming routes; until VPC Route Table releases enough route space, or more efficient route space is provided by increasing quotas, the batch of routes will be processed.</br>
  
- **Q: How to create an IPv4/IPv6 dual stack VPC?**</br>
  A: Relevant services of IPv6 are under beta currently. If you need to use such service, you must apply for the permission. If you've already have the permission, you can create a dual stack VPC. Please refer to [VPC Configuration](https://docs.jdcloud.com/en/virtual-private-cloud/vpc-configuration); If you don't have the permission for the moment but need to use the IPv6 service, please contact the customer service or [Open Ticket](https://ticket.jdcloud.com/applyorder/form?cateId=1135&questionId=1155) to apply for joining the beta.</br>
  

