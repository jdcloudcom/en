**FAQ**

- **Q: VPC quota of single user?**</br>
  A: JD Cloud allows users to create no more than 10 VPCs in the same geographical area. Users can create or delete VPCs within a limited number according to actual usage;</br>
- **Q: Can CIDR be repeated between subnets? What’s the requirements?**</br>
  A: The CIDR of the subnet under the same VPC is not allowed to repeat. If the value entered by the user conflicts with the existing CIDR, there will be a corresponding notification. The range scope of the CIDR subnet mask is limited to 16~28.</br>
- **Q: Subnet quota of single user?**</br>
  A: JD Cloud allows users to create no more than 10 subnets under the same VPC. Users can create or delete subnets within a limited number based on actual use. </br>
- **Q: EIP quota of single user?**</br>
  A: JD Cloud allows users to apply for no more than 10 EIP in the same area. Users can apply for or delete EIP within the limited number according to actual use. </br>
- **Q: EIP bandwidth range?**</br>
  A: The EIP bandwidth ranges from 1~200Mbps. </br>
- **Q: After associating a EIP to a resource, the resource still cannot access the public network?**</br>
  A: After the resources in the VPC are associated to the EIP, you need to add the route rule to the public network in the route table of the subnet where the resource resides. The destination end is the public network segment (for example, all addresses: 0.0.0.0/0), the next hop type and address are all Internet. </br>
- **Q: When the source and destination IP addresses of the network ACL are filled in, what does the default value of 0.0.0.0/0 mean?**</br>
  A: 0.0.0.0/0 means to select all IP addresses. </br>
- **Q: What is the rule implementation order of the network ACL?**</br>
  A: Network ACL rules are matched according to the priority you set when you created them. The smaller the priority number, the higher the level, the lower the level, the larger the number. Immediately executed once matched. If no rule matches, the access will be denied. When the two network ACL rules have the same priority, they will be executed with the rules that match first. It is not guaranteed to be executed in the way you expect. Therefore, you are advised not to set two network ACL rules with the same priority.