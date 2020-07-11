## Access Related

**1. How to access VPC through public network**</br>
From the prospective of network security, JCS for Elasticsearch is deployed in the user's VPC. By creating a Virtual Machine on the same Virtual Private Cloud and subnet, the user can access Elasticsearch in the VPC. The VM Instance on public network can only be connected to a VPC.</br>

**2. The VPC of JD Cloud & AI Virtual Machine is the same as the VPC of ES, but the availability zones are different. Can JD Cloud & AI Virtual Machine access ES through the Intranet?**</br>
Yes. As long as the Virtual Machine and ES are under the same VPC, the Virtual Machine can access ES through the Intranet.</br>

**3. Kibana access permission management**</br>
You can directly access kibana by logging in JCS for Elasticsearch Console. Kibana itself does not support IAM. We have added corresponding policy switches to authenticate Kibana and provide IAM support for Kibana.</br>

**4. Virtual Machine cannot connect to the cluster**</br>
First of all, confirm whether the VM Instance and the cluster are in the same VPC:</br>
- If not, a VM Instance needs to be recreated in the VPC where the cluster is in;</br>
- If they are in the same VPC, test if the VM Instance can be normally connected to the cluster. If the port is unavailable, please contact the customer service or open ticket for troubleshooting.</br>

**5. Is it possible to log in to the JCS for Elasticsearch node via SSH**</br>
You cannot access any node in the JCS for Elasticsearch cluster via SSH and cannot directly modify elasticsearch.yml.

