### Reason Investigation of Trust Relationship Verification Failure

1. If the user establishes the directory service on the cloud, it is required to deploy the Directory Service and Trust Domain in the same VPC.

2. If the user is Remote Domain or Local Domain, it is required to establish a dedicated line to get through the VPC of the Directory Service, and then configure the trust relationship after normal communication.

3. If a trust relationship cannot be established with the same VPC, please check whether the Security Group of VPC has the required ports open.

4. It is recommended to turn off the firewall on the domain control instance when configuring the trust relationship.