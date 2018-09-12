# Create Security Group
Security group can act on any instance of the same virtual private cloud in the same region. Before creating security group, you need to create virtual private cloud.

## Operation Steps
1. Access [Security Group Console][1], or visit [JD Cloud Console][2] Click on the left navigation bar [Elastic Compute] - [Virtual Machine] - [Security Group] to enter the security group list page, click [Create], then pop up.
![](../../../../../image/vm/Operation-Guide-SG-create1.png)

2. First, you need to select the region where the security group is located and virtual private cloud. The security group can only be applied to instances under the same virtual private cloud. You can create a security group for the virtual private cloud you have created. You can also click the [Create Virtual Private Cloud] to go to the virtual private cloud creation page and create a new virtual private cloud.
    
	A maximum of 50 security groups can be created under a single virtual private cloud. If the number of security groups under the selected virtual private cloud has reached 50, "The number of security groups under selected virtual private cloud resource has reached 50" will be prompted, and you need to re-select other virtual private cloud.
![](../../../../../image/vm/Operation-Guide-SG-create2.png)

3. Enter the security group name and description which is the additional instructions for the security group rules, such as "Allow port 80 and port 443 in inlet direction"; it is recommended that you use the customer scenario or function of security group as the security group name, such as " Web server cluster allows port 80".

4. Click [OK] to complete the security group creation, and the new security group rejects all inlet and outlet traffic by default. After the security group is successfully created, you can go to the details page to set the outbound/ inbound rules.


  [1]: https://cns-console.jdcloud.com/host/netSecurity/list
  [2]: https://console.jdcloud.com/