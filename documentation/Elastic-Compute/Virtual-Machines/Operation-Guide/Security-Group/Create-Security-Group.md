# Create Security Group
Security group can act on any instance of the same Virtual Private Cloud in the same region. Before creating security group, you need to create Virtual Private Cloud.

## Operation Steps
1. Access [Security Group Console][1], or visit [JD Cloud Console][2] click navigation bar on the left **Elastic Compute** - **Virtual Machines** - **Security Group** to enter the Security Group page and click **Create**, then the creation pop up.
![](../../../../../image/vm/Operation-Guide-SG-create1.png)

2. First, you need to select the region where the security group is located and Virtual Private Cloud. The security group can only be applied to instances under the same Virtual Private Cloud. You can create a security group for the Virtual Private Cloud you have created. You can also click **Create Virtual Private Cloud** to go to the Virtual Private Cloud creation page and create a new Virtual Private Cloud.
    
	A maximum of 50 security groups can be created under a single Virtual Private Cloud. If the number of security groups under the selected Virtual Private Cloud has reached 50, "The number of security groups under selected Virtual Private Cloud resource has reached 50" will be prompted, and you need to re-select other Virtual Private Cloud.
![](../../../../../image/vm/Operation-Guide-SG-create2.png)

3. Enter the security group name and description which is the additional instructions for the security group rules, such as "Allow port 80 and port 443 in inlet direction"; it is recommended that you use the customer scenario or function of security group as the security group name, such as " Web server cluster allows port 80".

4. Click **OK** to complete the security group creation, and the new security group rejects all inlet and outlet traffic by default. After the security group is successfully created, you can go to the details page to set the outbound/ inbound rules.


  [1]: https://cns-console.jdcloud.com/host/netSecurity/list
  [2]: https://console.jdcloud.com/